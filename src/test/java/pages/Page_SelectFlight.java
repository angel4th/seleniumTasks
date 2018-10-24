package pages;

import helpers.Functions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import webElements.Elements_SelectFlight;

public class Page_SelectFlight {

    WebDriver driver;

    Functions function = new Functions();
    Elements_SelectFlight selectFlight = new Elements_SelectFlight();
    
    public Page_SelectFlight(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @Test
    public void selectOptions(){
        function.selectClickOption(selectFlight.rbtnDepart);
        function.selectClickOption(selectFlight.rbtnReturn);
        function.selectClickOption(selectFlight.btnContinue);
    }

}
