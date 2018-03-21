package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.SendAction;
import org.thingml.xthingmlmt.thingML.Expression;
import org.thingml.xthingmlmt.thingML.Message;
import org.thingml.xthingmlmt.thingML.Port;

@SuppressWarnings("all")
public class SendActionAdapter extends EObjectAdapter<SendAction> implements org.thingml.xthingmlmt.thingML.SendAction {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public SendActionAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Port getPort() {
    return (Port) adaptersFactory.createAdapter(adaptee.getPort(), eResource);
  }
  
  @Override
  public void setPort(final Port o) {
    if (o != null)
    	adaptee.setPort(((org.thingml.xthingml.adapters.xthingmlmt.thingML.PortAdapter) o).getAdaptee());
    else adaptee.setPort(null);
  }
  
  @Override
  public Message getMessage() {
    return (Message) adaptersFactory.createAdapter(adaptee.getMessage(), eResource);
  }
  
  @Override
  public void setMessage(final Message o) {
    if (o != null)
    	adaptee.setMessage(((org.thingml.xthingml.adapters.xthingmlmt.thingML.MessageAdapter) o).getAdaptee());
    else adaptee.setMessage(null);
  }
  
  private EList<Expression> parameters_;
  
  @Override
  public EList<Expression> getParameters() {
    if (parameters_ == null)
    	parameters_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParameters(), adaptersFactory, eResource);
    return parameters_;
  }
  
  @Override
  public void execute() {
    org.thingml.xthingml.aspects.SendActionAspect.execute(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getSendAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.SEND_ACTION__PORT:
    		return getPort();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.SEND_ACTION__MESSAGE:
    		return getMessage();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.SEND_ACTION__PARAMETERS:
    		return getParameters();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.SEND_ACTION__PORT:
    		return getPort() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.SEND_ACTION__MESSAGE:
    		return getMessage() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.SEND_ACTION__PARAMETERS:
    		return getParameters() != null && !getParameters().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.SEND_ACTION__PORT:
    		setPort(
    		(org.thingml.xthingmlmt.thingML.Port)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.SEND_ACTION__MESSAGE:
    		setMessage(
    		(org.thingml.xthingmlmt.thingML.Message)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.SEND_ACTION__PARAMETERS:
    		getParameters().clear();
    		getParameters().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
