package stepdefinition;

import Browser.Browser;
import Pages.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucumber1 {
	
	@Given("User on the webpage {string}.")
	public void user_on_the_webpage(String string) {
		try {
			Browser.openBrowser();
			Browser.openURL(string);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	 
	}

	@And("User passes the {string}")
	public void user_passes_the(String string) throws InterruptedException {
		try {
			Page.enterTheUsername(string);
            Thread.sleep(1000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		  
	}

	@And("User enters the {string}")
	public void user_enters_the(String string)  throws InterruptedException {
		try {
			Page.enterThePassword(string);
            Thread.sleep(1000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	    
	}

	@When("Click on the LoginButton.")
	public void click_on_the_login_button()  throws InterruptedException {
		try {
			Page.clickTheLoginButton();
            Thread.sleep(1000);
		}
		catch (Exception e) {
			e.printStackTrace();
		} 
	   
	}

	@Then("User is navigate to product backlog page.")
	public void user_is_navigate_to_product_backlog_page()  throws InterruptedException {
		try {
			Page.navigateTheProduct();
            Thread.sleep(1000);
		}
		catch (Exception e) {
			e.printStackTrace();
		} 
		Browser.browserClose();
	}

}
