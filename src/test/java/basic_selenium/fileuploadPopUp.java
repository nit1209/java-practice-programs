package basic_selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.core.sym.Name;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileuploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//with the no need to worry about the updated browsers
				WebDriverManager.chromedriver().setup();
				
				//initializing the driver object to work with the browser
				WebDriver d=new ChromeDriver();
				d.manage().window().maximize();
				d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				d.get("https://html.com/input-type-file/");
				
				//inspect the upload button the type attribute should be equal to file then we can say its file upload popup
				File f=new File(".\\src\\test\\resources\\single-select.html");
				String fpath = f.getAbsolutePath();
				d.findElement(By.name("fileupload")).sendKeys(fpath);
				Thread.sleep(2000);
				d.quit();
	}

}
