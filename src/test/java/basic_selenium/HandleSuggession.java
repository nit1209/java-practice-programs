package basic_selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSuggession {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.amazon.in/");
		
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		List<WebElement> sugg = d.findElements(By.xpath("//div[@class='left-pane-results-container']"));
		Thread.sleep(2000);
//		for(WebElement e:sugg)
//		{
//			System.out.println(e.getText());
//		}
		d.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(1000);
		List<WebElement> res = d.findElements(By.xpath("//span[@data-component-type='s-search-results']"));
		
		for(WebElement e:res)
		{
			System.out.println(e.getText());
		}
		
		
		
		
		
		
		d.quit();
	}

}
