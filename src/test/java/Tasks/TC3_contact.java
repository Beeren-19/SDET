package Tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_contact {
   public static void main(String[] args) {
	
	   WebDriver driver=new ChromeDriver();
	   driver.get("http://localhost:8888/");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		  
		  driver.findElement(By.xpath("//a[.='Contacts']")).click();
		  driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("rajendra");
		  JavascriptExecutor jse=(JavascriptExecutor)driver;
		  for(int i=0;i<=3;i++){

		jse.executeScript("window.scrollBy(0,1000)");
		  }
		  WebElement ele = driver.findElement(By.xpath("//input[@name='imagename']"));
		  ele.sendKeys("C:\\Users\\Dell\\Desktop\\GoToWebinar 015.png");
		  
}
}
