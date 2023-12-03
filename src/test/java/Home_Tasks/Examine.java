package Home_Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examine {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement searchID = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        String search = "Boston";
        searchID.sendKeys(search+Keys.ENTER);
        WebElement head = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/div"));

        if (head.isDisplayed()) {
            System.out.println("it works--Test is passed");
        }else{
            System.out.println("It does not work--Test is not passed");
        }

    }
}
