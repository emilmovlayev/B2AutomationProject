package Home_Tasks;

import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Examine {

    WebDriver driver;

    @BeforeMethod
    public void setuo(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://loopcamp.vercel.app/checkboxes.html");
    }

}
