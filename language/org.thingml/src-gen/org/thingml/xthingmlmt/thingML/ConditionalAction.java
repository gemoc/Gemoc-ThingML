/**
 */
package org.thingml.xthingmlmt.thingML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingmlmt.thingML.ConditionalAction#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.thingml.xthingmlmt.thingML.ConditionalAction#getAction <em>Action</em>}</li>
 *   <li>{@link org.thingml.xthingmlmt.thingML.ConditionalAction#getElseAction <em>Else Action</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getConditionalAction()
 * @model
 * @generated
 */
public interface ConditionalAction extends Action {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getConditionalAction_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.thingml.xthingmlmt.thingML.ConditionalAction#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getConditionalAction_Action()
	 * @model containment="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link org.thingml.xthingmlmt.thingML.ConditionalAction#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Else Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Action</em>' containment reference.
	 * @see #setElseAction(Action)
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getConditionalAction_ElseAction()
	 * @model containment="true"
	 * @generated
	 */
	Action getElseAction();

	/**
	 * Sets the value of the '{@link org.thingml.xthingmlmt.thingML.ConditionalAction#getElseAction <em>Else Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Action</em>' containment reference.
	 * @see #getElseAction()
	 * @generated
	 */
	void setElseAction(Action value);

} // ConditionalAction
