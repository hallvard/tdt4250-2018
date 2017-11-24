package no.hal.pg.config.actions;

import java.net.URL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionProvider;

import no.hal.pg.config.GameConfig;

public class AddConfigObjectToolbarAction extends ConfigToolbarAction {

	private EClass eClass;
	private EReference eRef;
	
	public AddConfigObjectToolbarAction(EClass eClass, EReference eRef) {
		this.eClass = eClass;
		this.eRef = eRef;
	}
	
	protected String getText(EClass eClass) {
		String name = eClass.getName(), suffix = "Config";
		if (name.endsWith(suffix)) {
			name = name.substring(0, name.length() - suffix.length());
		}
		return name;
	}

	protected String getToolTipText(EClass eClass) {
		return "Create " + getText(eClass);
	}
	
	protected URL getImageURL(EClass eClass) {
		return null;
	}

	protected ImageDescriptor getImageDescriptor(EClass eClass) {
		URL imageURL = getImageURL(eClass);
		return (imageURL != null ? ImageDescriptor.createFromURL(imageURL) : null);
	}
	
	@Override
	public Action getAction(Object currentObject, ISelectionProvider selectionProvider) {
		ConfigAction configAction = new ConfigAction(selectionProvider) {
			{
				String text = AddConfigObjectToolbarAction.this.getText(eClass);
				ImageDescriptor imageDescriptor = AddConfigObjectToolbarAction.this.getImageDescriptor(eClass);
				if (imageDescriptor != null) {
					setImageDescriptor(imageDescriptor);
				} else {
					setText(text);
				}
				setToolTipText(AddConfigObjectToolbarAction.this.getToolTipText(eClass));
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
