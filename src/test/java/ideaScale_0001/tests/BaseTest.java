package ideaScale_0001.tests;

import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static ideaScale_0001.utils.DataProcessor.getProcessedData;
import static ideaScale_0001.utils.DriverTools.driver;
import static ideaScale_0001.utils.DriverTools.getDriver;

public class BaseTest {

    @BeforeMethod
    public void setUp(){
        getDriver(getProcessedData().getChromeBrowser());
        driver.manage().window().setSize(new Dimension(1440,900));
        driver.get(getProcessedData().getURL());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
