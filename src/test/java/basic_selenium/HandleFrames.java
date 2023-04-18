package basic_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		//initializing the driver object to work with the browser
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.get("https://www.snapdeal.com/");
		
		Actions m = new Actions(d);
		m.moveToElement(d.findElement(By.className("accountInner"))).click().perform();
		d.findElement(By.className("newUserRegister")).click();
//		WebElement frmele = d.findElement(By.xpath("//div[@class='userAuth-card']"));
//		d.switchTo().frame(frmele);
		
		//look for iframe tag and get the id name and put it in frame method
		d.switchTo().frame("loginIframe");

		d.findElement(By.name("username")).sendKeys("1234567890");
		Thread.sleep(1000);
		d.quit();
	
	
	
	
	
	
	}

}
