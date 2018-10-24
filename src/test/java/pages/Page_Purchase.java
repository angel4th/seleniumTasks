package pages;

import webElements.Elements_Purchase;
import helpers.Functions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Page_Purchase {
    WebDriver driver;

    Functions function = new Functions();
    Elements_Purchase purchase = new Elements_Purchase();


    public Page_Purchase(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Test
    public void purchase(){
        function.fillText(purchase.txtFirst,  "Angel");
        function.fillText(purchase.txtLastName,  "Aguilar");
        function.selectIndexOption(purchase.mealDrop,0);
        function.selectIndexOption(purchase.creditCardDrop, 1);
        function.fillText(purchase.txtCreditNumber, "0987654321316253");
        function.selectIndexOption(purchase.expirationMonthrop,3);
        function.selectIndexOption(purchase.expirationYearDrop,10);
        function.fillText(purchase.txtBillFirst,"Test");
        function.fillText(purchase.txtBillLast,"TEst Last");
        function.fillText(purchase.txtBillMiddle,"Midle");
        function.fillText(purchase.txtBillAddress,"Mulsay");
        function.fillText(purchase.txtBillAddress2,"Ampliacion");
        function.fillText(purchase.txtBillCity,"Merida");
        function.fillText(purchase.txtBillState,"Yucatan");
        function.fillText(purchase.txtBillZip,"99999");
        function.selectIndexOption(purchase.billCountryDrop,214);//214 is US
        function.selectClickOption(purchase.chkTicket);
        function.fillText(purchase.txtDelAddress,"Sambula");
        function.fillText(purchase.txtDelAddress2,"Opichen");
        function.fillText(purchase.txtDelCity,"Merida");
        function.fillText(purchase.txtDelState,"Yucatan");
        function.fillText(purchase.txtDelZip,"99000");
        function.selectIndexOption(purchase.delCountryDrop,214);
        try {
            Alert alert = driver.switchTo().alert();
            System.out.println("There is an alert");
            alert.accept();
        }catch (Exception e){
            System.out.println(e);
        }
        function.selectClickOption(purchase.btnPurchase);
    }

    @Test
    public void backHome(){
        purchase.btnHome.click();
    }

}
