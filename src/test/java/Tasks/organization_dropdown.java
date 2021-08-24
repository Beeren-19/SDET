package Tasks;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.Webdriver_utility;

public class organization_dropdown {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("http://localhost:8888/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();

		driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		Webdriver_utility wbu=new Webdriver_utility();
		
		WebElement ele = driver.findElement(By.xpath("//select[@name='industry']"));
//		Select s=new Select(ele);
//		s.selectByIndex(6);
		wbu.select_DD(ele, 6);
		
		WebElement xyz = driver.findElement(By.xpath("//select[@name='accounttype']"));
		//Select se=new Select(xyz);
		//se.selectByValue("Customer");
		wbu.select_DD(xyz, "Customer");
		
		WebElement abc = driver.findElement(By.xpath("//select[@name='rating']"));
//		Select sel=new Select(abc);
//		sel.selectByVisibleText("Active");
		wbu.select_DD("Active", abc);
		
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		Thread.sleep(2000);

		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh.size());
		
		ArrayList<String> l=new ArrayList<String>(allwh);
		String wh = l.get(1);
		driver.switchTo().window(wh);
	
		driver.findElement(By.xpath("//a[.='TYSS8']")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(1000);
		String text = a.getText();
		System.out.println(text);
		Thread.sleep(1000);
		a.accept();

	}
}
