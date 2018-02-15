/**
 */
package org.thingml.xthingml.thingML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingml.thingML.PrintAction#isLine <em>Line</em>}</li>
 *   <li>{@link org.thingml.xthingml.thingML.PrintAction#getMsg <em>Msg</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingml.thingML.ThingMLPackage#getPrintAction()
 * @model
 * @generated
 */
public interface PrintAction extends Action {
	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(boolean)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getPrintAction_Line()
	 * @model
	 * @generated
	 */
	boolean isLine();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.PrintAction#isLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #isLine()
	 * @generated
	 */
	void setLine(boolean value);

	/**
	 * Returns the value of the '<em><b>Msg</b></em>' containment reference list.
	 * The list contents are of type {@link org.thingml.xthingml.thingML.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' containment reference list.
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getPrintAction_Msg()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getMsg();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // PrintAction
