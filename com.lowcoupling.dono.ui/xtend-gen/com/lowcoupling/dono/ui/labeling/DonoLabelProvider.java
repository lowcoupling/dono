/**
 * generated by Xtext
 */
package com.lowcoupling.dono.ui.labeling;

import com.google.inject.Inject;
import com.lowcoupling.dono.dono.Paragraph;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class DonoLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public DonoLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final Paragraph par) {
    return "paragrah";
  }
}
