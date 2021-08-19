package Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("headphones");
		Thread.sleep(2000);
		List<WebElement> eles = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
		String text;
		for (int i = 0; i < eles.size(); i++)
		{
			String	option=eles.get(i).getText();
			System.out.println(option);
			if(option.contains("headphones bluetooth"))
			{
				System.out.println("bluetooth prsent");
				break;
			}
			else{
				System.out.println("Not present");
			}
		}

		//	for(WebElement we:eles)
		//	{
		//		String text = we.getText();
		//		System.out.println(text);
		//	}
		//	if(text.contains("headphones bluetooth"))
		//	{
		//		System.out.println("option is present");
		//	}
		//	else
		//	{
		//		System.out.println("option is not present");
		//	}
	}
}
