package qsp1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class Readpropertyfile {
public static void main(String[] args) throws IOException {
	
	//open connection to properties file
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Commondata.properties");
	
	//create the object to properties class
	Properties pobj = new Properties();
	
	//with the reference load all the things 
	pobj.load(fis);
	
	
	//storing in the string
	String UN=pobj.getProperty("username");
	String PWD=pobj.getProperty("password");
	
	System.out.println(UN+" "+PWD);
	
	int i = Integer.MAX_VALUE;
System.out.println(i);
	
}
}
