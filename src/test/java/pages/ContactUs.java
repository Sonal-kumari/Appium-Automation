package pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ContactUs {

	AppiumDriver<MobileElement> driver;

	public ContactUs(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	By BusinessInsuranceClick = By.xpath("//a[text()=\"Business Insurance\"][@href=\"https://www.hubinternational.com/contact-us/business-insurance/\"]");
	By FirstName = By.cssSelector("input[id=\"CrmItem_FirstNameField\"]");
	By LastName = By.cssSelector("input[id=\"CrmItem_LastNameField\"]");
	
	
	public void validate()
	{
		driver.findElement(BusinessInsuranceClick).click();
		driver.get("https://www.hubinternational.com/contact-us/business-insurance/");
		if(driver.findElement(FirstName).isDisplayed() && driver.findElement(LastName).isDisplayed())
			Reporter.log("Contact us page validated");
		else
			Reporter.log("Contact us page not validated");
	}
	
}
