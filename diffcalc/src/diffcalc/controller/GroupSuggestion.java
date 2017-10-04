package diffcalc.controller;

import java.util.HashMap;

import MatchModel.Player;

public class GroupSuggestion {
	private HashMap<Player, HeroSuggestion> suggestions = new HashMap<>();

	GroupSuggestion(Player player, HeroSuggestion hs) {
		suggestions.put(player, hs);
	}

	public GroupSuggestion() {
	}

	public HeroSuggestion getSuggestion(Player player) {
		HeroSuggestion hs = suggestions.get(player);
		if (hs != null) {
			return hs;
		}
		return null;
	}

	public Integer getScore(Player player) {
		HeroSuggestion hs = suggestions.get(player);
		if (hs != null) {
			return hs.score;
		}
		return null;
		
	}

	public String printPlayerSuggestion(Player player, int numberofSelections) {
		HeroSuggestion hs = suggestions.get(player);
		if (hs != null) {
			
			return hs.hero.getHero().getName() + " : " +hs.score / (1 + numberofSelections);
		}
		return "";
	}

	int numberofSuggestions() {
		return suggestions.size();
	}

	void add(Player player, HeroSuggestion hs) {
		for (HeroSuggestion val : suggestions.values()) {
			if (val.hero.getHero().equals(hs.hero.getHero())) {
				if (val.score < hs.score) {
					suggestions.remove(val.hero.getPlayer());
				} else {
					return;
				}
			}
		}
		suggestions.put(player, hs);
	}

	
}
