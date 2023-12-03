package com.loop.test.day5_testNG;

import org.testng.Assert;
import org.testng.annotations.*;

import java.text.AttributedString;
public class T1_testNG_intro {
    @BeforeClass
    public void setUp(){
        System.out.println("before class is running");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("after class is running");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("before method is running");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("after method is running");
    }

    @Test(priority = 1)
    public void test1(){
        System.out.println("Test 1 is running");
        String actual="Feyruz";
        String expected="Nadir";

        Assert.assertEquals(actual, expected, "Message from Assertion, it will show if test fails");

    }

    @Test(priority = 2)
    public void atest2(){
        System.out.println("test 2 is running ");
    }
}
