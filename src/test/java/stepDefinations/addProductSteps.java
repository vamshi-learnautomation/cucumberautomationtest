package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.Pageobjectmanager;
import pageObjects.productpage;
import utilities.Testcontext;

public class addProductSteps {

	Testcontext Tc;
	Pageobjectmanager pm;
	productpage p;

	public addProductSteps(Testcontext Tc) {
		this.Tc = Tc;
	}

	@Given("user is on landing page of the application")
	public void user_is_on_landing_page_of_the_application() {

		/*
		 * // WebDriverManager.chromedriver().setup(); // Tc.driver = new
		 * ChromeDriver(); //
		 * Tc.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/"); //
		 */ }

	// @When("user select item {string} in the search box and added to cart")
	// public void user_select_item_in_the_search_box_and_added_to_cart(String
	// string) throws Exception
	// @When("user search item with shortname {string} in the search box")
	// public void user_search_item_with_shortname_in_the_search_box(String string)
	// {

	// pm= new Pageobjectmanager(Tc.driver);
	// productpage p=Tc.pageobjectmanager.getproductpage();
	@When("user search item with shortname {string} in the search box")
	public void user_search_item_with_shortname_in_the_search_box(String string) throws Exception {

		// productpage p= new productpage(Tc.driver);
		p = Tc.pageobjectmanager.getproductpage();
		p.searchproduct(string);
		Thread.sleep(3000);
		p.getproduct();
		String product = p.getproduct();
		System.out.println(product);

	}

	@When("searched item added to cart")
	public void searched_item_added_to_cart() {
		p.clickAddproduct();
	}

	//@When("increase the quantity of items added")
	//public void increase_the_quantity_of_items_added() {
		//System.out.println("Increment the quantity");
		//p.selectproductcount();
	@When("increase the {int} of items added")
	public void increase_the_of_items_added(Integer int1) {
		p.selectproductcount(int1);
	}
	
	
	/*
	 * @When("^increase the quantity of items added$") public void
	 * increase_the_quantity_of_items_added(int quantity) {
	 * System.out.println("Increment the quantity"); p.selectproductcount(quantity);
	 * }
	 */

}
