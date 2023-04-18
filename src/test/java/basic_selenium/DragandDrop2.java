package basic_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop2 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



		d.get("http://www.dhtmlgoodies.com/scripts/arrange-table-rows/demo.html");
		WebElement src = d.findElement(By.xpath("//tr[@id='row1']/td[contains(text(),'since 1973')]"));
		WebElement dst = d.findElement(By.xpath("(//td[normalize-space()='Top goal scorer injured in yesterdays match'])[1]"));

		Point	p=dst.getLocation();
		int xco=p.getX();
		int yco = p.getY();
		System.out.println(xco+"  "+yco);
		Actions b = new Actions(d);
		b.dragAndDropBy(src, 69, 206).perform();
		Thread.sleep(2000);
		d.quit();
	}

}
