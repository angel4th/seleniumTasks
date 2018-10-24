package pages;

import config.DriverFactory;
import webElements.Elements_FlightFinder;
import helpers.Functions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Page_FlightFinder extends DriverFactory {

    //WebDriver driver;

    Functions function = new Functions();//You can call functions
    Elements_FlightFinder flightFinder = new Elements_FlightFinder(driver);//The webElements on flight finder web page

    public Page_FlightFinder(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //This function fill the blank with the information about the flight
    @Test
    public void fillFlight(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        function.selectClickOption(flightFinder.rbtnTypeOneWay);
        function.selectIndexOption(flightFinder.passengersDrop, 0);
        function.selectIndexOption(flightFinder.fromPortDrop, 3);
        function.selectIndexOption(flightFinder.fromMonthDrop, 3);
        function.selectIndexOption(flightFinder.fromDayDrop,5);
        function.selectIndexOption(flightFinder.toPortDrop,3);
        function.selectIndexOption(flightFinder.toMonthDrop,3);
        function.selectIndexOption(flightFinder.toDayDrop,5);
        function.selectClickOption(flightFinder.serviceClassBtn);
        function.selectIndexOption(flightFinder.airlineDrop,2);
        function.selectClickOption(flightFinder.btnContinue);
    }


}
