package com.siva.leafGround.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage {
	
	@FindBy(id = "j_idt88:j_idt91")
	public  WebElement alertSimpleDialog;  //id= "j_idt88:j_idt91"
	
	@FindBy(id = "j_idt88:j_idt104")
	public  WebElement alertPromptDialog; //id= "j_idt88:j_idt104"
	
	@FindBy(xpath = "//*[@id='j_idt88:j_idt104']/following::span[1]")
	public  WebElement alertPromptDialogTextResult;
	
	@FindBy(id = "j_idt88:j_idt93")
	public  WebElement alertConfirmDialog;//id = "j_idt88:j_idt93"
	
	@FindBy(id = "j_idt88:j_idt106")
	public static WebElement sweetAlertConfirmation;//"j_idt88:j_idt106"
	
	@FindBy(id = "j_idt88:j_idt95")
	public static WebElement sweetAlertSimpleDialog;//id = "j_idt88:j_idt95"
	
	@FindBy(id = "j_idt88:j_idt111")
	public static WebElement sweetAlertMaxAndMin;//id = "j_idt88:j_idt111"
	
	@FindBy(id = "j_idt88:j_idt100")
	public static WebElement sweetAlertModalDialog;//id = "j_idt88:j_idt100"
	
	@FindBy(xpath = "//a[contains(@class,'logo')]")
	public static WebElement logo;				//xpath = "//a[contains(@class,'logo')]"
	
	@FindBy(id = "right-sidebar-button")
	public static WebElement kebabMenu;			//id = "right-sidebar-button"
	
	@FindBy(xpath = "//i[contains(@class,'pi pi-cog')]//parent::a[contains(@tabindex,'-1')]")
	public static WebElement gearIcon;			//xpath = "//i[contains(@class,'pi pi-cog')]//parent::a[contains(@tabindex,'-1')]"
	
	@FindBy(xpath = "//i[contains(@class,'pi pi-inbox')]//parent::a[contains(@tabindex,'-1')]")
	public static WebElement inboxIcon;			//xpath = "//i[contains(@class,'pi pi-inbox')]//parent::a[contains(@tabindex,'-1')]"
	
	@FindBy(xpath = "//i[contains(@class,'pi pi-calendar')]//parent::a[contains(@tabindex,'-1')]")
	public static WebElement calendarIcon;		//xpath = "//i[contains(@class,'pi pi-calendar')]//parent::a[contains(@tabindex,'-1')]"
	
}	
	
/*	
	WebElement alertSimpleDialog = driver.findElement(By.id("j_idt88:j_idt91"));
	WebElement alertPromptDialog = driver.findElement(By.id("j_idt88:j_idt104"));
	WebElement alertConfirmDialog = driver.findElement(By.id("j_idt88:j_idt93"));
	
	WebElement sweetAlertConfirmation = driver.findElement(By.id("j_idt88:j_idt106"));
	WebElement sweetAlertSimpleDialog = driver.findElement(By.id("j_idt88:j_idt95"));
	WebElement sweetAlertMaxAndMin = driver.findElement(By.id("j_idt88:j_idt111"));
	WebElement sweetAlertModalDialog = driver.findElement(By.id("j_idt88:j_idt100"));
	
	WebElement logo = driver.findElement(By.xpath("//a[contains(@class,'logo')]"));

	WebElement kebabMenu = driver.findElement(By.id("right-sidebar-button"));
	WebElement gearIcon = driver.findElement(By.xpath("//i[contains(@class,'pi pi-cog')]//parent::a[contains(@tabindex,'-1')]"));
	WebElement inboxIcon = driver.findElement(By.xpath("//i[contains(@class,'pi pi-inbox')]//parent::a[contains(@tabindex,'-1')]"));
	WebElement calendarIcon = driver.findElement(By.id("//i[contains(@class,'pi pi-calendar')]//parent::a[contains(@tabindex,'-1')]"));
	
	*/

