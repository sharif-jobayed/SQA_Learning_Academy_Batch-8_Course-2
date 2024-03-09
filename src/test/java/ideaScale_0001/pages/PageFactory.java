package ideaScale_0001.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public abstract class PageFactory {

    protected abstract String getTitle();
    protected abstract WebElement getElement(By Element);
    protected abstract List<WebElement> getElements(By Element);
    protected abstract void waitForElement(By Element);

    protected <T extends BasePage> T getInstance(Class<T> tClass){
        try {
            return tClass.getDeclaredConstructor().newInstance();
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }

}
