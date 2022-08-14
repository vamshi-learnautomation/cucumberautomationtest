package utilities;

import org.openqa.selenium.WebDriver;


import pageObjects.Pageobjectmanager;




public class Testcontext {

	public WebDriver driver;
	public Pageobjectmanager pageobjectmanager;
	public TestBase testbase;
	
	
	public Testcontext() throws Exception
	{
		testbase = new TestBase();
		pageobjectmanager=new Pageobjectmanager(testbase.WebdriverManager());
		
	}
	
	
}
