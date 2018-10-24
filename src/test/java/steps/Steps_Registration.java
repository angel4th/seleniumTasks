package steps;

import config.DriverFactory;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.Page_Registration;

import java.util.List;
import java.util.Map;

public class Steps_Registration extends DriverFactory {

    Page_Registration registrationPage = new Page_Registration(driver);

    @When("^I register my data correctly in the page for a new user$")
    public void iRegisterMyData(DataTable dt){
        List<Map<String, String>> user = dt.asMaps(String.class, String.class);
        for(int i=0; i<user.size(); i++) {
            String fn = user.get(i).get("First Name");
            String ln = user.get(i).get("Last Name");
            String pn = user.get(i).get("Phone");
            String email = user.get(i).get("Email");
            String add1 = user.get(i).get("Address 1");
            String add2 = user.get(i).get("Address 2");
            String city = user.get(i).get("City");
            String st = user.get(i).get("State");
            String pc = user.get(i).get("Postal Code");
            String country = user.get(i).get("Country");
            String us = user.get(i).get("Username");
            String pw = user.get(i).get("Password");
            registrationPage.fillRegistration(fn, ln, pn, email, add1, add2, city, st, pc, country, us, pw);
        }

    }

    @Then("^I should get a welcome message$")
    public void iShouldGetAWelcomeMessage(){
        Assert.assertTrue(registrationPage.registrationComplete());
        System.out.println("Registration complete");
    }
}
