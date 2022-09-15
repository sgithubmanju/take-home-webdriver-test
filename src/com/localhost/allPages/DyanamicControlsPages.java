package com.localhost.allPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DyanamicControlsPages {
	WebDriver driver;
	public DyanamicControlsPages(WebDriver driver)
	{
		this.driver=driver;
	}
	public void taskDyanamicControls() {
		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[onclick='swapCheckbox()']"))).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[onclick='swapInput()']"))).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[onclick='swapInput()']"))).click();
		
		
	}
}
