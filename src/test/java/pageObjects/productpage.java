package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productpage {

	public WebDriver driver;
	public productpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	private By search=By.xpath("//input[@type='search']");
	private By product= By.cssSelector("h4.product-name");
	private By Addproductlink = By.xpath("//button[text()='ADD TO CART']");
	private By productselect = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/a[2]");
	
	public void searchproduct(String string)
	{
		  driver.findElement(search).sendKeys(string);
	}
	public String getproduct()
	{
		 
		return driver.findElement(product).getText().split("-")[0].trim();
	}
	public void clickAddproduct()
	{
		driver.findElement(Addproductlink).click();
	}
	public void selectproductcount(int quantity)
	{
	  for(int i=1; i< quantity; i++)
	  {
		driver.findElement(productselect).click();
	}}
}
