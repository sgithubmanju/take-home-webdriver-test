package com.localhost.allPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DyanamicContentPages {
	WebDriver driver;

	public DyanamicContentPages(WebDriver driver) {
		this.driver = driver;
	}

	public void taskDyanamicContent() {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for (int i = 0; i < 3; i++) {
			driver.navigate().refresh();

		}
		String img1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]")).getText();
		String img2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]")).getText();

		Assert.assertNotEquals(img1, img2);
	}

}
