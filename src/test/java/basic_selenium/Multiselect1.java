package basic_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiselect1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoqa.com/select-menu");
		

		Select s = new Select(d.findElement(By.id("cars")));

		//create list for option avialable in select menu
		System.out.println("options present in the multiselect");
		List<WebElement> lis = s.getOptions();
		for (WebElement e:lis)
		{
			System.out.println(e.getText());
		}	
		
		//select multiple options
		s.selectByIndex(2);
		s.selectByVisibleText("Saab");
		
		s.selectByVisibleText("Audi");
		
		//save selected options in other list
		System.out.println("");
		System.out.println("SELECTED OPTIONS :-");
		List<WebElement> sop = s.getAllSelectedOptions();
		for(WebElement se:sop)
		{
			System.out.println(se.getText());
		}
		
		//use remove() to remove options in first list
		lis.removeAll(sop);
		
		//after removing print the first list values which are the unselected
		System.out.println("");
		System.out.println("UNSELECTED VALUES ARE:-");
		for(WebElement e:lis)
		{
			System.out.println(e.getText());
		}
		
		s.deselectAll();
		
		d.quit();
	}

}
