package mock;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_grid_local {

	String execution="remote";
	WebDriver d=null;
	@Test
	public void m1() throws MalformedURLException, InterruptedException
	{
		if(execution.equals("remote"))
		{
		URL url=new URL("http://192.168.56.1:1111/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		
		 d=new RemoteWebDriver(url, cap);
		}
		else if(execution.equals("local"))
		{
			WebDriverManager.chromedriver().setup();
			d=new ChromeDriver();
			
		}
	
		d.manage().window().maximize();
			d.get("https://www.icc-cricket.com/rankings/mens/player-rankings/t20i");
			Thread.sleep(1000);
			d.quit();
			
			
			
		
		
		
	}}

