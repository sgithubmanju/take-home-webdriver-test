package com.localhost.allPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IframePages {
	WebDriver driver;
	public IframePages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void taskIframe() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("http://localhost:7080/iframe");
		//System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		Thread.sleep(100);
		driver.switchTo().frame("mce_0_ifr");
		
		driver.findElement(By.cssSelector("body p")).sendKeys("Automation");
		
		driver.switchTo().parentFrame();
		
		
	}

}
