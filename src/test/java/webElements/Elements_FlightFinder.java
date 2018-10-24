package webElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements_FlightFinder {
    @FindBy(xpath = "//input[@value='oneway']")
    public WebElement rbtnTypeOneWay;

    @FindBy(name = "passCount")
    public WebElement passengersDrop;

    @FindBy(name = "fromPort")
    public WebElement fromPortDrop;

    @FindBy(name = "fromMonth")
    public WebElement fromMonthDrop;

    @FindBy(name = "fromDay")
    public WebElement fromDayDrop;

    @FindBy(name = "toPort")
    public WebElement toPortDrop;

    @FindBy(name = "toMonth")
    public WebElement toMonthDrop;

    @FindBy(name = "toDay")
    public WebElement toDayDrop;

    @FindBy(xpath = "//input[@value='First']")
    public WebElement serviceClassBtn;

    @FindBy(name = "airline")
    public WebElement airlineDrop;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")
    public WebElement btnContinue;
}
