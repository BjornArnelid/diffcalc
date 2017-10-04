package diffcalc.view;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;

public class NewPartyHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		NewPartyWizard wizard = new NewPartyWizard();
		WizardDialog dialog = new WizardDialog(null, wizard);
		dialog.open();
		if (dialog.getReturnCode() == WizardDialog.OK) {
			IViewPart view = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("mydotapicker.view");
			if (view instanceof HeroSuggestionView) {
				((HeroSuggestionView) view).updateSelection(wizard.getGroup());
			}
	
		}
		return null;
	}

}
