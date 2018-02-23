package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Action;
import org.thingml.xtext.thingML.Event;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xtext.thingML.State;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.Transition;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements org.thingml.xtext.thingML.Transition {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<PlatformAnnotation> annotations_;
  
  @Override
  public EList<PlatformAnnotation> getAnnotations() {
    if (annotations_ == null)
    	annotations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAnnotations(), adaptersFactory, eResource);
    return annotations_;
  }
  
  @Override
  public Event getEvent() {
    return (Event) adaptersFactory.createAdapter(adaptee.getEvent(), eResource);
  }
  
  @Override
  public void setEvent(final Event o) {
    if (o != null)
    	adaptee.setEvent(((org.thingml.xthingml.adapters.thingmlmt.thingML.EventAdapter) o).getAdaptee());
    else adaptee.setEvent(null);
  }
  
  @Override
  public Expression getGuard() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getGuard(), eResource);
  }
  
  @Override
  public void setGuard(final Expression o) {
    if (o != null)
    	adaptee.setGuard(((org.thingml.xthingml.adapters.thingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setGuard(null);
  }
  
  @Override
  public Action getAction() {
    return (Action) adaptersFactory.createAdapter(adaptee.getAction(), eResource);
  }
  
  @Override
  public void setAction(final Action o) {
    if (o != null)
    	adaptee.setAction(((org.thingml.xthingml.adapters.thingmlmt.thingML.ActionAdapter) o).getAdaptee());
    else adaptee.setAction(null);
  }
  
  @Override
  public State getTarget() {
    return (State) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final State o) {
    if (o != null)
    	adaptee.setTarget(((org.thingml.xthingml.adapters.thingmlmt.thingML.StateAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__NAME:
    		return getName();
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__EVENT:
    		return getEvent();
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__GUARD:
    		return getGuard();
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__ACTION:
    		return getAction();
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__EVENT:
    		return getEvent() != null;
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__GUARD:
    		return getGuard() != null;
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__ACTION:
    		return getAction() != null;
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__EVENT:
    		setEvent(
    		(org.thingml.xtext.thingML.Event)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__GUARD:
    		setGuard(
    		(org.thingml.xtext.thingML.Expression)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__ACTION:
    		setAction(
    		(org.thingml.xtext.thingML.Action)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.TRANSITION__TARGET:
    		setTarget(
    		(org.thingml.xtext.thingML.State)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
