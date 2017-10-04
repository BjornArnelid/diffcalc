package diffcalc.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;

import MatchModel.Contender;
import MatchModel.Hero;
import MatchModel.Match;
import MatchModel.Player;
import MatchModel.Side;

public class ParseJob extends Job {
	/**
	 * 
	 */
	private final HeroSuggestionController controller;

	List<HeroSuggestion> suggestions = new ArrayList<>();

	private Player player;
	private List<Hero> allies;
	private List<Hero> enemies;
	private boolean exact;

	public ParseJob(HeroSuggestionController heroSuggestionController, Player p, List<Hero> allies, List<Hero> enemies, boolean exact) {
		super("Pasrsing matches for player " + p.getName());
		controller = heroSuggestionController;
		this.player = p;
		this.allies = allies;
		this.enemies = enemies;
		this.exact = exact;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		if (player.getMatches() == null) {
			return Status.CANCEL_STATUS;
		}
		for (Match match : player.getMatches()) {
			HeroSuggestion matchSuggestion = parseMatch(match, allies, enemies, exact);

			boolean added = false;
			for (HeroSuggestion combinedSuggestion : suggestions) {
				if (combinedSuggestion.hero.equals(matchSuggestion.hero)) {
					combinedSuggestion.score += matchSuggestion.score;
					added = true;
				}
			}
			if (!added) {
				suggestions.add(matchSuggestion);
			}
		}
		Collections.sort(suggestions, new Comparator<HeroSuggestion>() {
			public int compare(HeroSuggestion o1, HeroSuggestion o2) {
				return o2.score.compareTo(o1.score);
			}
		});
		return Status.OK_STATUS;
	}
	
	private HeroSuggestion parseMatch(Match match, List<Hero> allies, List<Hero> enemies, boolean exact) {
		Side side;
		Contender c = findPlayer(match.getRadiant().getContenders());
		if (c != null) {
			side = Side.RADIANT;
		} else {
			c = findPlayer(match.getDire().getContenders());
			side = Side.DIRE;
		}
		int score = side.equals(Side.RADIANT) ? 
				findPlayers(match.getRadiant().getContenders()) : findPlayers(match.getDire().getContenders());
		if (side.equals(Side.RADIANT)) {
			score += parseTeam(match.getRadiant().getContenders(), allies);
			score += parseTeam(match.getDire().getContenders(), enemies);
		} else {
			score += parseTeam(match.getDire().getContenders(), allies);
			score += parseTeam(match.getRadiant().getContenders(), enemies);
		}
		
		if (exact) {
			if (score == (controller.selected.getPlayers().size() + allies.size() + enemies.size())) {
				score = 1;
			} else {
				score = 0;
			}
		}
		
		score = side.equals(match.getWinner()) ? score : -score;
		return new HeroSuggestion(c, score);
	}
	


	private int findPlayers(EList<Contender> contenders) {
		int number = 0;
		for(Contender c : contenders) {
			Player p = c.getPlayer();
			if (p != null && controller.selected.getPlayers().contains(p)) {
				number++;
			}
		}
		return number;
	}

	private Contender findPlayer(EList<Contender> contenders) {
		for (Contender c : contenders) {
			if (c.getPlayer() != null && c.getPlayer().getId() == player.getId()) {
				return c;
			}
		}
		return null;
	}
	
	private int parseTeam(List<Contender> contenders, List<Hero> allies) {
		int score = 0;
		for (Contender c : contenders) {
			if (allies.contains(c.getHero())) {
				score++;
			}
		}
		return score;
	}

	Player getPlayer() {
		return player;
	}
}