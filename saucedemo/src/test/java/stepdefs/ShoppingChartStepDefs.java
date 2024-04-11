package stepdefs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasePage;
import pages.ShoppingChartPage;

public class ShoppingChartStepDefs extends BasePage {

    ShoppingChartPage shoppingChartPage = new ShoppingChartPage();

    @Then("I should see the product successfully added")
    public void i_should_see_the_product_successfully_added() {

        Assert.assertEquals(shoppingChartPage.getItemName(), highestPriceItemName);
        Assert.assertEquals(shoppingChartPage.getItemPrice(), "$"+highestPrice);

    }
}
