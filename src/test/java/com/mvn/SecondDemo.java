package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class SecondDemo {
	@Test
public void test() throws MalformedURLException, InterruptedException {
	UiAutomator2Options options =new UiAutomator2Options();
	options.setDeviceName("Tanvi");
	options.setApp("H:\\apk file\\ApiDemos-debug.apk");
	
	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	Thread.sleep(3000);
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	Thread.sleep(3000);
	driver.findElement(AppiumBy
			.androidUIAutomator("new UiScrollable(new UiSelector())"
					+ ".scrollIntoView(text(\"WebView\"));")).click();
		Thread.sleep(10000);
	driver.quit();
	}
}
