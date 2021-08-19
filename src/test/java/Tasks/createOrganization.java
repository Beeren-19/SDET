package Tasks;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.generic.ReaddatafromPropfile;


public class createOrganization extends ReaddatafromPropfile {
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
	  driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("abcd");
	  driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www");
	  driver.findElement(By.xpath("//input[@name='tickersymbol']")).sendKeys("!@#");
	  driver.findElement(By.xpath("//input[@name='employees']")).sendKeys("bee");
	  driver.findElement(By.xpath("//input[@name='email2']")).sendKeys("bee@gmail.com");
	  driver.findElement(By.xpath("//input[@name='emailoptout']")).click();
	  driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9164991755");
	  driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("Fa2x");
	  driver.findElement(By.xpath("//input[@name='otherphone']")).sendKeys("6363392436");
	  driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("gkbee@gmail.com");
	  driver.findElement(By.xpath("//input[@name='ownership']")).sendKeys("raghu");
	  driver.findElement(By.xpath("//input[@name='siccode']")).sendKeys("CO23");
	  driver.findElement(By.xpath("//input[@name='notify_owner']")).click();
	  driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("qwerpoiufghdskal");
	  driver.findElement(By.xpath("//input[@name='bill_pobox']")).sendKeys("524");
	  driver.findElement(By.xpath("//input[@name='bill_city']")).sendKeys("banglore");
	  driver.findElement(By.xpath("//input[@name='bill_state']")).sendKeys("karnataka");
	  driver.findElement(By.xpath("//input[@name='bill_code']")).sendKeys("560063");
	  driver.findElement(By.xpath("//input[@name='bill_country']")).sendKeys("India");
	  driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("mnzxcbvhgfjdk");
	  driver.findElement(By.xpath("//input[@name='ship_pobox']")).sendKeys("123");
	  driver.findElement(By.xpath("//input[@name='ship_city']")).sendKeys("honatsugi");
	  driver.findElement(By.xpath("//input[@name='ship_state']")).sendKeys("kanagwava");
	  driver.findElement(By.xpath("//input[@name='ship_code']")).sendKeys("84569");
	  driver.findElement(By.xpath("//input[@name='ship_country']")).sendKeys("Japan");
	  driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("asdlkjhgftryeuwiopq");
	  driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
}
}
