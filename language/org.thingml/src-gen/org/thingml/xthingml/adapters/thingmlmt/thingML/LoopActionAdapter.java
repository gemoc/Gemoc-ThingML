package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Action;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.LoopAction;

@SuppressWarnings("all")
public class LoopActionAdapter extends EObjectAdapter<LoopAction> implements org.thingml.xtext.thingML.LoopAction {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public LoopActionAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getCondition() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getCondition(), eResource);
  }
  
  @Override
  public void setCondition(final Expression o) {
    if (o != null)
    	adaptee.setCondition(((org.thingml.xthingml.adapters.thingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setCondition(null);
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
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getLoopAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.LOOP_ACTION__CONDITION:
    		return getCondition();
    	case org.thingml.xtext.thingML.ThingMLPackage.LOOP_ACTION__ACTION:
    		return getAction();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.LOOP_ACTION__CONDITION:
    		return getCondition() != null;
    	case org.thingml.xtext.thingML.ThingMLPackage.LOOP_ACTION__ACTION:
    		return getAction() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.LOOP_ACTION__CONDITION:
    		setCondition(
    		(org.thingml.xtext.thingML.Expression)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.LOOP_ACTION__ACTION:
    		setAction(
    		(org.thingml.xtext.thingML.Action)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
