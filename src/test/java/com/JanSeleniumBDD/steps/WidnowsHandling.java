package com.JanSeleniumBDD.steps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WidnowsHandling {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// implicit wait - wait until element visibility
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// wait = new WebDriverWait(driver, 60);
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");

		String parentwindow = driver.getWindowHandle();
		
		System.out.println(parentwindow);
		
		System.out.println("-------------------------");

		driver.findElement(By.xpath("(//a[text()='Contract Jobs'])[1]")).click();

		Set<String> c = driver.getWindowHandles();
		
		
		for(String kids: c) {
			
			System.out.println(kids);
			
			if(kids.equals(parentwindow)) {
				
				System.out.println("same as parent window");
			}else {
				
				driver.switchTo().window(kids);
				
				driver.findElement(By.xpath("//input[@id='fts_header']")).sendKeys("Selenium");
				
				driver.findElement(By.xpath("//input[@value='Search']")).click();
				
				driver.close();
			}
		}
		
		
		driver.switchTo().window(parentwindow);
		
		driver.findElement(By.xpath("//input[@id='SE_home_autocomplete']")).sendKeys("selenium");
		

	}

}
