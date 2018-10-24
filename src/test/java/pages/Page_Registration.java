package pages;

import helpers.Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Page_Registration {
    WebDriver driver;

    Functions function = new Functions();

    @FindBy(name = "country")
    private WebElement countryDrop;

    @FindBy(name = "firstName")
    private WebElement firstNameTxtBox;

    @FindBy(name = "lastName")
    private WebElement lastNameTxtBox;

    @FindBy(name = "phone")
    private WebElement phoneTxtBox;

    @FindBy(name = "userName")
    private WebElement emailTxtBox;

    @FindBy(name = "address1")
    private WebElement address1TxtBox;

    @FindBy(name = "address2")
    private WebElement address2TxtBox;

    @FindBy(name = "city")
    private WebElement cityTxtBox;

    @FindBy(name = "state")
    private WebElement stateTxtBox;

    @FindBy(name = "postalCode")
    private WebElement postalCodeTxtBox;

    @FindBy(name = "email")
    private WebElement userNameTxtBox;

    @FindBy(name = "password")
    private WebElement passwordTxtBox;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPasswordTxtBox;

    @FindBy(name = "register")
    private WebElement btnRegister;

    String xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b";

    public Page_Registration(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @Test
    public void fillRegistration(String fn,String ln,String pn,String email,String add1,String add2,String city,
                                 String st,String pc,String country,String us,String pw)
    {
        function.fillText(firstNameTxtBox,fn);
        function.fillText(lastNameTxtBox,ln);
        function.fillText(phoneTxtBox,pn);
        function.fillText(emailTxtBox,email);
        function.fillText(address1TxtBox,add1);
        function.fillText(address2TxtBox,add2);
        function.fillText(cityTxtBox, city);
        function.fillText(stateTxtBox,st);
        function.fillText(postalCodeTxtBox,pc);
        function.selectValueOption(countryDrop, country);
        function.fillText(userNameTxtBox,us);
        function.fillText(passwordTxtBox,pw);
        function.fillText(confirmPasswordTxtBox,pw);
        function.selectClickOption(btnRegister);
    }

    //validate the registration
    @Test
    public boolean registrationComplete(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        return element.isDisplayed();
    }
}
