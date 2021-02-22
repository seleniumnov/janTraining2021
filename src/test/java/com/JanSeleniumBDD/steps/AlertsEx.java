package com.JanSeleniumBDD.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// implicit wait - wait until element visibility
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		/**
		 * CSS Selector Basic Syntax
		 * tagname[attribute='value']
		 */
		
		driver.findElement(By.cssSelector("input[name='alert']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.cssSelector("input[name='confirmation']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();

	}

}
