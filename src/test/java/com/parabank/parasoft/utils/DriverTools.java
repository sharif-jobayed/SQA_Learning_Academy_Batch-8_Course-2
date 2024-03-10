package com.parabank.parasoft.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static com.parabank.parasoft.utils.DataProcessor.getEnvSettings;

public class DriverTools {

    /*--------------Driver assignment--------------*/

    public static WebDriver driver;

    private static void setDriver(String myDriver){
        switch (myDriver){
            case "Firefox":
                driver=new FirefoxDriver();
                break;
            case "Chrome":
                driver=new ChromeDriver();
                break;
            case "Edge":
                driver=new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
    public static WebDriver getDriver(String myDriver){
        setDriver(myDriver);
        return driver;
    }

    /*--------------Driver assignment done--------------*/

    public static WebDriverWait getXWait(){
        return new WebDriverWait(driver, Duration.ofSeconds(getEnvSettings().getWaitingTime()));
    }
    public static Actions getActions(){
        return new Actions(driver);
    }
    public static JavascriptExecutor getJS(){
        return (JavascriptExecutor)driver;
    }

}
