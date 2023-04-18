package basic_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws Throwable {


		
			
			//manage the browser driver (insted of chromedriver.exe we use this maven dependency)
			//with the no need to worry about the updated browsers
			WebDriverManager.chromedriver().setup();
			
			//initializing the driver object to work with the browser
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			d.get("https://demo.actitime.com/login.do");
			
			
			
			//id ---1
			d.findElement(By.id("username")).sendKeys("admin");
			
			//name--2
			d.findElement(By.name("pwd")).sendKeys("manager");
			
			
			//class name--not much of recommended
			d.findElement(By.className("initial")).click();
			
			//link text --4
//			d.findElement(By.linkText("Forgot your password?")).click();
			
			//partial link text --not recommended to use
//			d.findElement(By.partialLinkText("Forgot")).click();
			
			//xpath	--3
			d.findElement(By.xpath("//input[@id='SubmitTTButton']")).click();
			
			Thread.sleep(2000);
			//css selector --3
			//for id---#idname
			//for class---.classname
			d.findElement(By.cssSelector("#logoutLink")).click();
			

	}

}
