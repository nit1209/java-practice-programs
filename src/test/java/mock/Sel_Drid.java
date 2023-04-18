package mock;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Sel_Drid {
	@Test
	public void m1() throws MalformedURLException, InterruptedException
	{
		URL url = new URL("http://192.168.56.1:1111/wd/hub");
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		WebDriver d=new RemoteWebDriver(url, cap);
		
		d.manage().window().maximize();
		d.get("https://www.icc-cricket.com/rankings/mens/player-rankings/t20i");
		Thread.sleep(1000);
		d.quit();
		
		
		
	}



	
	
	
}
