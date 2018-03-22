/**
 */
package thingML;

import org.thingml.xtext.thingML.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thingML.ProxyValue#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see thingML.ThingMLPackage#getProxyValue()
 * @model
 * @generated
 */
public interface ProxyValue extends Value {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(Expression)
	 * @see thingML.ThingMLPackage#getProxyValue_Expression()
	 * @model required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link thingML.ProxyValue#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // ProxyValue
