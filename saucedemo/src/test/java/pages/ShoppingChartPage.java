package pages;

import org.openqa.selenium.support.PageFactory;

public class ShoppingChartPage extends BasePage{

    public ShoppingChartPage(){
        PageFactory.initElements(driver, this);
    }

    public String getItemName(){
        return inventoryItemNames.get(0).getText().trim();
    }

    public String getItemPrice(){
        return inventoryItemPrice.get(0).getText().trim();
    }
}
