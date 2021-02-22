package com.JanSeleniumBDD.steps;

import com.JanSeleniumBDD.utilities.GenericMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends GenericMethods {

	
	@Before
	public void init() {
		initiateBrowser();
		initiateApplication();
	}
	
	@After
	public void tearDown() {
		closeSession();
	}
}
