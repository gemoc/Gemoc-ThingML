/**
 */
package org.thingml.xthingml.thingML.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.thingml.xthingml.thingML.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.thingml.xthingml.thingML.ThingMLPackage
 * @generated
 */
public class ThingMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ThingMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ThingMLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingMLSwitch<Adapter> modelSwitch =
		new ThingMLSwitch<Adapter>() {
			@Override
			public Adapter caseThingMLModel(ThingMLModel object) {
				return createThingMLModelAdapter();
			}
			@Override
			public Adapter casePlatformAnnotation(PlatformAnnotation object) {
				return createPlatformAnnotationAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseAnnotatedElement(AnnotatedElement object) {
				return createAnnotatedElementAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseTypeRef(TypeRef object) {
				return createTypeRefAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseObjectType(ObjectType object) {
				return createObjectTypeAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteral(EnumerationLiteral object) {
				return createEnumerationLiteralAdapter();
			}
			@Override
			public Adapter caseThing(Thing object) {
				return createThingAdapter();
			}
			@Override
			public Adapter casePropertyAssign(PropertyAssign object) {
				return createPropertyAssignAdapter();
			}
			@Override
			public Adapter caseProtocol(Protocol object) {
				return createProtocolAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseRequiredPort(RequiredPort object) {
				return createRequiredPortAdapter();
			}
			@Override
			public Adapter caseProvidedPort(ProvidedPort object) {
				return createProvidedPortAdapter();
			}
			@Override
			public Adapter caseInternalPort(InternalPort object) {
				return createInternalPortAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseHandler(Handler object) {
				return createHandlerAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseInternalTransition(InternalTransition object) {
				return createInternalTransitionAdapter();
			}
			@Override
			public Adapter caseCompositeState(CompositeState object) {
				return createCompositeStateAdapter();
			}
			@Override
			public Adapter caseSession(Session object) {
				return createSessionAdapter();
			}
			@Override
			public Adapter caseRegion(Region object) {
				return createRegionAdapter();
			}
			@Override
			public Adapter caseFinalState(FinalState object) {
				return createFinalStateAdapter();
			}
			@Override
			public Adapter caseStateContainer(StateContainer object) {
				return createStateContainerAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseReceiveMessage(ReceiveMessage object) {
				return createReceiveMessageAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseActionBlock(ActionBlock object) {
				return createActionBlockAdapter();
			}
			@Override
			public Adapter caseExternStatement(ExternStatement object) {
				return createExternStatementAdapter();
			}
			@Override
			public Adapter caseLocalVariable(LocalVariable object) {
				return createLocalVariableAdapter();
			}
			@Override
			public Adapter caseSendAction(SendAction object) {
				return createSendActionAdapter();
			}
			@Override
			public Adapter caseVariableAssignment(VariableAssignment object) {
				return createVariableAssignmentAdapter();
			}
			@Override
			public Adapter caseIncrement(Increment object) {
				return createIncrementAdapter();
			}
			@Override
			public Adapter caseDecrement(Decrement object) {
				return createDecrementAdapter();
			}
			@Override
			public Adapter caseLoopAction(LoopAction object) {
				return createLoopActionAdapter();
			}
			@Override
			public Adapter caseConditionalAction(ConditionalAction object) {
				return createConditionalActionAdapter();
			}
			@Override
			public Adapter caseReturnAction(ReturnAction object) {
				return createReturnActionAdapter();
			}
			@Override
			public Adapter casePrintAction(PrintAction object) {
				return createPrintActionAdapter();
			}
			@Override
			public Adapter caseErrorAction(ErrorAction object) {
				return createErrorActionAdapter();
			}
			@Override
			public Adapter caseStartSession(StartSession object) {
				return createStartSessionAdapter();
			}
			@Override
			public Adapter caseFunctionCallStatement(FunctionCallStatement object) {
				return createFunctionCallStatementAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseExternExpression(ExternExpression object) {
				return createExternExpressionAdapter();
			}
			@Override
			public Adapter caseEnumLiteralRef(EnumLiteralRef object) {
				return createEnumLiteralRefAdapter();
			}
			@Override
			public Adapter caseByteLiteral(ByteLiteral object) {
				return createByteLiteralAdapter();
			}
			@Override
			public Adapter caseCharLiteral(CharLiteral object) {
				return createCharLiteralAdapter();
			}
			@Override
			public Adapter caseIntegerLiteral(IntegerLiteral object) {
				return createIntegerLiteralAdapter();
			}
			@Override
			public Adapter caseBooleanLiteral(BooleanLiteral object) {
				return createBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseStringLiteral(StringLiteral object) {
				return createStringLiteralAdapter();
			}
			@Override
			public Adapter caseDoubleLiteral(DoubleLiteral object) {
				return createDoubleLiteralAdapter();
			}
			@Override
			public Adapter casePropertyReference(PropertyReference object) {
				return createPropertyReferenceAdapter();
			}
			@Override
			public Adapter caseEventReference(EventReference object) {
				return createEventReferenceAdapter();
			}
			@Override
			public Adapter caseFunctionCallExpression(FunctionCallExpression object) {
				return createFunctionCallExpressionAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseInstance(Instance object) {
				return createInstanceAdapter();
			}
			@Override
			public Adapter caseConfigPropertyAssign(ConfigPropertyAssign object) {
				return createConfigPropertyAssignAdapter();
			}
			@Override
			public Adapter caseAbstractConnector(AbstractConnector object) {
				return createAbstractConnectorAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseExternalConnector(ExternalConnector object) {
				return createExternalConnectorAdapter();
			}
			@Override
			public Adapter caseCastExpression(CastExpression object) {
				return createCastExpressionAdapter();
			}
			@Override
			public Adapter caseOrExpression(OrExpression object) {
				return createOrExpressionAdapter();
			}
			@Override
			public Adapter caseAndExpression(AndExpression object) {
				return createAndExpressionAdapter();
			}
			@Override
			public Adapter caseEqualsExpression(EqualsExpression object) {
				return createEqualsExpressionAdapter();
			}
			@Override
			public Adapter caseNotEqualsExpression(NotEqualsExpression object) {
				return createNotEqualsExpressionAdapter();
			}
			@Override
			public Adapter caseGreaterExpression(GreaterExpression object) {
				return createGreaterExpressionAdapter();
			}
			@Override
			public Adapter caseLowerExpression(LowerExpression object) {
				return createLowerExpressionAdapter();
			}
			@Override
			public Adapter caseGreaterOrEqualExpression(GreaterOrEqualExpression object) {
				return createGreaterOrEqualExpressionAdapter();
			}
			@Override
			public Adapter caseLowerOrEqualExpression(LowerOrEqualExpression object) {
				return createLowerOrEqualExpressionAdapter();
			}
			@Override
			public Adapter casePlusExpression(PlusExpression object) {
				return createPlusExpressionAdapter();
			}
			@Override
			public Adapter caseMinusExpression(MinusExpression object) {
				return createMinusExpressionAdapter();
			}
			@Override
			public Adapter caseTimesExpression(TimesExpression object) {
				return createTimesExpressionAdapter();
			}
			@Override
			public Adapter caseDivExpression(DivExpression object) {
				return createDivExpressionAdapter();
			}
			@Override
			public Adapter caseModExpression(ModExpression object) {
				return createModExpressionAdapter();
			}
			@Override
			public Adapter caseExpressionGroup(ExpressionGroup object) {
				return createExpressionGroupAdapter();
			}
			@Override
			public Adapter caseNotExpression(NotExpression object) {
				return createNotExpressionAdapter();
			}
			@Override
			public Adapter caseUnaryMinus(UnaryMinus object) {
				return createUnaryMinusAdapter();
			}
			@Override
			public Adapter caseArrayIndex(ArrayIndex object) {
				return createArrayIndexAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.ThingMLModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.ThingMLModel
	 * @generated
	 */
	public Adapter createThingMLModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.PlatformAnnotation <em>Platform Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.PlatformAnnotation
	 * @generated
	 */
	public Adapter createPlatformAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.AnnotatedElement
	 * @generated
	 */
	public Adapter createAnnotatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.TypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.TypeRef
	 * @generated
	 */
	public Adapter createTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.ObjectType
	 * @generated
	 */
	public Adapter createObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.EnumerationLiteral
	 * @generated
	 */
	public Adapter createEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Thing
	 * @generated
	 */
	public Adapter createThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.PropertyAssign <em>Property Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.PropertyAssign
	 * @generated
	 */
	public Adapter createPropertyAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Protocol
	 * @generated
	 */
	public Adapter createProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.RequiredPort <em>Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.RequiredPort
	 * @generated
	 */
	public Adapter createRequiredPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.ProvidedPort <em>Provided Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.ProvidedPort
	 * @generated
	 */
	public Adapter createProvidedPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.InternalPort <em>Internal Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.InternalPort
	 * @generated
	 */
	public Adapter createInternalPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Handler
	 * @generated
	 */
	public Adapter createHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.InternalTransition <em>Internal Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.InternalTransition
	 * @generated
	 */
	public Adapter createInternalTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.CompositeState <em>Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.CompositeState
	 * @generated
	 */
	public Adapter createCompositeStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Session
	 * @generated
	 */
	public Adapter createSessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Region
	 * @generated
	 */
	public Adapter createRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.FinalState
	 * @generated
	 */
	public Adapter createFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.StateContainer <em>State Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.StateContainer
	 * @generated
	 */
	public Adapter createStateContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.ReceiveMessage <em>Receive Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.ReceiveMessage
	 * @generated
	 */
	public Adapter createReceiveMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.ActionBlock <em>Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.ActionBlock
	 * @generated
	 */
	public Adapter createActionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.ExternStatement <em>Extern Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.ExternStatement
	 * @generated
	 */
	public Adapter createExternStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.LocalVariable
	 * @generated
	 */
	public Adapter createLocalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.SendAction <em>Send Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.SendAction
	 * @generated
	 */
	public Adapter createSendActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.VariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.VariableAssignment
	 * @generated
	 */
	public Adapter createVariableAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Increment <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Increment
	 * @generated
	 */
	public Adapter createIncrementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Decrement <em>Decrement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Decrement
	 * @generated
	 */
	public Adapter createDecrementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.LoopAction <em>Loop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.LoopAction
	 * @generated
	 */
	public Adapter createLoopActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.ConditionalAction <em>Conditional Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.ConditionalAction
	 * @generated
	 */
	public Adapter createConditionalActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.ReturnAction <em>Return Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.ReturnAction
	 * @generated
	 */
	public Adapter createReturnActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.PrintAction <em>Print Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.PrintAction
	 * @generated
	 */
	public Adapter createPrintActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.ErrorAction <em>Error Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.ErrorAction
	 * @generated
	 */
	public Adapter createErrorActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.StartSession <em>Start Session</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.StartSession
	 * @generated
	 */
	public Adapter createStartSessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.FunctionCallStatement <em>Function Call Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.FunctionCallStatement
	 * @generated
	 */
	public Adapter createFunctionCallStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.ExternExpression <em>Extern Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.ExternExpression
	 * @generated
	 */
	public Adapter createExternExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.EnumLiteralRef <em>Enum Literal Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.EnumLiteralRef
	 * @generated
	 */
	public Adapter createEnumLiteralRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.ByteLiteral <em>Byte Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.ByteLiteral
	 * @generated
	 */
	public Adapter createByteLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.CharLiteral <em>Char Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.CharLiteral
	 * @generated
	 */
	public Adapter createCharLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.IntegerLiteral
	 * @generated
	 */
	public Adapter createIntegerLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.BooleanLiteral
	 * @generated
	 */
	public Adapter createBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.StringLiteral
	 * @generated
	 */
	public Adapter createStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.DoubleLiteral <em>Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.DoubleLiteral
	 * @generated
	 */
	public Adapter createDoubleLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.PropertyReference <em>Property Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.PropertyReference
	 * @generated
	 */
	public Adapter createPropertyReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.EventReference <em>Event Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.EventReference
	 * @generated
	 */
	public Adapter createEventReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.FunctionCallExpression <em>Function Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.FunctionCallExpression
	 * @generated
	 */
	public Adapter createFunctionCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.ConfigPropertyAssign <em>Config Property Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.ConfigPropertyAssign
	 * @generated
	 */
	public Adapter createConfigPropertyAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.AbstractConnector <em>Abstract Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.AbstractConnector
	 * @generated
	 */
	public Adapter createAbstractConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.ExternalConnector <em>External Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.ExternalConnector
	 * @generated
	 */
	public Adapter createExternalConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.CastExpression <em>Cast Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.CastExpression
	 * @generated
	 */
	public Adapter createCastExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.OrExpression
	 * @generated
	 */
	public Adapter createOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.AndExpression
	 * @generated
	 */
	public Adapter createAndExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.EqualsExpression <em>Equals Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.EqualsExpression
	 * @generated
	 */
	public Adapter createEqualsExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.NotEqualsExpression <em>Not Equals Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.NotEqualsExpression
	 * @generated
	 */
	public Adapter createNotEqualsExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.GreaterExpression <em>Greater Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.GreaterExpression
	 * @generated
	 */
	public Adapter createGreaterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.LowerExpression <em>Lower Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.LowerExpression
	 * @generated
	 */
	public Adapter createLowerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.GreaterOrEqualExpression <em>Greater Or Equal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.GreaterOrEqualExpression
	 * @generated
	 */
	public Adapter createGreaterOrEqualExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.LowerOrEqualExpression <em>Lower Or Equal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.LowerOrEqualExpression
	 * @generated
	 */
	public Adapter createLowerOrEqualExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.PlusExpression <em>Plus Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.PlusExpression
	 * @generated
	 */
	public Adapter createPlusExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.MinusExpression <em>Minus Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.MinusExpression
	 * @generated
	 */
	public Adapter createMinusExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.TimesExpression <em>Times Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.TimesExpression
	 * @generated
	 */
	public Adapter createTimesExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.DivExpression <em>Div Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.DivExpression
	 * @generated
	 */
	public Adapter createDivExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.ModExpression <em>Mod Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.ModExpression
	 * @generated
	 */
	public Adapter createModExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.ExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.ExpressionGroup
	 * @generated
	 */
	public Adapter createExpressionGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.NotExpression <em>Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.NotExpression
	 * @generated
	 */
	public Adapter createNotExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.UnaryMinus <em>Unary Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.UnaryMinus
	 * @generated
	 */
	public Adapter createUnaryMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.thingml.xthingml.thingML.ArrayIndex <em>Array Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.thingml.xthingml.thingML.ArrayIndex
	 * @generated
	 */
	public Adapter createArrayIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ThingMLAdapterFactory
