/**
 */
package no.hal.pg.runtime.impl;

import java.util.ArrayList;
import java.util.Collection;

import no.hal.pg.runtime.Item;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.PlayersHaveItemsCondition;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Players Have Items Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.impl.PlayersHaveItemsConditionImpl#getItemClasses <em>Item Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayersHaveItemsConditionImpl extends AbstractConditionImpl<Task<?>> implements PlayersHaveItemsCondition {
	/**
	 * The cached value of the '{@link #getItemClasses() <em>Item Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> itemClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayersHaveItemsConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.PLAYERS_HAVE_ITEMS_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setContext(Task<?> newContext) {
		super.setContext(newContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClass> getItemClasses() {
		if (itemClasses == null) {
			itemClasses = new EObjectResolvingEList<EClass>(EClass.class, this, RuntimePackage.PLAYERS_HAVE_ITEMS_CONDITION__ITEM_CLASSES);
		}
		return itemClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.PLAYERS_HAVE_ITEMS_CONDITION__ITEM_CLASSES:
				return getItemClasses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RuntimePackage.PLAYERS_HAVE_ITEMS_CONDITION__ITEM_CLASSES:
				getItemClasses().clear();
				getItemClasses().addAll((Collection<? extends EClass>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RuntimePackage.PLAYERS_HAVE_ITEMS_CONDITION__ITEM_CLASSES:
				getItemClasses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RuntimePackage.PLAYERS_HAVE_ITEMS_CONDITION__ITEM_CLASSES:
				return itemClasses != null && !itemClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	//
	
	@Override
	public boolean test(Task<?> context) {
		EList<Player> players = context.getPlayers();
		Collection<Item> itemsFound = new ArrayList<Item>();
		itemClass : for (EClass itemClass : getItemClasses()) {
			for (Player player : players) {
				for (Item item : player.getItems()) {
					if (itemClass.isInstance(item) && (! itemsFound.contains(item))) {
						itemsFound.add(item);
						continue itemClass;
					}
				}
			}
			// item for itemClass not found
			return false;
		}
		return true;
	}

} //PlayersHaveItemsConditionImpl
