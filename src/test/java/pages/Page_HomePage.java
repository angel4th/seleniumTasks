package pages;


import config.DriverFactory;
import webElements.Elements_HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Page_HomePage extends DriverFactory {

    Elements_HomePage homePage = new Elements_HomePage(driver);

    public Page_HomePage(WebDriver driver){
        this.driver = driver;

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
