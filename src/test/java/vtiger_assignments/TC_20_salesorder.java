package vtiger_assignments;

import org.testng.annotations.Test;

import com.generic.BaseClass;
import com.objectrepopom.Homepage;
import com.objectrepopom.MoreSales;
import com.objectrepopom.SalesorderPage;
import com.objectrepopom.SearchPage;

public class TC_20_salesorder extends BaseClass {

	@Test
	public void TC_20()
	{
		
//		WebDriver driver=new ChromeDriver();
//		
//		ReaddatafromPropfile prop=new ReaddatafromPropfile();
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
		sop.clickonsearchimg();
		
		SearchPage sp=new SearchPage(driver);
		sp.selectfilter();
		
		//hp.logoutapp(driver);
	}
}
