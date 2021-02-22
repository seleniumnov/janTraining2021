package com.JanSeleniumBDD.steps;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class MouseHoverEx {
	
	public static WebDriver driver;
	
	public static void takeScreenShot(String name) throws Exception {

		// press prt sc key in keyboard
		File takingscreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File destination = new File("E:\\Screenshots\\" + name + ".png");

		FileHandler.copy(takingscreenshot, destination);

	}


	public static void main(String[] args)throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// implicit wait - wait until element visibility
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement sign = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(sign).build().perform();
		
		
		takeScreenShot("hover on sign in");
		
		
		driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a")).click();
		
		//refresh
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.getTitle();
		
		driver.getPageSource();
		
		driver.getCurrentUrl();
		

	}

}
