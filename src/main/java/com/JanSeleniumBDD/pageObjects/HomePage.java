package com.JanSeleniumBDD.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.JanSeleniumBDD.utilities.GenericMethods;

public class HomePage extends GenericMethods {

	/*
	 * WebElement ele = driver.findElement(By.xpath(""));
	 
	 * Page Object Model using PageFactory
	 */

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='src']")
	public WebElement source;

	@FindBy(xpath = "//input[@id='src']")
	public WebElement source1;

	@FindBy(how = How.CSS, using = "input[name='email']")
	public WebElement name;

	@FindBy(how = How.CSS, using = "input[name='phone']")
	public WebElement phone;

	@FindBy(how = How.CSS, using = "input[name='name_of_college']")
	public WebElement nameofcollege;

	@FindBy(how = How.CSS, using = "input[name='year_of_graduation']")
	public WebElement graduation;

	@FindBy(how = How.CSS, using = "input[name='where_did_you_hear_about_us']")
	public WebElement aboutus;

	@FindBy(how = How.CSS, using = "input[name='coding_language_of_your_most_comfort_is']")
	public WebElement codinglanguage;

	@FindBy(how = How.CSS, using = "select[name='timing_preference']")
	public WebElement timingpreference;

	public void formFilling() {
		input(name, "Selenium189@gmail.com");
		input(phone, "996688");
		input(nameofcollege, "Bapatla");
		input(graduation, "2011");
		selectByText(aboutus, "Quora");
		selectByText(codinglanguage, "C++");
		selectByValue(timingpreference, "Morning (Mon-Fri) 7:00 AM to 8:30 AM");
	}
	
	
	public void enterEmailID() {
		input(name, "Selenium189@gmail.com");
	}
	
	public void enterPhoneNumber() {
		input(phone, "996688");
	}
	
	public void enterCollegeName() {
		input(nameofcollege, "Bapatla");
	}
	
	public void selecttimeingPreference() {
		selectByValue(timingpreference, "Morning (Mon-Fri) 7:00 AM to 8:30 AM");
	}

}
