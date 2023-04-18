package basic_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TryAllinONE {

	@Test
	public void m() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
/*		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.name("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		d.get("https://www.amazon.in/");
		WebElement last = d.findElement(By.xpath("//span[contains(.,'Back to')]"));
		Point p=last.getLocation();
		int lastX = p.getX();
		int lastY = p.getY();
		System.out.println(lastX+" "+lastY);
		JavascriptExecutor jse=(JavascriptExecutor)d;
		jse.executeScript("window.scrollBy(0,5056)");	
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[contains(.,'Back to')]")).click();
		
		
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("gift card vo");
		Thread.sleep(1000);
		List<WebElement> sugg = d.findElements(By.xpath("//span[@class='s-heavy']/parent::div/ancestor::div[@class='left-pane-results-container']"));

		System.out.println(sugg.size());
		for (WebElement e : sugg) {
			String suggations = e.getText();
			System.out.println(suggations);
		} 
		
		Thread.sleep(1000);	*/
	d.get("https://www.pavantestingtools.com/");
	WebElement e = d.findElement(By.linkText("Online Training"));	
		e.click();
		Thread.sleep(1000);
		d.navigate().back();
		Thread.sleep(1000);
		try {
			
		} catch (StaleElementReferenceException e2) {
			e = d.findElement(By.linkText("Online Training"));
			e.click();
		}
		
		
		
		
		
	}
	
	
	
	
	
	
}
