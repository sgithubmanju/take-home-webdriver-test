package com.localhost.allPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPages {
	WebDriver driver;         
	public FileUploadPages(WebDriver driver)
	{
		this.driver=driver;
	}
	public void taskFileUpload() {
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\16572\\Downloads\\some-file (1).txt");
		
		
		driver.findElement(By.id("file-submit")).click();
		


	}

}
