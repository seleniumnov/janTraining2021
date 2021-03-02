package com.JanSeleniumBDD.steps;

import com.JanSeleniumBDD.pageObjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GeneralSteps {
	
	LoginPage login = new LoginPage();
	
	
	@Given("i navigate to frames site")
	public void i_navigate_to_frames() {
		
		login.navigateToFrameSite();
	}
	
	@When("i switch to frame")
	public void i_switch_to_frame() {
		
		login.enterDataInSearch();
	}
	
	@Then("i perform any action on inside frame")
	public void i_perform() {
		
		
	}

}
