package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.google.common.base.CharMatcher;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Search {
	
	AppiumDriver<MobileElement> driver;
	
	By SearchIconClick = By.xpath("//div[@class=\"search-sb\"]");
	By GetText = By.xpath("//*[@class=\"query-text\"]");
	
	public Search(AppiumDriver<MobileElement> driver)
	{
		this.driver = driver;
	}
	
	public void pageValidation(String pass)
	{
		driver.findElement(SearchIconClick).click();
		driver.get(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String value = driver.findElement(GetText).getText();
		String result = CharMatcher.is('\"').trimFrom(value);
		if(result.equals(pass))
			Reporter.log(result + "Page is validated");
		else
			Reporter.log(result + "Page is not validated");
	}
}
