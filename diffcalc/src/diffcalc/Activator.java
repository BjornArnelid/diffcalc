package diffcalc;

import java.io.File;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	private static Activator activator;
	private Resource matchModel;
	private Resource heroPool;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		
		ResourceSet rs = new ResourceSetImpl();
		heroPool = getResource(rs, "heroPool.xmi");
		matchModel = getResource(rs, "matchmodel.xmi");
		activator = this;
	}

	Resource getResource(ResourceSet rs, String name) {
		File f = getWorkSpaceLocation().append(name).toFile();
		if (!f.exists()) {
			return rs.createResource(URI.createFileURI(f.getAbsolutePath()));
		} else {
			return rs.getResource(URI.createFileURI(f.getAbsolutePath()), true); 
		}
	}
	
	public static Activator getSharedInstance() {
		return activator;
	}

	public static IPath getWorkSpaceLocation() {
		return ResourcesPlugin.getWorkspace().getRoot().getLocation();
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		matchModel.save(null);
		heroPool.save(null);
		activator = null;
	}
	
	public Resource getMatchModel() {
		return matchModel;
	}
	
	public Resource getHeroPool() {
		return heroPool;
	}
}
