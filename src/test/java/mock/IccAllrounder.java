package mock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IccAllrounder {
	@Test
	public void icc()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.icc-cricket.com/rankings/mens/player-rankings/t20i");
	
		List<WebElement> pdata = d.findElements(By.xpath("//div[@class='rankings-block__container ']/parent::div/following-sibling::div/descendant::h4[contains(.,'T20I All-Rounder')]/ancestor::div/following-sibling::table/descendant::td[@class='table-body__cell name']"));
		List<WebElement> prank = d.findElements(By.xpath("//div[@class='rankings-block__container ']/parent::div/following-sibling::div/descendant::h4[contains(.,'T20I All-Rounder')]/ancestor::div/following-sibling::table/descendant::td[@class='table-body__cell u-text-right rating']"));
		List<String> playername= new ArrayList<String>();
		List<String> playerranking= new ArrayList<String>();

		String top_pname=d.findElement(By.xpath("//div[@class='rankings-block__container ']/parent::div/following-sibling::div/descendant::h4[contains(.,'T20I All-Rounder')]/parent::div/following-sibling::a/descendant::div[@class='rankings-block__banner--name']")).getText();
		String top_prank = d.findElement(By.xpath("//div[@class='rankings-block__container ']/parent::div/following-sibling::div/descendant::h4[contains(.,'T20I All-Rounder')]/parent::div/following-sibling::a/descendant::div[@class='rankings-block__banner--rating']")).getText();


		for(WebElement e:pdata)
		{
			String data = e.getText();
			playername.add(data);
		}

		for(WebElement e:prank)
		{
			String rank = e.getText();
			playerranking.add(rank);
		}	

		int count = playername.size(),c=1;
		System.out.println(c+" "+top_pname+" "+top_prank);
		for(int i=0; i<count; i++)
		{c++;
		//d.findElement(By.xpath("\"//div[@class='rankings-block__container ']/parent::div/following-sibling::div/descendant::h4[contains(.,'T20I All-Rounder')]/ancestor::div/following-sibling::table/descendant::a[.='"+playername.get(i)+"']"));
		System.out.println(c+" "+playername.get(i)+" "+playerranking.get(i));
		}	









	}
}
