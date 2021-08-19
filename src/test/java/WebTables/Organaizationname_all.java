package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Organaizationname_all {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://localhost:8888/");
		
		 driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		  
		  driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
		  
		  List<WebElement> orgname = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a"));
		  
		  for(int i=0; i<orgname.size();i++)
		  {
              System.out.println(orgname.get(i).getText());
		  }
	}
}
