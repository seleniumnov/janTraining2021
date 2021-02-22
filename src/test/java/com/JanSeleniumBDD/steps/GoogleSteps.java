package com.JanSeleniumBDD.steps;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps {

	WebDriver driver;
	// WebDriverWait wait;

	@Given("I Navigate to Google Home Page")
	public void homepage() {
		System.setProperty("webdriver.chrome.driver", "E:\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// implicit wait - wait until element visibility
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// wait = new WebDriverWait(driver, 60);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	}

	@Then("Search for a keyword")
	public void searchKeyword() throws Exception {
		driver.findElement(By.name("q")).sendKeys("selenium");
		takeScreenShot("suggessions");
	}

	@When("select option from auto suggessions")
	public void suggessions() throws Exception {

		List<WebElement> ele = driver.findElements(By.xpath("//ul[@role='listbox']/li/div//div[@role='option']"));

		System.out.println("Total Suggessions " + ele.size());

		for (WebElement element : ele) {

			if (element.equals("seleniumhq")) {

				System.out.println(element);

				element.click();

				takeScreenShot("results");

				break;
			}

		}

		for (int i = 0; i < ele.size(); i++) {

			// WebElement suggession = ele.get(i);

			// String s = suggession.getText();

			// System.out.println(s);

			if (ele.get(i).equals("seleniumhq")) {

				System.out.println(ele.get(i));

				ele.get(i).click();

				takeScreenShot("results");

				break;
			}

		}

		driver.close();
	}

	public void takeScreenShot(String name) throws Exception {

		// press prt sc key in keyboard
		File takingscreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File destination = new File("E:\\Screenshots\\" + name + ".png");

		FileHandler.copy(takingscreenshot, destination);

	}

}
