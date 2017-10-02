package mydotapicker.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import MatchModel.Hero;
import MatchModel.HeroPool;
import MatchModel.Player;
import MatchModel.PlayerGroup;
import diffcalc.Activator;

public class HeroSuggestionController {
	
	private HeroPoolJob heroJob;
	private MatchUpdateJob matchJob;
	
	PlayerGroup selected;
	private Resource heroResource;
	private Resource matchResource;
	private Adapter adapter;

	public HeroSuggestionController() {
		Activator activator = Activator.getSharedInstance();
		heroResource = activator.getHeroPool();
		matchResource = activator.getMatchModel();

		matchJob = new MatchUpdateJob();

		if (heroResource.getContents() == null || heroResource.getContents().isEmpty()) {
			heroJob = new HeroPoolJob();
			heroJob.addJobChangeListener(new JobChangeAdapter(){
				@Override
				public void done(IJobChangeEvent event) {
					if (selected != null) {
						matchJob.schedule(selected);
					}
				}
			});
			heroJob.schedule();
		}
	}

	public List<GroupSuggestion> getSuggestedHeroes(List<Hero> allies, List<Hero> enemies, boolean exact) throws InterruptedException {
		ArrayList<ParseJob> jobs = new ArrayList<>();
		// TODO In exact mode do we need more then one job??
		for (Player player : selected.getPlayers()) {
			ParseJob job = new ParseJob(this, player, allies, enemies, exact);
			job.schedule();
			jobs.add(job);
		}

		for (ParseJob j : jobs) {
			j.join();
		}

		return buildSuggestions(jobs, allies, enemies);
	}
	
	private List<GroupSuggestion> buildSuggestions(ArrayList<ParseJob> jobs, List<Hero> allies, List<Hero> enemies) {
		ArrayList<GroupSuggestion> allSuggestions = new ArrayList<>();
		while(true) {
			GroupSuggestion suggestion = new GroupSuggestion();
			while (suggestion.numberofSuggestions() < selected.getPlayers().size()) {
				for (ParseJob job : jobs) {
					Iterator<HeroSuggestion> iter = job.suggestions.iterator();
					while(suggestion.getSuggestion(job.getPlayer()) == null) {
						if (!iter.hasNext()) {
							return allSuggestions;
						}

						HeroSuggestion hs = iter.next();
						// TODO Null problem
						if (allies.contains(hs.hero.getHero()) || enemies.contains(hs.hero.getHero())) {
							iter.remove();

						} else {
							suggestion.add(hs.hero.getPlayer(), hs);
						}
					}
				}
				if(suggestion.numberofSuggestions() == selected.getPlayers().size()) {
					allSuggestions.add(suggestion);
					for (ParseJob job : jobs) {
						job.suggestions.remove(suggestion.getSuggestion(job.getPlayer()));
					}
				}
			}

		}		
	}
	
	public void setSelected(PlayerGroup group, Adapter newAdapter) {
		if (selected != null && adapter != null) {
			selected.eAdapters().remove(this.adapter);
		}
		selected = group;
		for (Player p : selected.getPlayers()) {
			if(!objectExistsinResource(p)) {
				matchResource.getContents().add(p);
			}
		}
		
		if (!objectExistsinResource(selected)) {
			matchResource.getContents().add(selected);
		}
		
		adapter = newAdapter;
		selected.eAdapters().add(adapter);
		matchJob.schedule(selected);
	}

	private boolean objectExistsinResource(EObject current) {
		for (EObject saved : matchResource.getContents()) {
			if (saved.equals(current)) {
				return true;
			}
		}
		return false;
	}

	public Collection<Hero> getAllHeroes() {
		// TODO what about empty
		HeroPool pool = (HeroPool) heroResource.getContents().get(0);
		return pool.getHeroes();
	}

	public PlayerGroup getFirstAvailableGroup() {
		for (EObject obj : matchResource.getContents()) {
			if (obj instanceof PlayerGroup) {
				return (PlayerGroup) obj;
			}
		}
		return null;
	}

	public PlayerGroup getSlected() {
		return selected;
	}
}
