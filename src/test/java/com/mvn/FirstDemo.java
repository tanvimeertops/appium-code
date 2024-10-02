package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class FirstDemo {
 public AndroidDriver driver;
	@Test
	public void test() throws MalformedURLException, InterruptedException {
		UiAutomator2Options options=new UiAutomator2Options();
			
		options.setDeviceName("Tanvi");
		options.setApp("H:\\apk file\\ApiDemos-debug.apk");
		driver=new AndroidDriver
				(new URL("http://127.0.0.1:4723/")
				, options);
		Thread.sleep(2000);
		driver.quit();
	}
	
//	@AfterTest
//	public void after() {
//		
//	}
}
