package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_FlightFinder {
    WebDriver driver;

    Functions function = new Functions();

    @FindBy(xpath = "//input[@value='oneway']")
    private WebElement rbtnType;

    @FindBy(name = "passCount")
    private WebElement passengersDrop;

    @FindBy(name = "fromPort")
    private WebElement fromPortDrop;

    @FindBy(name = "fromMonth")
    private WebElement fromMonthDrop;

    @FindBy(name = "fromDay")
    private WebElement fromDayDrop;

    @FindBy(name = "toPort")
    private WebElement toPortDrop;

    @FindBy(name = "toMonth")
    private WebElement toMonthDrop;

    @FindBy(name = "toDay")
    private WebElement toDayDrop;

    @FindBy(xpath = "//input[@value='First']")
    private WebElement serviceClassBtn;

    @FindBy(name = "airline")
    private WebElement airlineDrop;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")
    private WebElement btnContinue;

    public Page_FlightFinder(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillFlight(){
        function.selectClickOption(rbtnType);
        function.selectIndexOption(passengersDrop, 0);
        function.selectIndexOption(fromPortDrop, 3);
        function.selectIndexOption(fromMonthDrop, 3);
        function.selectIndexOption(fromDayDrop,5);
        function.selectIndexOption(toPortDrop,3);
        function.selectIndexOption(toMonthDrop,3);
        function.selectIndexOption(toDayDrop,5);
        function.selectClickOption(serviceClassBtn);
        function.selectIndexOption(airlineDrop,2);
        function.selectClickOption(btnContinue);
    }


}
