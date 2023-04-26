package others;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
		String from="Patna";
		String to = "Kalaburagi";
		d.findElement(By.id("fromCity")).sendKeys(from);
		d.findElement(By.xpath("//div[@class='makeFlex hrtlCenter']/descendant::p[contains(.,'"+from+", India')]")).click();
		d.findElement(By.id("toCity")).sendKeys(to);
		d.findElement(By.xpath("//div[@class='makeFlex hrtlCenter']/descendant::p[contains(.,'"+to+", India')]")).click();

		//date config
		Date date = new Date();
		SimpleDateFormat DDformatter = new SimpleDateFormat("dd");
		String returnDate="22 July 2023";
		String[] s = returnDate.split(" ");
		String mon = s[1]+s[2];
		System.out.println(mon);

		String dd = DDformatter.format(date);

		d.findElement(By.xpath("//div[@class='DayPicker-Caption']/div[.='April 2023']/ancestor::div[@class='DayPicker-Month']/descendant::div[@class='dateInnerCell']/p[.='"+dd+"']")).click();
		d.findElement(By.xpath("//span[.='Return']")).click();
		while(true)
		{
		
			WebElement monSel = d.findElement(By.xpath("//div[@class='DayPicker-Caption']/div"));
		
			System.out.println(monSel.getText());
			if(monSel.getText().equals(mon))
			{
				d.findElement(By.xpath("//p[text()='"+s[0]+"']")).click();
				break;
			}
			else
				d.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		
		}
	}
}
