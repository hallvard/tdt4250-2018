package no.hal.pg.exampletask.config.actions;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.ecore.EClass;

import no.hal.pg.config.actions.AddConfigObjectToolbarAction;
import no.hal.pg.exampletask.config.ConfigPackage;

public class AddExampleTaskToolbarAction extends AddConfigObjectToolbarAction {

	@Override
	protected URL getImageURL(EClass eClass) {
		try {
			return new URL("platform:/plugin/no.hal.pg.exampletask.config.viewmodel/icons/CreateExampleTask.png");
		} catch (MalformedURLException e) {
			return null;
		}
	}
	
	public AddExampleTaskToolbarAction() {
		super(ConfigPackage.eINSTANCE.getExampleTaskConfig(), no.hal.pg.config.ConfigPackage.eINSTANCE.getGameConfig_Tasks());
	}
}
