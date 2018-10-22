package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page_Registration {
    WebDriver driver;

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

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b")
    private WebElement xpathWelcome;

    public Page_Registration(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillRegistration(){
        typeFN("Angel");
        typeLN("Aguilar");
        typePhone("9991086664");
        typeEmail("asd@hotmail.com");
        typeAddress1("Mulsay 1");
        typeAddress2("Nueva Mulsay");
        typeCity("Merida");
        typeState("Yucatan");
        typePostalCode("97249");
        selectCountry(0);
        typeUserName("angrarof");
        typePassword("password123");
        typeConfirmPassword("password123");
        registrationBtn();
    }

    //Methods to fill the registration page
    public void typeFN(String firstName){
        firstNameTxtBox.sendKeys(firstName);
    }

    public void typeLN(String lastName){
        lastNameTxtBox.sendKeys(lastName);
    }

    public void typePhone(String phone){
        phoneTxtBox.sendKeys(phone);
    }

    public void typeEmail(String email){
        emailTxtBox.sendKeys(email);
    }

    public void typeAddress1(String address1){
        address1TxtBox.sendKeys(address1);
    }

    public void typeAddress2(String address2){
        address2TxtBox.sendKeys(address2);
    }

    public void typeCity(String city){
        cityTxtBox.sendKeys(city);
    }

    public void typeState(String state){
        stateTxtBox.sendKeys(state);
    }

    public void typePostalCode(String pc){
        postalCodeTxtBox.sendKeys(pc);
    }

    public void selectCountry(int index){
        Select country = new Select(countryDrop);
        country.selectByIndex(index);
    }

    public void typeUserName(String user){
        userNameTxtBox.sendKeys(user);
    }

    public void typePassword(String password){
        passwordTxtBox.sendKeys(password);
    }

    public void typeConfirmPassword(String cPassword){
        confirmPasswordTxtBox.sendKeys(cPassword);
    }

    public void registrationBtn(){
        btnRegister.click();
    }

    //validate the registration

    public boolean registrationComplete(){
        return xpathWelcome.isDisplayed();
    }
}
