package org.thingml.xthingml.adapters.xthingmlmt.thingml;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingmlmt.thingML.AbstractConnector;
import org.thingml.xthingmlmt.thingML.Action;
import org.thingml.xthingmlmt.thingML.ActionBlock;
import org.thingml.xthingmlmt.thingML.AndExpression;
import org.thingml.xthingmlmt.thingML.AnnotatedElement;
import org.thingml.xthingmlmt.thingML.ArrayIndex;
import org.thingml.xthingmlmt.thingML.BooleanLiteral;
import org.thingml.xthingmlmt.thingML.ByteLiteral;
import org.thingml.xthingmlmt.thingML.CastExpression;
import org.thingml.xthingmlmt.thingML.CharLiteral;
import org.thingml.xthingmlmt.thingML.CompositeState;
import org.thingml.xthingmlmt.thingML.ConditionalAction;
import org.thingml.xthingmlmt.thingML.ConfigPropertyAssign;
import org.thingml.xthingmlmt.thingML.Configuration;
import org.thingml.xthingmlmt.thingML.Connector;
import org.thingml.xthingmlmt.thingML.Decrement;
import org.thingml.xthingmlmt.thingML.DivExpression;
import org.thingml.xthingmlmt.thingML.DoubleLiteral;
import org.thingml.xthingmlmt.thingML.EnumLiteralRef;
import org.thingml.xthingmlmt.thingML.Enumeration;
import org.thingml.xthingmlmt.thingML.EnumerationLiteral;
import org.thingml.xthingmlmt.thingML.EqualsExpression;
import org.thingml.xthingmlmt.thingML.ErrorAction;
import org.thingml.xthingmlmt.thingML.Event;
import org.thingml.xthingmlmt.thingML.EventReference;
import org.thingml.xthingmlmt.thingML.Expression;
import org.thingml.xthingmlmt.thingML.ExpressionGroup;
import org.thingml.xthingmlmt.thingML.ExternExpression;
import org.thingml.xthingmlmt.thingML.ExternStatement;
import org.thingml.xthingmlmt.thingML.ExternalConnector;
import org.thingml.xthingmlmt.thingML.FinalState;
import org.thingml.xthingmlmt.thingML.Function;
import org.thingml.xthingmlmt.thingML.FunctionCallExpression;
import org.thingml.xthingmlmt.thingML.FunctionCallStatement;
import org.thingml.xthingmlmt.thingML.GreaterExpression;
import org.thingml.xthingmlmt.thingML.GreaterOrEqualExpression;
import org.thingml.xthingmlmt.thingML.Handler;
import org.thingml.xthingmlmt.thingML.Increment;
import org.thingml.xthingmlmt.thingML.Instance;
import org.thingml.xthingmlmt.thingML.IntegerLiteral;
import org.thingml.xthingmlmt.thingML.InternalPort;
import org.thingml.xthingmlmt.thingML.InternalTransition;
import org.thingml.xthingmlmt.thingML.LocalVariable;
import org.thingml.xthingmlmt.thingML.LoopAction;
import org.thingml.xthingmlmt.thingML.LowerExpression;
import org.thingml.xthingmlmt.thingML.LowerOrEqualExpression;
import org.thingml.xthingmlmt.thingML.Message;
import org.thingml.xthingmlmt.thingML.MinusExpression;
import org.thingml.xthingmlmt.thingML.ModExpression;
import org.thingml.xthingmlmt.thingML.NamedElement;
import org.thingml.xthingmlmt.thingML.NotEqualsExpression;
import org.thingml.xthingmlmt.thingML.NotExpression;
import org.thingml.xthingmlmt.thingML.ObjectType;
import org.thingml.xthingmlmt.thingML.OrExpression;
import org.thingml.xthingmlmt.thingML.Parameter;
import org.thingml.xthingmlmt.thingML.PlatformAnnotation;
import org.thingml.xthingmlmt.thingML.PlusExpression;
import org.thingml.xthingmlmt.thingML.Port;
import org.thingml.xthingmlmt.thingML.PrimitiveType;
import org.thingml.xthingmlmt.thingML.PrintAction;
import org.thingml.xthingmlmt.thingML.Property;
import org.thingml.xthingmlmt.thingML.PropertyAssign;
import org.thingml.xthingmlmt.thingML.PropertyReference;
import org.thingml.xthingmlmt.thingML.Protocol;
import org.thingml.xthingmlmt.thingML.ProvidedPort;
import org.thingml.xthingmlmt.thingML.ReceiveMessage;
import org.thingml.xthingmlmt.thingML.Region;
import org.thingml.xthingmlmt.thingML.RequiredPort;
import org.thingml.xthingmlmt.thingML.ReturnAction;
import org.thingml.xthingmlmt.thingML.SendAction;
import org.thingml.xthingmlmt.thingML.Session;
import org.thingml.xthingmlmt.thingML.StartSession;
import org.thingml.xthingmlmt.thingML.State;
import org.thingml.xthingmlmt.thingML.StateContainer;
import org.thingml.xthingmlmt.thingML.StringLiteral;
import org.thingml.xthingmlmt.thingML.Thing;
import org.thingml.xthingmlmt.thingML.ThingMLFactory;
import org.thingml.xthingmlmt.thingML.ThingMLModel;
import org.thingml.xthingmlmt.thingML.ThingMLPackage;
import org.thingml.xthingmlmt.thingML.TimesExpression;
import org.thingml.xthingmlmt.thingML.Transition;
import org.thingml.xthingmlmt.thingML.Type;
import org.thingml.xthingmlmt.thingML.TypeRef;
import org.thingml.xthingmlmt.thingML.UnaryMinus;
import org.thingml.xthingmlmt.thingML.Variable;
import org.thingml.xthingmlmt.thingML.VariableAssignment;

@SuppressWarnings("all")
public class ThingMLFactoryAdapter extends EFactoryImpl implements ThingMLFactory {
  private XThingMLMTAdaptersFactory adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  
  private org.thingml.xthingml.thingML.ThingMLFactory thingMLAdaptee = org.thingml.xthingml.thingML.ThingMLFactory.eINSTANCE;
  
  @Override
  public ThingMLModel createThingMLModel() {
    return adaptersFactory.createThingMLModelAdapter(thingMLAdaptee.createThingMLModel(), null);
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
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE;
  }
}
