package diffcalc;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = "mydotapicker.perspective";

	@Override
	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		return new WorkbenchWindowAdvisor(configurer);
	}
	
	@Override
	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}
}
