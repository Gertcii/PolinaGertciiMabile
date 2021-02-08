package scenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import setup.BaseTest;
import setup.ConfProperties;

import java.util.List;

public class webMobileTests extends BaseTest {

    private String inputText = ConfProperties.getInputText();


    @Test(groups = {"web"}, description = "Search via google search field and check that we have a proper results")
    public void googleSearchTest() throws NoSuchFieldException, IllegalAccessException, InstantiationException {

        getDriver().get("http://google.com");

        getPo().getWelement("searchTextField").click();
        getPo().inputText("searchTextField", inputText);
        List<WebElement> searchResult = getPo().getWebElements("resultList");

        assert (searchResult.size() > 0);

    }


}
