package org.java;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.pom.Pom;

public class Selenium extends BaseClass {
	public static Pom p = new Pom();
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException, IOException {
	
ChromeOptions co=new ChromeOptions();

co.addArguments("--remote-allow-origins=*");

driver=new ChromeDriver();

url(driver, "https://www.opencart.com/index.php?route=common/home");
maximize(driver);
Thread.sleep(1000);

WebElement element = driver.findElement(By.xpath("(//a[text()='Features'])[1]"));

element.click();

 
WebElement e1 = driver.findElement(By.xpath("//*[@id=\"tab-admin\"]/div[5]/a"));
WebElement e12 = driver.findElement(By.xpath("//div[h3[text()='Affiliates']]"));
JavascriptExecutor js=(JavascriptExecutor)driver;
//scroll down and click unlimited
js.executeScript("arguments[0].scrollIntoView(true)", e12);
e1.click();

WebElement e2 = driver.findElement(By.xpath("(//div/h1[@class=\"text-center\"])[2]"));
WebElement e21 = driver.findElement(By.xpath("//li/a[text()='Customer']"));
//scroll up and click customers
js.executeScript("arguments[0].scrollIntoView(false)", e2);
e21.click();
//scroll down and click shippings
WebElement e3 = driver.findElement(By.xpath("//div/h2[text()='Turn mail to your advantage']"));
WebElement e4 = driver.findElement(By.xpath("(//a[@class=\"btn btn-lg\"])[3]"));
js.executeScript("arguments[0].scrollIntoView(true)", e3);
e4.click();
//scroll up and click extensions
WebElement e5 = driver.findElement(By.xpath("//div/h1[text()='Comprehensive payment gateways']"));
WebElement e6 = driver.findElement(By.xpath("//li/a[text()='Extensions']"));
js.executeScript("arguments[0].scrollIntoView(false)",e5);
e6.click();
//scroll down and click mobile
WebElement e7 = driver.findElement(By.xpath("//div/h2[text()='Partners around the world']"));
WebElement e8 = driver.findElement(By.xpath("(//div/a[@class=\"btn btn-lg\"])[5]"));
js.executeScript("arguments[0].scrollIntoView(true)",e7);
e8.click();
//scroll up and click developer
WebElement e9 = driver.findElement(By.xpath("//div/h1[text()='Responsive & SEO friendly']"));
WebElement e10 = driver.findElement(By.xpath("(//li/a[text()='Developer'])[2]"));
js.executeScript("arguments[0].scrollIntoView(false)",e9);
e10.click();
//click demo
click(driver.findElement(By.xpath("//li/a[text()='Demo']")));
//click store front
click(driver.findElement(By.xpath("(//div/a[@class=\"box-overlay\"])[1]")));
//switch to new tab
Thread.sleep(5000);
ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
driver.switchTo().window(tab.get(1));
Thread.sleep(2000);
url(driver, "https://demo.opencart.com/index.php?route=common/home&language=en-gb");
maximize(driver);
click(driver.findElement(By.xpath("(//li/a[@class=\"nav-link dropdown-toggle\"])[3]")));
//mouse over on monitors and click
Actions ac = new Actions(driver);
Thread.sleep(1000);
ac.moveToElement(driver.findElement(By.xpath("(//li/a[@class=\"nav-link\"])[6]"))).click();
//click apple cinema 30
click(driver.findElement(By.xpath("(//li/a[@class=\"nav-link\"])[6]")));

Thread.sleep(2000);
click(driver.findElement(By.xpath("(//div/a/img[@class=\"img-fluid\"])[3]")));
Thread.sleep(1000);
//scroll down to avaliable options
Thread.sleep(1000);
WebElement e11 = driver.findElement(By.xpath("//*[@id=\"form-product\"]/h3"));

js.executeScript("arguments[0].scrollIntoView(true)",e11);
js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.className("form-label")));
//radio button click small
Thread.sleep(1000);
click(driver.findElement(By.xpath("//*[@id=\"input-option-value-5\"]")));
//checkbox2 click 
Thread.sleep(1000);
click(driver.findElement(By.xpath("//*[@id=\"input-option-value-9\"]")));
Select s1 = new Select(driver.findElement(By.id("input-option-217")));
s1.selectByValue("3");
WebElement element2 = driver.findElement(By.id("input-option-209"));
element2.sendKeys("helloo");
//click add to cart button
Thread.sleep(1000);
//driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
//taking screen shot 
TakesScreenshot ts = (TakesScreenshot)driver;
File sourse = ts.getScreenshotAs(OutputType.FILE);
File target = new File("C:\\Users\\ELCOT\\eclipse-workspace\\NewPRo\\src\\screenshots\\sc.png");
FileUtils.copyFile(sourse, target);
//switching to previous tab
driver.switchTo().window(tab.get(0));
Thread.sleep(500);
//click marketplace
click(driver.findElement(By.xpath("//li/a[text()=\"Marketplace\"]")));
//click free option
click(driver.findElement(By.xpath("//div/a[@class=\"btn btn-default btn-lg active\"]")));


//select sort by rating option
Select s3 = new Select(driver.findElement(By.xpath("//div/select[@id=\"input-sort\"]")));
s3.selectByVisibleText("Rating");
//scroll down up to rating
WebElement ele =  driver.findElement(By.xpath("//section/h4[text()='Rating']"));
js.executeScript("arguments[0].scrollIntoView(true)", ele);
//scroll up 
//WebElement ele1 = driver.findElement(By.xpath("//section/h4[text()='Search extensions and themes']"));
//js.executeScript("argument[0].scrollIntoView(false)", driver.findElement(By.xpath("//section/h4[text()='Search extensions and themes']")));
//click search box
WebElement element3 = driver.findElement(By.xpath("//div/input[@name=\"filter_search\"]"));
element3.sendKeys("mobile");
click(driver.findElement(By.id("button-search")));
Thread.sleep(500);
//scroll down upto opencart version
WebElement ele3 = driver.findElement(By.xpath("//div/section/h4[text()='OpenCart version']"));
js.executeScript("arguments[0].scrollIntoView(true)", ele3);
//select version dropdown
WebElement element4 = driver.findElement(By.xpath("//div/select[@class='form-control']"));
Select s2 = new Select(element4);
s2.selectByIndex(5);
click(driver.findElement(By.xpath("//li/a[text()='Blog']")));
js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("(//div/a/h2[@class=\"blog-title\"])[7]")));
js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//div/a/h2[text()='Email Marketing Automation: 5 Tips for eCommerce Stores']")));
Thread.sleep(500);
js.executeScript("arguments[0].scrollIntoView(false)", driver.findElement(By.xpath("//div/a/h2[text()='Email Marketing Automation: 5 Tips for eCommerce Stores']")));
js.executeScript("arguments[0].scrollIntoView(false)", driver.findElement(By.xpath("(//div/a/h2[@class=\"blog-title\"])[7]")));
click(driver.findElement(By.xpath("(//li/a[text()='Download'])[1]")));
//scroll down in download
//js.executeScript("argument[0].scrollIntoView(true)", driver.findElement(By.xpath("//div/h2[text()='Ready to jump start your OpenCart project?']")));
//js.executeScript("argument[0].scrollIntoView(false)", driver.findElement(By.xpath("//div/h2[text()='How to install OpenCart']")));
//select resourses drop down

WebElement element5 = driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[6]/a"));
Select s4 = new Select(element5);
s4.selectByVisibleText("OPENCART BOOKS");
//select admin interface
click(driver.findElement(By.xpath("(//li/a[text()='Admin Interface'])[2]")));
//scroll down to books
js.executeScript("argument[0].scrollIntoView(true)", driver.findElement(By.xpath("//h2[text()='Additional Reading']")));
click(driver.findElement(By.xpath("//p/a[text()='OpenCart 2.0 Tips and Tricks #3 (Free)']")));


}


}






























	
