package org.thingml.xthingml.adapters.thingmlmt.thingml;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.thingml.xtext.thingML.AbstractConnector;
import org.thingml.xtext.thingML.Action;
import org.thingml.xtext.thingML.ActionBlock;
import org.thingml.xtext.thingML.AndExpression;
import org.thingml.xtext.thingML.AnnotatedElement;
import org.thingml.xtext.thingML.ArrayIndex;
import org.thingml.xtext.thingML.BooleanLiteral;
import org.thingml.xtext.thingML.ByteLiteral;
import org.thingml.xtext.thingML.CastExpression;
import org.thingml.xtext.thingML.CharLiteral;
import org.thingml.xtext.thingML.CompositeState;
import org.thingml.xtext.thingML.ConditionalAction;
import org.thingml.xtext.thingML.ConfigPropertyAssign;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.Connector;
import org.thingml.xtext.thingML.Decrement;
import org.thingml.xtext.thingML.DivExpression;
import org.thingml.xtext.thingML.DoubleLiteral;
import org.thingml.xtext.thingML.EnumLiteralRef;
import org.thingml.xtext.thingML.Enumeration;
import org.thingml.xtext.thingML.EnumerationLiteral;
import org.thingml.xtext.thingML.EqualsExpression;
import org.thingml.xtext.thingML.ErrorAction;
import org.thingml.xtext.thingML.Event;
import org.thingml.xtext.thingML.EventReference;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xtext.thingML.ExpressionGroup;
import org.thingml.xtext.thingML.ExternExpression;
import org.thingml.xtext.thingML.ExternStatement;
import org.thingml.xtext.thingML.ExternalConnector;
import org.thingml.xtext.thingML.FinalState;
import org.thingml.xtext.thingML.Function;
import org.thingml.xtext.thingML.FunctionCallExpression;
import org.thingml.xtext.thingML.FunctionCallStatement;
import org.thingml.xtext.thingML.GreaterExpression;
import org.thingml.xtext.thingML.GreaterOrEqualExpression;
import org.thingml.xtext.thingML.Handler;
import org.thingml.xtext.thingML.Import;
import org.thingml.xtext.thingML.Increment;
import org.thingml.xtext.thingML.Instance;
import org.thingml.xtext.thingML.IntegerLiteral;
import org.thingml.xtext.thingML.InternalPort;
import org.thingml.xtext.thingML.InternalTransition;
import org.thingml.xtext.thingML.LocalVariable;
import org.thingml.xtext.thingML.LoopAction;
import org.thingml.xtext.thingML.LowerExpression;
import org.thingml.xtext.thingML.LowerOrEqualExpression;
import org.thingml.xtext.thingML.Message;
import org.thingml.xtext.thingML.MinusExpression;
import org.thingml.xtext.thingML.ModExpression;
import org.thingml.xtext.thingML.NamedElement;
import org.thingml.xtext.thingML.NotEqualsExpression;
import org.thingml.xtext.thingML.NotExpression;
import org.thingml.xtext.thingML.ObjectType;
import org.thingml.xtext.thingML.OrExpression;
import org.thingml.xtext.thingML.Parameter;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xtext.thingML.PlusExpression;
import org.thingml.xtext.thingML.Port;
import org.thingml.xtext.thingML.PrimitiveType;
import org.thingml.xtext.thingML.PrintAction;
import org.thingml.xtext.thingML.Property;
import org.thingml.xtext.thingML.PropertyAssign;
import org.thingml.xtext.thingML.PropertyReference;
import org.thingml.xtext.thingML.Protocol;
import org.thingml.xtext.thingML.ProvidedPort;
import org.thingml.xtext.thingML.ReceiveMessage;
import org.thingml.xtext.thingML.Region;
import org.thingml.xtext.thingML.RequiredPort;
import org.thingml.xtext.thingML.ReturnAction;
import org.thingml.xtext.thingML.SendAction;
import org.thingml.xtext.thingML.Session;
import org.thingml.xtext.thingML.StartSession;
import org.thingml.xtext.thingML.State;
import org.thingml.xtext.thingML.StateContainer;
import org.thingml.xtext.thingML.StringLiteral;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLModel;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.thingML.TimesExpression;
import org.thingml.xtext.thingML.Transition;
import org.thingml.xtext.thingML.Type;
import org.thingml.xtext.thingML.TypeRef;
import org.thingml.xtext.thingML.UnaryMinus;
import org.thingml.xtext.thingML.Variable;
import org.thingml.xtext.thingML.VariableAssignment;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;

@SuppressWarnings("all")
public class ThingMLFactoryAdapter extends EFactoryImpl implements ThingMLFactory {
  private ThingMLMTAdaptersFactory adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  
  private org.thingml.xthingml.thingML.ThingMLFactory thingMLAdaptee = org.thingml.xthingml.thingML.ThingMLFactory.eINSTANCE;
  
  @Override
  public ThingMLModel createThingMLModel() {
    return adaptersFactory.createThingMLModelAdapter(thingMLAdaptee.createThingMLModel(), null);
  }
  
  @Override
  public Import createImport() {
    return adaptersFactory.createImportAdapter(thingMLAdaptee.createImport(), null);
  }
  
  @Override
  public PlatformAnnotation createPlatformAnnotation() {
    return adaptersFactory.createPlatformAnnotationAdapter(thingMLAdaptee.createPlatformAnnotation(), null);
  }
  
  @Override
  public NamedElement createNamedElement() {
    return adaptersFactory.createNamedElementAdapter(thingMLAdaptee.createNamedElement(), null);
  }
  
  @Override
  public AnnotatedElement createAnnotatedElement() {
    return adaptersFactory.createAnnotatedElementAdapter(thingMLAdaptee.createAnnotatedElement(), null);
  }
  
  @Override
  public Variable createVariable() {
    return adaptersFactory.createVariableAdapter(thingMLAdaptee.createVariable(), null);
  }
  
  @Override
  public TypeRef createTypeRef() {
    return adaptersFactory.createTypeRefAdapter(thingMLAdaptee.createTypeRef(), null);
  }
  
  @Override
  public Type createType() {
    return adaptersFactory.createTypeAdapter(thingMLAdaptee.createType(), null);
  }
  
  @Override
  public PrimitiveType createPrimitiveType() {
    return adaptersFactory.createPrimitiveTypeAdapter(thingMLAdaptee.createPrimitiveType(), null);
  }
  
  @Override
  public ObjectType createObjectType() {
    return adaptersFactory.createObjectTypeAdapter(thingMLAdaptee.createObjectType(), null);
  }
  
  @Override
  public Enumeration createEnumeration() {
    return adaptersFactory.createEnumerationAdapter(thingMLAdaptee.createEnumeration(), null);
  }
  
  @Override
  public EnumerationLiteral createEnumerationLiteral() {
    return adaptersFactory.createEnumerationLiteralAdapter(thingMLAdaptee.createEnumerationLiteral(), null);
  }
  
  @Override
  public Thing createThing() {
    return adaptersFactory.createThingAdapter(thingMLAdaptee.createThing(), null);
  }
  
  @Override
  public PropertyAssign createPropertyAssign() {
    return adaptersFactory.createPropertyAssignAdapter(thingMLAdaptee.createPropertyAssign(), null);
  }
  
  @Override
  public Protocol createProtocol() {
    return adaptersFactory.createProtocolAdapter(thingMLAdaptee.createProtocol(), null);
  }
  
  @Override
  public Function createFunction() {
    return adaptersFactory.createFunctionAdapter(thingMLAdaptee.createFunction(), null);
  }
  
  @Override
  public Property createProperty() {
    return adaptersFactory.createPropertyAdapter(thingMLAdaptee.createProperty(), null);
  }
  
  @Override
  public Message createMessage() {
    return adaptersFactory.createMessageAdapter(thingMLAdaptee.createMessage(), null);
  }
  
  @Override
  public Parameter createParameter() {
    return adaptersFactory.createParameterAdapter(thingMLAdaptee.createParameter(), null);
  }
  
  @Override
  public Port createPort() {
    return adaptersFactory.createPortAdapter(thingMLAdaptee.createPort(), null);
  }
  
  @Override
  public RequiredPort createRequiredPort() {
    return adaptersFactory.createRequiredPortAdapter(thingMLAdaptee.createRequiredPort(), null);
  }
  
  @Override
  public ProvidedPort createProvidedPort() {
    return adaptersFactory.createProvidedPortAdapter(thingMLAdaptee.createProvidedPort(), null);
  }
  
  @Override
  public InternalPort createInternalPort() {
    return adaptersFactory.createInternalPortAdapter(thingMLAdaptee.createInternalPort(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(thingMLAdaptee.createState(), null);
  }
  
  @Override
  public Handler createHandler() {
    return adaptersFactory.createHandlerAdapter(thingMLAdaptee.createHandler(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(thingMLAdaptee.createTransition(), null);
  }
  
  @Override
  public InternalTransition createInternalTransition() {
    return adaptersFactory.createInternalTransitionAdapter(thingMLAdaptee.createInternalTransition(), null);
  }
  
  @Override
  public CompositeState createCompositeState() {
    return adaptersFactory.createCompositeStateAdapter(thingMLAdaptee.createCompositeState(), null);
  }
  
  @Override
  public Session createSession() {
    return adaptersFactory.createSessionAdapter(thingMLAdaptee.createSession(), null);
  }
  
  @Override
  public Region createRegion() {
    return adaptersFactory.createRegionAdapter(thingMLAdaptee.createRegion(), null);
  }
  
  @Override
  public FinalState createFinalState() {
    return adaptersFactory.createFinalStateAdapter(thingMLAdaptee.createFinalState(), null);
  }
  
  @Override
  public StateContainer createStateContainer() {
    return adaptersFactory.createStateContainerAdapter(thingMLAdaptee.createStateContainer(), null);
  }
  
  @Override
  public Event createEvent() {
    return adaptersFactory.createEventAdapter(thingMLAdaptee.createEvent(), null);
  }
  
  @Override
  public ReceiveMessage createReceiveMessage() {
    return adaptersFactory.createReceiveMessageAdapter(thingMLAdaptee.createReceiveMessage(), null);
  }
  
  @Override
  public Action createAction() {
    return adaptersFactory.createActionAdapter(thingMLAdaptee.createAction(), null);
  }
  
  @Override
  public ActionBlock createActionBlock() {
    return adaptersFactory.createActionBlockAdapter(thingMLAdaptee.createActionBlock(), null);
  }
  
  @Override
  public ExternStatement createExternStatement() {
    return adaptersFactory.createExternStatementAdapter(thingMLAdaptee.createExternStatement(), null);
  }
  
  @Override
  public LocalVariable createLocalVariable() {
    return adaptersFactory.createLocalVariableAdapter(thingMLAdaptee.createLocalVariable(), null);
  }
  
  @Override
  public SendAction createSendAction() {
    return adaptersFactory.createSendActionAdapter(thingMLAdaptee.createSendAction(), null);
  }
  
  @Override
  public VariableAssignment createVariableAssignment() {
    return adaptersFactory.createVariableAssignmentAdapter(thingMLAdaptee.createVariableAssignment(), null);
  }
  
  @Override
  public Increment createIncrement() {
    return adaptersFactory.createIncrementAdapter(thingMLAdaptee.createIncrement(), null);
  }
  
  @Override
  public Decrement createDecrement() {
    return adaptersFactory.createDecrementAdapter(thingMLAdaptee.createDecrement(), null);
  }
  
  @Override
  public LoopAction createLoopAction() {
    return adaptersFactory.createLoopActionAdapter(thingMLAdaptee.createLoopAction(), null);
  }
  
  @Override
  public ConditionalAction createConditionalAction() {
    return adaptersFactory.createConditionalActionAdapter(thingMLAdaptee.createConditionalAction(), null);
  }
  
  @Override
  public ReturnAction createReturnAction() {
    return adaptersFactory.createReturnActionAdapter(thingMLAdaptee.createReturnAction(), null);
  }
  
  @Override
  public PrintAction createPrintAction() {
    return adaptersFactory.createPrintActionAdapter(thingMLAdaptee.createPrintAction(), null);
  }
  
  @Override
  public ErrorAction createErrorAction() {
    return adaptersFactory.createErrorActionAdapter(thingMLAdaptee.createErrorAction(), null);
  }
  
  @Override
  public StartSession createStartSession() {
    return adaptersFactory.createStartSessionAdapter(thingMLAdaptee.createStartSession(), null);
  }
  
  @Override
  public FunctionCallStatement createFunctionCallStatement() {
    return adaptersFactory.createFunctionCallStatementAdapter(thingMLAdaptee.createFunctionCallStatement(), null);
  }
  
  @Override
  public Expression createExpression() {
    return adaptersFactory.createExpressionAdapter(thingMLAdaptee.createExpression(), null);
  }
  
  @Override
  public ExternExpression createExternExpression() {
    return adaptersFactory.createExternExpressionAdapter(thingMLAdaptee.createExternExpression(), null);
  }
  
  @Override
  public EnumLiteralRef createEnumLiteralRef() {
    return adaptersFactory.createEnumLiteralRefAdapter(thingMLAdaptee.createEnumLiteralRef(), null);
  }
  
  @Override
  public ByteLiteral createByteLiteral() {
    return adaptersFactory.createByteLiteralAdapter(thingMLAdaptee.createByteLiteral(), null);
  }
  
  @Override
  public CharLiteral createCharLiteral() {
    return adaptersFactory.createCharLiteralAdapter(thingMLAdaptee.createCharLiteral(), null);
  }
  
  @Override
  public IntegerLiteral createIntegerLiteral() {
    return adaptersFactory.createIntegerLiteralAdapter(thingMLAdaptee.createIntegerLiteral(), null);
  }
  
  @Override
  public BooleanLiteral createBooleanLiteral() {
    return adaptersFactory.createBooleanLiteralAdapter(thingMLAdaptee.createBooleanLiteral(), null);
  }
  
  @Override
  public StringLiteral createStringLiteral() {
    return adaptersFactory.createStringLiteralAdapter(thingMLAdaptee.createStringLiteral(), null);
  }
  
  @Override
  public DoubleLiteral createDoubleLiteral() {
    return adaptersFactory.createDoubleLiteralAdapter(thingMLAdaptee.createDoubleLiteral(), null);
  }
  
  @Override
  public PropertyReference createPropertyReference() {
    return adaptersFactory.createPropertyReferenceAdapter(thingMLAdaptee.createPropertyReference(), null);
  }
  
  @Override
  public EventReference createEventReference() {
    return adaptersFactory.createEventReferenceAdapter(thingMLAdaptee.createEventReference(), null);
  }
  
  @Override
  public FunctionCallExpression createFunctionCallExpression() {
    return adaptersFactory.createFunctionCallExpressionAdapter(thingMLAdaptee.createFunctionCallExpression(), null);
  }
  
  @Override
  public Configuration createConfiguration() {
    return adaptersFactory.createConfigurationAdapter(thingMLAdaptee.createConfiguration(), null);
  }
  
  @Override
  public Instance createInstance() {
    return adaptersFactory.createInstanceAdapter(thingMLAdaptee.createInstance(), null);
  }
  
  @Override
  public ConfigPropertyAssign createConfigPropertyAssign() {
    return adaptersFactory.createConfigPropertyAssignAdapter(thingMLAdaptee.createConfigPropertyAssign(), null);
  }
  
  @Override
  public AbstractConnector createAbstractConnector() {
    return adaptersFactory.createAbstractConnectorAdapter(thingMLAdaptee.createAbstractConnector(), null);
  }
  
  @Override
  public Connector createConnector() {
    return adaptersFactory.createConnectorAdapter(thingMLAdaptee.createConnector(), null);
  }
  
  @Override
  public ExternalConnector createExternalConnector() {
    return adaptersFactory.createExternalConnectorAdapter(thingMLAdaptee.createExternalConnector(), null);
  }
  
  @Override
  public CastExpression createCastExpression() {
    return adaptersFactory.createCastExpressionAdapter(thingMLAdaptee.createCastExpression(), null);
  }
  
  @Override
  public OrExpression createOrExpression() {
    return adaptersFactory.createOrExpressionAdapter(thingMLAdaptee.createOrExpression(), null);
  }
  
  @Override
  public AndExpression createAndExpression() {
    return adaptersFactory.createAndExpressionAdapter(thingMLAdaptee.createAndExpression(), null);
  }
  
  @Override
  public EqualsExpression createEqualsExpression() {
    return adaptersFactory.createEqualsExpressionAdapter(thingMLAdaptee.createEqualsExpression(), null);
  }
  
  @Override
  public NotEqualsExpression createNotEqualsExpression() {
    return adaptersFactory.createNotEqualsExpressionAdapter(thingMLAdaptee.createNotEqualsExpression(), null);
  }
  
  @Override
  public GreaterExpression createGreaterExpression() {
    return adaptersFactory.createGreaterExpressionAdapter(thingMLAdaptee.createGreaterExpression(), null);
  }
  
  @Override
  public LowerExpression createLowerExpression() {
    return adaptersFactory.createLowerExpressionAdapter(thingMLAdaptee.createLowerExpression(), null);
  }
  
  @Override
  public GreaterOrEqualExpression createGreaterOrEqualExpression() {
    return adaptersFactory.createGreaterOrEqualExpressionAdapter(thingMLAdaptee.createGreaterOrEqualExpression(), null);
  }
  
  @Override
  public LowerOrEqualExpression createLowerOrEqualExpression() {
    return adaptersFactory.createLowerOrEqualExpressionAdapter(thingMLAdaptee.createLowerOrEqualExpression(), null);
  }
  
  @Override
  public PlusExpression createPlusExpression() {
    return adaptersFactory.createPlusExpressionAdapter(thingMLAdaptee.createPlusExpression(), null);
  }
  
  @Override
  public MinusExpression createMinusExpression() {
    return adaptersFactory.createMinusExpressionAdapter(thingMLAdaptee.createMinusExpression(), null);
  }
  
  @Override
  public TimesExpression createTimesExpression() {
    return adaptersFactory.createTimesExpressionAdapter(thingMLAdaptee.createTimesExpression(), null);
  }
  
  @Override
  public DivExpression createDivExpression() {
    return adaptersFactory.createDivExpressionAdapter(thingMLAdaptee.createDivExpression(), null);
  }
  
  @Override
  public ModExpression createModExpression() {
    return adaptersFactory.createModExpressionAdapter(thingMLAdaptee.createModExpression(), null);
  }
  
  @Override
  public ExpressionGroup createExpressionGroup() {
    return adaptersFactory.createExpressionGroupAdapter(thingMLAdaptee.createExpressionGroup(), null);
  }
  
  @Override
  public NotExpression createNotExpression() {
    return adaptersFactory.createNotExpressionAdapter(thingMLAdaptee.createNotExpression(), null);
  }
  
  @Override
  public UnaryMinus createUnaryMinus() {
    return adaptersFactory.createUnaryMinusAdapter(thingMLAdaptee.createUnaryMinus(), null);
  }
  
  @Override
  public ArrayIndex createArrayIndex() {
    return adaptersFactory.createArrayIndexAdapter(thingMLAdaptee.createArrayIndex(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getThingMLPackage();
  }
  
  public ThingMLPackage getThingMLPackage() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE;
  }
}
