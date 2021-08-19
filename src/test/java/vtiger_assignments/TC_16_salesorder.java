package vtiger_assignments;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.BaseClass;
import com.generic.ReaddatafromPropfile;
import com.generic.Webdriver_utility;
import com.objectrepopom.CreatenewsalesPage;
import com.objectrepopom.Homepage;
import com.objectrepopom.Loginpage;
import com.objectrepopom.MoreSales;
import com.objectrepopom.SalesorderPage;

public class TC_16_salesorder extends BaseClass {

	@Test(groups="regression test")
	public void TC_16() throws InterruptedException
	{
		
		
//		WebDriver driver=new ChromeDriver();
//
//		ReaddatafromPropfile prop=new ReaddatafromPropfile();
//
//		driver.get(prop.readdata("url"));
//
//		String UN = prop.readdata("UN");
//		String PWD = prop.readdata("PWD");
//
//		driver.manage().window().maximize();
//
//		Webdriver_utility wdu=new Webdriver_utility();
//		wdu.impicitwait(driver);
//
//		Loginpage lp=new Loginpage(driver);
//		lp.loginintoapp(UN, PWD);
		
		Homepage hp=new Homepage(driver);
		hp.clickonmore();
		
		MoreSales ms=new MoreSales(driver);
		ms.clickonsalesorder();
		
		SalesorderPage sop=new SalesorderPage(driver);
		sop.clickonsalesorderimg();
		
		CreatenewsalesPage csp=new CreatenewsalesPage(driver);
		csp.passdata16(driver);
		
		//hp.logoutapp(driver);
		
		
	}
	
	@Test(groups="smoke test")
	public void TC_15()
	{
		Homepage hp=new Homepage(driver);
		hp.clickonmore();
		
		MoreSales ms=new MoreSales(driver);
		ms.clickonsalesorder();
		
		SalesorderPage sop=new SalesorderPage(driver);
		sop.clickonsalesorderimg();
		
	}
}
