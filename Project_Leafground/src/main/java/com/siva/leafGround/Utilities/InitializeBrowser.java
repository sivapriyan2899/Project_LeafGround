package com.siva.leafGround.Utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InitializeBrowser {
	
	public static WebDriver driver;
	
	public static WebDriver configRead() {
		try (FileInputStream stream = new FileInputStream("src/main/resources/config.properties")) {
			Properties property = new Properties();
			property.load(stream);
			
			String browser = property.getProperty("browser");
			String location = property.getProperty("DriverLocation");
			
			if(browser.equals("chrome")) {
				driver=InitializeBrowser.chromeBrowser("webdriver.chrome.driver",location);
			}else if(browser.equals("edge")) {
				driver=InitializeBrowser.edgeBrowser("webdriver.edge.driver",location);
			}
				
		}catch (IOException e) {
			e.printStackTrace();
		}
		return driver;
	}
	
	public static WebDriver chromeBrowser(String browser, String location) {
		System.setProperty(browser,location);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver edgeBrowser(String browser, String location) {
		System.setProperty(browser,location);
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
