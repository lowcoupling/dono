/*
* generated by Xtext
*/
package com.lowcoupling.dono;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class DonoUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return com.lowcoupling.dono.ui.internal.DonoActivator.getInstance().getInjector("com.lowcoupling.dono.Dono");
	}
	
}
