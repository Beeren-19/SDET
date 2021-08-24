package Tasks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.ReaddatafromPropfile;
import com.generic.Webdriver_utility;
import com.objectrepopom.CreatenewOrgPage;
import com.objectrepopom.Homepage;
import com.objectrepopom.Loginpage;
import com.objectrepopom.Organizationpage;

public class CreateOrg_POM extends ReaddatafromPropfile{

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver=new ChromeDriver();

		ReaddatafromPropfile prop=new ReaddatafromPropfile();

		driver.get(prop.readdata("url"));

		String UN = prop.readdata("UN");
		String PWD = prop.readdata("PWD");

		driver.manage().window().maximize();

		Webdriver_utility wdu=new Webdriver_utility();
		wdu.impicitwait(driver);

		Loginpage lp=new Loginpage(driver);

		lp.loginintoapp(UN, PWD);

		Homepage hp=new Homepage(driver);
		hp.clickonOrg();

		Organizationpage op=new Organizationpage(driver);
		op.clickorgimg();
		
		CreatenewOrgPage cop=new CreatenewOrgPage(driver);
		cop.createOrg();
	
		Thread.sleep(2000);
		hp.logoutapp(driver);
	}
}