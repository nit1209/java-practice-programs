package basic_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_AlertHandle {

	public static void main(String[] args) throws Throwable {
		//with the no need to worry about the updated browsers
		WebDriverManager.chromedriver().setup();
		
		//initializing the driver object to work with the browser
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		
		//---to handle the drop downs we use the select class----//
		//**after inspecting the element ,if the tha is "select" we can go for the select class
		//** we dont perform any click or sendkeys is select class.
		
		//1.store the drop down element in the webelement variable first 
		WebElement op=d.findElement(By.id("dropdown-class-example"));
		 
		Select	sel=new Select(op);
		//we can also directly pass the element to the select constructor as below
		//	Select	sel=new Select(d.findElement(By.id("dropdown-class-example")));
		sel.selectByVisibleText("Option2");
		
		
		
		
		//HANDLE THE ALERTS ACCEPT AND CANCLE
		//	d.findElement(By.xpath("//input[@value='Alert']")).click();
		d.findElement(By.id("confirmbtn")).click();
		Alert alt = d.switchTo().alert();
		System.out.println(alt.getText());
		String actual = alt.getText();
		alt.accept();		
	
		d.findElement(By.id("confirmbtn")).click();
		alt.dismiss();
		
		//alert validation
		if(actual.equals("Hello , Are you sure you want to confirm?"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fails");
		}
		
		
		d.quit();
	}

}
