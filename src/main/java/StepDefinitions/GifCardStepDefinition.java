package StepDefinitions;

import org.junit.Assert;
import Pages.GiftPage;
import Util.TestBase;
import io.cucumber.java.en.Then;

public class GifCardStepDefinition extends TestBase  {

	GiftPage gp;
	
	@Then("^user click gift card$")
	public void user_click_gift_card() {
		gp= new GiftPage();
		gp.openGiftSection();
		}
	@Then("^user click birthday section$")
	public void user_click_birthday_section() {
		gp.birthdayPage();
	}
	
	@Then("^user can see birthday gift options$")
	public void page_title_check() {
		Assert.assertEquals("Amazon.com Birthday Gift Cards",gp.pageTitleCheck());
	}

}
