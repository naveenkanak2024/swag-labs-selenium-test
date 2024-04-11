package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.LoginPage;

public class LoginPageStepDefs extends BasePage {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the sauce demo login page")
    public void i_am_on_the_sauce_demo_login_page() {
        driver.get("https://www.saucedemo.com/");
    }
    @When("I enter the username as {string}")
    public void i_enter_the_username_as(String userName) {
        loginPage.enterUsername(userName);
    }
    @When("I enter the password as {string}")
    public void i_enter_the_password_as(String password) {
        loginPage.enterPassword(password);
    }
    @When("I click on login button")
    public void i_click_on_login_button() {
        captureScreenshot();
        loginPage.clickOnLogin();
    }
}
