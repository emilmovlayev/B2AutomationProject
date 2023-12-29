package com.loop.test.day10_upload_download;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_JSExecutor_scroll {
    /*
    1. Go to https://www.etsy.com
    2. Scroll down
    3. Generate random email and enter into subscribe box
    4. Click on Subscribe
    5. Verify "Great! We've sent you an email to confirm your subscription." is displayed
     */

    @Test
    public void etsy_scroll_test(){
        Driver.getdriver().get(ConfigurationReader.getproperty("etsy"));
        WebElement emailBox = Driver.getdriver().findElement(By.id("email-list-signup-email-input"));

        Actions action = new Actions(Driver.getdriver());
        //action.moveToElement(emailBox).perform();
        //action.scrollToElement(emailBox).perform();
        //action.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_UP).perform();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getdriver();
        //js.executeScript("window.scroll(0,5000");
        js.executeScript("arguments[0].scrollIntoView(true)",emailBox);
        js.executeScript("arguments[0].click",emailBox);


    }
}
