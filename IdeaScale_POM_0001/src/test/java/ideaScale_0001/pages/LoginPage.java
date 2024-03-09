package ideaScale_0001.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static ideaScale_0001.utils.DataProcessor.getProcessedCommonData;

public class LoginPage extends BasePage{

    /*
    * acceptCookies: //button[text()='Accept']
    * enterAdminEmail: #login-email
    * enterAdminPassword: #login-password
    * clickLoginBtn: //button[text()='Log in']
    */

    public LoginPage logPageTitle(){
        System.out.println(getPageTitle());
        return this;
    }
    public LoginPage acceptCookies(){
        getElement(By.xpath("//button[text()='Accept']")).click();
        return this;
    }
    public LoginPage enterAdminEmail(){
        WebElement el=getElement(By.id("login-email"));
        el.sendKeys(getProcessedCommonData().getAdminEmail());
        Assert.assertEquals(el.getText(),getProcessedCommonData().getAdminEmail(),"Entered user email address is not correct.");
        return this;
    }
    public LoginPage enterAdminPassword(){
        WebElement el=getElement(By.id("login-password"));
        el.sendKeys(getProcessedCommonData().getAdminPassword());
        Assert.assertEquals(el.getText(),getProcessedCommonData().getAdminPassword(),"Entered user password is not correct.");
        return this;
    }

}
