package org.thingml;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.thingml.xthingmlmt.thingML.ThingMLFactory;

@SuppressWarnings("all")
public interface XThingMLMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ThingMLFactory getThingMLFactory();
  
  public abstract void save(final String uri) throws IOException;
}
