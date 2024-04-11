package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id="user-name")
    private WebElement usernameTextbox;

    @FindBy(id="password")
    private WebElement passwordTextbox;

    @FindBy(id="login-button")
    private WebElement loginButton;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String userName) {
        waitForElement(usernameTextbox).sendKeys(userName);
    }

    public void enterPassword(String password) {
        waitForElement(passwordTextbox).sendKeys(password);
    }

    public void clickOnLogin() {
        waitForElement(loginButton).click();
    }
}
