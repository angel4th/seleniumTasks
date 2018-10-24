package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/java/features"},
        glue={"steps"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:src/test/java/report.html" },
        monochrome = true,

        tags = "@SecondFeature"
)

public class TestRunner {
    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(System.getProperty("user.dir")+"\\src\\test\\java\\config\\extent-config.xml");
    }
}


