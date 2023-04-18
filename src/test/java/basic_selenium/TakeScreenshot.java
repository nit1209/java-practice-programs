package basic_selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.protobuf.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.get("https://www.amazon.com");
		
	TakesScreenshot ts=(TakesScreenshot) d;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst = new File("C:\\Users\\NPM\\Pictures\\Camera Roll\\name.png");
	FileUtils.copyFile(src, dst);
	d.quit();
	}

}
