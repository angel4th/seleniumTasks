package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_HomePage {

    WebDriver driver;

    @FindBy(xpath = "//a[@href='/mercuryregister.php']")
    private WebElement hrefRegistration;

    @FindBy(linkText = "REGISTER")
    private WebElement registerLink;

    public Page_HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToHomePage(){
        driver.get("http://newtours.demoaut.com/");
    }

    public void goToRegistration(){
        registerLink.click();
    }

}
