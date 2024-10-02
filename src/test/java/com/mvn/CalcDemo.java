package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class CalcDemo {
	@Test
public void openCalc() throws MalformedURLException, InterruptedException {
	DesiredCapabilities cap=new DesiredCapabilities();
	
	cap.setCapability("deviceName", "Xiaomi M2006C3LII");
	cap.setCapability("udid","RG7LQ8FUMR5DEQLV");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "10.0");
	cap.setCapability( "appPackage","com.dencreak.dlcalculator");
	cap.setCapability("appActivity","com.dencreak.dlcalculator"
			+ ".DLCalculatorActivity");
	cap.setCapability("automationName", "UIAutomator2");
	
	URL url=new URL("http://127.0.0.1:4723/");
	
	AppiumDriver driver=new AppiumDriver(url, cap);
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Thread.sleep(2000); 
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_d_d")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_d_b")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
	Thread.sleep(2000);
	String ans=	driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val"))
			.getText();
	
	System.out.println("ans is :"+ans);
	Thread.sleep(2000);
	driver.quit();
	
	

}
}
