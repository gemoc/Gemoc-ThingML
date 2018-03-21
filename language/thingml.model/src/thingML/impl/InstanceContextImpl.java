/**
 */
package thingML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import thingML.InstanceContext;
import thingML.PropertyEntry;
import thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thingML.impl.InstanceContextImpl#getPropertyEntries <em>Property Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceContextImpl extends MinimalEObjectImpl.Container implements InstanceContext {
	/**
	 * The cached value of the '{@link #getPropertyEntries() <em>Property Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyEntry> propertyEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThingMLPackage.Literals.INSTANCE_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyEntry> getPropertyEntries() {
		if (propertyEntries == null) {
			propertyEntries = new EObjectContainmentEList<PropertyEntry>(PropertyEntry.class, this, ThingMLPackage.INSTANCE_CONTEXT__PROPERTY_ENTRIES);
		}
		return propertyEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThingMLPackage.INSTANCE_CONTEXT__PROPERTY_ENTRIES:
				return ((InternalEList<?>)getPropertyEntries()).basicRemove(otherEnd, msgs);
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
			case ThingMLPackage.INSTANCE_CONTEXT__PROPERTY_ENTRIES:
				return getPropertyEntries();
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
			case ThingMLPackage.INSTANCE_CONTEXT__PROPERTY_ENTRIES:
				getPropertyEntries().clear();
				getPropertyEntries().addAll((Collection<? extends PropertyEntry>)newValue);
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
			case ThingMLPackage.INSTANCE_CONTEXT__PROPERTY_ENTRIES:
				getPropertyEntries().clear();
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
			case ThingMLPackage.INSTANCE_CONTEXT__PROPERTY_ENTRIES:
				return propertyEntries != null && !propertyEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstanceContextImpl
