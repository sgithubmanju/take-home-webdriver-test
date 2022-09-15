package com.localhost.allPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPages {
	WebDriver driver;
	public JavaScriptAlertPages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void taskJavaScriptAlert() throws InterruptedException {
       //JS Alert Button handling
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Thread.sleep(200);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		//handling JS confirmation
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Thread.sleep(200);
		Alert alert1 = driver.switchTo().alert();
		
		
		String textOnConfirmation = alert1.getText();
		
		System.out.println(textOnConfirmation);
		
		alert1.accept();
		
				
		
		
		Thread.sleep(1000);
		
		//handling prompt
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert alert2 = driver.switchTo().alert();
		
		String textOnPrompt = alert2.getText();
		
		System.out.println(textOnPrompt);
	
		alert2.sendKeys("Automation");
		alert2.accept();
		
		
	}

}
