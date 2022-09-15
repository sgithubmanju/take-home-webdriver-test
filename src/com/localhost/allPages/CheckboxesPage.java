package com.localhost.allPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesPage {
	WebDriver driver;

	By checkbox1 = By.xpath("(//input[@type='checkbox'])[1]");
	By checkbox2 = By.xpath("(//input[@type='checkbox'])[2]");

	public CheckboxesPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickCheckbox1() throws InterruptedException {
		
		driver.findElement(checkbox1).click();
		WebElement check=driver.findElement(checkbox2);
		System.out.println(check.isSelected());
		Assert.assertTrue(check.isSelected());

	}

	@Test
	public void clickCheckbox2() {
		driver.findElement(checkbox2).click();
		WebElement check=driver.findElement(checkbox2);
		System.out.println(check.isSelected());
		Assert.assertFalse(check.isSelected());
	}

}
