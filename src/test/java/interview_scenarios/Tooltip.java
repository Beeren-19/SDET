package interview_scenarios;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.ReaddatafromPropfile;
import com.generic.Webdriver_utility;
import com.objectrepopom.Loginpage;

public class Tooltip extends ReaddatafromPropfile {

	public static void main(String[] args) throws IOException {
		
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
		
		WebElement att = driver.findElement(By.xpath("//img[@title='Show World Clock...']"));
		
		String tool = att.getAttribute("title");
		System.out.println(tool);
	}
}
