package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public void fillRegistration(){
        function.fillText(firstNameTxtBox,"Angel");
        function.fillText(lastNameTxtBox,"Aguilar");
        function.fillText(phoneTxtBox,"9991086664");
        function.fillText(emailTxtBox,"asd@hotmail.com");
        function.fillText(address1TxtBox,"Mulsay 1");
        function.fillText(address2TxtBox,"Nueva Mulsay");
        function.fillText(cityTxtBox, "Merida");
        function.fillText(stateTxtBox,"Yucatan");
        function.fillText(postalCodeTxtBox,"97249");
        function.selectIndexOption(countryDrop,0);
        function.fillText(userNameTxtBox,"angrarof");
        function.fillText(passwordTxtBox,"password123");
        function.fillText(confirmPasswordTxtBox,"password123");
        function.selectClickOption(btnRegister);
    }
    /*
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
    */
    //validate the registration

    public boolean registrationComplete(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        return element.isDisplayed();
    }
}
