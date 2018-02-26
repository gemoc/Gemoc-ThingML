package org.thingml.xthingml.adapters.xthingmlmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.AbstractConnectorAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ActionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ActionBlockAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.AndExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.AnnotatedElementAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ArrayIndexAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.BooleanLiteralAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ByteLiteralAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.CastExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.CharLiteralAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.CompositeStateAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ConditionalActionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ConfigPropertyAssignAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ConfigurationAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ConnectorAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.DecrementAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.DivExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.DoubleLiteralAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.EnumLiteralRefAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.EnumerationAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.EnumerationLiteralAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.EqualsExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ErrorActionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.EventAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.EventReferenceAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionGroupAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ExternExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ExternStatementAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ExternalConnectorAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.FinalStateAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.FunctionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.FunctionCallExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.FunctionCallStatementAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.GreaterExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.GreaterOrEqualExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.HandlerAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.IncrementAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.InstanceAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.IntegerLiteralAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.InternalPortAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.InternalTransitionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.LocalVariableAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.LoopActionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.LowerExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.LowerOrEqualExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.MessageAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.MinusExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ModExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.NamedElementAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.NotEqualsExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.NotExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ObjectTypeAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.OrExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ParameterAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.PlatformAnnotationAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.PlusExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.PortAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.PrimitiveTypeAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.PrintActionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.PropertyAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.PropertyAssignAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.PropertyReferenceAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ProtocolAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ProvidedPortAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ReceiveMessageAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.RegionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.RequiredPortAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ReturnActionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.SendActionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.SessionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.StartSessionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.StateAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.StateContainerAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.StringLiteralAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ThingAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.ThingMLModelAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.TimesExpressionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.TransitionAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.TypeAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.TypeRefAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.UnaryMinusAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.VariableAdapter;
import org.thingml.xthingml.adapters.xthingmlmt.thingML.VariableAssignmentAdapter;
import org.thingml.xthingml.thingML.AbstractConnector;
import org.thingml.xthingml.thingML.Action;
import org.thingml.xthingml.thingML.ActionBlock;
import org.thingml.xthingml.thingML.AndExpression;
import org.thingml.xthingml.thingML.AnnotatedElement;
import org.thingml.xthingml.thingML.ArrayIndex;
import org.thingml.xthingml.thingML.BooleanLiteral;
import org.thingml.xthingml.thingML.ByteLiteral;
import org.thingml.xthingml.thingML.CastExpression;
import org.thingml.xthingml.thingML.CharLiteral;
import org.thingml.xthingml.thingML.CompositeState;
import org.thingml.xthingml.thingML.ConditionalAction;
import org.thingml.xthingml.thingML.ConfigPropertyAssign;
import org.thingml.xthingml.thingML.Configuration;
import org.thingml.xthingml.thingML.Connector;
import org.thingml.xthingml.thingML.Decrement;
import org.thingml.xthingml.thingML.DivExpression;
import org.thingml.xthingml.thingML.DoubleLiteral;
import org.thingml.xthingml.thingML.EnumLiteralRef;
import org.thingml.xthingml.thingML.Enumeration;
import org.thingml.xthingml.thingML.EnumerationLiteral;
import org.thingml.xthingml.thingML.EqualsExpression;
import org.thingml.xthingml.thingML.ErrorAction;
import org.thingml.xthingml.thingML.Event;
import org.thingml.xthingml.thingML.EventReference;
import org.thingml.xthingml.thingML.Expression;
import org.thingml.xthingml.thingML.ExpressionGroup;
import org.thingml.xthingml.thingML.ExternExpression;
import org.thingml.xthingml.thingML.ExternStatement;
import org.thingml.xthingml.thingML.ExternalConnector;
import org.thingml.xthingml.thingML.FinalState;
import org.thingml.xthingml.thingML.Function;
import org.thingml.xthingml.thingML.FunctionCallExpression;
import org.thingml.xthingml.thingML.FunctionCallStatement;
import org.thingml.xthingml.thingML.GreaterExpression;
import org.thingml.xthingml.thingML.GreaterOrEqualExpression;
import org.thingml.xthingml.thingML.Handler;
import org.thingml.xthingml.thingML.Increment;
import org.thingml.xthingml.thingML.Instance;
import org.thingml.xthingml.thingML.IntegerLiteral;
import org.thingml.xthingml.thingML.InternalPort;
import org.thingml.xthingml.thingML.InternalTransition;
import org.thingml.xthingml.thingML.LocalVariable;
import org.thingml.xthingml.thingML.LoopAction;
import org.thingml.xthingml.thingML.LowerExpression;
import org.thingml.xthingml.thingML.LowerOrEqualExpression;
import org.thingml.xthingml.thingML.Message;
import org.thingml.xthingml.thingML.MinusExpression;
import org.thingml.xthingml.thingML.ModExpression;
import org.thingml.xthingml.thingML.NamedElement;
import org.thingml.xthingml.thingML.NotEqualsExpression;
import org.thingml.xthingml.thingML.NotExpression;
import org.thingml.xthingml.thingML.ObjectType;
import org.thingml.xthingml.thingML.OrExpression;
import org.thingml.xthingml.thingML.Parameter;
import org.thingml.xthingml.thingML.PlatformAnnotation;
import org.thingml.xthingml.thingML.PlusExpression;
import org.thingml.xthingml.thingML.Port;
import org.thingml.xthingml.thingML.PrimitiveType;
import org.thingml.xthingml.thingML.PrintAction;
import org.thingml.xthingml.thingML.Property;
import org.thingml.xthingml.thingML.PropertyAssign;
import org.thingml.xthingml.thingML.PropertyReference;
import org.thingml.xthingml.thingML.Protocol;
import org.thingml.xthingml.thingML.ProvidedPort;
import org.thingml.xthingml.thingML.ReceiveMessage;
import org.thingml.xthingml.thingML.Region;
import org.thingml.xthingml.thingML.RequiredPort;
import org.thingml.xthingml.thingML.ReturnAction;
import org.thingml.xthingml.thingML.SendAction;
import org.thingml.xthingml.thingML.Session;
import org.thingml.xthingml.thingML.StartSession;
import org.thingml.xthingml.thingML.State;
import org.thingml.xthingml.thingML.StateContainer;
import org.thingml.xthingml.thingML.StringLiteral;
import org.thingml.xthingml.thingML.Thing;
import org.thingml.xthingml.thingML.ThingMLModel;
import org.thingml.xthingml.thingML.TimesExpression;
import org.thingml.xthingml.thingML.Transition;
import org.thingml.xthingml.thingML.Type;
import org.thingml.xthingml.thingML.TypeRef;
import org.thingml.xthingml.thingML.UnaryMinus;
import org.thingml.xthingml.thingML.Variable;
import org.thingml.xthingml.thingML.VariableAssignment;

@SuppressWarnings("all")
public class XThingMLMTAdaptersFactory implements AdaptersFactory {
  private static XThingMLMTAdaptersFactory instance;
  
  public static XThingMLMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XThingMLMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.thingml.xthingml.thingML.ThingMLModel){
    	return createThingMLModelAdapter((org.thingml.xthingml.thingML.ThingMLModel) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.PlatformAnnotation){
    	return createPlatformAnnotationAdapter((org.thingml.xthingml.thingML.PlatformAnnotation) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Variable){
    	return createVariableAdapter((org.thingml.xthingml.thingML.Variable) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.PrimitiveType){
    	return createPrimitiveTypeAdapter((org.thingml.xthingml.thingML.PrimitiveType) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.ObjectType){
    	return createObjectTypeAdapter((org.thingml.xthingml.thingML.ObjectType) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Enumeration){
    	return createEnumerationAdapter((org.thingml.xthingml.thingML.Enumeration) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Type){
    	return createTypeAdapter((org.thingml.xthingml.thingML.Type) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.EnumerationLiteral){
    	return createEnumerationLiteralAdapter((org.thingml.xthingml.thingML.EnumerationLiteral) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Thing){
    	return createThingAdapter((org.thingml.xthingml.thingML.Thing) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Protocol){
    	return createProtocolAdapter((org.thingml.xthingml.thingML.Protocol) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Function){
    	return createFunctionAdapter((org.thingml.xthingml.thingML.Function) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Property){
    	return createPropertyAdapter((org.thingml.xthingml.thingML.Property) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Message){
    	return createMessageAdapter((org.thingml.xthingml.thingML.Message) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Parameter){
    	return createParameterAdapter((org.thingml.xthingml.thingML.Parameter) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.RequiredPort){
    	return createRequiredPortAdapter((org.thingml.xthingml.thingML.RequiredPort) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.ProvidedPort){
    	return createProvidedPortAdapter((org.thingml.xthingml.thingML.ProvidedPort) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Port){
    	return createPortAdapter((org.thingml.xthingml.thingML.Port) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.NamedElement){
    	return createNamedElementAdapter((org.thingml.xthingml.thingML.NamedElement) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.AnnotatedElement){
    	return createAnnotatedElementAdapter((org.thingml.xthingml.thingML.AnnotatedElement) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.TypeRef){
    	return createTypeRefAdapter((org.thingml.xthingml.thingML.TypeRef) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.PropertyAssign){
    	return createPropertyAssignAdapter((org.thingml.xthingml.thingML.PropertyAssign) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.InternalPort){
    	return createInternalPortAdapter((org.thingml.xthingml.thingML.InternalPort) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.State){
    	return createStateAdapter((org.thingml.xthingml.thingML.State) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Transition){
    	return createTransitionAdapter((org.thingml.xthingml.thingML.Transition) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.InternalTransition){
    	return createInternalTransitionAdapter((org.thingml.xthingml.thingML.InternalTransition) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Handler){
    	return createHandlerAdapter((org.thingml.xthingml.thingML.Handler) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.CompositeState){
    	return createCompositeStateAdapter((org.thingml.xthingml.thingML.CompositeState) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Session){
    	return createSessionAdapter((org.thingml.xthingml.thingML.Session) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Region){
    	return createRegionAdapter((org.thingml.xthingml.thingML.Region) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.FinalState){
    	return createFinalStateAdapter((org.thingml.xthingml.thingML.FinalState) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.StateContainer){
    	return createStateContainerAdapter((org.thingml.xthingml.thingML.StateContainer) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.ReceiveMessage){
    	return createReceiveMessageAdapter((org.thingml.xthingml.thingML.ReceiveMessage) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Event){
    	return createEventAdapter((org.thingml.xthingml.thingML.Event) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.ActionBlock){
    	return createActionBlockAdapter((org.thingml.xthingml.thingML.ActionBlock) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.ExternStatement){
    	return createExternStatementAdapter((org.thingml.xthingml.thingML.ExternStatement) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.LocalVariable){
    	return createLocalVariableAdapter((org.thingml.xthingml.thingML.LocalVariable) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.SendAction){
    	return createSendActionAdapter((org.thingml.xthingml.thingML.SendAction) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.VariableAssignment){
    	return createVariableAssignmentAdapter((org.thingml.xthingml.thingML.VariableAssignment) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Increment){
    	return createIncrementAdapter((org.thingml.xthingml.thingML.Increment) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Decrement){
    	return createDecrementAdapter((org.thingml.xthingml.thingML.Decrement) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.LoopAction){
    	return createLoopActionAdapter((org.thingml.xthingml.thingML.LoopAction) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.ConditionalAction){
    	return createConditionalActionAdapter((org.thingml.xthingml.thingML.ConditionalAction) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.ReturnAction){
    	return createReturnActionAdapter((org.thingml.xthingml.thingML.ReturnAction) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.PrintAction){
    	return createPrintActionAdapter((org.thingml.xthingml.thingML.PrintAction) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.ErrorAction){
    	return createErrorActionAdapter((org.thingml.xthingml.thingML.ErrorAction) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.StartSession){
    	return createStartSessionAdapter((org.thingml.xthingml.thingML.StartSession) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.FunctionCallStatement){
    	return createFunctionCallStatementAdapter((org.thingml.xthingml.thingML.FunctionCallStatement) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Action){
    	return createActionAdapter((org.thingml.xthingml.thingML.Action) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.ExternExpression){
    	return createExternExpressionAdapter((org.thingml.xthingml.thingML.ExternExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.EnumLiteralRef){
    	return createEnumLiteralRefAdapter((org.thingml.xthingml.thingML.EnumLiteralRef) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.ByteLiteral){
    	return createByteLiteralAdapter((org.thingml.xthingml.thingML.ByteLiteral) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.CharLiteral){
    	return createCharLiteralAdapter((org.thingml.xthingml.thingML.CharLiteral) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.IntegerLiteral){
    	return createIntegerLiteralAdapter((org.thingml.xthingml.thingML.IntegerLiteral) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.BooleanLiteral){
    	return createBooleanLiteralAdapter((org.thingml.xthingml.thingML.BooleanLiteral) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.StringLiteral){
    	return createStringLiteralAdapter((org.thingml.xthingml.thingML.StringLiteral) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.DoubleLiteral){
    	return createDoubleLiteralAdapter((org.thingml.xthingml.thingML.DoubleLiteral) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.PropertyReference){
    	return createPropertyReferenceAdapter((org.thingml.xthingml.thingML.PropertyReference) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.EventReference){
    	return createEventReferenceAdapter((org.thingml.xthingml.thingML.EventReference) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.FunctionCallExpression){
    	return createFunctionCallExpressionAdapter((org.thingml.xthingml.thingML.FunctionCallExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Expression){
    	return createExpressionAdapter((org.thingml.xthingml.thingML.Expression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Configuration){
    	return createConfigurationAdapter((org.thingml.xthingml.thingML.Configuration) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Instance){
    	return createInstanceAdapter((org.thingml.xthingml.thingML.Instance) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.ConfigPropertyAssign){
    	return createConfigPropertyAssignAdapter((org.thingml.xthingml.thingML.ConfigPropertyAssign) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.Connector){
    	return createConnectorAdapter((org.thingml.xthingml.thingML.Connector) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.ExternalConnector){
    	return createExternalConnectorAdapter((org.thingml.xthingml.thingML.ExternalConnector) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.AbstractConnector){
    	return createAbstractConnectorAdapter((org.thingml.xthingml.thingML.AbstractConnector) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.CastExpression){
    	return createCastExpressionAdapter((org.thingml.xthingml.thingML.CastExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.OrExpression){
    	return createOrExpressionAdapter((org.thingml.xthingml.thingML.OrExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.AndExpression){
    	return createAndExpressionAdapter((org.thingml.xthingml.thingML.AndExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.EqualsExpression){
    	return createEqualsExpressionAdapter((org.thingml.xthingml.thingML.EqualsExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.NotEqualsExpression){
    	return createNotEqualsExpressionAdapter((org.thingml.xthingml.thingML.NotEqualsExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.GreaterExpression){
    	return createGreaterExpressionAdapter((org.thingml.xthingml.thingML.GreaterExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.LowerExpression){
    	return createLowerExpressionAdapter((org.thingml.xthingml.thingML.LowerExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.GreaterOrEqualExpression){
    	return createGreaterOrEqualExpressionAdapter((org.thingml.xthingml.thingML.GreaterOrEqualExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.LowerOrEqualExpression){
    	return createLowerOrEqualExpressionAdapter((org.thingml.xthingml.thingML.LowerOrEqualExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.PlusExpression){
    	return createPlusExpressionAdapter((org.thingml.xthingml.thingML.PlusExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.MinusExpression){
    	return createMinusExpressionAdapter((org.thingml.xthingml.thingML.MinusExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.TimesExpression){
    	return createTimesExpressionAdapter((org.thingml.xthingml.thingML.TimesExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.DivExpression){
    	return createDivExpressionAdapter((org.thingml.xthingml.thingML.DivExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.ModExpression){
    	return createModExpressionAdapter((org.thingml.xthingml.thingML.ModExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.ExpressionGroup){
    	return createExpressionGroupAdapter((org.thingml.xthingml.thingML.ExpressionGroup) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.NotExpression){
    	return createNotExpressionAdapter((org.thingml.xthingml.thingML.NotExpression) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.UnaryMinus){
    	return createUnaryMinusAdapter((org.thingml.xthingml.thingML.UnaryMinus) o, res);
    }
    if (o instanceof org.thingml.xthingml.thingML.ArrayIndex){
    	return createArrayIndexAdapter((org.thingml.xthingml.thingML.ArrayIndex) o, res);
    }
    
    return null;
  }
  
  public ThingMLModelAdapter createThingMLModelAdapter(final ThingMLModel adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ThingMLModelAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ThingMLModelAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ThingMLModelAdapter) adapter;
    }
  }
  
  public PlatformAnnotationAdapter createPlatformAnnotationAdapter(final PlatformAnnotation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.PlatformAnnotationAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.PlatformAnnotationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.PlatformAnnotationAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.NamedElementAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.NamedElementAdapter) adapter;
    }
  }
  
  public AnnotatedElementAdapter createAnnotatedElementAdapter(final AnnotatedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.AnnotatedElementAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.AnnotatedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.AnnotatedElementAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.VariableAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.VariableAdapter) adapter;
    }
  }
  
  public TypeRefAdapter createTypeRefAdapter(final TypeRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.TypeRefAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.TypeRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.TypeRefAdapter) adapter;
    }
  }
  
  public TypeAdapter createTypeAdapter(final Type adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.TypeAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.TypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.TypeAdapter) adapter;
    }
  }
  
  public PrimitiveTypeAdapter createPrimitiveTypeAdapter(final PrimitiveType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.PrimitiveTypeAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.PrimitiveTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.PrimitiveTypeAdapter) adapter;
    }
  }
  
  public ObjectTypeAdapter createObjectTypeAdapter(final ObjectType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ObjectTypeAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ObjectTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ObjectTypeAdapter) adapter;
    }
  }
  
  public EnumerationAdapter createEnumerationAdapter(final Enumeration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.EnumerationAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.EnumerationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.EnumerationAdapter) adapter;
    }
  }
  
  public EnumerationLiteralAdapter createEnumerationLiteralAdapter(final EnumerationLiteral adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.EnumerationLiteralAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.EnumerationLiteralAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.EnumerationLiteralAdapter) adapter;
    }
  }
  
  public ThingAdapter createThingAdapter(final Thing adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ThingAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ThingAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ThingAdapter) adapter;
    }
  }
  
  public PropertyAssignAdapter createPropertyAssignAdapter(final PropertyAssign adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.PropertyAssignAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.PropertyAssignAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.PropertyAssignAdapter) adapter;
    }
  }
  
  public ProtocolAdapter createProtocolAdapter(final Protocol adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ProtocolAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ProtocolAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ProtocolAdapter) adapter;
    }
  }
  
  public FunctionAdapter createFunctionAdapter(final Function adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.FunctionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.FunctionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.FunctionAdapter) adapter;
    }
  }
  
  public PropertyAdapter createPropertyAdapter(final Property adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.PropertyAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.PropertyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.PropertyAdapter) adapter;
    }
  }
  
  public MessageAdapter createMessageAdapter(final Message adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.MessageAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.MessageAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.MessageAdapter) adapter;
    }
  }
  
  public ParameterAdapter createParameterAdapter(final Parameter adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ParameterAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ParameterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ParameterAdapter) adapter;
    }
  }
  
  public PortAdapter createPortAdapter(final Port adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.PortAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.PortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.PortAdapter) adapter;
    }
  }
  
  public RequiredPortAdapter createRequiredPortAdapter(final RequiredPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.RequiredPortAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.RequiredPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.RequiredPortAdapter) adapter;
    }
  }
  
  public ProvidedPortAdapter createProvidedPortAdapter(final ProvidedPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ProvidedPortAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ProvidedPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ProvidedPortAdapter) adapter;
    }
  }
  
  public InternalPortAdapter createInternalPortAdapter(final InternalPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.InternalPortAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.InternalPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.InternalPortAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.StateAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.StateAdapter) adapter;
    }
  }
  
  public HandlerAdapter createHandlerAdapter(final Handler adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.HandlerAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.HandlerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.HandlerAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.TransitionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.TransitionAdapter) adapter;
    }
  }
  
  public InternalTransitionAdapter createInternalTransitionAdapter(final InternalTransition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.InternalTransitionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.InternalTransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.InternalTransitionAdapter) adapter;
    }
  }
  
  public CompositeStateAdapter createCompositeStateAdapter(final CompositeState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.CompositeStateAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.CompositeStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.CompositeStateAdapter) adapter;
    }
  }
  
  public SessionAdapter createSessionAdapter(final Session adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.SessionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.SessionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.SessionAdapter) adapter;
    }
  }
  
  public RegionAdapter createRegionAdapter(final Region adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.RegionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.RegionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.RegionAdapter) adapter;
    }
  }
  
  public FinalStateAdapter createFinalStateAdapter(final FinalState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.FinalStateAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.FinalStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.FinalStateAdapter) adapter;
    }
  }
  
  public StateContainerAdapter createStateContainerAdapter(final StateContainer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.StateContainerAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.StateContainerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.StateContainerAdapter) adapter;
    }
  }
  
  public EventAdapter createEventAdapter(final Event adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.EventAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.EventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.EventAdapter) adapter;
    }
  }
  
  public ReceiveMessageAdapter createReceiveMessageAdapter(final ReceiveMessage adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ReceiveMessageAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ReceiveMessageAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ReceiveMessageAdapter) adapter;
    }
  }
  
  public ActionAdapter createActionAdapter(final Action adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ActionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ActionAdapter) adapter;
    }
  }
  
  public ActionBlockAdapter createActionBlockAdapter(final ActionBlock adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ActionBlockAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ActionBlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ActionBlockAdapter) adapter;
    }
  }
  
  public ExternStatementAdapter createExternStatementAdapter(final ExternStatement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ExternStatementAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ExternStatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ExternStatementAdapter) adapter;
    }
  }
  
  public LocalVariableAdapter createLocalVariableAdapter(final LocalVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.LocalVariableAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.LocalVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.LocalVariableAdapter) adapter;
    }
  }
  
  public SendActionAdapter createSendActionAdapter(final SendAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.SendActionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.SendActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.SendActionAdapter) adapter;
    }
  }
  
  public VariableAssignmentAdapter createVariableAssignmentAdapter(final VariableAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.VariableAssignmentAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.VariableAssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.VariableAssignmentAdapter) adapter;
    }
  }
  
  public IncrementAdapter createIncrementAdapter(final Increment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.IncrementAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.IncrementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.IncrementAdapter) adapter;
    }
  }
  
  public DecrementAdapter createDecrementAdapter(final Decrement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.DecrementAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.DecrementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.DecrementAdapter) adapter;
    }
  }
  
  public LoopActionAdapter createLoopActionAdapter(final LoopAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.LoopActionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.LoopActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.LoopActionAdapter) adapter;
    }
  }
  
  public ConditionalActionAdapter createConditionalActionAdapter(final ConditionalAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ConditionalActionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ConditionalActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ConditionalActionAdapter) adapter;
    }
  }
  
  public ReturnActionAdapter createReturnActionAdapter(final ReturnAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ReturnActionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ReturnActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ReturnActionAdapter) adapter;
    }
  }
  
  public PrintActionAdapter createPrintActionAdapter(final PrintAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.PrintActionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.PrintActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.PrintActionAdapter) adapter;
    }
  }
  
  public ErrorActionAdapter createErrorActionAdapter(final ErrorAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ErrorActionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ErrorActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ErrorActionAdapter) adapter;
    }
  }
  
  public StartSessionAdapter createStartSessionAdapter(final StartSession adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.StartSessionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.StartSessionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.StartSessionAdapter) adapter;
    }
  }
  
  public FunctionCallStatementAdapter createFunctionCallStatementAdapter(final FunctionCallStatement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.FunctionCallStatementAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.FunctionCallStatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.FunctionCallStatementAdapter) adapter;
    }
  }
  
  public ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionAdapter) adapter;
    }
  }
  
  public ExternExpressionAdapter createExternExpressionAdapter(final ExternExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ExternExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ExternExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ExternExpressionAdapter) adapter;
    }
  }
  
  public EnumLiteralRefAdapter createEnumLiteralRefAdapter(final EnumLiteralRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.EnumLiteralRefAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.EnumLiteralRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.EnumLiteralRefAdapter) adapter;
    }
  }
  
  public ByteLiteralAdapter createByteLiteralAdapter(final ByteLiteral adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ByteLiteralAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ByteLiteralAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ByteLiteralAdapter) adapter;
    }
  }
  
  public CharLiteralAdapter createCharLiteralAdapter(final CharLiteral adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.CharLiteralAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.CharLiteralAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.CharLiteralAdapter) adapter;
    }
  }
  
  public IntegerLiteralAdapter createIntegerLiteralAdapter(final IntegerLiteral adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.IntegerLiteralAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.IntegerLiteralAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.IntegerLiteralAdapter) adapter;
    }
  }
  
  public BooleanLiteralAdapter createBooleanLiteralAdapter(final BooleanLiteral adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.BooleanLiteralAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.BooleanLiteralAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.BooleanLiteralAdapter) adapter;
    }
  }
  
  public StringLiteralAdapter createStringLiteralAdapter(final StringLiteral adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.StringLiteralAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.StringLiteralAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.StringLiteralAdapter) adapter;
    }
  }
  
  public DoubleLiteralAdapter createDoubleLiteralAdapter(final DoubleLiteral adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.DoubleLiteralAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.DoubleLiteralAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.DoubleLiteralAdapter) adapter;
    }
  }
  
  public PropertyReferenceAdapter createPropertyReferenceAdapter(final PropertyReference adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.PropertyReferenceAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.PropertyReferenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.PropertyReferenceAdapter) adapter;
    }
  }
  
  public EventReferenceAdapter createEventReferenceAdapter(final EventReference adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.EventReferenceAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.EventReferenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.EventReferenceAdapter) adapter;
    }
  }
  
  public FunctionCallExpressionAdapter createFunctionCallExpressionAdapter(final FunctionCallExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.FunctionCallExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.FunctionCallExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.FunctionCallExpressionAdapter) adapter;
    }
  }
  
  public ConfigurationAdapter createConfigurationAdapter(final Configuration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ConfigurationAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ConfigurationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ConfigurationAdapter) adapter;
    }
  }
  
  public InstanceAdapter createInstanceAdapter(final Instance adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.InstanceAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.InstanceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.InstanceAdapter) adapter;
    }
  }
  
  public ConfigPropertyAssignAdapter createConfigPropertyAssignAdapter(final ConfigPropertyAssign adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ConfigPropertyAssignAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ConfigPropertyAssignAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ConfigPropertyAssignAdapter) adapter;
    }
  }
  
  public AbstractConnectorAdapter createAbstractConnectorAdapter(final AbstractConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.AbstractConnectorAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.AbstractConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.AbstractConnectorAdapter) adapter;
    }
  }
  
  public ConnectorAdapter createConnectorAdapter(final Connector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ConnectorAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ConnectorAdapter) adapter;
    }
  }
  
  public ExternalConnectorAdapter createExternalConnectorAdapter(final ExternalConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ExternalConnectorAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ExternalConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ExternalConnectorAdapter) adapter;
    }
  }
  
  public CastExpressionAdapter createCastExpressionAdapter(final CastExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.CastExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.CastExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.CastExpressionAdapter) adapter;
    }
  }
  
  public OrExpressionAdapter createOrExpressionAdapter(final OrExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.OrExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.OrExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.OrExpressionAdapter) adapter;
    }
  }
  
  public AndExpressionAdapter createAndExpressionAdapter(final AndExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.AndExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.AndExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.AndExpressionAdapter) adapter;
    }
  }
  
  public EqualsExpressionAdapter createEqualsExpressionAdapter(final EqualsExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.EqualsExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.EqualsExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.EqualsExpressionAdapter) adapter;
    }
  }
  
  public NotEqualsExpressionAdapter createNotEqualsExpressionAdapter(final NotEqualsExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.NotEqualsExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.NotEqualsExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.NotEqualsExpressionAdapter) adapter;
    }
  }
  
  public GreaterExpressionAdapter createGreaterExpressionAdapter(final GreaterExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.GreaterExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.GreaterExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.GreaterExpressionAdapter) adapter;
    }
  }
  
  public LowerExpressionAdapter createLowerExpressionAdapter(final LowerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.LowerExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.LowerExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.LowerExpressionAdapter) adapter;
    }
  }
  
  public GreaterOrEqualExpressionAdapter createGreaterOrEqualExpressionAdapter(final GreaterOrEqualExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.GreaterOrEqualExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.GreaterOrEqualExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.GreaterOrEqualExpressionAdapter) adapter;
    }
  }
  
  public LowerOrEqualExpressionAdapter createLowerOrEqualExpressionAdapter(final LowerOrEqualExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.LowerOrEqualExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.LowerOrEqualExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.LowerOrEqualExpressionAdapter) adapter;
    }
  }
  
  public PlusExpressionAdapter createPlusExpressionAdapter(final PlusExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.PlusExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.PlusExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.PlusExpressionAdapter) adapter;
    }
  }
  
  public MinusExpressionAdapter createMinusExpressionAdapter(final MinusExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.MinusExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.MinusExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.MinusExpressionAdapter) adapter;
    }
  }
  
  public TimesExpressionAdapter createTimesExpressionAdapter(final TimesExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.TimesExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.TimesExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.TimesExpressionAdapter) adapter;
    }
  }
  
  public DivExpressionAdapter createDivExpressionAdapter(final DivExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.DivExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.DivExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.DivExpressionAdapter) adapter;
    }
  }
  
  public ModExpressionAdapter createModExpressionAdapter(final ModExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ModExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ModExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ModExpressionAdapter) adapter;
    }
  }
  
  public ExpressionGroupAdapter createExpressionGroupAdapter(final ExpressionGroup adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionGroupAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionGroupAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionGroupAdapter) adapter;
    }
  }
  
  public NotExpressionAdapter createNotExpressionAdapter(final NotExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.NotExpressionAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.NotExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.NotExpressionAdapter) adapter;
    }
  }
  
  public UnaryMinusAdapter createUnaryMinusAdapter(final UnaryMinus adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.UnaryMinusAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.UnaryMinusAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.UnaryMinusAdapter) adapter;
    }
  }
  
  public ArrayIndexAdapter createArrayIndexAdapter(final ArrayIndex adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ArrayIndexAdapter) adapter;
    else {
    	adapter = new org.thingml.xthingml.adapters.xthingmlmt.thingML.ArrayIndexAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.thingml.xthingml.adapters.xthingmlmt.thingML.ArrayIndexAdapter) adapter;
    }
  }
}