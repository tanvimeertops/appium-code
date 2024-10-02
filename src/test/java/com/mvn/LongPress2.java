package com.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class LongPress2 extends BaseTest {

	@Test
	public void longPress() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists"))
		.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]"))
		.click();
		Thread.sleep(2000);
		
		// //class_value[@text='text_value']
		WebElement e1=driver.findElement
				(By.xpath("//android.widget.TextView[@text='People Names']"));
		longPressAction(e1);
		
	String msg=	driver.findElement(By.id("android:id/title")).getText();
		Assert.assertEquals(msg, "Sample menu");
	}
}
