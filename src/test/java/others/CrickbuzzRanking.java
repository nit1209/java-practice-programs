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

public class CrickbuzzRanking {
@Test
public void ranks()
{
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	d.get("https://www.cricbuzz.com/cricket-stats/icc-rankings/men/batting");
	List<WebElement> allnames = d.findElements(By.xpath("//a[@class='text-hvr-underline text-bold cb-font-16']"));
	List<String> pnames = new ArrayList<String>();
	
	for(WebElement e:allnames)
	{
		String n = e.getText();
		pnames.add(n);
	
	}
	int count=1;
	for(int i=0; i<pnames.size(); i++)
	{count++;
		 WebElement rank = d.findElement(By.xpath("//a[.='"+pnames.get(i)+"']/parent::div/following::div[@class='cb-col cb-col-17 cb-rank-tbl pull-right']"));
		if(count<=10)
		{
		System.out.println(pnames.get(i)+" <--his rank is-->"+rank.getText());
		
		}
		
	}	
	
	/*String rank = d.findElement(By.xpath("//a[.='Rishabh Pant']/parent::div/following::div[@class='cb-col cb-col-17 cb-rank-tbl pull-right']")).getText();
	System.out.println(rank);*/

}
}
