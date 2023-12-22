package com.loop.test.day9_configuration;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_gogle_search {

    @Test
    public void google_search(){
        Driver.getdriver().get(ConfigurationReader.getproperty("google.url"));
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) Driver.getdriver()).getSessionId());
        WebElement searchBox = Driver.getdriver().findElement(By.name("q"));
        searchBox.sendKeys("Loop Academy"+ Keys.ENTER);
        Assert.assertEquals(Driver.getdriver().getTitle(),"Loop Academy - Google Search");
    }

    @Test
    public void docuport_search() throws InterruptedException {
        Driver.getdriver().get(ConfigurationReader.getproperty("env"));
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) Driver.getdriver()).getSessionId());
        DocuportUtils.login(Driver.getdriver(),"advisor");
    }
}
