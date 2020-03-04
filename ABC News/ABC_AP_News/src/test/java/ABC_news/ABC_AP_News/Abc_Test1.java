package ABC_news.ABC_AP_News;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Abc_Test1 {
public AppiumDriver<MobileElement> driver;
	
	@Test
	public void desiredCapabilities() throws MalformedURLException 
	{
		try {
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("platformName" , "Android");
		capabilities.setCapability("platformVersion" , "9");
		capabilities.setCapability("deviceName" , "988b5143424258595730");
		capabilities.setCapability("appPackage" , "com.abc.abcnews");
		capabilities.setCapability("appActivity" , "com.abc.abcnews.ui.StartActivity");
		capabilities.setCapability("noReset" , "false");
		driver= new AndroidDriver<MobileElement>(new URL ("http://0.0.0.0:4723/wd/hub"),capabilities);
		Thread.sleep(3000);
	} catch(Exception e)
		{
		System.out.println(e);
		}

}

}
