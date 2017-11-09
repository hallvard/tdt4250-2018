package no.hal.pg.exampletask.config.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelectionProvider;

import no.hal.pg.config.GameConfig;
import no.hal.pg.config.actions.ConfigAction;
import no.hal.pg.config.actions.ConfigToolbarAction;
import no.hal.pg.exampletask.config.ConfigFactory;

public class AddExampleTaskToolbarAction extends ConfigToolbarAction {

	@Override
	public Action getAction(Object currentObject, ISelectionProvider selectionProvider) {
		ConfigAction configAction = new ConfigAction(selectionProvider) {
			{
				setText("ExampleTask");
			}
			@Override
			protected void run(GameConfig gameConfig) {
				gameConfig.getTasks().add(ConfigFactory.eINSTANCE.createExampleTaskConfig());
			}
		};
		return configAction;
	}
}
