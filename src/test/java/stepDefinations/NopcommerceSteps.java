package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Loginpage;
import utilities.Configreader;


public class NopcommerceSteps  {


    public WebDriver driver;
    public Loginpage lp; 
   public Configreader cr=new Configreader();

	@Given("user is on the login page")
	public void user_is_on_the_login_page() throws Exception {

	String browser=cr.get_browser();
	if(browser.equals("CHROME"))
	{
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	     lp= new Loginpage(driver);
	     driver.get(cr.get_url());
		 driver.manage().window().maximize();
	}}

	@Given("verify page title as {string}")
	public void verify_page_title_as(String string) {
		String pagetitle = driver.getTitle();
		if (pagetitle.equalsIgnoreCase(string)) {
			System.out.println("Page Title is correct");
		}
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws Exception {

		lp.set_username();
		lp.set_password();

	}

	@When("click on login button")
	public void click_on_login_button() {

		lp.clicklogin();

	}

	@Then("verify homepage is displayed")
	public void verify_homepage_is_displayed() {
		System.out.println("Home page displayed");
	}

	@Then("verify page title {string}")
	public void verify_page_title(String string) {
		String pagetitle = driver.getTitle();
		if (pagetitle.equalsIgnoreCase(string)) {
			System.out.println("Page Title is correct");
		}
	}

}
