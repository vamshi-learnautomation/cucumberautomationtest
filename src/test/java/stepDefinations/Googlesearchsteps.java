package stepDefinations;

import io.cucumber.java.en.*;
import utilities.Configreader;

public class Googlesearchsteps {
	
	Configreader cr=new Configreader();

	@Given("user is on the googlepage")
	public void user_is_on_the_googlepage() throws Exception {
	    
		System.out.println("User is on google search page");
		String browser=cr.get_browser();
		System.out.println(browser);
	}
	@When("user clicks on the search box")
	public void user_clicks_on_the_search_box() {
		System.out.println("User clicks on search box");
	}
	
	@When("enter some search text and click on enter")
	public void enter_some_search_text_and_click_on_enter() {
		System.out.println("User enters text and clicks enter");
	}
	
	@Then("search results are displayed based on search criteria")
	public void search_results_are_displayed_based_on_search_criteria() {
		System.out.println(" search results are displayed based on  search criteria");
	}

	
}
