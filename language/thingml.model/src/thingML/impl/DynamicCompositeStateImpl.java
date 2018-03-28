/**
 */
package thingML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.thingml.xtext.thingML.CompositeState;
import org.thingml.xtext.thingML.State;

import thingML.DynamicCompositeState;
import thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Composite State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thingML.impl.DynamicCompositeStateImpl#getCompositeState <em>Composite State</em>}</li>
 *   <li>{@link thingML.impl.DynamicCompositeStateImpl#getCurrentState <em>Current State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicCompositeStateImpl extends MinimalEObjectImpl.Container implements DynamicCompositeState {
	/**
	 * The cached value of the '{@link #getCompositeState() <em>Composite State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeState()
	 * @generated
	 * @ordered
	 */
	protected CompositeState compositeState;

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
	protected DynamicCompositeStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThingMLPackage.Literals.DYNAMIC_COMPOSITE_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeState getCompositeState() {
		if (compositeState != null && compositeState.eIsProxy()) {
			InternalEObject oldCompositeState = (InternalEObject)compositeState;
			compositeState = (CompositeState)eResolveProxy(oldCompositeState);
			if (compositeState != oldCompositeState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThingMLPackage.DYNAMIC_COMPOSITE_STATE__COMPOSITE_STATE, oldCompositeState, compositeState));
			}
		}
		return compositeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeState basicGetCompositeState() {
		return compositeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeState(CompositeState newCompositeState) {
		CompositeState oldCompositeState = compositeState;
		compositeState = newCompositeState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DYNAMIC_COMPOSITE_STATE__COMPOSITE_STATE, oldCompositeState, compositeState));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThingMLPackage.DYNAMIC_COMPOSITE_STATE__CURRENT_STATE, oldCurrentState, currentState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DYNAMIC_COMPOSITE_STATE__CURRENT_STATE, oldCurrentState, currentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThingMLPackage.DYNAMIC_COMPOSITE_STATE__COMPOSITE_STATE:
				if (resolve) return getCompositeState();
				return basicGetCompositeState();
			case ThingMLPackage.DYNAMIC_COMPOSITE_STATE__CURRENT_STATE:
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
			case ThingMLPackage.DYNAMIC_COMPOSITE_STATE__COMPOSITE_STATE:
				setCompositeState((CompositeState)newValue);
				return;
			case ThingMLPackage.DYNAMIC_COMPOSITE_STATE__CURRENT_STATE:
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
			case ThingMLPackage.DYNAMIC_COMPOSITE_STATE__COMPOSITE_STATE:
				setCompositeState((CompositeState)null);
				return;
			case ThingMLPackage.DYNAMIC_COMPOSITE_STATE__CURRENT_STATE:
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
			case ThingMLPackage.DYNAMIC_COMPOSITE_STATE__COMPOSITE_STATE:
				return compositeState != null;
			case ThingMLPackage.DYNAMIC_COMPOSITE_STATE__CURRENT_STATE:
				return currentState != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicCompositeStateImpl
