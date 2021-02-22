package datatypesinjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruIssue {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/insurance/v1/register.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='licencetype_f']")).click();

	}

}
