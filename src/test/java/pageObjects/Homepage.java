package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Elementwaits;
public class Homepage {

	public WebDriver driver;
public Elementwaits wait= new Elementwaits(driver);
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		wait.Waitforelement(this.driver, 5);
	}
	
	By Saleslink = By.xpath("//i[@class='nav-icon fas fa-shopping-cart']");
	By Orders= By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[3]/ul/li[1]/a/p");
	By Searchlink = By.id("search-orders");
	
	public boolean verifySearch()
	{
		return driver.findElement(Searchlink).isDisplayed();
	}
	public void clickonSales()
	{
		driver.findElement(Saleslink).click();
	}
	public void clickOrders()
	{
		driver.findElement(Orders).click();
	}
	
}
