package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static com.parabank.parasoft.utils.DataProcessor.getCommonData;
import static io.qameta.allure.Allure.step;

public class LoginPage extends BasePage{

    /*
    * enterUsername: //input[@name='username']
    * enterUserPassword: //input[@name='password']
    * pressLoginBtn: //input[@type='submit']
    */

    public LoginPage thisPageTitle(){
        System.out.println(getPageTitle());
        return this;
    }
    public LoginPage enterUsername(){
        WebElement el=getPageElement(By.xpath("//input[@name='username']"));
        step("Entering username.");
        el.sendKeys(getCommonData().getUserEmail());
        step("Verifying entered username.");
        Assert.assertEquals(el.getAttribute("value"),getCommonData().getUserEmail(),"Username is not correct or empty.");
        return this;
    }
    public LoginPage enterUserPassword(){
        WebElement el=getPageElement(By.xpath("//input[@name='password']"));
        step("Entering user password.");
        el.sendKeys(getCommonData().getUserPassword());
        step("Verifying entered password.");
        Assert.assertEquals(el.getAttribute("value"),getCommonData().getUserPassword(),"User password is incorrect or empty.");
        return this;
    }
    public OverviewPage pressLoginBtn(){
        WebElement el=getPageElement(By.xpath("//input[@type='submit']"));
        step("Clicking the login button.");
        el.click();
        return getInstance(OverviewPage.class);
    }

}
