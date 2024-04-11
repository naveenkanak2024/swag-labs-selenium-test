package stepdefs;

import io.cucumber.java.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

import java.time.Duration;

public class Hooks extends BasePage {

    @Before
    public void setup(Scenario scenario){
        BasePage.scenario = scenario;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    @After
    public void close(){
        driver.quit();
    }
}
