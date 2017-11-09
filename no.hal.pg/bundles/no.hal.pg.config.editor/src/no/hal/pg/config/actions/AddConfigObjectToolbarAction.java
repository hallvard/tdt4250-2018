package no.hal.pg.config.actions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelectionProvider;

import no.hal.pg.config.GameConfig;

public class AddConfigObjectToolbarAction extends ConfigToolbarAction {

	private EClass eClass;
	private EReference eRef;
	
	public AddConfigObjectToolbarAction(EClass eClass, EReference eRef) {
		this.eClass = eClass;
		this.eRef = eRef;
	}
	
	@Override
	public Action getAction(Object currentObject, ISelectionProvider selectionProvider) {
		ConfigAction configAction = new ConfigAction(selectionProvider) {
			{
				String name = eClass.getName(), suffix = "Config";
				if (name.endsWith(suffix)) {
					name = name.substring(0, name.length() - suffix.length());
				}
				setText(name);
			}
			@Override
			protected void run(GameConfig gameConfig) {
				EObject newObject = EcoreUtil.create(eClass);
				if (eRef.isMany()) {
					((EList) gameConfig.eGet(eRef)).add(newObject);
				} else {
					gameConfig.eSet(eRef, newObject);
				}
			}
		};
		return configAction;
	}
}
