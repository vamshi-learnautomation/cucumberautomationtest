package utilities;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;
	FileReader file;
	Properties prop;
	
	public WebDriver WebdriverManager() throws Exception
	{
		file=new FileReader("C:\\Users\\Namaswi V\\eclipse-workspace\\cucumberautomation\\src\\test\\java\\properties\\config.properties");
     	prop= new Properties();
     	prop.load(file);
     	String browser= prop.getProperty("browser");
     	String url=prop.getProperty("url");
     	if(driver==null)
     	{
     	if(browser.equalsIgnoreCase("Chrome"))
     	{
     	 	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
     	}
     	}
     	return driver;
	}
}
