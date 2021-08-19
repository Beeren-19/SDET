package Tasks;

import java.io.FileNotFoundException;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.ReaddatafromXML;

public class XMLassignment extends ReaddatafromXML {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		
	
		
		WebDriver driver=new ChromeDriver();
		
		ReaddatafromXML rdX=new ReaddatafromXML();
		driver.get(rdX.readdata_XML("//commondata/url"));
		
		 driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(rdX.readdata_XML("//commondata/UN"));
		  driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(rdX.readdata_XML("//commondata/PWD"));
		  driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		  
		  driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
		
		
				
	}
}

