package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSE_disable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/NPM/Desktop/disabled.html");
		JavascriptExecutor j=(JavascriptExecutor) d;
		j.executeScript("document.getElementById('d2').value='kmh'");
		j.executeScript("document.getElementById('d1').value='kmh'");
		j.executeScript("document.getElementById('d3').click()");
		
		
	}

}
