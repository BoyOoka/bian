package bian;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class one {
	static AppiumDriver<WebElement> driver;
  @Test
  public void f() {
	  driver.findElement(By.id("w")).click();
  }
  @BeforeClass
  public static void beforeClass() throws MalformedURLException {
	  File file = new File("");
	  String path = file.getAbsolutePath();
	  file.getPath();
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
	  capabilities.setCapability(MobileCapabilityType.PLATFORM, "Andriod");
	  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "3487e851");
	  capabilities.setCapability(MobileCapabilityType.APP, path+"/apk/bl3.1.apk.apk");
	  capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
	  
	  capabilities.setCapability("appPackage", "com.bianla.app");
	  capabilities.setCapability("appActivity", "com.bianla.app.activity.LoginActivity");
	  driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
  }

  @AfterClass
  public static void afterClass() {
  }

}
