package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import Pages.OrderPage;
import Util.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class ItemSearchStepDefinitions extends TestBase {

	OrderPage op;
	
	@Then("^user search product$")
	public void user_search_product(DataTable item) throws InterruptedException {
		
		op = new OrderPage();
	for (Map<String, String> data : item.asMaps(String.class, String.class)) {
		
		op.Search(data.get("item"));	
		Thread.sleep(500);
		
		Assert.assertTrue(op.searchResultTagCheck(data.get("item")));
	}	
}
}
