package multiplewindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_windows {

public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.naukri.com");
	
	Set<String> allwh = driver.getWindowHandles();
	
	Iterator<String> it = allwh.iterator();
	
	while(it.hasNext())
	{
		String window = it.next();
		String title = driver.switchTo().window(window).getTitle();
		if(title.contains("Tech Mahindra"))
		{
			driver.close();
			break;
			
		}
		
	}
	
}
}
