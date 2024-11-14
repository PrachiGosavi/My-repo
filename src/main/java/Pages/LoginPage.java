package Pages;
import Pages.Setup.Url;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Url{
  WebDriver driver=getDriver();
    public void userlogin()
    {
        WebElement username= driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div/div/form/div[1]/input"));
        username.sendKeys("admin@gradvisor.org.uk");

        WebElement password= driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div/div/form/div[2]/input"));
        password.sendKeys("Abc@12345");

        WebElement signin= driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div/div/form/div[3]/button"));
        signin.click();

    }

    public static void main(String[] args) {
        LoginPage login=new LoginPage();
        login.userlogin();

    }

}
