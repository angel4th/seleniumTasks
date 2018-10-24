package pages;


import webElements.Elements_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Page_HomePage {

    WebDriver driver;

    Elements_HomePage homePage = new Elements_HomePage();

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
        homePage.registerLink.click();
    }

    @Test
    public void singIn(String user, String pass){
        homePage.txtUserName.sendKeys(user);
        homePage.txtPasswprd.sendKeys(pass);
        homePage.btnLogin.click();
    }

}
