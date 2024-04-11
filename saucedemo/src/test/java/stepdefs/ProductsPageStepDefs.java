package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.ProductsPage;

import java.util.Collections;
import java.util.HashMap;

public class ProductsPageStepDefs extends BasePage {

    ProductsPage productsPage = new ProductsPage();

    @Given("I am on the products page")
    public void i_am_on_the_products_page() {
        Assert.assertEquals(productsPage.getPageHeading(), "Products");
        captureScreenshot();
    }
    @When("I click on \"ADD TO CART\" button corresponding highest price")
    public void i_click_on_button_corresponding_highiest_price() {

        inventoryItemData = productsPage.collectPriceMappedToInventory();
        highestPrice = Collections.max(inventoryItemData.keySet());
        log("Highest price : "+highestPrice);
        HashMap<String, WebElement> maxPriceItem = inventoryItemData.get(highestPrice);
        highestPriceItemName = (String) (maxPriceItem.keySet().toArray())[0];
        log("Highest price item name : "+highestPriceItemName);
        maxPriceItem.get(highestPriceItemName).click();

    }

    @When("I click on cart icon")
    public void i_click_on_cart_icon() {
        productsPage.clickOnShoppingChartLink();
        captureScreenshot();
    }

}
