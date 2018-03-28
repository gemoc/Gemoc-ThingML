/**
 */
package thingML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import thingML.DynamicCompositeState;
import thingML.DynamicInstance;
import thingML.DynamicProperty;
import thingML.Frame;
import thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thingML.impl.DynamicInstanceImpl#getDynamicProperties <em>Dynamic Properties</em>}</li>
 *   <li>{@link thingML.impl.DynamicInstanceImpl#getDynamicCompositeStates <em>Dynamic Composite States</em>}</li>
 *   <li>{@link thingML.impl.DynamicInstanceImpl#getExecutionFrame <em>Execution Frame</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicInstanceImpl extends MinimalEObjectImpl.Container implements DynamicInstance {
	/**
	 * The cached value of the '{@link #getDynamicProperties() <em>Dynamic Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicProperty> dynamicProperties;

	/**
	 * The cached value of the '{@link #getDynamicCompositeStates() <em>Dynamic Composite States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicCompositeStates()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicCompositeState> dynamicCompositeStates;

	/**
	 * The cached value of the '{@link #getExecutionFrame() <em>Execution Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionFrame()
	 * @generated
	 * @ordered
	 */
	protected Frame executionFrame;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThingMLPackage.Literals.DYNAMIC_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicProperty> getDynamicProperties() {
		if (dynamicProperties == null) {
			dynamicProperties = new EObjectContainmentEList<DynamicProperty>(DynamicProperty.class, this, ThingMLPackage.DYNAMIC_INSTANCE__DYNAMIC_PROPERTIES);
		}
		return dynamicProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicCompositeState> getDynamicCompositeStates() {
		if (dynamicCompositeStates == null) {
			dynamicCompositeStates = new EObjectContainmentEList<DynamicCompositeState>(DynamicCompositeState.class, this, ThingMLPackage.DYNAMIC_INSTANCE__DYNAMIC_COMPOSITE_STATES);
		}
		return dynamicCompositeStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame getExecutionFrame() {
		return executionFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionFrame(Frame newExecutionFrame, NotificationChain msgs) {
		Frame oldExecutionFrame = executionFrame;
		executionFrame = newExecutionFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.DYNAMIC_INSTANCE__EXECUTION_FRAME, oldExecutionFrame, newExecutionFrame);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionFrame(Frame newExecutionFrame) {
		if (newExecutionFrame != executionFrame) {
			NotificationChain msgs = null;
			if (executionFrame != null)
				msgs = ((InternalEObject)executionFrame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DYNAMIC_INSTANCE__EXECUTION_FRAME, null, msgs);
			if (newExecutionFrame != null)
				msgs = ((InternalEObject)newExecutionFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DYNAMIC_INSTANCE__EXECUTION_FRAME, null, msgs);
			msgs = basicSetExecutionFrame(newExecutionFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DYNAMIC_INSTANCE__EXECUTION_FRAME, newExecutionFrame, newExecutionFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThingMLPackage.DYNAMIC_INSTANCE__DYNAMIC_PROPERTIES:
				return ((InternalEList<?>)getDynamicProperties()).basicRemove(otherEnd, msgs);
			case ThingMLPackage.DYNAMIC_INSTANCE__DYNAMIC_COMPOSITE_STATES:
				return ((InternalEList<?>)getDynamicCompositeStates()).basicRemove(otherEnd, msgs);
			case ThingMLPackage.DYNAMIC_INSTANCE__EXECUTION_FRAME:
				return basicSetExecutionFrame(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThingMLPackage.DYNAMIC_INSTANCE__DYNAMIC_PROPERTIES:
				return getDynamicProperties();
			case ThingMLPackage.DYNAMIC_INSTANCE__DYNAMIC_COMPOSITE_STATES:
				return getDynamicCompositeStates();
			case ThingMLPackage.DYNAMIC_INSTANCE__EXECUTION_FRAME:
				return getExecutionFrame();
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
			case ThingMLPackage.DYNAMIC_INSTANCE__DYNAMIC_PROPERTIES:
				getDynamicProperties().clear();
				getDynamicProperties().addAll((Collection<? extends DynamicProperty>)newValue);
				return;
			case ThingMLPackage.DYNAMIC_INSTANCE__DYNAMIC_COMPOSITE_STATES:
				getDynamicCompositeStates().clear();
				getDynamicCompositeStates().addAll((Collection<? extends DynamicCompositeState>)newValue);
				return;
			case ThingMLPackage.DYNAMIC_INSTANCE__EXECUTION_FRAME:
				setExecutionFrame((Frame)newValue);
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
			case ThingMLPackage.DYNAMIC_INSTANCE__DYNAMIC_PROPERTIES:
				getDynamicProperties().clear();
				return;
			case ThingMLPackage.DYNAMIC_INSTANCE__DYNAMIC_COMPOSITE_STATES:
				getDynamicCompositeStates().clear();
				return;
			case ThingMLPackage.DYNAMIC_INSTANCE__EXECUTION_FRAME:
				setExecutionFrame((Frame)null);
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
			case ThingMLPackage.DYNAMIC_INSTANCE__DYNAMIC_PROPERTIES:
				return dynamicProperties != null && !dynamicProperties.isEmpty();
			case ThingMLPackage.DYNAMIC_INSTANCE__DYNAMIC_COMPOSITE_STATES:
				return dynamicCompositeStates != null && !dynamicCompositeStates.isEmpty();
			case ThingMLPackage.DYNAMIC_INSTANCE__EXECUTION_FRAME:
				return executionFrame != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicInstanceImpl
