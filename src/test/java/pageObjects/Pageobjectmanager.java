package pageObjects;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager {

	public WebDriver driver;
	public productpage productpage;
	public Cartpage cartpage;
	
	public Pageobjectmanager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public productpage getproductpage()
	{
	 productpage= new productpage(driver);
	 return productpage;
	}
	
	public Cartpage getCartpage()
	{
		cartpage = new Cartpage(driver);
		return cartpage;
	}

	
}
