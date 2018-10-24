package webElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements_HomePage {
    @FindBy(xpath = "//a[@href='/mercuryregister.php']")
    public WebElement hrefRegistration;

    @FindBy(linkText = "REGISTER")
    public WebElement registerLink;

    @FindBy(name = "userName")
    public WebElement txtUserName;

    @FindBy(name = "password")
    public WebElement txtPasswprd;

    @FindBy(name = "login")
    public WebElement btnLogin;
}
