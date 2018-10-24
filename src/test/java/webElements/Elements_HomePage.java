package webElements;

import config.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements_HomePage{
    WebDriver driver;

    @FindBy(linkText = "REGISTER")
    public WebElement registerLink;

    @FindBy(name = "userName")
    public WebElement txtUserName;

    @FindBy(name = "password")
    public WebElement txtPasswprd;

    @FindBy(name = "login")
    public WebElement btnLogin;

    public Elements_HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
