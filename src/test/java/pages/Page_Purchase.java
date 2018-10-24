package pages;

import helpers.Functions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Page_Purchase {
    WebDriver driver;

    Functions function = new Functions();

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/input")
    private WebElement txtFirst;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement txtLastName;

    @FindBy(name = "pass.0.meal")
    private WebElement mealDrop;

    @FindBy(name = "creditCard")
    private WebElement creditCardDrop;

    @FindBy(name = "creditnumber")
    private WebElement txtCreditNumber;

    @FindBy(name = "cc_exp_dt_mn")
    private WebElement expirationMonthrop;

    @FindBy(name = "cc_exp_dt_yr")
    private WebElement expirationYearDrop;

    @FindBy(name = "cc_frst_name")
    private WebElement txtBillFirst;

    @FindBy(name = "cc_mid_name")
    private WebElement txtBillMiddle;

    @FindBy(name = "cc_last_name")
    private WebElement txtBillLast;

    @FindBy(name = "ticketLess")
    private WebElement chkTicket;

    @FindBy(name = "billAddress1")
    private WebElement txtBillAddress;

    @FindBy(name = "billAddress2")
    private WebElement txtBillAddress2;

    @FindBy(name = "billCity")
    private WebElement txtBillCity;

    @FindBy(name = "billState")
    private WebElement txtBillState;

    @FindBy(name = "billZip")
    private WebElement txtBillZip;

    @FindBy(name = "billCountry")
    private WebElement billCountryDrop;

    @FindBy(name = "ticketLess")
    private WebElement chkTicketLess;

    @FindBy(name = "delAddress1")
    private WebElement txtDelAddress;

    @FindBy(name = "delAddress2")
    private WebElement txtDelAddress2;

    @FindBy(name = "delCity")
    private WebElement txtDelCity;

    @FindBy(name = "delState")
    private WebElement txtDelState;

    @FindBy(name = "delZip")
    private WebElement txtDelZip;

    @FindBy(name = "delCountry")
    private WebElement delCountryDrop;

    @FindBy(name = "buyFlights")
    private WebElement btnPurchase;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[2]/a/img")
    private WebElement btnHome;

    public Page_Purchase(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @Test
    public void purchase(){
        function.fillText(txtFirst,  "Angel");
        function.fillText(txtLastName,  "Aguilar");
        function.selectIndexOption(mealDrop,0);
        function.selectIndexOption(creditCardDrop, 1);
        function.fillText(txtCreditNumber, "0987654321316253");
        function.selectIndexOption(expirationMonthrop,3);
        function.selectIndexOption(expirationYearDrop,10);
        function.fillText(txtBillFirst,"Test");
        function.fillText(txtBillLast,"TEst Last");
        function.fillText(txtBillMiddle,"Midle");
        function.fillText(txtBillAddress,"Mulsay");
        function.fillText(txtBillAddress2,"Ampliacion");
        function.fillText(txtBillCity,"Merida");
        function.fillText(txtBillState,"Yucatan");
        function.fillText(txtBillZip,"99999");
        function.selectIndexOption(billCountryDrop,214);//214 is US

        function.selectClickOption(chkTicket);
        function.fillText(txtDelAddress,"Sambula");
        function.fillText(txtDelAddress2,"Opichen");
        function.fillText(txtDelCity,"Merida");
        function.fillText(txtDelState,"Yucatan");
        function.fillText(txtDelZip,"99000");
        function.selectIndexOption(delCountryDrop,214);
        try {
            Alert alert = driver.switchTo().alert();
            System.out.println("There is a alert");
            alert.accept();
        }catch (Exception e){
            System.out.println(e);
        }
        function.selectClickOption(btnPurchase);
    }
    @Test
    public void backHome(){
        btnHome.click();
    }

}
