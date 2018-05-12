package bian;

import static org.junit.Assert.*;

import java.io.File;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class two {
	
	static AppiumDriver<WebElement> driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 File file = new File("");
		  String path = file.getAbsolutePath();
		  file.getPath();
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		  capabilities.setCapability(MobileCapabilityType.PLATFORM, "Andriod");
		  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "3487e851");
		  capabilities.setCapability(MobileCapabilityType.APP, path+"/apk/bl3.1.apk");
		  capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		  
		  capabilities.setCapability("appPackage", "com.bianla.app");
		  capabilities.setCapability("appActivity", "com.bianla.app.activity.LoginActivity");
		  driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
