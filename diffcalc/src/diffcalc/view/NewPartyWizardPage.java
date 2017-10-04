package diffcalc.view;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import MatchModel.MatchModelFactory;
import MatchModel.Player;
import MatchModel.PlayerGroup;

public class NewPartyWizardPage extends WizardPage {

	private TableViewer added;

	protected NewPartyWizardPage() {
		super("Hello World");
	}

	@Override
	public void createControl(Composite parent) {
		Composite main = new Composite(parent, SWT.NONE);
		main.setLayout(new GridLayout(2, false));
		
		Label nameLabel = new Label(main, SWT.NONE);
		nameLabel.setText("Name:");
		Text name = new Text(main, SWT.NONE);
		name.setMessage("Player name");
		
		Label idLabel = new Label(main, SWT.NONE);
		idLabel.setText("Id:");
		Text id = new Text(main, SWT.NONE);
		id.setMessage("Player id");

		Button add = new Button(main, SWT.PUSH);
		add.setText("Add...");
		
		added = new TableViewer(main, SWT.NONE);
		TableViewerColumn first = new TableViewerColumn(added, SWT.NONE);
		first.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof Player) {
					return ((Player)element).getName();
				}
				return null;
			}
		});
		first.getColumn().setWidth(200);
		first.getColumn().setText("Name");

		TableViewerColumn second = new TableViewerColumn(added, SWT.NONE);
		second.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof Player) {
					return Long.toString(((Player)element).getId());
				}
				return null;
			}
		});
		second.getColumn().setWidth(200);
		second.getColumn().setText("id");

		add.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Player player = MatchModelFactory.eINSTANCE.createPlayer();
				player.setName(name.getText());
				player.setId(Long.parseLong(id.getText()));
				added.add(player);
				
				name.setText("");
				id.setText("");
			}			
		});
		setControl(add);
	}

	PlayerGroup getTeamComposition() {
		PlayerGroup group = MatchModelFactory.eINSTANCE.createPlayerGroup();
		for (TableItem item : added.getTable().getItems()) {
			group.getPlayers().add((Player) item.getData());
		}
		return group;
	}
}
