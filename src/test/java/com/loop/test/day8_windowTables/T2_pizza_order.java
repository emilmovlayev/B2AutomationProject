package com.loop.test.day8_windowTables;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.PizzaOrderWebTableUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_pizza_order extends TestBase {

    @Test
    public void test_pizza_type() {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Alexandra Gray";
        String expectpizza = "Thin Crust";
        String actualpizza = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "Pizza Type");
        Assert.assertEquals(actualpizza, expectpizza, "does not match");

        String expectamount = "2";
        String actulaamount = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "Amount");
        Assert.assertEquals(actulaamount, expectamount, "does not match");

        String expectdate = "04/15/2021";
        String actualdate = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "Date");
        Assert.assertEquals(actualdate, expectdate, "does not match");

        String expectcity = "Chicago, IL";
        String actualcity = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "City");
        Assert.assertEquals(actualcity, expectcity, "does not match");

        String expectstate = "US";
        String actualstate = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "State");
        Assert.assertEquals(actualstate, expectstate, "does not match");

        String expectzip = "748";
        String actualzip = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "Zip");
        Assert.assertEquals(actualzip, expectzip, "does not match");

        String expectcard = "VISA";
        String actualcard = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "Card");
        Assert.assertEquals(actualcard, expectcard, "does not match");

        String expectnumber = "321456789012";
        String actualnumber = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "Card Number");
        Assert.assertEquals(actualnumber, expectnumber, "does not match");

        String expectexp = "02/24";
        String actualexp = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "Exp");
        Assert.assertEquals(actualexp, expectexp, "does not match");


    }

}