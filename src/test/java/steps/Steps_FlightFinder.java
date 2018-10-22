package steps;

import config.DriverFactory;
import cucumber.api.java.en.*;
import pages.Page_FlightFinder;
import pages.Page_Purchase;
import pages.Page_SelectFlight;

public class Steps_FlightFinder extends DriverFactory {

    Page_FlightFinder pageFlightFinder = new Page_FlightFinder(driver);
    Page_SelectFlight pageSelectFlight = new Page_SelectFlight(driver);
    Page_Purchase pagePurchase = new Page_Purchase(driver);

    @And("^I select my flight details$")
    public void iSelectFlight(){
        pageFlightFinder.fillFlight();
    }

    @And("^I select a departure and return flight$")
    public void iSelectDepartureAndReturn(){
        pageSelectFlight.selectOptions();
    }

    @And("^I purchase the flight$")
    public void purchaseFlight(){
        pagePurchase.purchase();
    }

    @Then("^I return to home page$")
    public void iReturnToHome(){
        pagePurchase.backHome();
    }
}
