package com.localhost.allPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPages {
	WebDriver driver;
	public MouseHoverPages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void taskMouseHover() throws InterruptedException {
		WebElement element =driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
		WebElement element1 =driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/img"));
		WebElement element2 =driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/img"));
		
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(300);
		action.moveToElement(element1).perform();
		Thread.sleep(300);
		action.moveToElement(element2).perform();
	}

}
