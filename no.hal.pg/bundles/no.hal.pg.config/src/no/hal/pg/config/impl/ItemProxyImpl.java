/**
 */
package no.hal.pg.config.impl;

import no.hal.pg.config.ConfigPackage;
import no.hal.pg.config.ItemConfig;
import no.hal.pg.config.ItemProxy;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ItemProxyImpl extends ProxyImpl<ItemConfig> implements ItemProxy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemProxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.ITEM_PROXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setRef(ItemConfig newRef) {
		super.setRef(newRef);
	}

} //ItemProxyImpl
