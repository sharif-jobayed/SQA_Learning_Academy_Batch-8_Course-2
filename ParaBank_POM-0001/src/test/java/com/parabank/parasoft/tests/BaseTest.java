package com.parabank.parasoft.tests;

import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.parabank.parasoft.utils.DataProcessor.getCommonData;
import static com.parabank.parasoft.utils.DataProcessor.getEnvSettings;
import static com.parabank.parasoft.utils.DriverTools.driver;
import static com.parabank.parasoft.utils.DriverTools.getDriver;
import static io.qameta.allure.Allure.step;

public class BaseTest {

    @BeforeMethod
    public void setUp(){
        step("Assigning the Test Driver.");
        getDriver(getEnvSettings().getChromeBrowser());
        step("Setting up a custom window size.");
        driver.manage().window().setSize(new Dimension(1440,900));
        step("Navigating to the target URL.");
        driver.get(getCommonData().getURL());
    }


    @AfterMethod
    public void tearDown(){
        step("Closing the session.");
        driver.quit();
    }

}
