package com.localhost.allPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DyanamicLoadingPages {
	WebDriver driver;
	public DyanamicLoadingPages(WebDriver driver)
	{
		this.driver=driver;
	}
	public void taskDyanamicLoadinga() {
		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(10));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='start'] button"))).click();
		
		Assert.assertEquals(false, false);
	}

}
