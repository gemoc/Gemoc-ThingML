/**
 */
package thingML;

import org.eclipse.emf.ecore.EObject;

import org.thingml.xtext.thingML.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Proxy Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thingML.ArrayProxyEntry#getIndexExpression <em>Index Expression</em>}</li>
 *   <li>{@link thingML.ArrayProxyEntry#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see thingML.ThingMLPackage#getArrayProxyEntry()
 * @model
 * @generated
 */
public interface ArrayProxyEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Index Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Expression</em>' reference.
	 * @see #setIndexExpression(Expression)
	 * @see thingML.ThingMLPackage#getArrayProxyEntry_IndexExpression()
	 * @model required="true"
	 * @generated
	 */
	Expression getIndexExpression();

	/**
	 * Sets the value of the '{@link thingML.ArrayProxyEntry#getIndexExpression <em>Index Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Expression</em>' reference.
	 * @see #getIndexExpression()
	 * @generated
	 */
	void setIndexExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Value)
	 * @see thingML.ThingMLPackage#getArrayProxyEntry_Value()
	 * @model required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link thingML.ArrayProxyEntry#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // ArrayProxyEntry
