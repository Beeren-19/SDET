package Tasks;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.ReaddatafromJSON;

public class Jsonassignment extends ReaddatafromJSON {

	public static void main(String[] args) throws IOException, ParseException {
		
		ReaddatafromJSON rdj=new ReaddatafromJSON();
		
		WebDriver driver=new ChromeDriver();
		driver.get(rdj.readdata_JSON("url"));
		
		String UN = rdj.readdata_JSON("UN");
		String PWD = rdj.readdata_JSON("PWD");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(UN);
		  driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PWD);
		  driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	}
}
