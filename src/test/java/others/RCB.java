package others;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RCB {
	@Test
	public void rcb()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 List<WebElement> totalteam1 = d.findElements(By.xpath("//div[@class='region region-content']/descendant::span[@class='team1  ']"));
		 List<WebElement> totalteam2 = d.findElements(By.xpath("//div[@class='region region-content']/descendant::span[@class='team1  ']"));
		 
		 
		 
		 
		
	}
	
	
}
