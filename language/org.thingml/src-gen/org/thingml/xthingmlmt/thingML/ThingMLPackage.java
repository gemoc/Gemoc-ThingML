/**
 */
package org.thingml.xthingmlmt.thingML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.thingml.xthingmlmt.thingML.ThingMLFactory
 * @model kind="package"
 * @generated
 */
public interface ThingMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "thingML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.thingml.xthingmlmt/thingML/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "thingML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThingMLPackage eINSTANCE = org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ThingMLModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLModelImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getThingMLModel()
	 * @generated
	 */
	int THING_ML_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_ML_MODEL__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_ML_MODEL__TYPES = 1;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_ML_MODEL__PROTOCOLS = 2;

	/**
	 * The feature id for the '<em><b>Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_ML_MODEL__CONFIGS = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_ML_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ImportImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_URI = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__FROM = 1;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.PlatformAnnotationImpl <em>Platform Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.PlatformAnnotationImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getPlatformAnnotation()
	 * @generated
	 */
	int PLATFORM_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ANNOTATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ANNOTATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Platform Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.NamedElementImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.AnnotatedElementImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getAnnotatedElement()
	 * @generated
	 */
	int ANNOTATED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT__ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Annotated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.VariableImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE_REF = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.TypeRefImpl <em>Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.TypeRefImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getTypeRef()
	 * @generated
	 */
	int TYPE_REF = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF__IS_ARRAY = 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF__CARDINALITY = 2;

	/**
	 * The number of structural features of the '<em>Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.TypeImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.PrimitiveTypeImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Byte Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__BYTE_SIZE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ObjectTypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ObjectTypeImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getObjectType()
	 * @generated
	 */
	int OBJECT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.EnumerationImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERALS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.EnumerationLiteralImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getThing()
	 * @generated
	 */
	int THING = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__FRAGMENT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__INCLUDES = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__MESSAGES = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__PORTS = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__PROPERTIES = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__FUNCTIONS = TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ASSIGN = TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__BEHAVIOUR = TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.PropertyAssignImpl <em>Property Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.PropertyAssignImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getPropertyAssign()
	 * @generated
	 */
	int PROPERTY_ASSIGN = 13;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGN__ANNOTATIONS = ANNOTATED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGN__PROPERTY = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGN__INDEX = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGN__INIT = ANNOTATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGN_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ProtocolImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.FunctionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TYPE_REF = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BODY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ABSTRACT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.PropertyImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ANNOTATIONS = VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE_REF = VARIABLE__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__READONLY = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INIT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.MessageImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ParameterImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ANNOTATIONS = VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE_REF = VARIABLE__TYPE_REF;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.PortImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SENDS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__RECEIVES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__MESSAGES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.RequiredPortImpl <em>Required Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.RequiredPortImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getRequiredPort()
	 * @generated
	 */
	int REQUIRED_PORT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__ANNOTATIONS = PORT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Sends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__SENDS = PORT__SENDS;

	/**
	 * The feature id for the '<em><b>Receives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__RECEIVES = PORT__RECEIVES;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__MESSAGES = PORT__MESSAGES;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__OPTIONAL = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ProvidedPortImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getProvidedPort()
	 * @generated
	 */
	int PROVIDED_PORT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__ANNOTATIONS = PORT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Sends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__SENDS = PORT__SENDS;

	/**
	 * The feature id for the '<em><b>Receives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__RECEIVES = PORT__RECEIVES;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__MESSAGES = PORT__MESSAGES;

	/**
	 * The number of structural features of the '<em>Provided Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.InternalPortImpl <em>Internal Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.InternalPortImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getInternalPort()
	 * @generated
	 */
	int INTERNAL_PORT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PORT__ANNOTATIONS = PORT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Sends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PORT__SENDS = PORT__SENDS;

	/**
	 * The feature id for the '<em><b>Receives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PORT__RECEIVES = PORT__RECEIVES;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PORT__MESSAGES = PORT__MESSAGES;

	/**
	 * The number of structural features of the '<em>Internal Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.StateImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getState()
	 * @generated
	 */
	int STATE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTRY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXIT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Internal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INTERNAL = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.HandlerImpl <em>Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.HandlerImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getHandler()
	 * @generated
	 */
	int HANDLER = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__EVENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__GUARD = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__ACTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.TransitionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = HANDLER__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ANNOTATIONS = HANDLER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = HANDLER__EVENT;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = HANDLER__GUARD;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = HANDLER__ACTION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = HANDLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = HANDLER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.InternalTransitionImpl <em>Internal Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.InternalTransitionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getInternalTransition()
	 * @generated
	 */
	int INTERNAL_TRANSITION = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__NAME = HANDLER__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__ANNOTATIONS = HANDLER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__EVENT = HANDLER__EVENT;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__GUARD = HANDLER__GUARD;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__ACTION = HANDLER__ACTION;

	/**
	 * The number of structural features of the '<em>Internal Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_FEATURE_COUNT = HANDLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.CompositeStateImpl <em>Composite State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.CompositeStateImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getCompositeState()
	 * @generated
	 */
	int COMPOSITE_STATE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__ANNOTATIONS = STATE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__PROPERTIES = STATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__ENTRY = STATE__ENTRY;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__EXIT = STATE__EXIT;

	/**
	 * The feature id for the '<em><b>Internal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__INTERNAL = STATE__INTERNAL;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__INITIAL = STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__HISTORY = STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Substate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__SUBSTATE = STATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__REGION = STATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Session</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__SESSION = STATE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__CURRENT_STATE = STATE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.StateContainerImpl <em>State Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.StateContainerImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getStateContainer()
	 * @generated
	 */
	int STATE_CONTAINER = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTAINER__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTAINER__INITIAL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTAINER__HISTORY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Substate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTAINER__SUBSTATE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.SessionImpl <em>Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.SessionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getSession()
	 * @generated
	 */
	int SESSION = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__NAME = STATE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__ANNOTATIONS = STATE_CONTAINER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__INITIAL = STATE_CONTAINER__INITIAL;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__HISTORY = STATE_CONTAINER__HISTORY;

	/**
	 * The feature id for the '<em><b>Substate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__SUBSTATE = STATE_CONTAINER__SUBSTATE;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__MAX_INSTANCES = STATE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FEATURE_COUNT = STATE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.RegionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = STATE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ANNOTATIONS = STATE_CONTAINER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__INITIAL = STATE_CONTAINER__INITIAL;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__HISTORY = STATE_CONTAINER__HISTORY;

	/**
	 * The feature id for the '<em><b>Substate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__SUBSTATE = STATE_CONTAINER__SUBSTATE;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = STATE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.FinalStateImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ANNOTATIONS = STATE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__PROPERTIES = STATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ENTRY = STATE__ENTRY;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__EXIT = STATE__EXIT;

	/**
	 * The feature id for the '<em><b>Internal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__INTERNAL = STATE__INTERNAL;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OUTGOING = STATE__OUTGOING;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.EventImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ReceiveMessageImpl <em>Receive Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ReceiveMessageImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getReceiveMessage()
	 * @generated
	 */
	int RECEIVE_MESSAGE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE__PORT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE__MESSAGE = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Receive Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ActionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 34;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ActionBlockImpl <em>Action Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ActionBlockImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getActionBlock()
	 * @generated
	 */
	int ACTION_BLOCK = 35;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__ACTIONS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ExternStatementImpl <em>Extern Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ExternStatementImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getExternStatement()
	 * @generated
	 */
	int EXTERN_STATEMENT = 36;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_STATEMENT__STATEMENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_STATEMENT__SEGMENTS = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extern Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_STATEMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.LocalVariableImpl <em>Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.LocalVariableImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getLocalVariable()
	 * @generated
	 */
	int LOCAL_VARIABLE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__ANNOTATIONS = VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__TYPE_REF = VARIABLE__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__READONLY = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__INIT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.SendActionImpl <em>Send Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.SendActionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getSendAction()
	 * @generated
	 */
	int SEND_ACTION = 38;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACTION__PORT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACTION__MESSAGE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACTION__PARAMETERS = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Send Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.VariableAssignmentImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getVariableAssignment()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT = 39;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__PROPERTY = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__INDEX = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__EXPRESSION = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.IncrementImpl <em>Increment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.IncrementImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getIncrement()
	 * @generated
	 */
	int INCREMENT = 40;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__VAR = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Increment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.DecrementImpl <em>Decrement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.DecrementImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getDecrement()
	 * @generated
	 */
	int DECREMENT = 41;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECREMENT__VAR = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decrement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECREMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.LoopActionImpl <em>Loop Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.LoopActionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getLoopAction()
	 * @generated
	 */
	int LOOP_ACTION = 42;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__CONDITION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__ACTION = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ConditionalActionImpl <em>Conditional Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ConditionalActionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getConditionalAction()
	 * @generated
	 */
	int CONDITIONAL_ACTION = 43;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION__CONDITION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION__ACTION = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION__ELSE_ACTION = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ReturnActionImpl <em>Return Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ReturnActionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getReturnAction()
	 * @generated
	 */
	int RETURN_ACTION = 44;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION__EXP = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.PrintActionImpl <em>Print Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.PrintActionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getPrintAction()
	 * @generated
	 */
	int PRINT_ACTION = 45;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_ACTION__LINE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_ACTION__MSG = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Print Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ErrorActionImpl <em>Error Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ErrorActionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getErrorAction()
	 * @generated
	 */
	int ERROR_ACTION = 46;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ACTION__LINE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ACTION__MSG = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.StartSessionImpl <em>Start Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.StartSessionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getStartSession()
	 * @generated
	 */
	int START_SESSION = 47;

	/**
	 * The feature id for the '<em><b>Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SESSION__SESSION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SESSION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.FunctionCallStatementImpl <em>Function Call Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.FunctionCallStatementImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getFunctionCallStatement()
	 * @generated
	 */
	int FUNCTION_CALL_STATEMENT = 48;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT__FUNCTION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT__PARAMETERS = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 49;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ExternExpressionImpl <em>Extern Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ExternExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getExternExpression()
	 * @generated
	 */
	int EXTERN_EXPRESSION = 50;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_EXPRESSION__SEGMENTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extern Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.EnumLiteralRefImpl <em>Enum Literal Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.EnumLiteralRefImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getEnumLiteralRef()
	 * @generated
	 */
	int ENUM_LITERAL_REF = 51;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_REF__ENUM = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_REF__LITERAL = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Literal Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ByteLiteralImpl <em>Byte Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ByteLiteralImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getByteLiteral()
	 * @generated
	 */
	int BYTE_LITERAL = 52;

	/**
	 * The feature id for the '<em><b>Byte Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_LITERAL__BYTE_VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Byte Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.CharLiteralImpl <em>Char Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.CharLiteralImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getCharLiteral()
	 * @generated
	 */
	int CHAR_LITERAL = 53;

	/**
	 * The feature id for the '<em><b>Char Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL__CHAR_VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Char Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.IntegerLiteralImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 54;

	/**
	 * The feature id for the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__INT_VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.BooleanLiteralImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 55;

	/**
	 * The feature id for the '<em><b>Bool Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__BOOL_VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.StringLiteralImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 56;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__STRING_VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.DoubleLiteralImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getDoubleLiteral()
	 * @generated
	 */
	int DOUBLE_LITERAL = 57;

	/**
	 * The feature id for the '<em><b>Double Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL__DOUBLE_VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.PropertyReferenceImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getPropertyReference()
	 * @generated
	 */
	int PROPERTY_REFERENCE = 58;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE__PROPERTY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.EventReferenceImpl <em>Event Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.EventReferenceImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getEventReference()
	 * @generated
	 */
	int EVENT_REFERENCE = 59;

	/**
	 * The feature id for the '<em><b>Receive Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE__RECEIVE_MSG = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE__PARAMETER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.FunctionCallExpressionImpl <em>Function Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.FunctionCallExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getFunctionCallExpression()
	 * @generated
	 */
	int FUNCTION_CALL_EXPRESSION = 60;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ConfigurationImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INSTANCES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONNECTORS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Propassigns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PROPASSIGNS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.InstanceImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ConfigPropertyAssignImpl <em>Config Property Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ConfigPropertyAssignImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getConfigPropertyAssign()
	 * @generated
	 */
	int CONFIG_PROPERTY_ASSIGN = 63;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_PROPERTY_ASSIGN__INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_PROPERTY_ASSIGN__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_PROPERTY_ASSIGN__INDEX = 2;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_PROPERTY_ASSIGN__INIT = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_PROPERTY_ASSIGN__ANNOTATIONS = 4;

	/**
	 * The number of structural features of the '<em>Config Property Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_PROPERTY_ASSIGN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.AbstractConnectorImpl <em>Abstract Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.AbstractConnectorImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getAbstractConnector()
	 * @generated
	 */
	int ABSTRACT_CONNECTOR = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ConnectorImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = ABSTRACT_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ANNOTATIONS = ABSTRACT_CONNECTOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Cli</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CLI = ABSTRACT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__REQUIRED = ABSTRACT_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Srv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SRV = ABSTRACT_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PROVIDED = ABSTRACT_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = ABSTRACT_CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ExternalConnectorImpl <em>External Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ExternalConnectorImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getExternalConnector()
	 * @generated
	 */
	int EXTERNAL_CONNECTOR = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONNECTOR__NAME = ABSTRACT_CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONNECTOR__ANNOTATIONS = ABSTRACT_CONNECTOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONNECTOR__INST = ABSTRACT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONNECTOR__PORT = ABSTRACT_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONNECTOR__PROTOCOL = ABSTRACT_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>External Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONNECTOR_FEATURE_COUNT = ABSTRACT_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.CastExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getCastExpression()
	 * @generated
	 */
	int CAST_EXPRESSION = 67;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__TERM = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__TYPE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__IS_ARRAY = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cast Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.OrExpressionImpl <em>Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.OrExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getOrExpression()
	 * @generated
	 */
	int OR_EXPRESSION = 68;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.AndExpressionImpl <em>And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.AndExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getAndExpression()
	 * @generated
	 */
	int AND_EXPRESSION = 69;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.EqualsExpressionImpl <em>Equals Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.EqualsExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getEqualsExpression()
	 * @generated
	 */
	int EQUALS_EXPRESSION = 70;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equals Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.NotEqualsExpressionImpl <em>Not Equals Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.NotEqualsExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getNotEqualsExpression()
	 * @generated
	 */
	int NOT_EQUALS_EXPRESSION = 71;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Not Equals Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.GreaterExpressionImpl <em>Greater Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.GreaterExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getGreaterExpression()
	 * @generated
	 */
	int GREATER_EXPRESSION = 72;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Greater Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.LowerExpressionImpl <em>Lower Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.LowerExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getLowerExpression()
	 * @generated
	 */
	int LOWER_EXPRESSION = 73;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lower Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.GreaterOrEqualExpressionImpl <em>Greater Or Equal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.GreaterOrEqualExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getGreaterOrEqualExpression()
	 * @generated
	 */
	int GREATER_OR_EQUAL_EXPRESSION = 74;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Greater Or Equal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.LowerOrEqualExpressionImpl <em>Lower Or Equal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.LowerOrEqualExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getLowerOrEqualExpression()
	 * @generated
	 */
	int LOWER_OR_EQUAL_EXPRESSION = 75;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_OR_EQUAL_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_OR_EQUAL_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lower Or Equal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_OR_EQUAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.PlusExpressionImpl <em>Plus Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.PlusExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getPlusExpression()
	 * @generated
	 */
	int PLUS_EXPRESSION = 76;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plus Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.MinusExpressionImpl <em>Minus Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.MinusExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getMinusExpression()
	 * @generated
	 */
	int MINUS_EXPRESSION = 77;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Minus Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.TimesExpressionImpl <em>Times Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.TimesExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getTimesExpression()
	 * @generated
	 */
	int TIMES_EXPRESSION = 78;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMES_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMES_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Times Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMES_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.DivExpressionImpl <em>Div Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.DivExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getDivExpression()
	 * @generated
	 */
	int DIV_EXPRESSION = 79;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Div Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ModExpressionImpl <em>Mod Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ModExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getModExpression()
	 * @generated
	 */
	int MOD_EXPRESSION = 80;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mod Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ExpressionGroupImpl <em>Expression Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ExpressionGroupImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getExpressionGroup()
	 * @generated
	 */
	int EXPRESSION_GROUP = 81;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_GROUP__TERM = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_GROUP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.NotExpressionImpl <em>Not Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.NotExpressionImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getNotExpression()
	 * @generated
	 */
	int NOT_EXPRESSION = 82;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__TERM = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.UnaryMinusImpl <em>Unary Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.UnaryMinusImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getUnaryMinus()
	 * @generated
	 */
	int UNARY_MINUS = 83;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS__TERM = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.thingml.xthingmlmt.thingML.impl.ArrayIndexImpl <em>Array Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.thingml.xthingmlmt.thingML.impl.ArrayIndexImpl
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getArrayIndex()
	 * @generated
	 */
	int ARRAY_INDEX = 84;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INDEX__ARRAY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INDEX__INDEX = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INDEX_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 85;


	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.ThingMLModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ThingMLModel
	 * @generated
	 */
	EClass getThingMLModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.ThingMLModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ThingMLModel#getImports()
	 * @see #getThingMLModel()
	 * @generated
	 */
	EReference getThingMLModel_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.ThingMLModel#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ThingMLModel#getTypes()
	 * @see #getThingMLModel()
	 * @generated
	 */
	EReference getThingMLModel_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.ThingMLModel#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ThingMLModel#getProtocols()
	 * @see #getThingMLModel()
	 * @generated
	 */
	EReference getThingMLModel_Protocols();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.ThingMLModel#getConfigs <em>Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ThingMLModel#getConfigs()
	 * @see #getThingMLModel()
	 * @generated
	 */
	EReference getThingMLModel_Configs();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.Import#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Import#getImportURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportURI();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.Import#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Import#getFrom()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_From();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.PlatformAnnotation <em>Platform Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Annotation</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PlatformAnnotation
	 * @generated
	 */
	EClass getPlatformAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.PlatformAnnotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PlatformAnnotation#getName()
	 * @see #getPlatformAnnotation()
	 * @generated
	 */
	EAttribute getPlatformAnnotation_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.PlatformAnnotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PlatformAnnotation#getValue()
	 * @see #getPlatformAnnotation()
	 * @generated
	 */
	EAttribute getPlatformAnnotation_Value();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.thingml.xthingmlmt.thingML.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.thingml.xthingmlmt.thingML.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Element</em>'.
	 * @see org.thingml.xthingmlmt.thingML.AnnotatedElement
	 * @generated
	 */
	EClass getAnnotatedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.AnnotatedElement#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.thingml.xthingmlmt.thingML.AnnotatedElement#getAnnotations()
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	EReference getAnnotatedElement_Annotations();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.Variable#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Ref</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Variable#getTypeRef()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_TypeRef();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.TypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Ref</em>'.
	 * @see org.thingml.xthingmlmt.thingML.TypeRef
	 * @generated
	 */
	EClass getTypeRef();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.TypeRef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.thingml.xthingmlmt.thingML.TypeRef#getType()
	 * @see #getTypeRef()
	 * @generated
	 */
	EReference getTypeRef_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.TypeRef#isIsArray <em>Is Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Array</em>'.
	 * @see org.thingml.xthingmlmt.thingML.TypeRef#isIsArray()
	 * @see #getTypeRef()
	 * @generated
	 */
	EAttribute getTypeRef_IsArray();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.TypeRef#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see org.thingml.xthingmlmt.thingML.TypeRef#getCardinality()
	 * @see #getTypeRef()
	 * @generated
	 */
	EReference getTypeRef_Cardinality();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.PrimitiveType#getByteSize <em>Byte Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Size</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PrimitiveType#getByteSize()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_ByteSize();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ObjectType
	 * @generated
	 */
	EClass getObjectType();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see org.thingml.xthingmlmt.thingML.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.Thing#isFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fragment</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Thing#isFragment()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Fragment();

	/**
	 * Returns the meta object for the reference list '{@link org.thingml.xthingmlmt.thingML.Thing#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Thing#getIncludes()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Includes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.Thing#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Thing#getMessages()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Messages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.Thing#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Thing#getPorts()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.Thing#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Thing#getProperties()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.Thing#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Thing#getFunctions()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.Thing#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assign</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Thing#getAssign()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Assign();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.Thing#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behaviour</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Thing#getBehaviour()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Behaviour();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.PropertyAssign <em>Property Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Assign</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PropertyAssign
	 * @generated
	 */
	EClass getPropertyAssign();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.PropertyAssign#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PropertyAssign#getProperty()
	 * @see #getPropertyAssign()
	 * @generated
	 */
	EReference getPropertyAssign_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.PropertyAssign#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PropertyAssign#getIndex()
	 * @see #getPropertyAssign()
	 * @generated
	 */
	EReference getPropertyAssign_Index();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.PropertyAssign#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PropertyAssign#getInit()
	 * @see #getPropertyAssign()
	 * @generated
	 */
	EReference getPropertyAssign_Init();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.Function#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Ref</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Function#getTypeRef()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_TypeRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.Function#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Function#getBody()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.Function#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Function#isAbstract()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Abstract();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.Property#isReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Property#isReadonly()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Readonly();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.Property#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Property#getInit()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Init();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.Message#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Message#getParameters()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Parameters();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference list '{@link org.thingml.xthingmlmt.thingML.Port#getSends <em>Sends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sends</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Port#getSends()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Sends();

	/**
	 * Returns the meta object for the reference list '{@link org.thingml.xthingmlmt.thingML.Port#getReceives <em>Receives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receives</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Port#getReceives()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Receives();

	/**
	 * Returns the meta object for the reference list '{@link org.thingml.xthingmlmt.thingML.Port#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Messages</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Port#getMessages()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Messages();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.RequiredPort <em>Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Port</em>'.
	 * @see org.thingml.xthingmlmt.thingML.RequiredPort
	 * @generated
	 */
	EClass getRequiredPort();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.RequiredPort#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.thingml.xthingmlmt.thingML.RequiredPort#isOptional()
	 * @see #getRequiredPort()
	 * @generated
	 */
	EAttribute getRequiredPort_Optional();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.ProvidedPort <em>Provided Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Port</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ProvidedPort
	 * @generated
	 */
	EClass getProvidedPort();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.InternalPort <em>Internal Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Port</em>'.
	 * @see org.thingml.xthingmlmt.thingML.InternalPort
	 * @generated
	 */
	EClass getInternalPort();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.thingml.xthingmlmt.thingML.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.State#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.thingml.xthingmlmt.thingML.State#getProperties()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.State#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see org.thingml.xthingmlmt.thingML.State#getEntry()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.State#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit</em>'.
	 * @see org.thingml.xthingmlmt.thingML.State#getExit()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Exit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.State#getInternal <em>Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal</em>'.
	 * @see org.thingml.xthingmlmt.thingML.State#getInternal()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Internal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing</em>'.
	 * @see org.thingml.xthingmlmt.thingML.State#getOutgoing()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outgoing();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Handler
	 * @generated
	 */
	EClass getHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.Handler#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Handler#getEvent()
	 * @see #getHandler()
	 * @generated
	 */
	EReference getHandler_Event();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.Handler#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Handler#getGuard()
	 * @see #getHandler()
	 * @generated
	 */
	EReference getHandler_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.Handler#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Handler#getAction()
	 * @see #getHandler()
	 * @generated
	 */
	EReference getHandler_Action();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.InternalTransition <em>Internal Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Transition</em>'.
	 * @see org.thingml.xthingmlmt.thingML.InternalTransition
	 * @generated
	 */
	EClass getInternalTransition();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.CompositeState <em>Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite State</em>'.
	 * @see org.thingml.xthingmlmt.thingML.CompositeState
	 * @generated
	 */
	EClass getCompositeState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.CompositeState#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Region</em>'.
	 * @see org.thingml.xthingmlmt.thingML.CompositeState#getRegion()
	 * @see #getCompositeState()
	 * @generated
	 */
	EReference getCompositeState_Region();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.CompositeState#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Session</em>'.
	 * @see org.thingml.xthingmlmt.thingML.CompositeState#getSession()
	 * @see #getCompositeState()
	 * @generated
	 */
	EReference getCompositeState_Session();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.CompositeState#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see org.thingml.xthingmlmt.thingML.CompositeState#getCurrentState()
	 * @see #getCompositeState()
	 * @generated
	 */
	EReference getCompositeState_CurrentState();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Session
	 * @generated
	 */
	EClass getSession();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.Session#getMaxInstances <em>Max Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Instances</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Session#getMaxInstances()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_MaxInstances();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see org.thingml.xthingmlmt.thingML.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.StateContainer <em>State Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Container</em>'.
	 * @see org.thingml.xthingmlmt.thingML.StateContainer
	 * @generated
	 */
	EClass getStateContainer();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.StateContainer#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial</em>'.
	 * @see org.thingml.xthingmlmt.thingML.StateContainer#getInitial()
	 * @see #getStateContainer()
	 * @generated
	 */
	EReference getStateContainer_Initial();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.StateContainer#isHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>History</em>'.
	 * @see org.thingml.xthingmlmt.thingML.StateContainer#isHistory()
	 * @see #getStateContainer()
	 * @generated
	 */
	EAttribute getStateContainer_History();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.StateContainer#getSubstate <em>Substate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Substate</em>'.
	 * @see org.thingml.xthingmlmt.thingML.StateContainer#getSubstate()
	 * @see #getStateContainer()
	 * @generated
	 */
	EReference getStateContainer_Substate();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.ReceiveMessage <em>Receive Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Message</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ReceiveMessage
	 * @generated
	 */
	EClass getReceiveMessage();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.ReceiveMessage#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ReceiveMessage#getPort()
	 * @see #getReceiveMessage()
	 * @generated
	 */
	EReference getReceiveMessage_Port();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.ReceiveMessage#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ReceiveMessage#getMessage()
	 * @see #getReceiveMessage()
	 * @generated
	 */
	EReference getReceiveMessage_Message();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.ActionBlock <em>Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Block</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ActionBlock
	 * @generated
	 */
	EClass getActionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.ActionBlock#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ActionBlock#getActions()
	 * @see #getActionBlock()
	 * @generated
	 */
	EReference getActionBlock_Actions();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.ExternStatement <em>Extern Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extern Statement</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ExternStatement
	 * @generated
	 */
	EClass getExternStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.ExternStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ExternStatement#getStatement()
	 * @see #getExternStatement()
	 * @generated
	 */
	EAttribute getExternStatement_Statement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.ExternStatement#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ExternStatement#getSegments()
	 * @see #getExternStatement()
	 * @generated
	 */
	EReference getExternStatement_Segments();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable</em>'.
	 * @see org.thingml.xthingmlmt.thingML.LocalVariable
	 * @generated
	 */
	EClass getLocalVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.LocalVariable#isReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.thingml.xthingmlmt.thingML.LocalVariable#isReadonly()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EAttribute getLocalVariable_Readonly();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.LocalVariable#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see org.thingml.xthingmlmt.thingML.LocalVariable#getInit()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EReference getLocalVariable_Init();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.SendAction <em>Send Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Action</em>'.
	 * @see org.thingml.xthingmlmt.thingML.SendAction
	 * @generated
	 */
	EClass getSendAction();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.SendAction#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.thingml.xthingmlmt.thingML.SendAction#getPort()
	 * @see #getSendAction()
	 * @generated
	 */
	EReference getSendAction_Port();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.SendAction#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see org.thingml.xthingmlmt.thingML.SendAction#getMessage()
	 * @see #getSendAction()
	 * @generated
	 */
	EReference getSendAction_Message();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.SendAction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.thingml.xthingmlmt.thingML.SendAction#getParameters()
	 * @see #getSendAction()
	 * @generated
	 */
	EReference getSendAction_Parameters();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.VariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment</em>'.
	 * @see org.thingml.xthingmlmt.thingML.VariableAssignment
	 * @generated
	 */
	EClass getVariableAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.VariableAssignment#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.thingml.xthingmlmt.thingML.VariableAssignment#getProperty()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.VariableAssignment#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see org.thingml.xthingmlmt.thingML.VariableAssignment#getIndex()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Index();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.VariableAssignment#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.VariableAssignment#getExpression()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Expression();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Increment <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Increment</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Increment
	 * @generated
	 */
	EClass getIncrement();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.Increment#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Increment#getVar()
	 * @see #getIncrement()
	 * @generated
	 */
	EReference getIncrement_Var();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Decrement <em>Decrement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decrement</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Decrement
	 * @generated
	 */
	EClass getDecrement();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.Decrement#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Decrement#getVar()
	 * @see #getDecrement()
	 * @generated
	 */
	EReference getDecrement_Var();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.LoopAction <em>Loop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Action</em>'.
	 * @see org.thingml.xthingmlmt.thingML.LoopAction
	 * @generated
	 */
	EClass getLoopAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.LoopAction#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.thingml.xthingmlmt.thingML.LoopAction#getCondition()
	 * @see #getLoopAction()
	 * @generated
	 */
	EReference getLoopAction_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.LoopAction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.thingml.xthingmlmt.thingML.LoopAction#getAction()
	 * @see #getLoopAction()
	 * @generated
	 */
	EReference getLoopAction_Action();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.ConditionalAction <em>Conditional Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Action</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ConditionalAction
	 * @generated
	 */
	EClass getConditionalAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.ConditionalAction#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ConditionalAction#getCondition()
	 * @see #getConditionalAction()
	 * @generated
	 */
	EReference getConditionalAction_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.ConditionalAction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ConditionalAction#getAction()
	 * @see #getConditionalAction()
	 * @generated
	 */
	EReference getConditionalAction_Action();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.ConditionalAction#getElseAction <em>Else Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Action</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ConditionalAction#getElseAction()
	 * @see #getConditionalAction()
	 * @generated
	 */
	EReference getConditionalAction_ElseAction();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.ReturnAction <em>Return Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Action</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ReturnAction
	 * @generated
	 */
	EClass getReturnAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.ReturnAction#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ReturnAction#getExp()
	 * @see #getReturnAction()
	 * @generated
	 */
	EReference getReturnAction_Exp();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.PrintAction <em>Print Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print Action</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PrintAction
	 * @generated
	 */
	EClass getPrintAction();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.PrintAction#isLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PrintAction#isLine()
	 * @see #getPrintAction()
	 * @generated
	 */
	EAttribute getPrintAction_Line();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.PrintAction#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PrintAction#getMsg()
	 * @see #getPrintAction()
	 * @generated
	 */
	EReference getPrintAction_Msg();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.ErrorAction <em>Error Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Action</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ErrorAction
	 * @generated
	 */
	EClass getErrorAction();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.ErrorAction#isLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ErrorAction#isLine()
	 * @see #getErrorAction()
	 * @generated
	 */
	EAttribute getErrorAction_Line();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.ErrorAction#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ErrorAction#getMsg()
	 * @see #getErrorAction()
	 * @generated
	 */
	EReference getErrorAction_Msg();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.StartSession <em>Start Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Session</em>'.
	 * @see org.thingml.xthingmlmt.thingML.StartSession
	 * @generated
	 */
	EClass getStartSession();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.StartSession#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Session</em>'.
	 * @see org.thingml.xthingmlmt.thingML.StartSession#getSession()
	 * @see #getStartSession()
	 * @generated
	 */
	EReference getStartSession_Session();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.FunctionCallStatement <em>Function Call Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call Statement</em>'.
	 * @see org.thingml.xthingmlmt.thingML.FunctionCallStatement
	 * @generated
	 */
	EClass getFunctionCallStatement();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.FunctionCallStatement#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see org.thingml.xthingmlmt.thingML.FunctionCallStatement#getFunction()
	 * @see #getFunctionCallStatement()
	 * @generated
	 */
	EReference getFunctionCallStatement_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.FunctionCallStatement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.thingml.xthingmlmt.thingML.FunctionCallStatement#getParameters()
	 * @see #getFunctionCallStatement()
	 * @generated
	 */
	EReference getFunctionCallStatement_Parameters();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.ExternExpression <em>Extern Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extern Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ExternExpression
	 * @generated
	 */
	EClass getExternExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.ExternExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ExternExpression#getExpression()
	 * @see #getExternExpression()
	 * @generated
	 */
	EAttribute getExternExpression_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.ExternExpression#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ExternExpression#getSegments()
	 * @see #getExternExpression()
	 * @generated
	 */
	EReference getExternExpression_Segments();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.EnumLiteralRef <em>Enum Literal Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal Ref</em>'.
	 * @see org.thingml.xthingmlmt.thingML.EnumLiteralRef
	 * @generated
	 */
	EClass getEnumLiteralRef();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.EnumLiteralRef#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum</em>'.
	 * @see org.thingml.xthingmlmt.thingML.EnumLiteralRef#getEnum()
	 * @see #getEnumLiteralRef()
	 * @generated
	 */
	EReference getEnumLiteralRef_Enum();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.EnumLiteralRef#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Literal</em>'.
	 * @see org.thingml.xthingmlmt.thingML.EnumLiteralRef#getLiteral()
	 * @see #getEnumLiteralRef()
	 * @generated
	 */
	EReference getEnumLiteralRef_Literal();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.ByteLiteral <em>Byte Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte Literal</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ByteLiteral
	 * @generated
	 */
	EClass getByteLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.ByteLiteral#getByteValue <em>Byte Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Value</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ByteLiteral#getByteValue()
	 * @see #getByteLiteral()
	 * @generated
	 */
	EAttribute getByteLiteral_ByteValue();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.CharLiteral <em>Char Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Literal</em>'.
	 * @see org.thingml.xthingmlmt.thingML.CharLiteral
	 * @generated
	 */
	EClass getCharLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.CharLiteral#getCharValue <em>Char Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char Value</em>'.
	 * @see org.thingml.xthingmlmt.thingML.CharLiteral#getCharValue()
	 * @see #getCharLiteral()
	 * @generated
	 */
	EAttribute getCharLiteral_CharValue();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see org.thingml.xthingmlmt.thingML.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.IntegerLiteral#getIntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Value</em>'.
	 * @see org.thingml.xthingmlmt.thingML.IntegerLiteral#getIntValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_IntValue();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see org.thingml.xthingmlmt.thingML.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.BooleanLiteral#isBoolValue <em>Bool Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool Value</em>'.
	 * @see org.thingml.xthingmlmt.thingML.BooleanLiteral#isBoolValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_BoolValue();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see org.thingml.xthingmlmt.thingML.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.StringLiteral#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see org.thingml.xthingmlmt.thingML.StringLiteral#getStringValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_StringValue();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.DoubleLiteral <em>Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Literal</em>'.
	 * @see org.thingml.xthingmlmt.thingML.DoubleLiteral
	 * @generated
	 */
	EClass getDoubleLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.DoubleLiteral#getDoubleValue <em>Double Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double Value</em>'.
	 * @see org.thingml.xthingmlmt.thingML.DoubleLiteral#getDoubleValue()
	 * @see #getDoubleLiteral()
	 * @generated
	 */
	EAttribute getDoubleLiteral_DoubleValue();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.PropertyReference <em>Property Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Reference</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PropertyReference
	 * @generated
	 */
	EClass getPropertyReference();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.PropertyReference#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PropertyReference#getProperty()
	 * @see #getPropertyReference()
	 * @generated
	 */
	EReference getPropertyReference_Property();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.EventReference <em>Event Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Reference</em>'.
	 * @see org.thingml.xthingmlmt.thingML.EventReference
	 * @generated
	 */
	EClass getEventReference();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.EventReference#getReceiveMsg <em>Receive Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receive Msg</em>'.
	 * @see org.thingml.xthingmlmt.thingML.EventReference#getReceiveMsg()
	 * @see #getEventReference()
	 * @generated
	 */
	EReference getEventReference_ReceiveMsg();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.EventReference#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.thingml.xthingmlmt.thingML.EventReference#getParameter()
	 * @see #getEventReference()
	 * @generated
	 */
	EReference getEventReference_Parameter();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.FunctionCallExpression <em>Function Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.FunctionCallExpression
	 * @generated
	 */
	EClass getFunctionCallExpression();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.FunctionCallExpression#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see org.thingml.xthingmlmt.thingML.FunctionCallExpression#getFunction()
	 * @see #getFunctionCallExpression()
	 * @generated
	 */
	EReference getFunctionCallExpression_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.FunctionCallExpression#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.thingml.xthingmlmt.thingML.FunctionCallExpression#getParameters()
	 * @see #getFunctionCallExpression()
	 * @generated
	 */
	EReference getFunctionCallExpression_Parameters();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.Configuration#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Configuration#getInstances()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Instances();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.Configuration#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Configuration#getConnectors()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.Configuration#getPropassigns <em>Propassigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propassigns</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Configuration#getPropassigns()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Propassigns();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.Instance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Instance#getType()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Type();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.ConfigPropertyAssign <em>Config Property Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Property Assign</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ConfigPropertyAssign
	 * @generated
	 */
	EClass getConfigPropertyAssign();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.ConfigPropertyAssign#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ConfigPropertyAssign#getInstance()
	 * @see #getConfigPropertyAssign()
	 * @generated
	 */
	EReference getConfigPropertyAssign_Instance();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.ConfigPropertyAssign#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ConfigPropertyAssign#getProperty()
	 * @see #getConfigPropertyAssign()
	 * @generated
	 */
	EReference getConfigPropertyAssign_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.ConfigPropertyAssign#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ConfigPropertyAssign#getIndex()
	 * @see #getConfigPropertyAssign()
	 * @generated
	 */
	EReference getConfigPropertyAssign_Index();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.ConfigPropertyAssign#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ConfigPropertyAssign#getInit()
	 * @see #getConfigPropertyAssign()
	 * @generated
	 */
	EReference getConfigPropertyAssign_Init();

	/**
	 * Returns the meta object for the containment reference list '{@link org.thingml.xthingmlmt.thingML.ConfigPropertyAssign#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ConfigPropertyAssign#getAnnotations()
	 * @see #getConfigPropertyAssign()
	 * @generated
	 */
	EReference getConfigPropertyAssign_Annotations();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.AbstractConnector <em>Abstract Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Connector</em>'.
	 * @see org.thingml.xthingmlmt.thingML.AbstractConnector
	 * @generated
	 */
	EClass getAbstractConnector();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.Connector#getCli <em>Cli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cli</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Connector#getCli()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Cli();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.Connector#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Connector#getRequired()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Required();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.Connector#getSrv <em>Srv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Srv</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Connector#getSrv()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Srv();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.Connector#getProvided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided</em>'.
	 * @see org.thingml.xthingmlmt.thingML.Connector#getProvided()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Provided();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.ExternalConnector <em>External Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Connector</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ExternalConnector
	 * @generated
	 */
	EClass getExternalConnector();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.ExternalConnector#getInst <em>Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inst</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ExternalConnector#getInst()
	 * @see #getExternalConnector()
	 * @generated
	 */
	EReference getExternalConnector_Inst();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.ExternalConnector#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ExternalConnector#getPort()
	 * @see #getExternalConnector()
	 * @generated
	 */
	EReference getExternalConnector_Port();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.ExternalConnector#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ExternalConnector#getProtocol()
	 * @see #getExternalConnector()
	 * @generated
	 */
	EReference getExternalConnector_Protocol();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.CastExpression <em>Cast Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cast Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.CastExpression
	 * @generated
	 */
	EClass getCastExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.CastExpression#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see org.thingml.xthingmlmt.thingML.CastExpression#getTerm()
	 * @see #getCastExpression()
	 * @generated
	 */
	EReference getCastExpression_Term();

	/**
	 * Returns the meta object for the reference '{@link org.thingml.xthingmlmt.thingML.CastExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.thingml.xthingmlmt.thingML.CastExpression#getType()
	 * @see #getCastExpression()
	 * @generated
	 */
	EReference getCastExpression_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.thingml.xthingmlmt.thingML.CastExpression#isIsArray <em>Is Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Array</em>'.
	 * @see org.thingml.xthingmlmt.thingML.CastExpression#isIsArray()
	 * @see #getCastExpression()
	 * @generated
	 */
	EAttribute getCastExpression_IsArray();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.OrExpression
	 * @generated
	 */
	EClass getOrExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.OrExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.OrExpression#getLhs()
	 * @see #getOrExpression()
	 * @generated
	 */
	EReference getOrExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.OrExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.OrExpression#getRhs()
	 * @see #getOrExpression()
	 * @generated
	 */
	EReference getOrExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.AndExpression
	 * @generated
	 */
	EClass getAndExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.AndExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.AndExpression#getLhs()
	 * @see #getAndExpression()
	 * @generated
	 */
	EReference getAndExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.AndExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.AndExpression#getRhs()
	 * @see #getAndExpression()
	 * @generated
	 */
	EReference getAndExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.EqualsExpression <em>Equals Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.EqualsExpression
	 * @generated
	 */
	EClass getEqualsExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.EqualsExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.EqualsExpression#getLhs()
	 * @see #getEqualsExpression()
	 * @generated
	 */
	EReference getEqualsExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.EqualsExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.EqualsExpression#getRhs()
	 * @see #getEqualsExpression()
	 * @generated
	 */
	EReference getEqualsExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.NotEqualsExpression <em>Not Equals Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Equals Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.NotEqualsExpression
	 * @generated
	 */
	EClass getNotEqualsExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.NotEqualsExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.NotEqualsExpression#getLhs()
	 * @see #getNotEqualsExpression()
	 * @generated
	 */
	EReference getNotEqualsExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.NotEqualsExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.NotEqualsExpression#getRhs()
	 * @see #getNotEqualsExpression()
	 * @generated
	 */
	EReference getNotEqualsExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.GreaterExpression <em>Greater Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.GreaterExpression
	 * @generated
	 */
	EClass getGreaterExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.GreaterExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.GreaterExpression#getLhs()
	 * @see #getGreaterExpression()
	 * @generated
	 */
	EReference getGreaterExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.GreaterExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.GreaterExpression#getRhs()
	 * @see #getGreaterExpression()
	 * @generated
	 */
	EReference getGreaterExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.LowerExpression <em>Lower Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.LowerExpression
	 * @generated
	 */
	EClass getLowerExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.LowerExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.LowerExpression#getLhs()
	 * @see #getLowerExpression()
	 * @generated
	 */
	EReference getLowerExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.LowerExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.LowerExpression#getRhs()
	 * @see #getLowerExpression()
	 * @generated
	 */
	EReference getLowerExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.GreaterOrEqualExpression <em>Greater Or Equal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Or Equal Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.GreaterOrEqualExpression
	 * @generated
	 */
	EClass getGreaterOrEqualExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.GreaterOrEqualExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.GreaterOrEqualExpression#getLhs()
	 * @see #getGreaterOrEqualExpression()
	 * @generated
	 */
	EReference getGreaterOrEqualExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.GreaterOrEqualExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.GreaterOrEqualExpression#getRhs()
	 * @see #getGreaterOrEqualExpression()
	 * @generated
	 */
	EReference getGreaterOrEqualExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.LowerOrEqualExpression <em>Lower Or Equal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Or Equal Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.LowerOrEqualExpression
	 * @generated
	 */
	EClass getLowerOrEqualExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.LowerOrEqualExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.LowerOrEqualExpression#getLhs()
	 * @see #getLowerOrEqualExpression()
	 * @generated
	 */
	EReference getLowerOrEqualExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.LowerOrEqualExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.LowerOrEqualExpression#getRhs()
	 * @see #getLowerOrEqualExpression()
	 * @generated
	 */
	EReference getLowerOrEqualExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.PlusExpression <em>Plus Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PlusExpression
	 * @generated
	 */
	EClass getPlusExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.PlusExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PlusExpression#getLhs()
	 * @see #getPlusExpression()
	 * @generated
	 */
	EReference getPlusExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.PlusExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.PlusExpression#getRhs()
	 * @see #getPlusExpression()
	 * @generated
	 */
	EReference getPlusExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.MinusExpression <em>Minus Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.MinusExpression
	 * @generated
	 */
	EClass getMinusExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.MinusExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.MinusExpression#getLhs()
	 * @see #getMinusExpression()
	 * @generated
	 */
	EReference getMinusExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.MinusExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.MinusExpression#getRhs()
	 * @see #getMinusExpression()
	 * @generated
	 */
	EReference getMinusExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.TimesExpression <em>Times Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Times Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.TimesExpression
	 * @generated
	 */
	EClass getTimesExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.TimesExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.TimesExpression#getLhs()
	 * @see #getTimesExpression()
	 * @generated
	 */
	EReference getTimesExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.TimesExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.TimesExpression#getRhs()
	 * @see #getTimesExpression()
	 * @generated
	 */
	EReference getTimesExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.DivExpression <em>Div Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.DivExpression
	 * @generated
	 */
	EClass getDivExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.DivExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.DivExpression#getLhs()
	 * @see #getDivExpression()
	 * @generated
	 */
	EReference getDivExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.DivExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.DivExpression#getRhs()
	 * @see #getDivExpression()
	 * @generated
	 */
	EReference getDivExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.ModExpression <em>Mod Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mod Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ModExpression
	 * @generated
	 */
	EClass getModExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.ModExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ModExpression#getLhs()
	 * @see #getModExpression()
	 * @generated
	 */
	EReference getModExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.ModExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ModExpression#getRhs()
	 * @see #getModExpression()
	 * @generated
	 */
	EReference getModExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.ExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Group</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ExpressionGroup
	 * @generated
	 */
	EClass getExpressionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.ExpressionGroup#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ExpressionGroup#getTerm()
	 * @see #getExpressionGroup()
	 * @generated
	 */
	EReference getExpressionGroup_Term();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.NotExpression <em>Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Expression</em>'.
	 * @see org.thingml.xthingmlmt.thingML.NotExpression
	 * @generated
	 */
	EClass getNotExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.NotExpression#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see org.thingml.xthingmlmt.thingML.NotExpression#getTerm()
	 * @see #getNotExpression()
	 * @generated
	 */
	EReference getNotExpression_Term();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.UnaryMinus <em>Unary Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Minus</em>'.
	 * @see org.thingml.xthingmlmt.thingML.UnaryMinus
	 * @generated
	 */
	EClass getUnaryMinus();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.UnaryMinus#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see org.thingml.xthingmlmt.thingML.UnaryMinus#getTerm()
	 * @see #getUnaryMinus()
	 * @generated
	 */
	EReference getUnaryMinus_Term();

	/**
	 * Returns the meta object for class '{@link org.thingml.xthingmlmt.thingML.ArrayIndex <em>Array Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Index</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ArrayIndex
	 * @generated
	 */
	EClass getArrayIndex();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.ArrayIndex#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ArrayIndex#getArray()
	 * @see #getArrayIndex()
	 * @generated
	 */
	EReference getArrayIndex_Array();

	/**
	 * Returns the meta object for the containment reference '{@link org.thingml.xthingmlmt.thingML.ArrayIndex#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see org.thingml.xthingmlmt.thingML.ArrayIndex#getIndex()
	 * @see #getArrayIndex()
	 * @generated
	 */
	EReference getArrayIndex_Index();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ThingMLFactory getThingMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ThingMLModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLModelImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getThingMLModel()
		 * @generated
		 */
		EClass THING_ML_MODEL = eINSTANCE.getThingMLModel();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_ML_MODEL__IMPORTS = eINSTANCE.getThingMLModel_Imports();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_ML_MODEL__TYPES = eINSTANCE.getThingMLModel_Types();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_ML_MODEL__PROTOCOLS = eINSTANCE.getThingMLModel_Protocols();

		/**
		 * The meta object literal for the '<em><b>Configs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_ML_MODEL__CONFIGS = eINSTANCE.getThingMLModel_Configs();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ImportImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__FROM = eINSTANCE.getImport_From();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.PlatformAnnotationImpl <em>Platform Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.PlatformAnnotationImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getPlatformAnnotation()
		 * @generated
		 */
		EClass PLATFORM_ANNOTATION = eINSTANCE.getPlatformAnnotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_ANNOTATION__NAME = eINSTANCE.getPlatformAnnotation_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_ANNOTATION__VALUE = eINSTANCE.getPlatformAnnotation_Value();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.NamedElementImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.AnnotatedElementImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getAnnotatedElement()
		 * @generated
		 */
		EClass ANNOTATED_ELEMENT = eINSTANCE.getAnnotatedElement();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_ELEMENT__ANNOTATIONS = eINSTANCE.getAnnotatedElement_Annotations();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.VariableImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE_REF = eINSTANCE.getVariable_TypeRef();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.TypeRefImpl <em>Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.TypeRefImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getTypeRef()
		 * @generated
		 */
		EClass TYPE_REF = eINSTANCE.getTypeRef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REF__TYPE = eINSTANCE.getTypeRef_Type();

		/**
		 * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_REF__IS_ARRAY = eINSTANCE.getTypeRef_IsArray();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REF__CARDINALITY = eINSTANCE.getTypeRef_Cardinality();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.TypeImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.PrimitiveTypeImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Byte Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__BYTE_SIZE = eINSTANCE.getPrimitiveType_ByteSize();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ObjectTypeImpl <em>Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ObjectTypeImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getObjectType()
		 * @generated
		 */
		EClass OBJECT_TYPE = eINSTANCE.getObjectType();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.EnumerationImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.EnumerationLiteralImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getThing()
		 * @generated
		 */
		EClass THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '<em><b>Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__FRAGMENT = eINSTANCE.getThing_Fragment();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__INCLUDES = eINSTANCE.getThing_Includes();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__MESSAGES = eINSTANCE.getThing_Messages();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__PORTS = eINSTANCE.getThing_Ports();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__PROPERTIES = eINSTANCE.getThing_Properties();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__FUNCTIONS = eINSTANCE.getThing_Functions();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__ASSIGN = eINSTANCE.getThing_Assign();

		/**
		 * The meta object literal for the '<em><b>Behaviour</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__BEHAVIOUR = eINSTANCE.getThing_Behaviour();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.PropertyAssignImpl <em>Property Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.PropertyAssignImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getPropertyAssign()
		 * @generated
		 */
		EClass PROPERTY_ASSIGN = eINSTANCE.getPropertyAssign();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASSIGN__PROPERTY = eINSTANCE.getPropertyAssign_Property();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASSIGN__INDEX = eINSTANCE.getPropertyAssign_Index();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASSIGN__INIT = eINSTANCE.getPropertyAssign_Init();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ProtocolImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.FunctionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__TYPE_REF = eINSTANCE.getFunction_TypeRef();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__BODY = eINSTANCE.getFunction_Body();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__ABSTRACT = eINSTANCE.getFunction_Abstract();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.PropertyImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__READONLY = eINSTANCE.getProperty_Readonly();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__INIT = eINSTANCE.getProperty_Init();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.MessageImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__PARAMETERS = eINSTANCE.getMessage_Parameters();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ParameterImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.PortImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Sends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__SENDS = eINSTANCE.getPort_Sends();

		/**
		 * The meta object literal for the '<em><b>Receives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__RECEIVES = eINSTANCE.getPort_Receives();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__MESSAGES = eINSTANCE.getPort_Messages();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.RequiredPortImpl <em>Required Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.RequiredPortImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getRequiredPort()
		 * @generated
		 */
		EClass REQUIRED_PORT = eINSTANCE.getRequiredPort();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PORT__OPTIONAL = eINSTANCE.getRequiredPort_Optional();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ProvidedPortImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getProvidedPort()
		 * @generated
		 */
		EClass PROVIDED_PORT = eINSTANCE.getProvidedPort();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.InternalPortImpl <em>Internal Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.InternalPortImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getInternalPort()
		 * @generated
		 */
		EClass INTERNAL_PORT = eINSTANCE.getInternalPort();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.StateImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PROPERTIES = eINSTANCE.getState_Properties();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENTRY = eINSTANCE.getState_Entry();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXIT = eINSTANCE.getState_Exit();

		/**
		 * The meta object literal for the '<em><b>Internal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INTERNAL = eINSTANCE.getState_Internal();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING = eINSTANCE.getState_Outgoing();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.HandlerImpl <em>Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.HandlerImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getHandler()
		 * @generated
		 */
		EClass HANDLER = eINSTANCE.getHandler();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLER__EVENT = eINSTANCE.getHandler_Event();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLER__GUARD = eINSTANCE.getHandler_Guard();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLER__ACTION = eINSTANCE.getHandler_Action();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.TransitionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.InternalTransitionImpl <em>Internal Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.InternalTransitionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getInternalTransition()
		 * @generated
		 */
		EClass INTERNAL_TRANSITION = eINSTANCE.getInternalTransition();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.CompositeStateImpl <em>Composite State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.CompositeStateImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getCompositeState()
		 * @generated
		 */
		EClass COMPOSITE_STATE = eINSTANCE.getCompositeState();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_STATE__REGION = eINSTANCE.getCompositeState_Region();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_STATE__SESSION = eINSTANCE.getCompositeState_Session();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_STATE__CURRENT_STATE = eINSTANCE.getCompositeState_CurrentState();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.SessionImpl <em>Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.SessionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getSession()
		 * @generated
		 */
		EClass SESSION = eINSTANCE.getSession();

		/**
		 * The meta object literal for the '<em><b>Max Instances</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__MAX_INSTANCES = eINSTANCE.getSession_MaxInstances();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.RegionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.FinalStateImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.StateContainerImpl <em>State Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.StateContainerImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getStateContainer()
		 * @generated
		 */
		EClass STATE_CONTAINER = eINSTANCE.getStateContainer();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_CONTAINER__INITIAL = eINSTANCE.getStateContainer_Initial();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_CONTAINER__HISTORY = eINSTANCE.getStateContainer_History();

		/**
		 * The meta object literal for the '<em><b>Substate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_CONTAINER__SUBSTATE = eINSTANCE.getStateContainer_Substate();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.EventImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ReceiveMessageImpl <em>Receive Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ReceiveMessageImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getReceiveMessage()
		 * @generated
		 */
		EClass RECEIVE_MESSAGE = eINSTANCE.getReceiveMessage();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_MESSAGE__PORT = eINSTANCE.getReceiveMessage_Port();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_MESSAGE__MESSAGE = eINSTANCE.getReceiveMessage_Message();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ActionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ActionBlockImpl <em>Action Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ActionBlockImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getActionBlock()
		 * @generated
		 */
		EClass ACTION_BLOCK = eINSTANCE.getActionBlock();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BLOCK__ACTIONS = eINSTANCE.getActionBlock_Actions();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ExternStatementImpl <em>Extern Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ExternStatementImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getExternStatement()
		 * @generated
		 */
		EClass EXTERN_STATEMENT = eINSTANCE.getExternStatement();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERN_STATEMENT__STATEMENT = eINSTANCE.getExternStatement_Statement();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERN_STATEMENT__SEGMENTS = eINSTANCE.getExternStatement_Segments();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.LocalVariableImpl <em>Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.LocalVariableImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getLocalVariable()
		 * @generated
		 */
		EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

		/**
		 * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_VARIABLE__READONLY = eINSTANCE.getLocalVariable_Readonly();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE__INIT = eINSTANCE.getLocalVariable_Init();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.SendActionImpl <em>Send Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.SendActionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getSendAction()
		 * @generated
		 */
		EClass SEND_ACTION = eINSTANCE.getSendAction();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_ACTION__PORT = eINSTANCE.getSendAction_Port();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_ACTION__MESSAGE = eINSTANCE.getSendAction_Message();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_ACTION__PARAMETERS = eINSTANCE.getSendAction_Parameters();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.VariableAssignmentImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getVariableAssignment()
		 * @generated
		 */
		EClass VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAssignment();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT__PROPERTY = eINSTANCE.getVariableAssignment_Property();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT__INDEX = eINSTANCE.getVariableAssignment_Index();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT__EXPRESSION = eINSTANCE.getVariableAssignment_Expression();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.IncrementImpl <em>Increment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.IncrementImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getIncrement()
		 * @generated
		 */
		EClass INCREMENT = eINSTANCE.getIncrement();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCREMENT__VAR = eINSTANCE.getIncrement_Var();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.DecrementImpl <em>Decrement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.DecrementImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getDecrement()
		 * @generated
		 */
		EClass DECREMENT = eINSTANCE.getDecrement();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECREMENT__VAR = eINSTANCE.getDecrement_Var();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.LoopActionImpl <em>Loop Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.LoopActionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getLoopAction()
		 * @generated
		 */
		EClass LOOP_ACTION = eINSTANCE.getLoopAction();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_ACTION__CONDITION = eINSTANCE.getLoopAction_Condition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_ACTION__ACTION = eINSTANCE.getLoopAction_Action();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ConditionalActionImpl <em>Conditional Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ConditionalActionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getConditionalAction()
		 * @generated
		 */
		EClass CONDITIONAL_ACTION = eINSTANCE.getConditionalAction();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_ACTION__CONDITION = eINSTANCE.getConditionalAction_Condition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_ACTION__ACTION = eINSTANCE.getConditionalAction_Action();

		/**
		 * The meta object literal for the '<em><b>Else Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_ACTION__ELSE_ACTION = eINSTANCE.getConditionalAction_ElseAction();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ReturnActionImpl <em>Return Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ReturnActionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getReturnAction()
		 * @generated
		 */
		EClass RETURN_ACTION = eINSTANCE.getReturnAction();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ACTION__EXP = eINSTANCE.getReturnAction_Exp();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.PrintActionImpl <em>Print Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.PrintActionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getPrintAction()
		 * @generated
		 */
		EClass PRINT_ACTION = eINSTANCE.getPrintAction();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT_ACTION__LINE = eINSTANCE.getPrintAction_Line();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT_ACTION__MSG = eINSTANCE.getPrintAction_Msg();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ErrorActionImpl <em>Error Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ErrorActionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getErrorAction()
		 * @generated
		 */
		EClass ERROR_ACTION = eINSTANCE.getErrorAction();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_ACTION__LINE = eINSTANCE.getErrorAction_Line();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_ACTION__MSG = eINSTANCE.getErrorAction_Msg();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.StartSessionImpl <em>Start Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.StartSessionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getStartSession()
		 * @generated
		 */
		EClass START_SESSION = eINSTANCE.getStartSession();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_SESSION__SESSION = eINSTANCE.getStartSession_Session();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.FunctionCallStatementImpl <em>Function Call Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.FunctionCallStatementImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getFunctionCallStatement()
		 * @generated
		 */
		EClass FUNCTION_CALL_STATEMENT = eINSTANCE.getFunctionCallStatement();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL_STATEMENT__FUNCTION = eINSTANCE.getFunctionCallStatement_Function();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL_STATEMENT__PARAMETERS = eINSTANCE.getFunctionCallStatement_Parameters();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ExternExpressionImpl <em>Extern Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ExternExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getExternExpression()
		 * @generated
		 */
		EClass EXTERN_EXPRESSION = eINSTANCE.getExternExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERN_EXPRESSION__EXPRESSION = eINSTANCE.getExternExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERN_EXPRESSION__SEGMENTS = eINSTANCE.getExternExpression_Segments();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.EnumLiteralRefImpl <em>Enum Literal Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.EnumLiteralRefImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getEnumLiteralRef()
		 * @generated
		 */
		EClass ENUM_LITERAL_REF = eINSTANCE.getEnumLiteralRef();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_LITERAL_REF__ENUM = eINSTANCE.getEnumLiteralRef_Enum();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_LITERAL_REF__LITERAL = eINSTANCE.getEnumLiteralRef_Literal();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ByteLiteralImpl <em>Byte Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ByteLiteralImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getByteLiteral()
		 * @generated
		 */
		EClass BYTE_LITERAL = eINSTANCE.getByteLiteral();

		/**
		 * The meta object literal for the '<em><b>Byte Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BYTE_LITERAL__BYTE_VALUE = eINSTANCE.getByteLiteral_ByteValue();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.CharLiteralImpl <em>Char Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.CharLiteralImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getCharLiteral()
		 * @generated
		 */
		EClass CHAR_LITERAL = eINSTANCE.getCharLiteral();

		/**
		 * The meta object literal for the '<em><b>Char Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_LITERAL__CHAR_VALUE = eINSTANCE.getCharLiteral_CharValue();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.IntegerLiteralImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__INT_VALUE = eINSTANCE.getIntegerLiteral_IntValue();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.BooleanLiteralImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Bool Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__BOOL_VALUE = eINSTANCE.getBooleanLiteral_BoolValue();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.StringLiteralImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__STRING_VALUE = eINSTANCE.getStringLiteral_StringValue();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.DoubleLiteralImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getDoubleLiteral()
		 * @generated
		 */
		EClass DOUBLE_LITERAL = eINSTANCE.getDoubleLiteral();

		/**
		 * The meta object literal for the '<em><b>Double Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_LITERAL__DOUBLE_VALUE = eINSTANCE.getDoubleLiteral_DoubleValue();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.PropertyReferenceImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getPropertyReference()
		 * @generated
		 */
		EClass PROPERTY_REFERENCE = eINSTANCE.getPropertyReference();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REFERENCE__PROPERTY = eINSTANCE.getPropertyReference_Property();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.EventReferenceImpl <em>Event Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.EventReferenceImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getEventReference()
		 * @generated
		 */
		EClass EVENT_REFERENCE = eINSTANCE.getEventReference();

		/**
		 * The meta object literal for the '<em><b>Receive Msg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_REFERENCE__RECEIVE_MSG = eINSTANCE.getEventReference_ReceiveMsg();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_REFERENCE__PARAMETER = eINSTANCE.getEventReference_Parameter();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.FunctionCallExpressionImpl <em>Function Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.FunctionCallExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getFunctionCallExpression()
		 * @generated
		 */
		EClass FUNCTION_CALL_EXPRESSION = eINSTANCE.getFunctionCallExpression();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL_EXPRESSION__FUNCTION = eINSTANCE.getFunctionCallExpression_Function();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL_EXPRESSION__PARAMETERS = eINSTANCE.getFunctionCallExpression_Parameters();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ConfigurationImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__INSTANCES = eINSTANCE.getConfiguration_Instances();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONNECTORS = eINSTANCE.getConfiguration_Connectors();

		/**
		 * The meta object literal for the '<em><b>Propassigns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__PROPASSIGNS = eINSTANCE.getConfiguration_Propassigns();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.InstanceImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__TYPE = eINSTANCE.getInstance_Type();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ConfigPropertyAssignImpl <em>Config Property Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ConfigPropertyAssignImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getConfigPropertyAssign()
		 * @generated
		 */
		EClass CONFIG_PROPERTY_ASSIGN = eINSTANCE.getConfigPropertyAssign();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_PROPERTY_ASSIGN__INSTANCE = eINSTANCE.getConfigPropertyAssign_Instance();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_PROPERTY_ASSIGN__PROPERTY = eINSTANCE.getConfigPropertyAssign_Property();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_PROPERTY_ASSIGN__INDEX = eINSTANCE.getConfigPropertyAssign_Index();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_PROPERTY_ASSIGN__INIT = eINSTANCE.getConfigPropertyAssign_Init();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_PROPERTY_ASSIGN__ANNOTATIONS = eINSTANCE.getConfigPropertyAssign_Annotations();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.AbstractConnectorImpl <em>Abstract Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.AbstractConnectorImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getAbstractConnector()
		 * @generated
		 */
		EClass ABSTRACT_CONNECTOR = eINSTANCE.getAbstractConnector();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ConnectorImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Cli</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__CLI = eINSTANCE.getConnector_Cli();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__REQUIRED = eINSTANCE.getConnector_Required();

		/**
		 * The meta object literal for the '<em><b>Srv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SRV = eINSTANCE.getConnector_Srv();

		/**
		 * The meta object literal for the '<em><b>Provided</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__PROVIDED = eINSTANCE.getConnector_Provided();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ExternalConnectorImpl <em>External Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ExternalConnectorImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getExternalConnector()
		 * @generated
		 */
		EClass EXTERNAL_CONNECTOR = eINSTANCE.getExternalConnector();

		/**
		 * The meta object literal for the '<em><b>Inst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CONNECTOR__INST = eINSTANCE.getExternalConnector_Inst();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CONNECTOR__PORT = eINSTANCE.getExternalConnector_Port();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CONNECTOR__PROTOCOL = eINSTANCE.getExternalConnector_Protocol();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.CastExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getCastExpression()
		 * @generated
		 */
		EClass CAST_EXPRESSION = eINSTANCE.getCastExpression();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST_EXPRESSION__TERM = eINSTANCE.getCastExpression_Term();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST_EXPRESSION__TYPE = eINSTANCE.getCastExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAST_EXPRESSION__IS_ARRAY = eINSTANCE.getCastExpression_IsArray();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.OrExpressionImpl <em>Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.OrExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getOrExpression()
		 * @generated
		 */
		EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_EXPRESSION__LHS = eINSTANCE.getOrExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_EXPRESSION__RHS = eINSTANCE.getOrExpression_Rhs();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.AndExpressionImpl <em>And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.AndExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getAndExpression()
		 * @generated
		 */
		EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXPRESSION__LHS = eINSTANCE.getAndExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXPRESSION__RHS = eINSTANCE.getAndExpression_Rhs();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.EqualsExpressionImpl <em>Equals Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.EqualsExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getEqualsExpression()
		 * @generated
		 */
		EClass EQUALS_EXPRESSION = eINSTANCE.getEqualsExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALS_EXPRESSION__LHS = eINSTANCE.getEqualsExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALS_EXPRESSION__RHS = eINSTANCE.getEqualsExpression_Rhs();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.NotEqualsExpressionImpl <em>Not Equals Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.NotEqualsExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getNotEqualsExpression()
		 * @generated
		 */
		EClass NOT_EQUALS_EXPRESSION = eINSTANCE.getNotEqualsExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EQUALS_EXPRESSION__LHS = eINSTANCE.getNotEqualsExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EQUALS_EXPRESSION__RHS = eINSTANCE.getNotEqualsExpression_Rhs();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.GreaterExpressionImpl <em>Greater Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.GreaterExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getGreaterExpression()
		 * @generated
		 */
		EClass GREATER_EXPRESSION = eINSTANCE.getGreaterExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREATER_EXPRESSION__LHS = eINSTANCE.getGreaterExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREATER_EXPRESSION__RHS = eINSTANCE.getGreaterExpression_Rhs();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.LowerExpressionImpl <em>Lower Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.LowerExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getLowerExpression()
		 * @generated
		 */
		EClass LOWER_EXPRESSION = eINSTANCE.getLowerExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOWER_EXPRESSION__LHS = eINSTANCE.getLowerExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOWER_EXPRESSION__RHS = eINSTANCE.getLowerExpression_Rhs();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.GreaterOrEqualExpressionImpl <em>Greater Or Equal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.GreaterOrEqualExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getGreaterOrEqualExpression()
		 * @generated
		 */
		EClass GREATER_OR_EQUAL_EXPRESSION = eINSTANCE.getGreaterOrEqualExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREATER_OR_EQUAL_EXPRESSION__LHS = eINSTANCE.getGreaterOrEqualExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREATER_OR_EQUAL_EXPRESSION__RHS = eINSTANCE.getGreaterOrEqualExpression_Rhs();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.LowerOrEqualExpressionImpl <em>Lower Or Equal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.LowerOrEqualExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getLowerOrEqualExpression()
		 * @generated
		 */
		EClass LOWER_OR_EQUAL_EXPRESSION = eINSTANCE.getLowerOrEqualExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOWER_OR_EQUAL_EXPRESSION__LHS = eINSTANCE.getLowerOrEqualExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOWER_OR_EQUAL_EXPRESSION__RHS = eINSTANCE.getLowerOrEqualExpression_Rhs();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.PlusExpressionImpl <em>Plus Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.PlusExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getPlusExpression()
		 * @generated
		 */
		EClass PLUS_EXPRESSION = eINSTANCE.getPlusExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUS_EXPRESSION__LHS = eINSTANCE.getPlusExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUS_EXPRESSION__RHS = eINSTANCE.getPlusExpression_Rhs();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.MinusExpressionImpl <em>Minus Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.MinusExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getMinusExpression()
		 * @generated
		 */
		EClass MINUS_EXPRESSION = eINSTANCE.getMinusExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINUS_EXPRESSION__LHS = eINSTANCE.getMinusExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINUS_EXPRESSION__RHS = eINSTANCE.getMinusExpression_Rhs();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.TimesExpressionImpl <em>Times Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.TimesExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getTimesExpression()
		 * @generated
		 */
		EClass TIMES_EXPRESSION = eINSTANCE.getTimesExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMES_EXPRESSION__LHS = eINSTANCE.getTimesExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMES_EXPRESSION__RHS = eINSTANCE.getTimesExpression_Rhs();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.DivExpressionImpl <em>Div Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.DivExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getDivExpression()
		 * @generated
		 */
		EClass DIV_EXPRESSION = eINSTANCE.getDivExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIV_EXPRESSION__LHS = eINSTANCE.getDivExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIV_EXPRESSION__RHS = eINSTANCE.getDivExpression_Rhs();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ModExpressionImpl <em>Mod Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ModExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getModExpression()
		 * @generated
		 */
		EClass MOD_EXPRESSION = eINSTANCE.getModExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOD_EXPRESSION__LHS = eINSTANCE.getModExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOD_EXPRESSION__RHS = eINSTANCE.getModExpression_Rhs();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ExpressionGroupImpl <em>Expression Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ExpressionGroupImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getExpressionGroup()
		 * @generated
		 */
		EClass EXPRESSION_GROUP = eINSTANCE.getExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_GROUP__TERM = eINSTANCE.getExpressionGroup_Term();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.NotExpressionImpl <em>Not Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.NotExpressionImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getNotExpression()
		 * @generated
		 */
		EClass NOT_EXPRESSION = eINSTANCE.getNotExpression();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EXPRESSION__TERM = eINSTANCE.getNotExpression_Term();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.UnaryMinusImpl <em>Unary Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.UnaryMinusImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getUnaryMinus()
		 * @generated
		 */
		EClass UNARY_MINUS = eINSTANCE.getUnaryMinus();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_MINUS__TERM = eINSTANCE.getUnaryMinus_Term();

		/**
		 * The meta object literal for the '{@link org.thingml.xthingmlmt.thingML.impl.ArrayIndexImpl <em>Array Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.thingml.xthingmlmt.thingML.impl.ArrayIndexImpl
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getArrayIndex()
		 * @generated
		 */
		EClass ARRAY_INDEX = eINSTANCE.getArrayIndex();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_INDEX__ARRAY = eINSTANCE.getArrayIndex_Array();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_INDEX__INDEX = eINSTANCE.getArrayIndex_Index();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.thingml.xthingmlmt.thingML.impl.ThingMLPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

	}

} //ThingMLPackage
