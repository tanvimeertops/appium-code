package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class Deepakcalc {
	@Test
	public void name() throws Exception {
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Xiaomi M2010J19SI");
		cap.setCapability("udid","84b1ddd91220");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12.0");
		cap.setCapability( "appPackage","com.miui.calculator");
		cap.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
		cap.setCapability("automationName", "UIAutomator2");
		
		URL url=new URL("http://127.0.0.1:4723/");
		
		AppiumDriver driver=new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("com.miui.calculator:id/listView")).click();
		Thread.sleep(500);
		driver.findElement(By.id("com.miui.calculator:id/btn_1_s")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
		Thread.sleep(2000);
//		
//		driver.findElement(By.id("com.miui.calculator:id/btn_2_s")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.miui.calculator:id/btn_3_s")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.miui.calculator:id/btn_4_s")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.miui.calculator:id/btn_5_s")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.miui.calculator:id/btn_6_s")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.miui.calculator:id/btn_7_s")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.miui.calculator:id/btn_8_s")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.miui.calculator:id/btn_9_s")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.miui.calculator:id/btn_equal_s")).click();
//		Thread.sleep(2000);
		driver.quit();
	}
	
//	@Test
	public void clock() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Xiaomi M2010J19SI");
		cap.setCapability("udid","84b1ddd91220");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12.0");
		cap.setCapability( "appPackage","com.android.deskclock");
		cap.setCapability("appActivity","com.android.deskclock.DeskClockTabActivity");
		cap.setCapability("automationName", "UIAutomator2");
		
		URL url=new URL("http://127.0.0.1:4723/");
		
		AppiumDriver driver=new AppiumDriver(url, cap);
	}
	



}
