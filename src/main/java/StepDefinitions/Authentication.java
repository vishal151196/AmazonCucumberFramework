package StepDefinitions;

import org.junit.Assert;
import Pages.HomePage;
import Pages.LoginPage;
import Util.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Authentication extends TestBase {

	LoginPage lp;
	HomePage hp;

	@Given("^user is on Login Page$")
	public void user_is_on_login_page() {
		TestBase.initialization();
		
	}

	@When("^title page is amazon signin$")
	public void title_page_is_amazon_signin() {
		lp = new LoginPage();
		String title = lp.validateLoginPageTitle();
		Assert.assertEquals("Amazon Sign-In",title);
	}

	@Then("user login to site$") //use of regular expression to pass information
	public void user_enter_username_and_pwd() {
		hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		Assert.assertTrue(hp.validateCustomerName());
	}
	@Then("^user close browser$")
	public void user_close_browser() {
		driver.quit();
	}
}
