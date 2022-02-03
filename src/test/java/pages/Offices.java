package pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Offices 
{
	AppiumDriver<MobileElement> driver;

	By InputField = By.xpath("//input[@aria-label=\"Search by city or address\"]");
	
	public Offices(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public void pageValidation()
	{
		if(driver.findElement(InputField).isDisplayed())
			Reporter.log("Offices page is Validated");
		else
			Reporter.log("Offices page is not Validated");
	}
}