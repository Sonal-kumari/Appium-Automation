package pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Home {
	
	AppiumDriver<MobileElement> driver;
	
	public Home(AppiumDriver<MobileElement> driver)
	{
		this.driver = driver;
	}
	
	By HubLogo = By.xpath("//img[@class=\"logo roundel\"]");
	By HomeElementValid = By.xpath("//div[@class=\"panel-header\"]");
	By Menu = By.xpath("/html/body/header/div[1]");
	By CookieClose = By.xpath("//button[@aria-label=\"Close\"][contains(@class,\"ot-mobile\")]");
	By Offices = By.xpath("//*[@class=\"chevron\"][text()=\"Offices\"]");
	By Products = By.xpath("//*[@class=\"chevron\"][contains(text(),'Products')]");
	By Insights = By.xpath("//*[@class=\"chevron\"][text()=\"Insights\"]");
	By Industries = By.xpath("//*[@class=\"chevron\"][contains(text(),'Industries')]");
	By SearchIcon = By.xpath("//*[@class = \"search-icon\"]");
	By SearchBar = By.xpath("//*[@title=\"Search\"]");
	By ContactUs = By.xpath("//a[@class=\"chevron\"][contains(text(),\"Contact Us\")]");
	
	public void homePageValidation()
	{
		if(driver.findElements(HomeElementValid).size() == 7)
			Reporter.log("Home Page Validated");
		else
			Reporter.log("Home Page not Validated");
	}
	
	public void hubLogoClick()
	{
		driver.findElement(HubLogo).click();
		homePageValidation();
	}
	
	public void menuClick()
	{
		driver.findElement(Menu).click();
	}
	
	public void cookieClose()
	{
		driver.findElement(CookieClose).click();
	}
	
	public void officesClick()
	{
		driver.findElement(Offices).click();
		driver.get("https://www.hubinternational.com/offices/");
		Offices of = new Offices(driver);
		of.pageValidation();
	}
	
	public void productsClick()
	{
		driver.findElement(Products).click();
		Products pd = new Products(driver);
		pd.businessInsuranceClick();
	}
	
	public void insightsClick()
	{
		driver.findElement(Insights).click();
		Insights it = new Insights(driver);
		driver.get("https://www.hubinternational.com/insights/");
		it.pageValidation();
	}
	
	public void industriesClick()
	{
		driver.findElement(Industries).click();
		Industries id = new Industries(driver);
		id.pageValidation();
	}
	
	public void searchIconClick()
	{
		driver.findElement(SearchIcon).click();
		String pass = "Industries";
		driver.findElement(SearchBar).sendKeys(pass);
		Search sc = new Search(driver);
		sc.pageValidation(pass);
	}
	public void contactUsClick()
	{
		driver.findElement(ContactUs).click();
		driver.get("https://www.hubinternational.com/contact-us/");
		ContactUs cu = new ContactUs(driver);
		cu.validate();
	}
}
