package basic_selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.protobuf.Internal.ListAdapter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	@Test
	public void brkn() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.amazon.in/");
		
		List<WebElement> alllinks = d.findElements(By.xpath("//a"));
		List<String> reallinks = new ArrayList();		
		List<String> brokenlinks=new ArrayList();
		
		System.out.println("Total no. of links in this site "+alllinks.size());
		System.out.println("");
		
		for(WebElement e:alllinks)
		{
			
			String links = e.getAttribute("href");
			if(links!=null)
			{
				if(links.contains("http")|| links.contains("https"))
				{
					reallinks.add(links);
				}
				else
				{
					
					brokenlinks.add("LINKS WITHOUT HTTP PROTOCALL:--"+links);
					
				}
				
			}
			else
			{
				brokenlinks.add("NULL LINKS:-"+links);
			}
			
		}
		System.out.println("links with https&http:-"+reallinks.size());
		
		System.out.println(reallinks);
		System.out.println("\n");
		System.out.println("Brokenlinks are:- "+brokenlinks.size());
		System.out.println(brokenlinks);
		
		
		for(String link:reallinks) {
	try	{
			URL url=new URL(link);
			URLConnection urlcon = url.openConnection();
			HttpURLConnection httpcon=(HttpURLConnection) urlcon;
			int statuscode = httpcon.getResponseCode();
			String statusmsg = httpcon.getResponseMessage();
			
			if(statuscode>=400)
			{
				brokenlinks.add(link+"status code:-"+statuscode+"--> Response msg"+statusmsg);
			}
	}
	catch(Exception e)
	{
		brokenlinks.add(link+"--> not connected to server");
		
	}
			
			
			
		}
		
		
		System.out.println(brokenlinks);
	}

}
