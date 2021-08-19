package multiplewindows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class organization_windows {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("http://localhost:8888/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();

		driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();

		driver.findElement(By.xpath("//img[@title='Select']")).click();
		Thread.sleep(2000);

		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh.size());

		Iterator<String> it = allwh.iterator();

		while(it.hasNext())
		{
			String we = it.next();
			String title = driver.switchTo().window(we).getTitle();
			System.out.println(title);
			if(title.contains("Accounts&action"))
			{
				
				break;

			}
			
		}
		driver.findElement(By.xpath("//a[.='TYSS8']")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(1000);
		String text = a.getText();
		System.out.println(text);
		Thread.sleep(1000);
		a.accept();
	}
}
