package com.grooming;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Selenium_grid {

	public RemoteWebDriver driver;
	
	@Test
	
	public void remoteExecution() throws MalformedURLException
	{
		URL url = new URL("http://192.168.202.1:4444/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities().chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		driver=new RemoteWebDriver(url, cap);
		driver.get("https://gmail.com");
	}
}
