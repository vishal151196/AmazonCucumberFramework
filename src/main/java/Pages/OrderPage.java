package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends Util.TestBase {

	@FindBy(xpath = "//input[@placeholder='Search Amazon']")
	WebElement searchBox;

	@FindBy(xpath = "//div[@class='sg-col-inner']/div/span[3]")
	WebElement searchResultTag;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement searchBtn;

	@FindBy(xpath = "//div[@id='topRefinements/-1']")
	WebElement preferenceTag;

	@FindBy(xpath = "(//div[@data-index='2'])[1]")
	WebElement firstProduct;

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement addToCart;

	@FindBy(xpath = "//span[contains(text(),'Added to Cart')]")
	WebElement addItemSuccess;

	@FindBy(xpath = "(//a[contains(text(),\"Go to Cart\")])[2]")
	WebElement goToCart;

	public OrderPage() {
		PageFactory.initElements(driver, this);
	}

	// enter item to search
	public void Search(String Product) throws InterruptedException {
		searchBox.sendKeys(Product);
		searchBtn.click();
	}

	// check if search has given correct result or not
	public boolean searchResultTagCheck(String Product) {

		String result = searchResultTag.getText().toString().replaceAll("^\"|\"$", "");
		searchBox.clear();
		return result.equals(Product);
	}

	// click on first product
	public boolean ClickonFirstProduct() throws InterruptedException {
		Thread.sleep(500);
		firstProduct.click();
		Thread.sleep(500);
		addToCart.click();
		return addItemSuccess.isDisplayed();
	}

	public void GoToCart() {
		goToCart.click();
	}

}
