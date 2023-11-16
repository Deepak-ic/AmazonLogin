package org.stepdefinition;

import org.bas.baseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class amazonHooksClass extends baseClass {
	
	
	@Before
	private void launchTheBrowser() {
		launchBrowser();
		WindowsMaximazer();
	}

	@After
	private void closeThebrowser() {
		closeBrowser();
	}
	
}
