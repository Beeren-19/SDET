package dataProvider;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.generic.ReaddatafromExcel;

public class Dataprovider_Excel extends ReaddatafromExcel {

	@Test(dataProvider="getvalues")
	public void getdata(String s1, String s2) throws InterruptedException
	{

		 Date dateobj=new Date();
		   System.out.println(dateobj);
			 
			 //  Fri Aug 06 08:32:36 IST 2021 
			 //   0   1   2     3     4    5
			   
			//  Fri Aug 06 2021
			   
			   String currentdate = dateobj.toString();
			   
			   String[] arr = currentdate.split(" ");
			   
			   String day = arr[0];
			   String month = arr[1];
			   String todaysdate = arr[2];
			   String year = arr[5];
			   
			   String MMT_Date = day+" "+month+" "+todaysdate+" "+year;
			   
			   System.out.println(MMT_Date);
			
			   WebDriver driver=new ChromeDriver();
			   driver.get("https://www.makemytrip.com/");
			   
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   
			   Actions act=new Actions(driver);
			   act.moveByOffset(10, 10).click().perform();
			   
			   driver.findElement(By.id("fromCity")).sendKeys(s1);
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//div[text()='"+s1+"']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.id("toCity")).sendKeys(s2);
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//div[text()='"+s2+"']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//div[@aria-label='"+MMT_Date+"']")).click();
			   
			   driver.close();
			   
		//System.out.println(s1+" "+s2);
	}
	
	@DataProvider
	public Object[][] getvalues() throws EncryptedDocumentException, IOException
	{
		int lastrow=getlastrow();
		Object[][] arr=new Object[lastrow+1][2];
		for(int i=0;i<lastrow+1;i++)
		{
			arr[i][0] =readdata_excel("Sheet2", i, 0);
			arr[i][1] =readdata_excel("Sheet2", i, 1);
		}
		return arr;
	}
}
