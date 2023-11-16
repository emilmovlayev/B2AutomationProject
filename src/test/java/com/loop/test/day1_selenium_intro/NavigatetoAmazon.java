package com.loop.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatetoAmazon {
    public static void main(String[] args) {
   /*
    navigate to amazon
    maximize
    navigate back
    navigate forward
    refresh
     */
        //setting up the web driver
        WebDriverManager.chromedriver().setup();

        //create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        // Thread.sleep(5000);

        //navigate to web page
        driver.get("https://www.Amazon.com");
        // driver.navigate().to("https://www.google.com");

        driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();




    }
}
