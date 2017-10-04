package diffcalc.view;

import org.eclipse.jface.wizard.Wizard;

import MatchModel.PlayerGroup;

public class NewPartyWizard extends Wizard {

	private NewPartyWizardPage page;
	private PlayerGroup group;

	@Override
	public boolean performFinish() {
		group = page.getTeamComposition();
		return true;
	}

	@Override
	public void addPages() {
		super.addPages();
		page = new NewPartyWizardPage();
		addPage(page);
	}

	public PlayerGroup getGroup() {
		return group;
	}
}
