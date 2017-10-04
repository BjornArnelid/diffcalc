package diffcalc.controller;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.gson.Gson;

import MatchModel.Hero;
import MatchModel.HeroPool;
import MatchModel.MatchModelFactory;
import diffcalc.Activator;

public class HeroPoolJob extends Job {

	private class InputHero {
		int id;
		String localized_name;
		String name;
	}
	
	public HeroPoolJob() {
		super("Loading heroes");
	}

	protected IStatus run(IProgressMonitor monitor) {
		Resource heroes = Activator.getSharedInstance().getHeroPool();
		if (!heroes.getContents().isEmpty()) {
			return Status.OK_STATUS;
		}
		HeroPool pool = MatchModelFactory.eINSTANCE.createHeroPool();
		try {
			for (InputHero hero : loadHeroes()) {
				Hero h = MatchModelFactory.eINSTANCE.createHero();
				h.setId(hero.id);
				h.setName(hero.localized_name);
				
				String pathName = extractName(hero.name) + "_sb.png";
				h.setImagePath(pathName);
				pool.getHeroes().add(h);
			}
			heroes.getContents().add(pool);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Status.OK_STATUS;
	}
	
	private InputHero[] loadHeroes() throws URISyntaxException, IOException {
		// TODO handle file does not exist
		File file = Activator.getWorkSpaceLocation().removeLastSegments(1).append("res/Heroes.json").toFile();
		Scanner scan = new Scanner(file);  
		scan.useDelimiter("\\Z");  
		String content = scan.next();
		scan.close();
		return readNames(content);
	}

	private InputHero[] readNames(String content) {
		Gson gson = new Gson();
		return gson.fromJson(content, InputHero[].class);
	}

	private String extractName(String name) {
		return name.substring(14, name.length());
	}

}
