package pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Industries {
	
	AppiumDriver<MobileElement> driver;

	public Industries(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	By Entertainment = By.xpath("//a[@class=\"chevron\"][text()=\"Entertainment\"]");
	By EntertainmentPageValidation = By.xpath("//a[text()=\"Business Management\"]");
	
	public void pageValidation()
	{
		driver.findElement(Entertainment).click();;
		driver.get("https://www.hubinternational.com/industries/entertainment-insurance/");
		if(driver.findElement(EntertainmentPageValidation).isDisplayed())
			Reporter.log("Industries -> Entertainment Page Validated");
		else
			Reporter.log("Industries -> Entertainment Page not Validated");
	}
	
}
