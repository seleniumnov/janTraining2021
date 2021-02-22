package com.JanSeleniumBDD.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.JanSeleniumBDD.DriverFactory.WebDriverInitiation;

public class GenericMethods extends WebDriverInitiation {

	public static void input(WebElement ele, String data) {
		if (ele.isDisplayed()) {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("Entered " + data + " in " + ele);
		} else {
			Assert.fail(ele + " is not displayed");
		}
	}

	public static void click(WebElement ele) {
		if (ele.isDisplayed()) {
			ele.click();
			System.out.println("Clicked On " + ele);
		} else {
			Assert.fail(ele + " is not displayed");
		}
	}

	public static void jsClick(WebElement ele) {
		js.executeScript("arguments[0].click();", ele);
		System.out.println("Clicked On " + ele);
	}

	public static void selectByText(WebElement ele, String data) {

		if (ele.isDisplayed()) {
			select = new Select(ele);
			select.selectByVisibleText(data);
			System.out.println("Selected " + data + " from " + ele);
		} else {
			Assert.fail(ele + " is not displayed");
		}

	}

	public static void selectByValue(WebElement ele, String data) {
		if (ele.isDisplayed()) {
			select = new Select(ele);
			select.selectByValue(data);
			System.out.println("Selected " + data + " from " + ele);
		} else {
			Assert.fail(ele + " is not displayed");
		}

	}

	public static String getText(WebElement ele) {

		return ele.getText().trim();
	}

	public static void waitForElement(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	public static void waitForElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
