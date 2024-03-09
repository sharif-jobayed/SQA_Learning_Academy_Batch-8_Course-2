package ideaScale_0001.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import static ideaScale_0001.utils.DriverTools.driver;
import static ideaScale_0001.utils.DriverTools.getXWait;

public class BasePage extends PageFactory{
    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public WebElement getElement(By Element) {
        try{
            waitForElement(Element);
            return driver.findElement(Element);
        }catch(Exception e){
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }

    @Override
    public List<WebElement> getElements(By Element) {
        try{
            waitForElement(Element);
            return driver.findElements(Element);
        }catch(Exception e){
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }

    @Override
    public void waitForElement(By Element) {
        getXWait().until(ExpectedConditions.presenceOfElementLocated(Element));
    }

}
