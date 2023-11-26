package com.loop.test.day4_xpath_findelement;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T000_xpath_getText {
    public static void main(String[] args) {
     /*
    1. Open Chrome browser
    2. Go to docuport
    3. Click on forgot password
    4. validate URL contains: reset-password
    5. validate - Enter the email address associated with your account
    6. enter forgotpasswordg1@gmail.com to email box
    7. validate cancel button is displayed
    8. validate send button is displayed
    9. click send button
    10. validate - We've sent you an email with a link to reset your password. Please check your email
     */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");



        WebElement forgotPassword = driver.findElement(By.xpath("//a[@href='/reset-password']"));
        forgotPassword.click();

  String actualUrlForResetPassword= driver.getCurrentUrl();


        if(actualUrlForResetPassword.contains(DocuportConstants.RESET_PASSWORD_URL)){
            System.out.println("TEST PASS: => Actual url: " + actualUrlForResetPassword + " contains expected url: " + DocuportConstants.RESET_PASSWORD_URL);
        } else {
            System.out.println("TEST FAIL: => Actual url: " + actualUrlForResetPassword + " does not contain expected url: " + DocuportConstants.RESET_PASSWORD_URL);
        }

    }
}
