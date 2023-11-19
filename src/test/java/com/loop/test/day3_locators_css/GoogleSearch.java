package com.loop.test.day3_locators_css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

          driver.get("https://www.google.com/");

        driver.manage().window().maximize();

      String expectedTitle="Google";
      String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Actual title: "+actualTitle+ " , matches expected title: " );
        }else{
            System.err.println("Actual title: "+actualTitle+" ,does not match expected title:" );
        }



        String expectedURL = "https://www.google.com/";
        String actualURL =driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)) {
            System.out.println("Actual title: "+actualURL+ " , matches expected title: " );
        }else{
            System.err.println("Actual title: "+actualURL+" ,does not match expected title:" );
        }


    }

}
