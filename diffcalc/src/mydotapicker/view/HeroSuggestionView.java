package mydotapicker.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;
import org.eclipse.ui.part.ViewPart;

import MatchModel.Hero;
import MatchModel.MatchModelFactory;
import MatchModel.Player;
import MatchModel.PlayerGroup;
import mydotapicker.controller.GroupSuggestion;
import mydotapicker.controller.HeroSuggestionController;

public class HeroSuggestionView extends ViewPart {
	
	private class HeroSelectionDialog extends FilteredItemsSelectionDialog {
		public HeroSelectionDialog(Shell shell, boolean multi) {
			super(shell, multi);
		}

		protected IStatus validateItem(Object item) {
			return Status.OK_STATUS;
		}
		
		protected Comparator<Hero> getItemsComparator() {
			return new Comparator<Hero>() {
				public int compare(Hero o1, Hero o2) {
					return o1.getId() - o2.getId();
				}
			};
		}
		
		public String getElementName(Object item) {
			Hero h = (Hero) item;
			return h.getName();
		}
		
		protected IDialogSettings getDialogSettings() {
			return new DialogSettings("mydotapicker.herodialog");
		}
		
		protected void fillContentProvider(AbstractContentProvider contentProvider, ItemsFilter itemsFilter,
				IProgressMonitor progressMonitor) throws CoreException {
			Collection<Hero> heroes = controller.getAllHeroes();
			progressMonitor.beginTask("Searching", heroes.size());
			for (Hero h : heroes) {
				contentProvider.add(h, itemsFilter);
				progressMonitor.worked(1);
			}
		}
		
		protected ItemsFilter createFilter() {
			return new ItemsFilter() {

				public boolean matchItem(Object item) {
					Hero hero = (Hero) item;
					return matches(hero.getName())  ;
				}

				public boolean isConsistentItem(Object item) {
					return true;
				}
			};
		}
		
		protected Control createExtendedContentArea(Composite parent) {
			return null;
		}
	}
	
	private class HeroSelectionAdapter extends SelectionAdapter {
		private Button sourceButton;

		private HeroSelectionAdapter(Button sourceButton) {
			this.sourceButton = sourceButton;
		}
		
		@Override
		public void widgetSelected(SelectionEvent e) {
			sourceButton.setData(null);
			updateSuggestedHeroes();
			sourceButton.setImage(images.getDefaultImage());
		}
	}
	
	public static final String ID = "mydotapicker.view";

	private HeroSuggestionController controller;
	private Images images = new Images();
	private TableViewer suggestionViewer;
	private Composite composite;
	private Button[] enemies;
	private Button[] allies;
	private Button exactDiff;

	public HeroSuggestionView() {
		super();
		controller = new HeroSuggestionController();

		PlayerGroup selected = controller.getFirstAvailableGroup();
		if (selected == null) {
			NewPartyWizard partyWizard = new NewPartyWizard();
			WizardDialog dialog = new WizardDialog(null, partyWizard);
			dialog.open();
			if (dialog.getReturnCode() == WizardDialog.OK) {
				selected = partyWizard.getGroup();
			}
		}
		if (selected == null) {
			selected = MatchModelFactory.eINSTANCE.createPlayerGroup();
		}
		updateControlerSelection(selected);
	}

	private void updateControlerSelection(PlayerGroup selected) {
		Adapter adapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						updateSuggestedHeroes();
					}

				});
			}
		};
		controller.setSelected(selected, adapter);		
	}
	
	void updateSelection(PlayerGroup group) {
		updateControlerSelection(group);
		clearButtons(controller.getSlected().getPlayers().size());
		updateSuggestedHeroes();
	}

	private void updateSuggestedHeroes() {
		final List<Hero> alliedHeroes = getHeroArray(allies);
		final List<Hero> enemyHeroes = getHeroArray(enemies);
		final boolean exact = exactDiff.getSelection();
		
		// TODO Reuse job and cancel at dispose...
		Job suggestHeroJob = new Job("Parsing matches"){
			protected IStatus run(IProgressMonitor monitor) {
				if (controller.getSlected() == null) {
					return Status.CANCEL_STATUS;
				}
				try {
					List<GroupSuggestion> suggestions = 
							controller.getSuggestedHeroes(alliedHeroes, enemyHeroes, exact);
					Display.getDefault().asyncExec(new Runnable(){
						public void run() {
							suggestionViewer.setInput(null);
							List<Player> players = controller.getSlected().getPlayers();
							for (int i = 0; i < 5; i++) {
								TableColumn column = suggestionViewer.getTable().getColumn(i);
								if (i < players.size()) {
									column.setWidth(150);
									column.setText(players.get(i).getName());
								} else {
									column.setWidth(0);
									column.setText("");
								}
							}
							suggestionViewer.setInput(suggestions);
							composite.pack();
						}});
				} catch (InterruptedException e) {
					// TODO Return error
					e.printStackTrace();
				}

				return Status.OK_STATUS;
			}};
		suggestHeroJob.schedule();
	}

	public void createPartControl(Composite parent) {
		composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		
		exactDiff = new Button(composite, SWT.CHECK);
		exactDiff.setText("Exact diff");
		exactDiff.setSelection(true);
		exactDiff.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateSuggestedHeroes();
			}
		});
		
		Composite buttonComposite = new Composite(composite, SWT.NONE);
		buttonComposite.setLayout(new GridLayout(5, false));

		enemies = new Button[5];
		for (int i = 0; i < enemies.length; i++) {
			enemies[i] = createButton(buttonComposite);
		}
		
		allies = new Button[5];
		for (int i = 0; i < allies.length; i++) {
			allies[i] = createButton(buttonComposite);
		}

		suggestionViewer = new TableViewer(composite, SWT.NONE);
		suggestionViewer.setContentProvider(ArrayContentProvider.getInstance());
		suggestionViewer.getTable().setLinesVisible(true);
		suggestionViewer.getTable().setHeaderVisible(true);
		
		for (int i = 0; i < allies.length; i++) {
			TableViewerColumn column = new TableViewerColumn(suggestionViewer, SWT.NONE);
			column.getColumn().setWidth(0);
			column.setLabelProvider(new HeroLabelProvider(i));
		}
		if (controller.getSlected() != null) {
			clearButtons(controller.getSlected().getPlayers().size());
		}
		updateSuggestedHeroes();
	}
	
	private class HeroLabelProvider extends ColumnLabelProvider {

		private int colNumber;

		public HeroLabelProvider(int num) {
			colNumber = num;
		}
		
		@Override
		public String getText(Object element) {
			if (element instanceof GroupSuggestion && controller.getSlected().getPlayers().size() > colNumber) {
				Player player = controller.getSlected().getPlayers().get(colNumber);
				GroupSuggestion gs = (GroupSuggestion) element;
				int suggestionSize = exactDiff.getSelection() ? 0 : getHeroArray(allies).size() + getHeroArray(enemies).size();
				return gs.printPlayerSuggestion(player, suggestionSize);
			}
			return "";
		}		
	}

	private Button createButton(Composite composite) {
		Button b = new Button(composite, SWT.NONE);
		b.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FilteredItemsSelectionDialog dialog = new HeroSelectionDialog(composite.getShell(), false);
				dialog.setListLabelProvider(new LabelProvider(){
					@Override
					public String getText(Object element) {
						if (element instanceof Hero) {
							return ((Hero)element).getName();
						}
						return "";
					}
				});
				
				if (dialog.open() == InputDialog.OK) {
					Button b = (Button) e.getSource();
					Hero h = (Hero) dialog.getResult()[0];
					b.setData(h);
					updateSuggestedHeroes();
					b.setImage(images.getHeroImage(h));
				}
			}
		});
		
		MenuManager menuManager = new MenuManager();
		Menu menu = menuManager.createContextMenu(b);
		b.setMenu(menu);
		getSite().registerContextMenu(menuManager, getSite().getSelectionProvider());
		
		MenuItem item = new MenuItem(menu, SWT.PUSH);
		item.setText("Remove");
		item.addSelectionListener(new HeroSelectionAdapter(b));
		return b;
	}
	
	protected List<Hero> getHeroArray(Button[] array) {
		ArrayList<Hero> heroes = new ArrayList<Hero>();
		for (int i = 0; i < array.length; i++) {
			Hero h = (Hero) array[i].getData();
			if (h != null) {
				heroes.add(h);
			}
		}
		return heroes;
	}
	
	@Override
	public void dispose() {
		images.dispose();
		super.dispose();
	}
	
	private void clearButtons(int partySize) {
		for (int i = 0; i < 5; i++) {
			allies[i].setData(null);
			allies[i].setImage(images.getDefaultImage());
			enemies[i].setData(null);
			enemies[i].setImage(images.getDefaultImage());
			allies[i].setEnabled(i >= partySize);
		}

	}

	public void setFocus() {
		allies[0].setFocus();
	}
}