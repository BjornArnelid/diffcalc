package diffcalc.view;

import java.util.HashMap;

import org.eclipse.core.runtime.IPath;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import MatchModel.Hero;
import diffcalc.Activator;

public class Images {
	private Image defaultImage;
	private HashMap<Hero, Image> imageMap = new HashMap<>();

	Image getDefaultImage() {
		if (defaultImage == null) {
			IPath path = Activator.getWorkSpaceLocation().removeLastSegments(1).append("res/" + "dota2" + ".png");
			defaultImage = new Image(Display.getDefault(), path.toOSString());
		}
		return defaultImage;
	}

	void dispose() {
		if (defaultImage != null) {
			defaultImage.dispose();
		}
		for (Image i : imageMap.values()) {
			i.dispose();
		}
		imageMap = null;
	}

	Image getHeroImage(Hero h) {
		if (imageMap.get(h) == null) {
			
			IPath path = Activator.getWorkSpaceLocation().removeLastSegments(1).append("res/" + h.getImagePath());
			imageMap.put(h, new Image(Display.getDefault(), path.toOSString()));
		}
		return imageMap.get(h);
	}
}
