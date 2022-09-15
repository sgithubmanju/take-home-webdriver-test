package com.localhost.allPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FileDownloadPages {
	WebDriver driver;
	public FileDownloadPages(WebDriver driver)
	{
		this.driver=driver;
	}
	public void taskFileDownload() {
		driver.findElement(By.xpath("//a[@href='download/some-file.txt']")).click();
		Assert.assertEquals("some-file.txt", "some-file.txt");
	}

}
