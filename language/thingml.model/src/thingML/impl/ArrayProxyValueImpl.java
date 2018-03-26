/**
 */
package thingML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import thingML.ArrayProxyEntry;
import thingML.ArrayProxyValue;
import thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Proxy Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thingML.impl.ArrayProxyValueImpl#getArrayProxyEntries <em>Array Proxy Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayProxyValueImpl extends ProxyValueImpl implements ArrayProxyValue {
	/**
	 * The cached value of the '{@link #getArrayProxyEntries() <em>Array Proxy Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayProxyEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayProxyEntry> arrayProxyEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayProxyValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThingMLPackage.Literals.ARRAY_PROXY_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayProxyEntry> getArrayProxyEntries() {
		if (arrayProxyEntries == null) {
			arrayProxyEntries = new EObjectContainmentEList<ArrayProxyEntry>(ArrayProxyEntry.class, this, ThingMLPackage.ARRAY_PROXY_VALUE__ARRAY_PROXY_ENTRIES);
		}
		return arrayProxyEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThingMLPackage.ARRAY_PROXY_VALUE__ARRAY_PROXY_ENTRIES:
				return ((InternalEList<?>)getArrayProxyEntries()).basicRemove(otherEnd, msgs);
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
			case ThingMLPackage.ARRAY_PROXY_VALUE__ARRAY_PROXY_ENTRIES:
				return getArrayProxyEntries();
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
			case ThingMLPackage.ARRAY_PROXY_VALUE__ARRAY_PROXY_ENTRIES:
				getArrayProxyEntries().clear();
				getArrayProxyEntries().addAll((Collection<? extends ArrayProxyEntry>)newValue);
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
			case ThingMLPackage.ARRAY_PROXY_VALUE__ARRAY_PROXY_ENTRIES:
				getArrayProxyEntries().clear();
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
			case ThingMLPackage.ARRAY_PROXY_VALUE__ARRAY_PROXY_ENTRIES:
				return arrayProxyEntries != null && !arrayProxyEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArrayProxyValueImpl
