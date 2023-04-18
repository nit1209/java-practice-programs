package others;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Olympics {

	
	
	@Test
	public void oly()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		 List<WebElement> countries = driver.findElements(By.xpath("//span[@data-cy='country-name']"));
		 ArrayList<String> countryList = new ArrayList<String>();
		 for(int i=0; i<countries.size();i++)
		 {
			 String str = countries.get(i).getText();
			 countryList.add(str);
		 }
		 int row = 1;char val = '"';
//		 List<WebElements> goldmedals = driver.findElements(By.xpath("//span[.='Argentina']/ancestor::div[@data-row-id='country-medal-row-1']/following-sibling::div[@title='Gold']"));
		 for(int i=0; i<countryList.size();i++)
		 {
			 String goldmedals = driver.findElement(By.xpath("//span[.="+val+""+countryList.get(i)+""+val+"]/ancestor::div[@data-row-id='country-medal-row-"+row+"']/following-sibling::div[@title='Gold']")).getText();
			 String silvermedals = driver.findElement(By.xpath("//span[.="+val+""+countryList.get(i)+""+val+"]/ancestor::div[@data-row-id='country-medal-row-"+row+"']/following-sibling::div[@title='Silver']")).getText();
			 String bronzemedals = driver.findElement(By.xpath("//span[.="+val+""+countryList.get(i)+""+val+"]/ancestor::div[@data-row-id='country-medal-row-"+row+"']/following-sibling::div[@title='Bronze']")).getText();
			 
			 System.out.println("country : "+countryList.get(i)+" "+"gold : "+goldmedals+" "+"silver : "+silvermedals+" "+"bromze : "+bronzemedals);
			 row++;
		 }
	}
	
	
	//span[.=""India""]/ancestor::div[@data-row-id='country-medal-row-"+row+"']/following-sibling::div[@title='Gold']")).getText();
}
