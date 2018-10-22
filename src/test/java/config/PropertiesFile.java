package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

    Properties properties = new Properties();
    InputStream inputStream = null;
    public PropertiesFile() {
        loadProperties();
    }
    private void loadProperties() {
        try {
            inputStream = new FileInputStream("C:\\Users\\AngelJoseAguilarMart\\IdeaProjects\\Task1Cucumber\\src\\test\\java\\config\\config.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String readProperty(String key) {
        return properties.getProperty(key);
    }

}
