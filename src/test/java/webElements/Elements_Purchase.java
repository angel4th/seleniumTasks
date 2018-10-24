package webElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements_Purchase {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/input")
    public WebElement txtFirst;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")
    public WebElement txtLastName;

    @FindBy(name = "pass.0.meal")
    public WebElement mealDrop;

    @FindBy(name = "creditCard")
    public WebElement creditCardDrop;

    @FindBy(name = "creditnumber")
    public WebElement txtCreditNumber;

    @FindBy(name = "cc_exp_dt_mn")
    public WebElement expirationMonthrop;

    @FindBy(name = "cc_exp_dt_yr")
    public WebElement expirationYearDrop;

    @FindBy(name = "cc_frst_name")
    public WebElement txtBillFirst;

    @FindBy(name = "cc_mid_name")
    public WebElement txtBillMiddle;

    @FindBy(name = "cc_last_name")
    public WebElement txtBillLast;

    @FindBy(name = "ticketLess")
    public WebElement chkTicket;

    @FindBy(name = "billAddress1")
    public WebElement txtBillAddress;

    @FindBy(name = "billAddress2")
    public WebElement txtBillAddress2;

    @FindBy(name = "billCity")
    public WebElement txtBillCity;

    @FindBy(name = "billState")
    public WebElement txtBillState;

    @FindBy(name = "billZip")
    public WebElement txtBillZip;

    @FindBy(name = "billCountry")
    public WebElement billCountryDrop;

    @FindBy(name = "ticketLess")
    public WebElement chkTicketLess;

    @FindBy(name = "delAddress1")
    public WebElement txtDelAddress;

    @FindBy(name = "delAddress2")
    public WebElement txtDelAddress2;

    @FindBy(name = "delCity")
    public WebElement txtDelCity;

    @FindBy(name = "delState")
    public WebElement txtDelState;

    @FindBy(name = "delZip")
    public WebElement txtDelZip;

    @FindBy(name = "delCountry")
    public WebElement delCountryDrop;

    @FindBy(name = "buyFlights")
    public WebElement btnPurchase;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[2]/a/img")
    public WebElement btnHome;

    public Elements_Purchase(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
