/*
 * generated by Xtext
 */
package org.xtext.example.mydsl1;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ThisDslStandaloneSetup extends ThisDslStandaloneSetupGenerated{

	public static void doSetup() {
		new ThisDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

