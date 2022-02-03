package pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Insights {
	
	AppiumDriver<MobileElement> driver;

	public Insights(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	By fetchElement = By.xpath("//span[@class=\"insights-label\"]");
	
	public void pageValidation()
	{
		if(driver.findElements(fetchElement).size() == 5)
			Reporter.log("Elements Present......Insights Page Validated");
		else
			Reporter.log("Elements not Present......Insights Page not Validated");
	}
	
}
