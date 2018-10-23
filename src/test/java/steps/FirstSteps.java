package steps;

import config.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;

public class FirstSteps {
    private WebDriver driver;
    @Before
    public void beforeScenario() {
        driver = new DriverFactory().getDriver();
        //System.out.println("this will run before the actual scenario");
    }

    @After
    public void afterScenario() {

        new DriverFactory().destroyDriver();
        //System.out.println("this will run after scneario is finished, even if it failed");
    }
}
