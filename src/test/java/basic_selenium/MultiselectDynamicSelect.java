package basic_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiselectDynamicSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoqa.com/select-menu");
		
		WebElement e = d.findElement(By.xpath("(//div[contains(text(),'Select')])[7]"));
		Actions a = new Actions(d);
		a.moveToElement(e).click().perform();
		
		WebElement ops = d.findElement(By.xpath("//div[@class=' css-26l3qy-menu']"));
		
		
		
		
		
	}

}
