package com.loop.test.day8_windowTables;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.DocuportWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_windowTables extends TestBase {
    @Test
    public void test_webTables() throws InterruptedException {

        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
        users.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String expectedFullName = "Alex De Souza";
        String actualFullName = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "Full name");
        System.out.println("actualFullName = " + actualFullName);
        Assert.assertEquals(actualFullName, expectedFullName, "not matching");

        String expectedUserName = "alexdesouze";
        String actualUserName = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "username");
        Assert.assertEquals(actualUserName, expectedUserName, "does not match");

        String expectedPhoneNumber = "994512060042";
        String actualPhoneNumber = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "phone number");
        Assert.assertEquals(actualPhoneNumber, expectedPhoneNumber, "does not match");

        String expectedRole = "Client";
        String actualRole = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "role");
        Assert.assertEquals(actualRole, expectedRole, "does not match");

        String expectedadvisor = "Batch1 Group1";
        String actualadvisor = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "advisor");
        Assert.assertEquals(actualadvisor, expectedadvisor, "does not match");

    }
}