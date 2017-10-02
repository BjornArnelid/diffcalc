package mydotapicker.view;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;

import MatchModel.Player;
import MatchModel.PlayerGroup;
import diffcalc.Activator;

// TODO Update selection when new Party is created
public class ChoosePartyContribution extends ContributionItem {
	private static class MySelectionAdapter extends SelectionAdapter {
		private PlayerGroup group;

		public MySelectionAdapter(PlayerGroup group) {
			this.group = group;
		}
		
		@Override
		public void widgetSelected(SelectionEvent e) {
			// TODO What about null values
			IViewPart view = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("mydotapicker.view");
			if (view instanceof HeroSuggestionView) {
				((HeroSuggestionView) view).updateSelection(group);
			}
		}
	}

	@Override
	public void fill(Menu menu, int index) {
		EList<EObject> contents = Activator.getSharedInstance().getMatchModel().getContents();
		if (contents == null) {
			return;
		}
		for (EObject eObject : Activator.getSharedInstance().getMatchModel().getContents()) {
			if (eObject instanceof PlayerGroup) {
				PlayerGroup group = (PlayerGroup) eObject;
				if (!group.getPlayers().isEmpty()) {
					MenuItem item = new MenuItem(menu, SWT.RADIO);
					String title = "";
					for (Player player : group.getPlayers()) {
						title += player.getName() + " ";
					}
					item.setText(title);
					item.setData(group);
					item.addSelectionListener(new MySelectionAdapter(group));
				}
			}
		}
		if(menu.getItems().length <1) {
			return;
		}
		menu.getItem(0).setSelection(true);
	}
}
