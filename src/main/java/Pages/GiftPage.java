package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftPage extends Util.TestBase {

	public GiftPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='nav-xshop']//a[contains(text(),'Gift Cards')]")
	WebElement giftSection;
	
	@FindBy(xpath="//a[@aria-label='Birthday']")
	WebElement birthdayLabel;
	
	public void openGiftSection() {
		giftSection.click();
	}
	public void birthdayPage() {
		birthdayLabel.click();
	}
	public String pageTitleCheck() {
		String title = driver.getTitle();
		return title;
	}
	
	
	
	
	
	
}
