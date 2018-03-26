/**
 */
package thingML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.thingml.xtext.thingML.State;
import org.thingml.xtext.thingML.StateContainer;

import thingML.StateContainerEntry;
import thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Container Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thingML.impl.StateContainerEntryImpl#getStateContainer <em>State Container</em>}</li>
 *   <li>{@link thingML.impl.StateContainerEntryImpl#getCurrentState <em>Current State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateContainerEntryImpl extends MinimalEObjectImpl.Container implements StateContainerEntry {
	/**
	 * The cached value of the '{@link #getStateContainer() <em>State Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateContainer()
	 * @generated
	 * @ordered
	 */
	protected StateContainer stateContainer;

	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected State currentState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateContainerEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThingMLPackage.Literals.STATE_CONTAINER_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateContainer getStateContainer() {
		if (stateContainer != null && stateContainer.eIsProxy()) {
			InternalEObject oldStateContainer = (InternalEObject)stateContainer;
			stateContainer = (StateContainer)eResolveProxy(oldStateContainer);
			if (stateContainer != oldStateContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThingMLPackage.STATE_CONTAINER_ENTRY__STATE_CONTAINER, oldStateContainer, stateContainer));
			}
		}
		return stateContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateContainer basicGetStateContainer() {
		return stateContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateContainer(StateContainer newStateContainer) {
		StateContainer oldStateContainer = stateContainer;
		stateContainer = newStateContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.STATE_CONTAINER_ENTRY__STATE_CONTAINER, oldStateContainer, stateContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getCurrentState() {
		if (currentState != null && currentState.eIsProxy()) {
			InternalEObject oldCurrentState = (InternalEObject)currentState;
			currentState = (State)eResolveProxy(oldCurrentState);
			if (currentState != oldCurrentState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThingMLPackage.STATE_CONTAINER_ENTRY__CURRENT_STATE, oldCurrentState, currentState));
			}
		}
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentState(State newCurrentState) {
		State oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.STATE_CONTAINER_ENTRY__CURRENT_STATE, oldCurrentState, currentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThingMLPackage.STATE_CONTAINER_ENTRY__STATE_CONTAINER:
				if (resolve) return getStateContainer();
				return basicGetStateContainer();
			case ThingMLPackage.STATE_CONTAINER_ENTRY__CURRENT_STATE:
				if (resolve) return getCurrentState();
				return basicGetCurrentState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ThingMLPackage.STATE_CONTAINER_ENTRY__STATE_CONTAINER:
				setStateContainer((StateContainer)newValue);
				return;
			case ThingMLPackage.STATE_CONTAINER_ENTRY__CURRENT_STATE:
				setCurrentState((State)newValue);
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
			case ThingMLPackage.STATE_CONTAINER_ENTRY__STATE_CONTAINER:
				setStateContainer((StateContainer)null);
				return;
			case ThingMLPackage.STATE_CONTAINER_ENTRY__CURRENT_STATE:
				setCurrentState((State)null);
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
			case ThingMLPackage.STATE_CONTAINER_ENTRY__STATE_CONTAINER:
				return stateContainer != null;
			case ThingMLPackage.STATE_CONTAINER_ENTRY__CURRENT_STATE:
				return currentState != null;
		}
		return super.eIsSet(featureID);
	}

} //StateContainerEntryImpl
