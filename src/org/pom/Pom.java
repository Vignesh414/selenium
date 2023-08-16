package org.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pom {
	public static WebDriver driver;
	
	public WebElement method1()
	{
	 WebElement findElement = driver.findElement(By.xpath("(//a[text()='Features'])[1]"));	
return findElement;
	}
	
	

}

