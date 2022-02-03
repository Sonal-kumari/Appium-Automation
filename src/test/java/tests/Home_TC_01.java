package tests;

import org.testng.annotations.Test;

import pages.Home;

public class Home_TC_01 extends BaseClass{
	
	Home tc;
	
	@Test
	public void sampleTest()
	{
		tc = new Home(driver);		
		tc.cookieClose();
	}
//	@Test
//	public void sampleTest1() throws Exception
//	{
//		tc = new Home(driver);	
//		tc.menuClick();
//		tc.officesClick();
//	}
//	@Test
//	public void sampleTest2() throws Exception
//	{
//		tc = new Home(driver);	
//		tc.menuClick();
//		tc.productsClick();
//	}
//	@Test
//	public void sampleTest3() throws Exception
//	{
//		tc = new Home(driver);	
//		tc.menuClick();
//		tc.insightsClick();
//	}
//	@Test
//	public void sampleTest4() throws Exception
//	{
//		tc = new Home(driver);	
//		tc.menuClick();
//		tc.industriesClick();
//	}
	@Test
	public void sampleTest5() throws Exception
	{
		tc = new Home(driver);	
		tc.searchIconClick();	
	}
//	@Test
//	public void sampleTest6() throws Exception
//	{
//		tc = new Home(driver);	
//		tc.menuClick();
//		tc.contactUsClick();
//	}
}
