package com.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.objectrepopom.Homepage;
import com.objectrepopom.Loginpage;

public class BaseClass {

	public WebDriver driver;
	public ReaddatafromPropfile prop=new ReaddatafromPropfile();
	public Webdriver_utility wdu=new Webdriver_utility();
	
	
	
	@BeforeSuite(groups={"smoke test","regression test"})
	public void connection()
	{
		System.out.println("****JDBC connection done*****");
	}
	
	@AfterSuite(groups={"smoke test","regression test"})
	public void disconnection()
	{
		System.out.println("****JDBC connection closed****");
		
	}
	//@Parameters("BROWSER")
	@BeforeClass(groups={"smoke test","regression test"})
	public void launchBrowser() throws IOException
	{
		 //String BROWSER = prop.readdata("browser");
		String BROWSER = System.getProperty("browser");
		if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
	}
	
	@AfterClass(groups={"smoke test","regression test"})
	public void closeBrowser()
	{
		driver.close();
	}
	
	@BeforeMethod(groups={"smoke test","regression test"})
	public void logintoVtiger() throws IOException
	{
		 Loginpage lp=new Loginpage(driver);
		driver.get(prop.readdata("url"));

		String UN = prop.readdata("UN");
		String PWD = prop.readdata("PWD");
		driver.manage().window().maximize();
		wdu.impicitwait(driver);
		lp.loginintoapp(UN, PWD);

	}
	@AfterMethod(groups={"smoke test","regression test"})
	public void signoutVtiger()
	{
		Homepage hp=new Homepage(driver);
		hp.logoutapp(driver);
	}
}
