package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Action;
import org.thingml.xtext.thingML.Event;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.InternalTransition;

@SuppressWarnings("all")
public class InternalTransitionAdapter extends EObjectAdapter<InternalTransition> implements org.thingml.xtext.thingML.InternalTransition {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public InternalTransitionAdapter() {
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
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getInternalTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_TRANSITION__NAME:
    		return getName();
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_TRANSITION__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_TRANSITION__EVENT:
    		return getEvent();
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_TRANSITION__GUARD:
    		return getGuard();
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_TRANSITION__ACTION:
    		return getAction();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_TRANSITION__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_TRANSITION__EVENT:
    		return getEvent() != null;
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_TRANSITION__GUARD:
    		return getGuard() != null;
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_TRANSITION__ACTION:
    		return getAction() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_TRANSITION__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_TRANSITION__EVENT:
    		setEvent(
    		(org.thingml.xtext.thingML.Event)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_TRANSITION__GUARD:
    		setGuard(
    		(org.thingml.xtext.thingML.Expression)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_TRANSITION__ACTION:
    		setAction(
    		(org.thingml.xtext.thingML.Action)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
