package com.JanSeleniumBDD.steps;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RedBusSteps {

	WebDriver driver;
	// WebDriverWait wait;

	@Given("I Navigate to Red bus")
	
	public void lunchredbus() {
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		
		prefs.put("profile.default_content_setting_values.notifications", 1);
		
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "E:\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver(options);
		
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// wait = new WebDriverWait(driver, 60);

		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		
	
		
	}

	@And("I select Location From")

	public void FromLocation() {

		WebElement Board = driver.findElement(By.xpath("//input[@tabindex='1']"));

		Board.sendKeys("Kukatpally, Hyderabad");

	}

	@When("I select Destination To")

	public void ToDestination() {

		WebElement Des = driver.findElement(By.xpath("//input[@tabindex='2']"));

		Des.sendKeys("Vijayawada (All Locations)");
	}

	@Then("I select the Journey Date")

	public void JDate() {

		WebElement enterdate = driver.findElement(By.xpath("//input[@tabindex='3']"));

		enterdate.click();

		WebElement selectDate = driver.findElement(By.xpath("//td[@class='current day']"));

		selectDate.click();

	}

	@And("I click on the search bus")

	public void searchbus() {
		
	

		WebElement bus =driver.findElement(By.xpath("//button[@id='search_btn']"));

		bus.click();
		
		}

	@Then("I select DEPARTURE TIME")

	public void Departure() {

		WebElement Chxbox = driver.findElement(By.xpath("(//label[@for='dtBefore 6 am'])[1]"));

		Chxbox.click();
	}

	@And("I find Mornting star travel and check the view seats")

	public void viewseats() {

		WebElement vseat = driver
				.findElement(By.xpath("//div[contains(text(),'Morning Star Travels')]/following::div[27]"));

		vseat.click();
	}

}
