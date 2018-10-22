package steps;

import config.DriverFactory;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.Page_HomePage;

public class Steps_HomePage extends DriverFactory {
    //WebDriver driver = new FirefoxDriver();
    //private WebDriver driver;

    Page_HomePage homePage = new Page_HomePage(driver);
    @Given("^I am a new user$")
    public void iAmANewUser(){
        homePage.goToHomePage();
        homePage.goToRegistration();
    }
}
