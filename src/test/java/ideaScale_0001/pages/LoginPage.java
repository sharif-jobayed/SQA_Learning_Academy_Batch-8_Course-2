package ideaScale_0001.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static ideaScale_0001.utils.DataProcessor.getProcessedData;
import static ideaScale_0001.utils.DriverTools.driver;

public class LoginPage extends BasePage{

    /*
    * Cookies:         //button[text()='Accept']
    * Login email:     //*[contains(@id,'login-email')]
    * Login Password:  //*[contains(@id,'login-password')]
    * Login Button:    //button[text()='Log in']
    */

    public LoginPage getPageTitle(){
        getTitle();
        System.out.println(getTitle());
        return this;
    }
    public LoginPage acceptCookies(){
        WebElement element=getElement(By.xpath("//button[text()='Accept']"));
        element.click();
        return this;
    }
    public LoginPage enterAdminEmail(){
        try{
            WebElement element=getElement(By.id("login-email"));
            element.click();
            element.sendKeys(getProcessedData().getAdminEmail());
            Assert.assertEquals(element.getText(),getProcessedData().getAdminEmail(),"Values don't match");
            return this;
        }catch(StaleElementReferenceException e){
            throw new StaleElementReferenceException(e.getLocalizedMessage());
        }
    }
    public LoginPage enterAdminPassword(){
        WebElement element=getElement(By.id("login-password"));
        element.click();
        element.sendKeys(getProcessedData().getAdminPassword());
        Assert.assertEquals(element.getText(),getProcessedData().getAdminPassword(),"Values don't match");
        return this;
    }

}
