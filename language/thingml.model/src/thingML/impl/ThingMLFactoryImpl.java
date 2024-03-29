/**
 */
package thingML.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import thingML.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThingMLFactoryImpl extends EFactoryImpl implements ThingMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThingMLFactory init() {
		try {
			ThingMLFactory theThingMLFactory = (ThingMLFactory)EPackage.Registry.INSTANCE.getEFactory(ThingMLPackage.eNS_URI);
			if (theThingMLFactory != null) {
				return theThingMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ThingMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ThingMLPackage.DYNAMIC_INSTANCE: return createDynamicInstance();
			case ThingMLPackage.NULL_VALUE: return createNullValue();
			case ThingMLPackage.INTEGER_VALUE: return createIntegerValue();
			case ThingMLPackage.STRING_VALUE: return createStringValue();
			case ThingMLPackage.ARRAY_VALUE: return createArrayValue();
			case ThingMLPackage.PROXY_VALUE: return createProxyValue();
			case ThingMLPackage.ARRAY_PROXY_VALUE: return createArrayProxyValue();
			case ThingMLPackage.ARRAY_PROXY_ENTRY: return createArrayProxyEntry();
			case ThingMLPackage.DYNAMIC_COMPOSITE_STATE: return createDynamicCompositeState();
			case ThingMLPackage.FRAME: return createFrame();
			case ThingMLPackage.CONTEXT: return createContext();
			case ThingMLPackage.DYNAMIC_VARIABLE: return createDynamicVariable();
			case ThingMLPackage.BOOLEAN_VALUE: return createBooleanValue();
			case ThingMLPackage.DYNAMIC_PORT: return createDynamicPort();
			case ThingMLPackage.DYNAMIC_MESSAGE: return createDynamicMessage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicInstance createDynamicInstance() {
		DynamicInstanceImpl dynamicInstance = new DynamicInstanceImpl();
		return dynamicInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullValue createNullValue() {
		NullValueImpl nullValue = new NullValueImpl();
		return nullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayValue createArrayValue() {
		ArrayValueImpl arrayValue = new ArrayValueImpl();
		return arrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyValue createProxyValue() {
		ProxyValueImpl proxyValue = new ProxyValueImpl();
		return proxyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayProxyValue createArrayProxyValue() {
		ArrayProxyValueImpl arrayProxyValue = new ArrayProxyValueImpl();
		return arrayProxyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayProxyEntry createArrayProxyEntry() {
		ArrayProxyEntryImpl arrayProxyEntry = new ArrayProxyEntryImpl();
		return arrayProxyEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicCompositeState createDynamicCompositeState() {
		DynamicCompositeStateImpl dynamicCompositeState = new DynamicCompositeStateImpl();
		return dynamicCompositeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame createFrame() {
		FrameImpl frame = new FrameImpl();
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicVariable createDynamicVariable() {
		DynamicVariableImpl dynamicVariable = new DynamicVariableImpl();
		return dynamicVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicPort createDynamicPort() {
		DynamicPortImpl dynamicPort = new DynamicPortImpl();
		return dynamicPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicMessage createDynamicMessage() {
		DynamicMessageImpl dynamicMessage = new DynamicMessageImpl();
		return dynamicMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingMLPackage getThingMLPackage() {
		return (ThingMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ThingMLPackage getPackage() {
		return ThingMLPackage.eINSTANCE;
	}

} //ThingMLFactoryImpl
