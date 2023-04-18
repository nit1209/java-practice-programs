package basic_selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindowpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://skpatro.github.io/demo/links/");
		
		String req="about-me";
		String parent = d.getWindowHandle();
		
		d.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		Set<String> winid = d.getWindowHandles();
		Iterator<String> it = winid.iterator();
		while(it.hasNext())
		{
			String s=it.next();
			d.switchTo().window(s);
			if(s.contains(req))
			{
				break;	
			}
		}
		Thread.sleep(1000);
		d.close();
		Thread.sleep(1000);
		d.switchTo().window(parent);
		Thread.sleep(1000);
		d.close();
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
