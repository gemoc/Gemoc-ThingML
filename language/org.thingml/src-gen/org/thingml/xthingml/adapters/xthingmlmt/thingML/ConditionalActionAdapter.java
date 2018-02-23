package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.ConditionalAction;
import org.thingml.xthingmlmt.thingML.Action;
import org.thingml.xthingmlmt.thingML.Expression;

@SuppressWarnings("all")
public class ConditionalActionAdapter extends EObjectAdapter<ConditionalAction> implements org.thingml.xthingmlmt.thingML.ConditionalAction {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public ConditionalActionAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getCondition() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getCondition(), eResource);
  }
  
  @Override
  public void setCondition(final Expression o) {
    if (o != null)
    	adaptee.setCondition(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setCondition(null);
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
  public Action getElseAction() {
    return (Action) adaptersFactory.createAdapter(adaptee.getElseAction(), eResource);
  }
  
  @Override
  public void setElseAction(final Action o) {
    if (o != null)
    	adaptee.setElseAction(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ActionAdapter) o).getAdaptee());
    else adaptee.setElseAction(null);
  }
  
  @Override
  public void execute() {
    org.thingml.xthingml.aspects.ActionAspect.execute(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getConditionalAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONDITIONAL_ACTION__CONDITION:
    		return getCondition();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONDITIONAL_ACTION__ACTION:
    		return getAction();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONDITIONAL_ACTION__ELSE_ACTION:
    		return getElseAction();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONDITIONAL_ACTION__CONDITION:
    		return getCondition() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONDITIONAL_ACTION__ACTION:
    		return getAction() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONDITIONAL_ACTION__ELSE_ACTION:
    		return getElseAction() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONDITIONAL_ACTION__CONDITION:
    		setCondition(
    		(org.thingml.xthingmlmt.thingML.Expression)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONDITIONAL_ACTION__ACTION:
    		setAction(
    		(org.thingml.xthingmlmt.thingML.Action)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONDITIONAL_ACTION__ELSE_ACTION:
    		setElseAction(
    		(org.thingml.xthingmlmt.thingML.Action)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
