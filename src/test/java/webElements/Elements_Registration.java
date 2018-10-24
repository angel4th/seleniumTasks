package webElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements_Registration {
    @FindBy(name = "country")
    public WebElement countryDrop;

    @FindBy(name = "firstName")
    public WebElement firstNameTxtBox;

    @FindBy(name = "lastName")
    public WebElement lastNameTxtBox;

    @FindBy(name = "phone")
    public WebElement phoneTxtBox;

    @FindBy(name = "userName")
    public WebElement emailTxtBox;

    @FindBy(name = "address1")
    public WebElement address1TxtBox;

    @FindBy(name = "address2")
    public WebElement address2TxtBox;

    @FindBy(name = "city")
    public WebElement cityTxtBox;

    @FindBy(name = "state")
    public WebElement stateTxtBox;

    @FindBy(name = "postalCode")
    public WebElement postalCodeTxtBox;

    @FindBy(name = "email")
    public WebElement userNameTxtBox;

    @FindBy(name = "password")
    public WebElement passwordTxtBox;

    @FindBy(name = "confirmPassword")
    public WebElement confirmPasswordTxtBox;

    @FindBy(name = "register")
    public WebElement btnRegister;

    public String xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b";

}
