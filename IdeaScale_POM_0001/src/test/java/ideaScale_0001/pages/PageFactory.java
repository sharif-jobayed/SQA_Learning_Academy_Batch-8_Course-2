package ideaScale_0001.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public abstract class PageFactory {

    protected abstract String getPageTitle();
    protected abstract WebElement getElement(By pageElement);
    protected abstract List<WebElement> getElements(By pageElements);
    protected abstract void waitForElement(By pageElement);
    protected abstract <T extends BasePage> T getInstance(Class<T> tClass);

}
