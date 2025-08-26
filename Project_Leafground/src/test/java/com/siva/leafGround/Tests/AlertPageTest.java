package com.siva.leafGround.Tests;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentEmailReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.siva.leafGround.Pages.AlertPage;
import com.siva.leafGround.Pages.InitializeBrowser;


public class AlertPageTest {

	public  WebDriver driver; // declared WebDriver as instance variable, so one browser will get open and run all test case.
	public  AlertPage alertPage; // declared to initialize elements in AlertPage.class
	public ExtentReports extentReport;
	public ExtentSparkReporter sparkReport;
	ExtentEmailReporter emailReport;
	public ExtentTest testCase;

	// Helper method - switch to alert
	public Alert switchToAlert(WebDriver x) {
		Alert alert = x.switchTo().alert();
		return alert;
	}

	// Helper method - sleep
	public static void pause(Integer sec) {
		try {
			Thread.sleep(sec);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Helper method - WebDriverWait for 5 seconds
	public Alert webdriverWait() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	@BeforeTest
	public  WebDriver navigateToAlertPage() {
		extentReport = new ExtentReports();
		sparkReport = new ExtentSparkReporter("sReport.html");
		extentReport.attachReporter(sparkReport);
		
		
		driver = InitializeBrowser.chromeBrowser();
		String url ="https://leafground.com/alert.xhtml;jsessionid=node0qo3nh9g1hog612ch2drsbxu353858683.node0";
		driver.get(url);
		return driver;
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		extentReport.flush();
	}
	
	@BeforeMethod
	public void initElements() {
		
		//AlertPage alertpage = new AlertPage();
		//PageFactory.initElements(driver, alertpage);  
		//this will also work, here it get the driver and find all elements mentioned with @FindBy
		
		alertPage= PageFactory.initElements(driver, AlertPage.class);// here it will create instance of that class and find the elements
	}

	@Test (priority = 0)
	public void testCase01_1_alertSimpleDialog() {
		testCase = extentReport.createTest("Alert_SimpleDialog_accept");
		testCase.log(Status.INFO, "hii");
		
		alertPage.alertSimpleDialog.click();
		switchToAlert(driver);
		Alert alert = webdriverWait();
		//pause(2000);
		alert.accept();
	}

	@Test (priority = 1)
	public void testCase01_2_alertSimpleDialog() {
		testCase = extentReport.createTest("Alert_SimpleDialog_dismiss");

		alertPage.alertSimpleDialog.click();
		switchToAlert(driver);
		Alert alert = webdriverWait();
		//pause(2000);
		alert.dismiss();	
	}
	
	@Test (priority = 2)
	public void testCase01_3_alertSimpleDialog() {
		testCase = extentReport.createTest("Alert_SimpleDialog_getAlertText");
		
		alertPage.alertSimpleDialog.click();
		switchToAlert(driver);
		Alert alert = webdriverWait();
		String alertText =alert.getText();
		System.out.println(alertText);
		//pause(2000);
		alert.accept();
	}

	@Test (priority = 3)
	public  void testCase02_1_alertPromptDialog() {
		testCase = extentReport.createTest("Alert_promptDialog_accept");
		alertPage.alertPromptDialog.click();
		
		Alert alert = webdriverWait();
		switchToAlert(driver);
		System.out.println(alert.getText());
		alert.sendKeys("siva");
		alert.accept();

	}
	
	@Test(priority = 4)
	public void testCase02_2_alertPromptDialog() {
		testCase = extentReport.createTest("Alert_promptDialog_getAlertText");
		alertPage.alertPromptDialog.click();
		
		Alert alert = webdriverWait();
		switchToAlert(driver);
		alert.dismiss();
		String textResult = alertPage.alertPromptDialogTextResult.getText();
		System.out.println(textResult);

	}

	@Test (priority = 5)
	public  void testCase03_1_alertConfirmationDialog() {
		testCase = extentReport.createTest("Alert_ConfirmationDialog_accept");
		
		alertPage.alertConfirmDialog.click();
		Alert alertHandller = switchToAlert(driver);
		//pause(2000);
		alertHandller.accept();
	}

	@Test (priority = 6)
	public void testCase03_2_alertConfirmationDialog()  {
		testCase = extentReport.createTest("Alert_ConfirmationDialog_verifyText");
		
		alertPage.alertConfirmDialog.click();
		switchToAlert(driver);
		Alert alert =  webdriverWait();
		
		String alertText = alert.getText();
		Assert.assertEquals(alertText, "Did you call me?", "Alert text not matched");
		//pause(2000);
		alert.accept();
		
	}

	 
}
