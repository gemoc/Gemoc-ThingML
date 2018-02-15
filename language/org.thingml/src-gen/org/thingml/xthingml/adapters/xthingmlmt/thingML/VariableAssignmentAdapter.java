package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.VariableAssignment;
import org.thingml.xthingmlmt.thingML.Expression;
import org.thingml.xthingmlmt.thingML.Variable;

@SuppressWarnings("all")
public class VariableAssignmentAdapter extends EObjectAdapter<VariableAssignment> implements org.thingml.xthingmlmt.thingML.VariableAssignment {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public VariableAssignmentAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Variable getProperty() {
    return (Variable) adaptersFactory.createAdapter(adaptee.getProperty(), eResource);
  }
  
  @Override
  public void setProperty(final Variable o) {
    if (o != null)
    	adaptee.setProperty(((org.thingml.xthingml.adapters.xthingmlmt.thingML.VariableAdapter) o).getAdaptee());
    else adaptee.setProperty(null);
  }
  
  private EList<Expression> index_;
  
  @Override
  public EList<Expression> getIndex() {
    if (index_ == null)
    	index_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIndex(), adaptersFactory, eResource);
    return index_;
  }
  
  @Override
  public Expression getExpression() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getExpression(), eResource);
  }
  
  @Override
  public void setExpression(final Expression o) {
    if (o != null)
    	adaptee.setExpression(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setExpression(null);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getVariableAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.VARIABLE_ASSIGNMENT__PROPERTY:
    		return getProperty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.VARIABLE_ASSIGNMENT__INDEX:
    		return getIndex();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.VARIABLE_ASSIGNMENT__EXPRESSION:
    		return getExpression();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.VARIABLE_ASSIGNMENT__PROPERTY:
    		return getProperty() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.VARIABLE_ASSIGNMENT__INDEX:
    		return getIndex() != null && !getIndex().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.VARIABLE_ASSIGNMENT__EXPRESSION:
    		return getExpression() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.VARIABLE_ASSIGNMENT__PROPERTY:
    		setProperty(
    		(org.thingml.xthingmlmt.thingML.Variable)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.VARIABLE_ASSIGNMENT__INDEX:
    		getIndex().clear();
    		getIndex().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.VARIABLE_ASSIGNMENT__EXPRESSION:
    		setExpression(
    		(org.thingml.xthingmlmt.thingML.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
