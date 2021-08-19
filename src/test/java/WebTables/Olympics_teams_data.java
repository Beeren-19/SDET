package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Olympics_teams_data {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://olympics.com/tokyo-2020/olympic-games/en/results/all-sports/medal-standings.htm");
		
		List<WebElement> eles = driver.findElements(By.xpath("//table[@id='medal-standing-table']/tbody/tr[*]/td[2]"));
		
		int count = eles.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			System.out.println(eles.get(i).getText());
		}
	}
}
