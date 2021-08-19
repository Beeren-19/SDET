package interview_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.Webdriver_utility;

public class Amazonapp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?ref=icp_country_us");
		
		driver.manage().window().maximize();
		Webdriver_utility wdu=new Webdriver_utility();
		wdu.impicitwait(driver);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles under 15000");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Price: High to Low']")).click();
		Thread.sleep(1000);
		WebElement price = driver.findElement(By.xpath("//span[@cel_widget_id='MAIN-SEARCH_RESULTS-0']/..//span[text()='14,999']"));
	
		 String value = price.getText();
		 System.out.println(value);
		 
//		 StringBuffer strbuf=new StringBuffer(value);
//		 StringBuffer str = strbuf.deleteCharAt(value.length()-4);
//		 System.out.println(str);
//		 
//		 String st=new String(str);
		 
		String[] arr = value.split(",");
		String str = arr[0];
		String str1 = arr[1];
		String con = str+str1;
		System.out.println(con);
		
		 int ip = Integer.parseInt(con);
		 if(ip<15000)
		 {
			 System.out.println("test case pass");
		 }
		 else
		 {
			 System.out.println("test case fail");
		 }
	}
}
