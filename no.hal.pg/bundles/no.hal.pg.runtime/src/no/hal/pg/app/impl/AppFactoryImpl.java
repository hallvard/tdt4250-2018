/**
 */
package no.hal.pg.app.impl;

import no.hal.pg.app.*;

import no.hal.pg.runtime.Task;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppFactoryImpl extends EFactoryImpl implements AppFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AppFactory init() {
		try {
			AppFactory theAppFactory = (AppFactory)EPackage.Registry.INSTANCE.getEFactory(AppPackage.eNS_URI);
			if (theAppFactory != null) {
				return theAppFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AppFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AppPackage.GAME_VIEW: return createGameView();
			case AppPackage.TASK_VIEW: return createTaskView();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Task<?>> GameView<T> createGameView() {
		GameViewImpl<T> gameView = new GameViewImpl<T>();
		return gameView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Task<?>> TaskView<T> createTaskView() {
		TaskViewImpl<T> taskView = new TaskViewImpl<T>();
		return taskView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppPackage getAppPackage() {
		return (AppPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AppPackage getPackage() {
		return AppPackage.eINSTANCE;
	}

} //AppFactoryImpl
