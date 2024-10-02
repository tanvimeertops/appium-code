package com.mvn;

import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	 public AndroidDriver driver;
	AppiumDriverLocalService service;
	@BeforeTest
	public void test() throws Exception
	{
		service=new AppiumServiceBuilder()
				.withAppiumJS(new File("C:\\Users\\"
						+ "tops\\AppData\\Roaming\\npm"
						+ "\\node_modules\\appium\\build\\"
						+ "lib\\main.js"))
				.withIPAddress("127.0.0.1")
				.withTimeout(Duration.ofSeconds(20))
				.usingPort(4723)
				.build();
		service.start();
		
		
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("Tanvi");
		options.setApp("H:\\apk file\\ApiDemos-debug.apk");
		options.setCapability("ignoreHiddenApiPolicyError", true);
//		options.setApp("H:\\apk file\\General-Store.apk");
		 driver=new AndroidDriver
				(new URL("http://127.0.0.1:4723/"),options);
		 //implicit wait
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		
	}
	
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}

	public void swipeAction(WebElement ele,String direction)
	{
		((JavascriptExecutor) driver).executeScript
		("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
			 
			    "direction", direction,
			    "percent", 0.15
			));		
	}
	public void drapNDrop(WebElement source) {
		((JavascriptExecutor) driver)
		.executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) source).getId(),
			    "endX", 719,
			    "endY", 960
			));
	}
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(20000);
		driver.quit();
		service.stop();
	}
}
