package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickall_checkbox {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://localhost:8888/");
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		  
		  driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
		 
		  List<WebElement> chbox = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[1]/input"));
		  int count=0;
		  System.out.println(chbox.size());
		  for(int i=3;i<chbox.size()+2;i++)
		  {
			  driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+i+"]/td[1]/input")).click();
			  count++;
		  }
		  System.out.println(count);
	}
}
