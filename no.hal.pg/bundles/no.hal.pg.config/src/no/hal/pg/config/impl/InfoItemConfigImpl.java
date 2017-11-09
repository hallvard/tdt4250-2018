/**
 */
package no.hal.pg.config.impl;

import org.eclipse.emf.ecore.EClass;

import no.hal.pg.config.ConfigPackage;
import no.hal.pg.config.InfoItemConfig;
import no.hal.pg.config.ItemProxy;
import no.hal.pg.runtime.InfoItem;
import no.hal.pg.runtime.Item;
import no.hal.pg.runtime.RuntimeFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Info Item Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InfoItemConfigImpl extends ItemConfigImpl implements InfoItemConfig {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoItemConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.INFO_ITEM_CONFIG;
	}
	
	@Override
	public Item createItem(ItemProxy proxy) {
		InfoItem infoItem = RuntimeFactory.eINSTANCE.createInfoItem();
		String description = getDescription();
		if (description == null) {
			description = proxy.getDescription();
		}
		infoItem.setDescription(description);
		return infoItem;
	}

} //InfoItemConfigImpl
