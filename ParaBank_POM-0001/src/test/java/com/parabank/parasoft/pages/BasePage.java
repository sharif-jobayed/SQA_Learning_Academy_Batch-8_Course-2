package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import static com.parabank.parasoft.utils.DriverTools.driver;
import static com.parabank.parasoft.utils.DriverTools.getXWait;

public class BasePage extends PageFactory{
    @Override
    protected String getPageTitle() {
        System.out.println("The page title is:"+" "+driver.getTitle());
        return driver.getTitle();
    }

    @Override
    protected WebElement getPageElement(By pageElement) {
        waitForElement(pageElement);
        return driver.findElement(pageElement);
    }

    @Override
    protected List<WebElement> getPageElements(By pageElements) {
        waitForElement(pageElements);
        return driver.findElements(pageElements);
    }

    @Override
    protected void waitForElement(By pageElement) {
        getXWait().until(ExpectedConditions.presenceOfElementLocated(pageElement));
    }

    @Override
    protected <T extends BasePage> T getInstance(Class<T> tClass) {
        try {
            return tClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }
}
