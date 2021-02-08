package setup;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface IPageObject {

    WebElement getWelement(String weName) throws NoSuchFieldException, IllegalAccessException, InstantiationException;

    void inputText(String weName, String text) throws NoSuchFieldException, IllegalAccessException;

    List<WebElement> getWebElements(String weName) throws NoSuchFieldException, IllegalAccessException;

}
