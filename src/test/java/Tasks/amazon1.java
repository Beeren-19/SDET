package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon1 {
   public static void main(String[] args) {
	
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.com/");
	   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
	   driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
}
}
