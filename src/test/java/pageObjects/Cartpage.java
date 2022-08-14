package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cartpage {

	public WebDriver driver;
	
	public Cartpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By carticon= By.xpath("//a[@class='cart-icon']");
	
	By cartproduct = By.cssSelector("h4.product-name");
	
	By Proceedtocheckout = By.xpath("//div[@class='action-block']//button[text()='PROCEED TO CHECKOUT']");

	By cartitem = By.xpath("//tbody/tr/td[2]/p");
	
	By cartTotal = By.xpath("//tbody/tr/td[5]/p");
	
	
	
	public void clickoncart()
	{
		driver.findElement(carticon).click();
	}
	public String verifycartproduct()
	{
		return driver.findElement(cartproduct).getText().split("-")[0].trim();
	}
	public void clickonproceedtocheckout()
	{
        driver.findElement(Proceedtocheckout).click();
	}
	public String getcartitem()
	{
		return driver.findElement(cartitem).getText().split("-")[0].trim();
	}
	public String getcartTotal()
	{
		return driver.findElement(cartTotal).getText();
	}
}
