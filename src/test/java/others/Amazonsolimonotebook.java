package others;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonsolimonotebook {
@Test
public void amazon()
{
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.get("https://www.amazon.in/");
	d.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("solimo notebook");
	d.findElement(By.id("nav-search-submit-button")).click();
	
	List<WebElement> allcon = d.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal' and contains(.,'Solimo')]"));
	List<WebElement> price = d.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal' and contains(.,'Solimo')]/ancestor::div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']/following-sibling::div/descendant::span[@class='a-price-whole']"));
	int count = price.size();
	
	for (int i = 0; i < count; i++) {
		String brand = allcon.get(i).getText();
		String p = price.get(i).getText();
		System.out.println(brand+"\n"+"Rs: "+p+"\n");
	
	
	
	}
	
}
	
	
	
	
	
}
