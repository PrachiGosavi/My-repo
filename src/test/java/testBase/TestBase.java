package testBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import Pages.Setup.Url;
import Pages.LoginPage;



public class TestBase {
    WebDriver driver;
    LoginPage login;
    @BeforeMethod
    public void setUp(){
        Url url=new Url();
        driver=url.getDriver();
        login=new LoginPage();
    }
    @Test
    public void loginTest()
    {
        driver.get("https://test-admin.gradvisor.uk/");
        login.userlogin();
        String currentUrl = driver.getCurrentUrl();
        assert currentUrl != null;
        Assert.assertTrue(currentUrl.contains("dashboard"), "Login sucessfull");

    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Close the browser
        }
}
}
