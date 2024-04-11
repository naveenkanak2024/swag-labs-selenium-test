package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.*;

public class ProductsPage extends BasePage{

    @FindBy(css = "[data-test='title']")
    private WebElement pageHeading;

    @FindAll(@FindBy(css="[id*='add-to-cart']"))
    private List<WebElement> addToCartButton;

    @FindBy(css="[data-test='shopping-cart-link']")
    private WebElement shoppingCartLink;

    public String getPageHeading(){
        return waitForElement(pageHeading).getText().trim();
    }

    public ProductsPage(){
        PageFactory.initElements(driver, this);
    }

    public HashMap<Double, HashMap<String, WebElement>> collectPriceMappedToInventory(){

        HashMap<Double, HashMap<String, WebElement>> dataCollector = new HashMap<>();

        for (int i = 0; i < inventoryItemNames.size(); i++) {
            String itemPriceString = inventoryItemPrice.get(i).getText().replace("$","");
            double price = Double.parseDouble(itemPriceString);
            HashMap<String, WebElement> singleInventoryData = new HashMap<>();
            singleInventoryData.put(inventoryItemNames.get(i).getText().trim(),addToCartButton.get(i));
            dataCollector.put(price,singleInventoryData);
        }

        return dataCollector;
    }

    public void clickOnShoppingChartLink(){
        waitForElement(shoppingCartLink).click();
    }
}
