package com.JanSeleniumBDD.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.JanSeleniumBDD.utilities.GenericMethods;

public class LoginPage extends GenericMethods {
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//iframe[@name='globalSqa']")
	public WebElement globalframe;
	
	@FindBy(how=How.XPATH,using="//span[text()='Trainings']/preceding::form/input")
	public WebElement searchinput;
	
	@FindBy(how=How.XPATH,using="//a[text()='Home']")
	public WebElement home;
	
	public void navigateToFrameSite() {
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
	}
	
	public void enterDataInSearch() {
		
		//driver.switchTo().frame(globalframe);
		
		input(searchinput, "frames");
		
		//driver.switchTo().defaultContent();
		
		click(home);
		
	}
	
	
	
}
