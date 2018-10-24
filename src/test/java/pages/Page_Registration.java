package pages;

import config.DriverFactory;
import helpers.Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import webElements.Elements_Registration;

public class Page_Registration extends DriverFactory {


    Functions function = new Functions();
    Elements_Registration registration = new Elements_Registration(driver);

    public Page_Registration(WebDriver driver){
        this.driver = driver;
    }

    @Test
    public void fillRegistration(String fn,String ln,String pn,String email,String add1,String add2,String city,
                                 String st,String pc,String country,String us,String pw)
    {
        function.fillText(registration.firstNameTxtBox,fn);
        function.fillText(registration.lastNameTxtBox,ln);
        function.fillText(registration.phoneTxtBox,pn);
        function.fillText(registration.emailTxtBox,email);
        function.fillText(registration.address1TxtBox,add1);
        function.fillText(registration.address2TxtBox,add2);
        function.fillText(registration.cityTxtBox, city);
        function.fillText(registration.stateTxtBox,st);
        function.fillText(registration.postalCodeTxtBox,pc);
        function.selectValueOption(registration.countryDrop, country);
        function.fillText(registration.userNameTxtBox,us);
        function.fillText(registration.passwordTxtBox,pw);
        function.fillText(registration.confirmPasswordTxtBox,pw);
        function.selectClickOption(registration.btnRegister);
    }

    //validate the registration
    @Test
    public boolean registrationComplete(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(registration.xpath)));
        return element.isDisplayed();
    }
}
