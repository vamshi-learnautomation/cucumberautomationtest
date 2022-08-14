package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Elementwaits {

	public WebDriver driver;
	
public Elementwaits(WebDriver driver)
{
	this.driver=driver;
}
	
	public void Waitforelement(WebDriver driver, long time)
		{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
	}
	
		
}
