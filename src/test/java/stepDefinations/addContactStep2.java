package stepDefinations;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.addContactTest;

public class addContactStep2 {
	
//	WebDriver driver = new FirefoxDriver(); 

	addContactTest act = new addContactTest();
	
	@Given("user is already on login page2")
	public void user_is_already_on_login_page2() {
		act.openLoginPage2();
	    
	}

	@When("the title of page2 is {string}")
	public void the_title_of_page2_is(String string) {
	    act.getTitle2();
	}

	@Then("user enters2 {string} and {string}")
	public void user_enters2_and(String string, String string2) {
	    act.enterCreds2(string, string2);
	}

	@Then("user clicks on Login button2")
	public void user_clicks_on_login_button2() {
	    act.clickLoginBtn2();
	}

	@Given("user is now on Homepage2")
	public void user_is_now_on_homepage2() {
	   
	}

	@When("the display name2 is present {string}")
	public void the_display_name2_is_present(String string) throws InterruptedException {
	    Assert.assertTrue(act.verifyUserName());
		//act.verifyUserName();
	}

	@Then("user clicks on contacts button2 from navigation panel on left side")
	public void user_clicks_on_contacts_button2_from_navigation_panel_on_left_side() throws InterruptedException {
	   act.clickOnNewContactLink();
	}

	@Given("user is on create new Contact page2")
	public void user_is_on_create_new_contact_page2() throws InterruptedException {
	  // act.newContactPage();
	}

	@When("the flagBtn2 is displayed")
	public void the_flag_btn2_is_displayed() throws InterruptedException {
		Assert.assertTrue(act.verifyFlagBtn());
//		do {
//			driver.navigate().refresh();
//		}while (act.verifyFlagBtn() == false);
		//Assert.assertTrue(act.verifyFlagBtn());
	   // act.verifyFlagBtn();
	}
	
	@Then("user2 enters {string} and {string}")
	public void user2_enters_and(String string, String string2) throws InterruptedException {
	    act.createContact(string, string2);
	}

	@Then("user click on save btn2")
	public void user_click_on_save_btn2() throws InterruptedException {
	    act.clickSaveContact();
	}

	@Then("user quit2")
	public void user_quit2() {
	   act.closeBrowser2();
	}
	
}
