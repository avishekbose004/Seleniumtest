package StepDefination;

import java.awt.Desktop;
import java.net.URI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	@Given("^The user is in login page$")
	public void the_user_is_in_login_page() {
	    System.out.println("Home page");
	    try {
	    	  Desktop desktop = java.awt.Desktop.getDesktop();
	    	  URI oURL = new URI("http://www.google.com");
	    	  desktop.browse(oURL);
	    	} catch (Exception e) {
	    	  e.printStackTrace();
	    	}
	    throw new io.cucumber.java.PendingException();
	}

	@When("^User clicks on submit button$")
	public void user_clicks_on_submit_button() {
	    System.out.println("Home page2");
	    throw new io.cucumber.java.PendingException();
	}

	@Then("^User is able to login$")
	public void user_is_able_to_login() {
	    System.out.println("Home page3");
	    throw new io.cucumber.java.PendingException();
	}


}
