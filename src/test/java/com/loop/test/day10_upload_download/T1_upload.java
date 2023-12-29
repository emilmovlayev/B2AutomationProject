package com.loop.test.day10_upload_download;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertEquals;

public class T1_upload {
        /*
    1. Go to
    2. Upload file into Choose File
    3. Click terms of service check box
    4. Click Submit File button
    5. Validate expected message appeared. Expected: “1 file has been successfully uploaded.

#1- Right click on the file
#2- Select "properties"
#3- Go to "Security" tab
#4- Get the path from "Object name"

For windows, either double backward "\" or single forward "/" works.

     */
  @Test
    public void upload_file() throws InterruptedException {
       Driver.getdriver().get(ConfigurationReader.getproperty("guru.url"));
       WebElement chooseFile = Driver.getdriver().findElement(By.id("uploadfile_0"));
       String path ="C:\\Users\\Elvin\\OneDrive\\Рабочий стол\\note.txt";
       chooseFile.sendKeys(path);
       WebElement checkBox = Driver.getdriver().findElement(By.id("terms"));
       checkBox.click();
       Thread.sleep(3000);
       WebElement submitButton = Driver.getdriver().findElement(By.id("submitbutton"));
       submitButton.click();
       Thread.sleep(3000);
       WebElement successMessage =Driver.getdriver().findElement(By.id("res"));
       String expectedMessage = "1 file\nhas been successfully uploaded.";
       Assert.assertEquals(successMessage.getText(), expectedMessage,"does not match");
  }

}
