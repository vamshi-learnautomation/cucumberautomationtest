package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class LoginSteps {
	
	
	@Given("user is on the new login page")
	public void user_is_on_the_new_login_page() {
	    
		System.out.println("User is on the login Page");
		
	}
	@When("user enters Nusername and Npassword")
	public void user_enters_nusername_and_npassword(DataTable data) {
	   
		     List<List<String>> data1 = data.asLists();
		     int rows=data1.size();
		     
		     
		     System.out.println(rows);
		     
		     for(int i=0;i<rows;i++)
		     { 
		    	 
		       for(int j=0;j<i;j++)
		       {
		    	   	       	    			    	 
		    		 String username=data1.get(i).get(j);
				     String password=data1.get(i).get(j+1);
				     System.out.println(username+ " "+password);
				     
		    	 }
		    	
		    	}
		     //String username=data1.get(0).get(0);
		     //String password=data1.get(0).get(1);
		     //System.out.println(username+ " "+password);
	}
	@When("click on logins button")
	public void click_on_logins_button() {
	    System.out.println("User clicked on login button");
	}
	@Then("verify homepages is displayed")
	public void verify_homepages_is_displayed() {
	   System.out.println("User verifies home page");
	}
	@Given("user is on the Home page")
	public void user_is_on_the_home_page() {
	    System.out.println("User is on the Home Page");
	}
	@When("user Searches for some product")
	public void user_searches_for_some_product() {
		System.out.println("User searches for some product");
	}
	@When("click on Search button")
	public void click_on_search_button() {
		System.out.println("User clicked on search button");
	}
	@Then("verify Search results are displayed")
	public void verify_search_results_are_displayed() {
		System.out.println("search results are displayed");
	}
}
