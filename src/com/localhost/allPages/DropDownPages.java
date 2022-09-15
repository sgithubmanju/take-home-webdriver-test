package com.localhost.allPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownPages {

	WebDriver driver;
	public DropDownPages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void taskDropDown() {
		WebElement staticDropdown = driver.findElement(By.id("dropdown"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.getFirstSelectedOption().getText();
		dropdown.selectByVisibleText("Option 2");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		Assert.assertEquals("Option 2", dropdown.getFirstSelectedOption().getText());
		
		
	}
}
