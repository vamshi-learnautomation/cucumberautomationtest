package stepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pageObjects.Homepage;

public class HomepageSteps {

public WebDriver driver;
 
Homepage hp= new Homepage(driver);


@When("click on sales menu")
public void click_on_sales_menu() throws Exception {
    
	
	hp.clickonSales();
}
@When("click on Orders")
public void click_on_orders() throws Exception {
 
	hp.clickOrders();
	
}
@When("verify search orders button displayed")
public void verify_search_orders_button_displayed()
{
   hp.verifySearch();
}

}
