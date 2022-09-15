package com.localhost.allPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OpenInNewTabPages {
	WebDriver driver;
	public OpenInNewTabPages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void taskOpenInNewTab() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://localhost:7080/windows");
		
		driver.findElement(By.linkText("Click Here")).click();
	
		//String expected=driver.findElement(By.className("signInBtn")).getText();
		//Assert.assertEquals("New Window", expected);
		//System.out.println(expected);
	}

}
