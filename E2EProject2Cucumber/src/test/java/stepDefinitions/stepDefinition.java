package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class stepDefinition extends base{
	
	@Given("Initialize the browser with chrome driver")
	public void initialize_the_browser_with_chrome_driver() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}

	@Given("navigate to the {string} site")
	public void navigate_to_the_site(String string) {
	    // Write code here that turns the phrase above into concrete actions
//		driver.get(prop.getProperty("url"));
		driver.get(string);
	}

	@Given("Click on Login link on home page to land on secure sign in page")
	public void click_on_Login_link_on_home_page_to_land_on_secure_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l = new LandingPage(driver);
		if(l.getPopupSize() > 0) {
			l.getPopup().click();
		}
		l.getLogin().click();
	}

	@When("^User enters (.+) and (.+) and logs in$")
	public void user_enters_and_and_logs_in(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(string);
		lp.getPassword().sendKeys(string2);

//		log.info(text);

		lp.getLogin().click();
	}

	@Then("verify user is successfully logged in")
	public void verify_user_is_successfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is logged in");
	}
	
	@And("^Close browsers$")
    public void close_browsers() throws Throwable {
		driver.close();
        driver.quit();
    }

}
