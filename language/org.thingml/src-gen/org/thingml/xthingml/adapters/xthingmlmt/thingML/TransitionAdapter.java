package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.Transition;
import org.thingml.xthingmlmt.thingML.Action;
import org.thingml.xthingmlmt.thingML.Event;
import org.thingml.xthingmlmt.thingML.Expression;
import org.thingml.xthingmlmt.thingML.PlatformAnnotation;
import org.thingml.xthingmlmt.thingML.State;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements org.thingml.xthingmlmt.thingML.Transition {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
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
    	adaptee.setEvent(((org.thingml.xthingml.adapters.xthingmlmt.thingML.EventAdapter) o).getAdaptee());
    else adaptee.setEvent(null);
  }
  
  @Override
  public Expression getGuard() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getGuard(), eResource);
  }
  
  @Override
  public void setGuard(final Expression o) {
    if (o != null)
    	adaptee.setGuard(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setGuard(null);
  }
  
  @Override
  public Action getAction() {
    return (Action) adaptersFactory.createAdapter(adaptee.getAction(), eResource);
  }
  
  @Override
  public void setAction(final Action o) {
    if (o != null)
    	adaptee.setAction(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ActionAdapter) o).getAdaptee());
    else adaptee.setAction(null);
  }
  
  @Override
  public State getTarget() {
    return (State) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final State o) {
    if (o != null)
    	adaptee.setTarget(((org.thingml.xthingml.adapters.xthingmlmt.thingML.StateAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public State fire(final State state) {
    return (State) adaptersFactory.createAdapter(org.thingml.xthingml.aspects.TransitionAspect.fire(adaptee, (org.thingml.xthingml.thingML.State)((EObjectAdapter)state).getAdaptee()
    ), eResource);
  }
  
  @Override
  public boolean isValid() {
    return org.thingml.xthingml.aspects.HandlerAspect.isValid(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__NAME:
    		return getName();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__EVENT:
    		return getEvent();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__GUARD:
    		return getGuard();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__ACTION:
    		return getAction();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__EVENT:
    		return getEvent() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__GUARD:
    		return getGuard() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__ACTION:
    		return getAction() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__EVENT:
    		setEvent(
    		(org.thingml.xthingmlmt.thingML.Event)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__GUARD:
    		setGuard(
    		(org.thingml.xthingmlmt.thingML.Expression)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__ACTION:
    		setAction(
    		(org.thingml.xthingmlmt.thingML.Action)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.TRANSITION__TARGET:
    		setTarget(
    		(org.thingml.xthingmlmt.thingML.State)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
