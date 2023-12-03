package com.loop.test.day5_testNG;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T0_radioButton {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/radio-buttons.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement red = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        WebElement green = driver.findElement(By.xpath("//input[@id='noRadio']"));

        // isSelected()

        System.out.println(red.isSelected() + " before clicking");
        red.click();
        Thread.sleep(5000);
        System.out.println(red.isSelected() + " after clicking");
        green.click();

        // isEnabled
        System.out.println(red.isEnabled() + " checking if enabled");
        System.out.println(green.isEnabled() + " checking if enabled");
    }
}
