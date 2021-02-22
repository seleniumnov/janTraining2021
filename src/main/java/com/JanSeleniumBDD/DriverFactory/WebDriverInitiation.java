package com.JanSeleniumBDD.DriverFactory;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverInitiation {

	public static WebDriver driver = null;

	public static WebDriverWait wait = null;

	public static Actions action = null;

	public static JavascriptExecutor js = null;
	
	public static Select select = null;
	
	public static String browserName = System.getProperty("browser");
	
	public static String appname = System.getProperty("url");

	public static void initiateBrowser() {

		switch (browserName.toLowerCase()) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		default:
			Assert.fail("Please pass valid browser name " + browserName);
			break;
		}
	}

	public static void initiateApplication() {

		if (appname.equalsIgnoreCase("amazon")) {

			driver.get("");

		} else if (appname.equalsIgnoreCase("flipkart")) {

			driver.get("");

		} else if (appname.equalsIgnoreCase("paytm")) {

			driver.get("");

		} else if (appname.equalsIgnoreCase("beingzero")) {

			driver.get("https://pages.razorpay.com/pl_CcxloRZu6illgu/view");

		} else {
			Assert.fail("Please pass valid application url " + appname);
		}

		driver.manage().window().maximize();
	}
	
	public static void closeSession() {
		driver.close();
	}

}
