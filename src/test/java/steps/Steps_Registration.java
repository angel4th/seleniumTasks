package steps;

import config.DriverFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.Page_Registration;

public class Steps_Registration extends DriverFactory {

    Page_Registration registrationPage = new Page_Registration(driver);

    @When("^I register my data correctly in the page for a new user$")
    public void iRegisterMyData(){
        registrationPage.fillRegistration();
    }

    @Then("^I should get a welcome message$")
    public void iShouldGetAWelcomeMessage(){
        Assert.assertTrue(registrationPage.registrationComplete());
    }
}
