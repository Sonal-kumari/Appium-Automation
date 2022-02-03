package pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Products {
	AppiumDriver<MobileElement> driver;

	public Products(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	By BusinessInsurance = By.xpath("//a[@class=\"chevron\"][text()=\"Business Insurance\"]");
	By BusinessInsurancePageValidation = By.xpath("//div[@class=\"title-absolute\"][contains(text(),\"Commercial Property\")]");
	
	public void businessInsuranceClick()
	{
		driver.findElement(BusinessInsurance).click();
		driver.get("https://www.hubinternational.com/products/business-insurance/");
		pageValidation();
	}
	public void pageValidation()
	{
		if(driver.findElement(BusinessInsurancePageValidation).isDisplayed())
			Reporter.log("Products -> Business Insurance Page validated....");
		else
			Reporter.log("Products -> Business Insurance Page validated....");
	}
	
}
