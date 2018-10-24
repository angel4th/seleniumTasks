package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Page_HomePage {

    WebDriver driver;

    @FindBy(xpath = "//a[@href='/mercuryregister.php']")
    private WebElement hrefRegistration;

    @FindBy(linkText = "REGISTER")
    private WebElement registerLink;

    @FindBy(name = "userName")
    private WebElement txtUserName;

    @FindBy(name = "password")
    private WebElement txtPasswprd;

    @FindBy(name = "login")
    private WebElement btnLogin;

    public Page_HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @Test
    public void goToHomePage(){
        driver.get("http://newtours.demoaut.com/");
    }
    @Test
    public void goToRegistration(){
        registerLink.click();
    }
    @Test
    public void singIn(String user, String pass){
        txtUserName.sendKeys(user);
        txtPasswprd.sendKeys(pass);
        btnLogin.click();
    }

    @AfterTest
    public void testAfter(){
        System.out.println("After test");
    }

}
