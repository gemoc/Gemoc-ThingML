package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.ActionBlock;
import org.thingml.xthingmlmt.thingML.Action;

@SuppressWarnings("all")
public class ActionBlockAdapter extends EObjectAdapter<ActionBlock> implements org.thingml.xthingmlmt.thingML.ActionBlock {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public ActionBlockAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  private EList<Action> actions_;
  
  @Override
  public EList<Action> getActions() {
    if (actions_ == null)
    	actions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getActions(), adaptersFactory, eResource);
    return actions_;
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getActionBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ACTION_BLOCK__ACTIONS:
    		return getActions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ACTION_BLOCK__ACTIONS:
    		return getActions() != null && !getActions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ACTION_BLOCK__ACTIONS:
    		getActions().clear();
    		getActions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
