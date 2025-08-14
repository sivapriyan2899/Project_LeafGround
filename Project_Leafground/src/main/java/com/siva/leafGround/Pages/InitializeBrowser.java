package com.siva.leafGround.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitializeBrowser {
	
	public static WebDriver chromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
