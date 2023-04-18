package others;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip_OneWay {
@Test
public void m1()
{
	ChromeOptions op =new ChromeOptions();
	op.addArguments("--disable-notifications");
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver(op);
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.get("https://www.makemytrip.com/");
	String from="Bengaluru";
	String to = "Kalaburagi";
	d.findElement(By.id("fromCity")).sendKeys(from);
	d.findElement(By.xpath("//div[@class='makeFlex hrtlCenter']/descendant::p[contains(.,'"+from+", India')]")).click();
	d.findElement(By.id("toCity")).sendKeys(to);
	d.findElement(By.xpath("//div[@class='makeFlex hrtlCenter']/descendant::p[contains(.,'"+to+", India')]")).click();
	
	
	
}
}
