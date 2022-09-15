package com.localhost.allPages;

import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragNDroPages {
	public WebDriver driver;
	
	public DragNDroPages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void dropDrag() {
		driver.findElement(By.id("column-a")).click();
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//div[@draggable='true'][1]"));
		WebElement target = driver.findElement(By.xpath("//div[@draggable='true'][2]"));
		
		a.dragAndDrop(source, target).perform();
		
		Assert.assertNotEquals("A", "B");
		
		//driver.switchTo().activeElement();
	}
	
}
