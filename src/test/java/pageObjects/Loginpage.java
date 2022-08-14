package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	public WebDriver driver;

	By username = By.id("Email");
	By password = By.id("Password");

	By loginbutton = By.xpath("//button[contains(text(),'Log in')]");

	public Loginpage(WebDriver rdriver) {
		this.driver = rdriver;

	}

	public void set_username()

	{
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys("admin@yourstore.com");
	}

	public void set_password() {
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys("admin");
	}

	public void clicklogin() {
		driver.findElement(loginbutton).click();

	}
}
