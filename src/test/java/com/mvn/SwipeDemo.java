package com.mvn;

import static org.testng.Assert.assertEquals;

import javax.annotation.concurrent.ThreadSafe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SwipeDemo extends BaseTest{
	@Test
public void swipe() throws InterruptedException {
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	Thread.sleep(2000);
	for (int i = 1; i <3; i++) {
	WebElement ele=driver.findElement
				(By.xpath("//android.widget.ImageView["+i+"]"));
//		 assertEquals(ele.getAttribute("focusable"), "true");
		 Thread.sleep(5000);
		 swipeAction(ele, "left");
		 Thread.sleep(5000);
//		 assertEquals(ele.getAttribute("focusable"), "false");
	 
	}
	 
	
	
}
}
