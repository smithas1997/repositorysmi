package stepdefinition;

import Browser.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Cucumber {


@Given("open the browser.")
public void open_the_browser() {
	try {
		Browser.openBrowser();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
    
}

@When("Enter the {string}.")
public void enter_the(String string) {
	try {
		Browser.openURL(string);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
   
}

@Then("Page is displayed.")
public void page_is_displayed() throws InterruptedException {
	try {
		String actualTitle = Browser.getTitle();
		Assert.assertEquals("Swag Labs", actualTitle);
	}
	catch (AssertionError e) {
		e.printStackTrace();
	}
	Browser.browserClose();
}
	
}
