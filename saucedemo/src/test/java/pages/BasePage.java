package pages;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class BasePage {

    @FindAll(@FindBy(css="[data-test='inventory-item-name']"))
    protected List<WebElement> inventoryItemNames;

    @FindAll(@FindBy(css="[data-test='inventory-item-price']"))
    protected List<WebElement> inventoryItemPrice;

    public static WebDriver driver;
    public static Scenario scenario;
    public static HashMap<Double, HashMap<String, WebElement>> inventoryItemData;
    public static Double highestPrice;
    public static String highestPriceItemName;
    public WebElement waitForElement(WebElement element){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void captureScreenshot(){
        TakesScreenshot ts = (TakesScreenshot) driver;

        byte[] src = ts.getScreenshotAs(OutputType.BYTES);
        scenario.attach(src, "image/png", "screenshot");
    }

    public void log(String logMessage){
        scenario.log("Message -> "+logMessage);
    }

    public BasePage(){
        PageFactory.initElements(driver, this);
    }
}
