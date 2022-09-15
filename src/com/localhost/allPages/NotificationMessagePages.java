package com.localhost.allPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NotificationMessagePages {
	WebDriver driver;
	public NotificationMessagePages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void taskNotificationPages() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		
		String [] expectedResult={"Action Successful!", "Action unsuccessful, please try again!","Action Unsuccessful!"};

		
		String [] resultText=new String[10];
		for(int i=0; i <4; i++) {
			
			driver.findElement(By.linkText("Click here")).click();
			resultText[i]=driver.findElement(By.id("flash")).getText().trim();
		}
		for(int i=0; i <2; i++) {
			Assert.assertNotEquals(expectedResult[i], resultText[i]);
			System.out.println(resultText[i]);
	}
		}
	
}
