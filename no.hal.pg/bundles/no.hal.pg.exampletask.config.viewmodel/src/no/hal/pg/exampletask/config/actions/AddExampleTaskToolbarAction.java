package no.hal.pg.exampletask.config.actions;

import no.hal.pg.config.actions.AddConfigObjectToolbarAction;
import no.hal.pg.exampletask.config.ConfigPackage;

public class AddExampleTaskToolbarAction extends AddConfigObjectToolbarAction {

	public AddExampleTaskToolbarAction() {
		super(ConfigPackage.eINSTANCE.getExampleTaskConfig(), no.hal.pg.config.ConfigPackage.eINSTANCE.getGameConfig_Tasks());
	}
}
