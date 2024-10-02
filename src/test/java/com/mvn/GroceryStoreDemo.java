package com.mvn;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class GroceryStoreDemo extends BaseTest {
	@Test
public void store() throws InterruptedException {
	driver.findElement(By.id("com.androidsample"
			+ ".generalstore:id/nameField"))
	.sendKeys("tanvi");
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.androidsample"
			+ ".generalstore:id/radioFemale"))
	.click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.androidsample"
			+ ".generalstore:id/spinnerCountry"))
	.click();
	Thread.sleep(2000);
	
	driver.findElement(AppiumBy.androidUIAutomator
			("new UiScrollable(new UiSelector())"
					+ ".scrollIntoView(text(\"India\"));"))
	.click();
	}
}
