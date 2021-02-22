package com.JanSeleniumBDD.steps;

import com.JanSeleniumBDD.pageObjects.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class BeingZero {
	
	HomePage homepage = new HomePage();

	@And("enter your personal email address")
	public void enter_your_personal_email_address() {
		
		homepage.enterEmailID();
	}

	@When("i enter my college name")
	public void i_enter_my_college_name() {
		
		homepage.enterCollegeName();
	}

	@And("i select my timing preference")
	public void i_select_my_timing_preference() {
		homepage.selecttimeingPreference();
	}

}
