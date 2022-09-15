package com.localhost.allPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FloatingMenuPages {
	WebDriver driver;
	public FloatingMenuPages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void taskFloatingMenu() throws InterruptedException {
		
		
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 
		 jse.executeScript("window.scrollBy(0,600)");
		 
		 Thread.sleep(1000);
		 
		 jse.executeScript("window.scrollBy(0,-200)");
		 

	}

}
