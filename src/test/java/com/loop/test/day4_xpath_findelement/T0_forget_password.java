package com.loop.test.day4_xpath_findelement;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T0_forget_password {
    public static void main(String[] args) throws InterruptedException {
        /*
         * verify forget password
         * identify reset password heading using css and go from parent to child
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");

        // forget password link
        WebElement forgetPasswordLink = driver.findElement(By.cssSelector("a[href='/reset-password']"));
        forgetPasswordLink.click();

        WebElement forgetPasswordHeading = driver.findElement(By.cssSelector("div[class='login-layout__form']>h1"));
        System.out.println("forgetPasswordHeading = " + forgetPasswordHeading.getText());

        WebElement validateMessage = driver.findElement(By.xpath("//div[@class='v-messages__message']"));
        String actualValidateMessage = validateMessage.getText();

        if(actualValidateMessage.contains(DocuportConstants.RESET_PASSWORD_MESSAGE)){
            System.out.println("TEST PASS: => Actual validate message: \""+actualValidateMessage+"\" contains expected message \""+DocuportConstants.RESET_PASSWORD_MESSAGE);
        }else {
            System.out.println("TEST FAIL: => Actual validate message: \""+actualValidateMessage+"\" doesnt contains expected message \""+DocuportConstants.RESET_PASSWORD_MESSAGE);

        }

        WebElement emailInputBox = driver.findElement(By.xpath("//input[contains(@id,'input')]"));
        emailInputBox.sendKeys(DocuportConstants.EMAIL_FOR_RESET_PASSWORD);

        WebElement cancelButton = driver.findElement(By.xpath("//span[normalize-space() = 'Cancel']"));
        WebElement sendButton = driver.findElement(By.xpath("//span[normalize-space() = 'Send']"));

        if(cancelButton.isDisplayed()){
            System.out.println("TEST PASS => Cancel button is displayed");
        } else {
            System.err.println("TEST FAILED => Cancel button is NOT displayed");
        }

        if(sendButton.isDisplayed()){
            System.out.println("TEST PASS => Send button is displayed");
        } else {
            System.err.println("TEST FAILED => Send button is NOT displayed");
        }

        sendButton.click();

        Thread.sleep(3000);

        WebElement successMessage = driver.findElement(By.xpath("//span[@class='body-1']"));

        Thread.sleep(10000);

        // 10. validate - We've sent you an email with a link to reset your password. Please check your email

        System.out.println(successMessage.getText());

        try{
            System.out.println(successMessage.getText());
        } catch (StaleElementReferenceException e){
            System.out.println("Element is not there anymore");
           // e.printStackTrace();
        }
    }
}
