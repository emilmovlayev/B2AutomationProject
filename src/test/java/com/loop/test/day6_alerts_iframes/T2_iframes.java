package com.loop.test.day6_alerts_iframes;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class T2_iframes extends TestBase {



    @Test
    public void iframetest(){
        driver.get("https://loopcamp.vercel.app/iframe.html");
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);

        WebElement box = driver.findElement(By.xpath("//*[@id='tinymce']"));
        box.clear();
        box.sendKeys("Emil and Elvin is in Boston");
        driver.switchTo().defaultContent();

        WebElement head = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
        String expect = "An iFrame containing the TinyMCE WYSIWYG Editor";
        String actual = head.getText();
        assertEquals(actual,expect,"actual does not match");

    }
}
