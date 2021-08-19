package Tasks;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.generic.Randomnumber;
import com.generic.ReaddatafromPropfile;

public class createorganization_save extends ReaddatafromPropfile{
	 public static void main(String[] args) throws IOException
	  {
		  ReaddatafromPropfile prop=new ReaddatafromPropfile();
		  WebDriver driver=new FirefoxDriver();
		  driver.get(prop.readdata("url"));
		  
		 
		  String UN = prop.readdata("UN");
		  String PWD = prop.readdata("PWD");
		  
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(UN);
		  driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PWD);
		  driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		  
		  driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
		  driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		  
		  Randomnumber r=new Randomnumber();
		  Object randomnum = r.createrandomNum();
		  System.out.println(randomnum);
		  String orgname = "TYSS"+randomnum;
		  
		  driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname);
		  driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
}
}
