package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    protected static WebDriver driver;
    public DriverFactory(){
        initialize();
    }
    public void initialize() {
        if (driver == null)
            createNewDriverInstance();
    }
    private void createNewDriverInstance() {
        String projectLocation = System.getProperty("user.dir");
        String browser = new PropertiesFile().readProperty("browser");
        if (browser.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver",projectLocation+"\\lib\\geckodriver\\geckodriver.exe");
            //System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");

            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        } else if (browser.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver", projectLocation+"\\lib\\chromeDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }else{
            System.out.println("can't read browser type");
        }
    }
    public WebDriver getDriver() {
        return driver;
    }
    public void destroyDriver() {
        driver.quit();
        driver = null;
    }
}
