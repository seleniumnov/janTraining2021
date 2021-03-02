package com.JanSeleniumBDD.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FBSteps {

	WebDriver driver;
	WebDriverWait wait;

	@Given("I navigate to facebook")
	public void navigateToFB() {
		System.setProperty("webdriver.chrome.driver", "E:\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// implicit wait - wait until element visibility
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 60);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}

	@And("I click on create account")
	public void createacc() {
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	}

	@When("I enter personal details")
	public void personalDetails() throws Exception {
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("firstname"))));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		
		//Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");

	}

}
