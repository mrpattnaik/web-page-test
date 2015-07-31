/**
 * 
 */
package com.web.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author mpattnai8440
 *
 */
public class WebPageTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Default open the phantomjs ghost driver
		DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
		capabilities.setJavascriptEnabled(true);
		PhantomJSDriver driver = new PhantomJSDriver(capabilities);
		
		driver.get("http://www.google.com"); 
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Chicken Salad Recipes");
        element.submit();
        System.out.println("Page Title: " + driver.getTitle());
		
        driver.quit();

	}

}
