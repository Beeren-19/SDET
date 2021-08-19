package Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc_dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		Thread.sleep(2000);
		List<WebElement> eles = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
				for(int i=0;i<eles.size();i++)
				{
					String options = eles.get(i).getText();
					Thread.sleep(2000);
					System.out.println(options);
					eles.get(2).click();
				
				//driver.findElement(By.xpath("//li[text()='Invest']")).click();
				
				driver.findElement(By.xpath("//a[text()='Select Product']")).click();
				Thread.sleep(200);
				List<WebElement> xyz = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
				for(int j=0;j<xyz.size();j++)
				{
					String text = xyz.get(j).getText();
					Thread.sleep(2000);
					System.out.println(text);
					xyz.get(2).click();
					
				}
				}	
	}
}
