/**
 */
package thingML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.thingml.xtext.thingML.Expression;

import thingML.ArrayProxyEntry;
import thingML.ThingMLPackage;
import thingML.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Proxy Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thingML.impl.ArrayProxyEntryImpl#getIndexExpression <em>Index Expression</em>}</li>
 *   <li>{@link thingML.impl.ArrayProxyEntryImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayProxyEntryImpl extends MinimalEObjectImpl.Container implements ArrayProxyEntry {
	/**
	 * The cached value of the '{@link #getIndexExpression() <em>Index Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression indexExpression;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Value value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayProxyEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThingMLPackage.Literals.ARRAY_PROXY_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIndexExpression() {
		if (indexExpression != null && indexExpression.eIsProxy()) {
			InternalEObject oldIndexExpression = (InternalEObject)indexExpression;
			indexExpression = (Expression)eResolveProxy(oldIndexExpression);
			if (indexExpression != oldIndexExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThingMLPackage.ARRAY_PROXY_ENTRY__INDEX_EXPRESSION, oldIndexExpression, indexExpression));
			}
		}
		return indexExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetIndexExpression() {
		return indexExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexExpression(Expression newIndexExpression) {
		Expression oldIndexExpression = indexExpression;
		indexExpression = newIndexExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.ARRAY_PROXY_ENTRY__INDEX_EXPRESSION, oldIndexExpression, indexExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (Value)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThingMLPackage.ARRAY_PROXY_ENTRY__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Value newValue) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.ARRAY_PROXY_ENTRY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThingMLPackage.ARRAY_PROXY_ENTRY__INDEX_EXPRESSION:
				if (resolve) return getIndexExpression();
				return basicGetIndexExpression();
			case ThingMLPackage.ARRAY_PROXY_ENTRY__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
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
			case ThingMLPackage.ARRAY_PROXY_ENTRY__INDEX_EXPRESSION:
				setIndexExpression((Expression)newValue);
				return;
			case ThingMLPackage.ARRAY_PROXY_ENTRY__VALUE:
				setValue((Value)newValue);
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
			case ThingMLPackage.ARRAY_PROXY_ENTRY__INDEX_EXPRESSION:
				setIndexExpression((Expression)null);
				return;
			case ThingMLPackage.ARRAY_PROXY_ENTRY__VALUE:
				setValue((Value)null);
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
			case ThingMLPackage.ARRAY_PROXY_ENTRY__INDEX_EXPRESSION:
				return indexExpression != null;
			case ThingMLPackage.ARRAY_PROXY_ENTRY__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrayProxyEntryImpl
