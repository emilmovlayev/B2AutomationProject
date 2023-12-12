package com.loop.test.day6_alerts_iframes;

import com.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class T1_alerts extends TestBase {
    @Test
    public void infromationalert(){
         driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
        WebElement clickForJSAlert =driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        clickForJSAlert.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement success = driver.findElement(By.xpath("//p[@id='result']"));
        String expex = "You successfully clicked an alert";
        String actual =success.getText();
        assertEquals(actual,expex,"actual does not match");
    }


    @Test
    public void confirmationaler(){
        driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
        WebElement clickForJSConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
        clickForJSConfirm.click();

        driver.switchTo().alert().accept();

        WebElement success2 = driver.findElement(By.xpath("//p[@id='result']"));
        String expex = "You clicked: Ok";
        String actual = success2.getText();
        assertEquals(actual,expex,"Actual does not match");

        clickForJSConfirm.click();
        driver.switchTo().alert().dismiss();
        actual = success2.getText();
        expex = "You clicked: Cancel";
        assertEquals(actual,expex,"actual does not match");

    }

    @Test
    public void Prompalerts(){
        driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
        WebElement clickforprompt = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[3]"));
        clickforprompt.click();
        String text = "Boston";

        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();

        WebElement success3 = driver.findElement(By.xpath("//p[@id='result']"));
        String expec = "You entered: "+text;
        String actual = success3.getText();
        assertEquals(actual,expec, "actual does not match");

    }

}
