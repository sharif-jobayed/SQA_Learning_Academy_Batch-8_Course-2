package ideaScale_0001.tests;

import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static ideaScale_0001.utils.DataProcessor.getProcessedCommonData;
import static ideaScale_0001.utils.DataProcessor.getProcessedEnvSettings;
import static ideaScale_0001.utils.DriverTools.driver;
import static ideaScale_0001.utils.DriverTools.getDriver;

public class BaseTest {

    @BeforeMethod
    public void setUp(){
        getDriver(getProcessedEnvSettings().getChromeBrowser());
        driver.manage().window().setSize(new Dimension(1440,900));
        driver.get(getProcessedCommonData().getURL());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
