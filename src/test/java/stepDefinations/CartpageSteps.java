package stepDefinations;

import io.cucumber.java.en.Then;
import pageObjects.Cartpage;
import utilities.Testcontext;

public class CartpageSteps {

	Testcontext Tc;
	Cartpage cp;

	public CartpageSteps(Testcontext Tc) {
		this.Tc = Tc;
	}

	@Then("item {string} added are displayed in the cart")
	public void item_added_are_displayed_in_the_cart(String string) throws Exception {
	    
		cp=Tc.pageobjectmanager.getCartpage();
		//cp= pm.getCartpage();
		cp.clickoncart();
		System.out.println("Item added to cart");
		String cartProduct = cp.verifycartproduct();
		Thread.sleep(2000);
		System.out.println(cartProduct);
        cp.clickonproceedtocheckout();
		Thread.sleep(2000);
		String cartpageitem = cp.getcartitem();
		System.out.println(cartpageitem);

		}
	@Then("total cart value displayed in the cart")
	public void total_cart_value_displayed_in_the_cart() {
	    
	String total=cp.getcartTotal();
	System.out.println(total);
	}



}
