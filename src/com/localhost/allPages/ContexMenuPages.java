package com.localhost.allPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ContexMenuPages {
public WebDriver driver;
	
	public ContexMenuPages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void taskContexMenu() {
       WebElement box = driver.findElement(By.id("hot-spot"));
		
		Actions action = new Actions(driver);
		action.contextClick(box).perform(); 
		
		driver.findElement(By.id("hot-spot"));
		Alert alert = driver.switchTo().alert();
		
		String textOnPrompt = alert.getText();
		
		Assert.assertEquals("You selected a context menu", textOnPrompt);
		driver.close();
	}

}
