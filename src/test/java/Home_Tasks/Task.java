package Home_Tasks;

import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task {

    WebDriver driver;
     String expect;
     String actual;

     @BeforeMethod
    public void setupmethod(){
         driver = WebDriverFactory.getDriver("chrome");
         driver.get("https://loopcamp.vercel.app/forgot-password.html");
     }

}
