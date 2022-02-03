package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass 
{
	
	public AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup()
	{
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 25");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
//		caps.setCapability(MobileCapabilityType.UDID, "5200bdce947156b1");
//		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-A260G");
//		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability("chromedriverExecutable", "/home/sonal/Downloads/chromedriver_linux64/chromedriver");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, caps);
		driver.get("https://www.hubinternational.com/");
		Thread.sleep(5000);
		
		}
		catch(Exception exp)
		{
			System.out.println("Cause is: " + exp.getCause());
			System.out.println("Message is: " + exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
