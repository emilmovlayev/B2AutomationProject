package Home_Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) {

       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();

        driver.get("http://google.com/");
        WebElement seachId = driver.findElement(By.id("APjFqb"));
        String search = "Boston";
        seachId.sendKeys(search+Keys.ENTER);


    }
}
