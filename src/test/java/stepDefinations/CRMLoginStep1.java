package stepDefinations;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CRMLoginPage;

public class CRMLoginStep1 {
	
	CRMLoginPage lp = new CRMLoginPage();
	
	@Given("user is already on Login Page")
	public void user_is_already_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		lp.openLoginPage();
		
	}

	@When("title of the page is {string}")
	public void title_of_the_page_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
		lp.getTitle();
	}

	@Then("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	 lp.enterCreds(string, string2);   // Write code here that turns the phrase above into concrete actions
	}

	@Then("user clicks on Login button")
	public void user_clicks_on_login_button() {
		lp.clickLoginBtn();	    // Write code here that turns the phrase above into concrete actions
	}


	@Then("user get error for email")
	public void user_get_error_for_email() throws InterruptedException{
		Thread.sleep(2000);
	   // Write code here that turns the phrase above into concrete actions
		String actualErr = lp.readError();
		Assert.assertEquals("Error does not match!!!!!", "Invalid login",actualErr);
	}

	@Then("user quit")
	public void user_quit() {
	  lp.closeBrowser();// Write code here that turns the phrase above into concrete actions
	}

}
