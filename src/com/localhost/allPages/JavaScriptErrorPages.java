package com.localhost.allPages;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class JavaScriptErrorPages {
	WebDriver driver;
	public JavaScriptErrorPages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void extractJSLogsInfo() {
		LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
		for (LogEntry entry : logEntries) {
			System.out.println(entry.getLevel() + "" + entry.getMessage());
		}
	}

}
