package Pages.Setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

    // WebDriver instance
     WebDriver driver;

    // Constructor to initialize WebDriver
    public Url() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://test-admin.gradvisor.uk/");
    }

    // Method to get the WebDriver instance
    public WebDriver getDriver() {
        return driver;
    }

//    // Method to open a URL
//    public void openUrl() {
//        driver.get("https://test-admin.gradvisor.uk/");  // Navigate to the specified URL
//    }


    // Main method for testing (optional)
    public static void main(String[] args) {
        Url url = new Url();  // Create an instance of the Url class
    }
}
