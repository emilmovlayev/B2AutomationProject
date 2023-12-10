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

public class Sample {
   WebDriver driver;
   String expect;
   String actual;

   @BeforeMethod
    public void setup(){
       driver = WebDriverFactory.getDriver("chrome");
       driver.get("https://loopcamp.vercel.app/dropdown.html");
   }

   @Test
    public void test1(){
       Select dropdown =new Select(driver.findElement(By.xpath("//*[@id=\"dropdown\"]")));
       dropdown.selectByIndex(2);
       Select birth =new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
       birth.selectByValue("1990");
       Select birth2 =new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
       birth2.selectByVisibleText("July");
       Select birth3 =new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
       birth3.selectByValue("29");
       Select state =new Select(driver.findElement(By.xpath("//*[@id=\"state\"]")));
       state.selectByVisibleText("Massachusetts");
       Select lang =new Select(driver.findElement(By.xpath("//*[@id=\"content\"]/select[6]")));
       lang.selectByVisibleText("Java");
        WebElement web = driver.findElement(By.xpath("//*[@id=\"dropdownMenuLink\"]"));
        web.click();


   }
}
