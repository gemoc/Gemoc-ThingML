/**
 */
package org.thingml.xthingml.thingML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.thingml.xthingml.thingML.ByteLiteral;
import org.thingml.xthingml.thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Byte Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingml.thingML.impl.ByteLiteralImpl#getByteValue <em>Byte Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ByteLiteralImpl extends ExpressionImpl implements ByteLiteral {
	/**
	 * The default value of the '{@link #getByteValue() <em>Byte Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteValue()
	 * @generated
	 * @ordered
	 */
	protected static final byte BYTE_VALUE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getByteValue() <em>Byte Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteValue()
	 * @generated
	 * @ordered
	 */
	protected byte byteValue = BYTE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ByteLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThingMLPackage.Literals.BYTE_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getByteValue() {
		return byteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteValue(byte newByteValue) {
		byte oldByteValue = byteValue;
		byteValue = newByteValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.BYTE_LITERAL__BYTE_VALUE, oldByteValue, byteValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThingMLPackage.BYTE_LITERAL__BYTE_VALUE:
				return getByteValue();
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
			case ThingMLPackage.BYTE_LITERAL__BYTE_VALUE:
				setByteValue((Byte)newValue);
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
			case ThingMLPackage.BYTE_LITERAL__BYTE_VALUE:
				setByteValue(BYTE_VALUE_EDEFAULT);
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
			case ThingMLPackage.BYTE_LITERAL__BYTE_VALUE:
				return byteValue != BYTE_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (byteValue: ");
		result.append(byteValue);
		result.append(')');
		return result.toString();
	}

} //ByteLiteralImpl
