package org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	// launchurl
	
	static WebDriver driver;

	public static void url(WebDriver driver,String s) {
		driver.get(s);

	}
		// maximizewindow
		public static void maximize(WebDriver driver) {
			driver.manage().window().maximize();
		}

		// navigate
		public static void navigateto(WebDriver driver, String s) {
			driver.navigate().to(s);
		}

		public static void navigateback(WebDriver driver) {
			driver.navigate().back();
		}

		public static void navigaterefresh(WebDriver driver) {
			driver.navigate().refresh();
		}
	// find element by xpath
		public WebElement findelementxpath(WebDriver driver, String s) {
			WebElement e = driver.findElement(By.xpath(s));
			return e;
		}
	//find element by id
		public WebElement findelementid(WebDriver driver, String s) {
			WebElement element = driver.findElement(By.id(s));
			return element;
		}
	//click an element
		public static void click(WebElement object) {
			object.click();

		}
//scroll down using javascript
		public static WebElement scrolldown(WebDriver driver, WebElement e) {
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("argumert[0].scrollIntoView(true)", e);
	return e;
}}

