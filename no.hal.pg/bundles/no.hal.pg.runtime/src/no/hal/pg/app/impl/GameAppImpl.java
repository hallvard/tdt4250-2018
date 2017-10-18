/**
 */
package no.hal.pg.app.impl;

import no.hal.pg.app.AppPackage;
import no.hal.pg.app.GameApp;
import no.hal.pg.app.GameView;

import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;

import no.hal.pg.runtime.Task;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game App</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GameAppImpl<T extends Task<?>> extends AppImpl<GameView<T>, Player, Game<T>> implements GameApp<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.GAME_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setModel(Game<T> newModel) {
		super.setModel(newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<GameView<T>> getViews() {
		if (views == null) {
			views = new EObjectContainmentEList<GameView<T>>(GameView.class, this, AppPackage.GAME_APP__VIEWS);
		}
		return views;
	}

} //GameAppImpl
