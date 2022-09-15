package com.localhost.allPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFailurePage {
	WebDriver driver;
	
	By userName = By.id("username");
	By passWord =By.id("password");
	By loginButton = By.cssSelector("button[type='submit']");

	public LoginFailurePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeUserName() 
	{
		driver.findElement(userName).sendKeys("tosmith");
	}
	
	public void typePassword()
	{
		driver.findElement(passWord).sendKeys("superSecretPassword!");
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(loginButton).click();
	}

	
	
	
	
}
