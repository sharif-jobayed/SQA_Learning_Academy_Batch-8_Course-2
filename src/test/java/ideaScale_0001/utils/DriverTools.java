package ideaScale_0001.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static ideaScale_0001.utils.DataProcessor.getProcessedData;

public class DriverTools {

    /*--------------Driver Assignment--------------*/
    public static WebDriver driver;
    public static void setDriver(String BrowserName){
        switch (BrowserName){
            case "Firefox":
                driver=new FirefoxDriver();
                break;
            case "Chrome":
                driver=new ChromeDriver();
                break;
            case "Edge":
                driver=new EdgeDriver();
                break;
            default:throw new IllegalArgumentException("Unsupported browser"+" "+BrowserName);

        }
    }
    public static WebDriver getDriver(String BrowserName){
        if(driver==null){
            setDriver(BrowserName);
            return driver;
        }
        return driver;
    }
    /*--------------Driver Assignment ends--------------*/

    public static WebDriverWait getXWait(){return new WebDriverWait(driver, Duration.ofSeconds(getProcessedData().getWaitingTime()));}
    public static Actions getActions(){return new Actions(driver);}
    public static JavascriptExecutor getJS(){return (JavascriptExecutor)driver;}

}
