package tests;

import org.testng.annotations.Test;

import pages.Home;

public class Home_TC_02 extends BaseClass{
	
	Home tc;
	
	@Test(priority = 0)
	public void cookieClose()
	{
		tc = new Home(driver);		
		tc.cookieClose();
	}
	@Test(priority = 1)
	public void homePageValidation()
	{
		tc = new Home(driver);		
		tc.homePageValidation();
	}
	@Test(priority = 2)
	public void officePageValidation() throws Exception
	{
		tc = new Home(driver);	
		tc.menuClick();
		tc.officesClick();
	}
	@Test(priority = 3)
	public void productsPageValidation() throws Exception
	{
		tc = new Home(driver);	
		tc.menuClick();
		tc.productsClick();
	}
	@Test(priority = 4)
	public void insightsPageValidation() throws Exception
	{
		tc = new Home(driver);	
		tc.menuClick();
		tc.insightsClick();
	}
	@Test(priority = 5)
	public void industriesPagevalidation() throws Exception
	{
		tc = new Home(driver);	
		tc.menuClick();
		tc.industriesClick();
	}
	@Test(priority = 6)
	public void searchIconValidation() throws Exception
	{
		tc = new Home(driver);	
		tc.searchIconClick();	
	}
	@Test(priority = 7)
	public void contactUsPageValidation() throws Exception
	{
		tc = new Home(driver);	
		tc.menuClick();
		tc.contactUsClick();
	}
}
