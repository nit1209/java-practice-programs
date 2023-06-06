package basic_selenium;

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
		
		String expt="qavalidation";
		d.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		Set<String> winid = d.getWindowHandles();
		for (String ewid : winid) {
			String title=	d.switchTo().window(ewid).getTitle();
			if(title.contains(expt))
			{
				System.out.println("im on right window");
				break;
			}
		}
		
		d.close();
		Thread.sleep(1000);
	}
}
