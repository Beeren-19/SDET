package com.objectrepopom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.Webdriver_utility;

public class CreatenewsalesPage {

	public CreatenewsalesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjecttxtfld;

	public WebElement getSubjecttxtfld() {
		return subjecttxtfld;
	}
	
	@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[4]")
	private WebElement orgnameimg;

	public WebElement getOrgnameimg() {
		return orgnameimg;
	}
	
	public void passdata16(WebDriver driver) throws InterruptedException
	{
		subjecttxtfld.sendKeys("Samsungj7");
		orgnameimg.click();
		Webdriver_utility wdu=new Webdriver_utility();
		wdu.switchwindow(driver, "Accounts&action");
		driver.findElement(By.xpath("//a[text()='samsung']")).click();
		Alert Alt = driver.switchTo().alert();
		Alt.accept();
		Thread.sleep(2000);
		wdu.switchwindow(driver, "SalesOrder&action");
		Thread.sleep(2000);
		wdu.select_DD("UPS", carrierdd);
		billingadds.sendKeys("banglore");
		shipingadds.sendKeys("banglore");
		wdu.select_DD("Created", statusdd);
		groupradiobtn.click();
		wdu.select_DD("Team Selling", groupdd);
		wdu.select_DD("Paid", invoicestatusdd);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<=3;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
		}
		productimg.click();
		wdu.switchwindow(driver, "Products&action");
		driver.findElement(By.xpath("//a[text()='laptop']")).click();
		wdu.switchwindow(driver, "SalesOrder&action");
		qtytxtfld.sendKeys("40");
		save.click();
		
	}
	
	@FindBy(xpath="//select[@name='carrier']")
	private WebElement carrierdd;
	
	
	public WebElement getCarrierdd() {
		return carrierdd;
	}

	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement billingadds;

	public WebElement getBillingadds() {
		return billingadds;
	}
	
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement shipingadds;

	public WebElement getShipingadds() {
		return shipingadds;
	}
	
	@FindBy(xpath="//select[@name='sostatus']")
	private WebElement statusdd;

	public WebElement getStatusdd() {
		return statusdd;
	}
	
	@FindBy(xpath="(//input[@name='assigntype'])[2]")
	private WebElement groupradiobtn;

	public WebElement getGroupradiobtn() {
		return groupradiobtn;
	}
	
	@FindBy(xpath="//select[@name='assigned_group_id']")
	private WebElement groupdd;

	public WebElement getGroupdd() {
		return groupdd;
	}
	
	@FindBy(xpath="//select[@name='invoicestatus']")
	private WebElement invoicestatusdd;

	public WebElement getInvoicestatusdd() {
		return invoicestatusdd;
	}
	
	@FindBy(xpath="//img[@title='Products']")
	private WebElement productimg;

	public WebElement getProductimg() {
		return productimg;
	}
	
	@FindBy(xpath="//input[@name='qty1']")
	private WebElement qtytxtfld;

	public WebElement getQtytxtfld() {
		return qtytxtfld;
	}
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement save;

	public WebElement getSave() {
		return save;
	}
	
	public void passdata17(WebDriver driver) throws InterruptedException
	{
		subjecttxtfld.sendKeys("Samsungj7");
		orgnameimg.click();
		Webdriver_utility wdu=new Webdriver_utility();
		wdu.switchwindow(driver, "Accounts&action");
		driver.findElement(By.xpath("//a[text()='samsung']")).click();
		Alert Alt = driver.switchTo().alert();
		Alt.accept();
		Thread.sleep(2000);
		wdu.switchwindow(driver, "SalesOrder&action");
		Thread.sleep(2000);
		wdu.select_DD("USPS", carrierdd);
		billingadds.sendKeys("banglore");
		shipingadds.sendKeys("banglore");
		wdu.select_DD("Created", statusdd);
		groupradiobtn.click();
		wdu.select_DD("Team Selling", groupdd);
		wdu.select_DD("Paid", invoicestatusdd);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<=3;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
		}
		productimg.click();
		wdu.switchwindow(driver, "Products&action");
		driver.findElement(By.xpath("//a[text()='laptop']")).click();
		wdu.switchwindow(driver, "SalesOrder&action");
		qtytxtfld.sendKeys("40");
		save.click();
		
	}
	
	public void passdata18(WebDriver driver) throws InterruptedException
	{
		subjecttxtfld.sendKeys("Samsungj7");
		orgnameimg.click();
		Webdriver_utility wdu=new Webdriver_utility();
		wdu.switchwindow(driver, "Accounts&action");
		driver.findElement(By.xpath("//a[text()='samsung']")).click();
		Alert Alt = driver.switchTo().alert();
		Alt.accept();
		Thread.sleep(2000);
		wdu.switchwindow(driver, "SalesOrder&action");
		wdu.select_DD("DHL", carrierdd);
		billingadds.sendKeys("banglore");
		shipingadds.sendKeys("banglore");
		wdu.select_DD("Created", statusdd);
		groupradiobtn.click();
		wdu.select_DD("Team Selling", groupdd);
		wdu.select_DD("Paid", invoicestatusdd);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<=3;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
		}
		productimg.click();
		wdu.switchwindow(driver, "Products&action");
		driver.findElement(By.xpath("//a[text()='laptop']")).click();
		wdu.switchwindow(driver, "SalesOrder&action");
		qtytxtfld.sendKeys("40");
		save.click();
		
	}
	
	public void passdata19(WebDriver driver) throws InterruptedException
	{
		subjecttxtfld.sendKeys("Samsungj7");
		orgnameimg.click();
		Webdriver_utility wdu=new Webdriver_utility();
		wdu.switchwindow(driver, "Accounts&action");
		driver.findElement(By.xpath("//a[text()='samsung']")).click();
		Alert Alt = driver.switchTo().alert();
		Alt.accept();
		Thread.sleep(2000);
		wdu.switchwindow(driver, "SalesOrder&action");
		wdu.select_DD("BlueDart", carrierdd);
		billingadds.sendKeys("banglore");
		shipingadds.sendKeys("banglore");
		wdu.select_DD("Created", statusdd);
		groupradiobtn.click();
		wdu.select_DD("Team Selling", groupdd);
		wdu.select_DD("Paid", invoicestatusdd);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<=3;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
		}
		productimg.click();
		wdu.switchwindow(driver, "Products&action");
		driver.findElement(By.xpath("//a[text()='laptop']")).click();
		wdu.switchwindow(driver, "SalesOrder&action");
		qtytxtfld.sendKeys("40");
		save.click();
		
	}
	
	
	
	
	
	
	
}
