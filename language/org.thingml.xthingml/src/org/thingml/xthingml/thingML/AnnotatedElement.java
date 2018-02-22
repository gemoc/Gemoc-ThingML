/**
 */
package org.thingml.xthingml.thingML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotated Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingml.thingML.AnnotatedElement#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingml.thingML.ThingMLPackage#getAnnotatedElement()
 * @model
 * @generated
 */
public interface AnnotatedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.thingml.xthingml.thingML.PlatformAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getAnnotatedElement_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlatformAnnotation> getAnnotations();

} // AnnotatedElement