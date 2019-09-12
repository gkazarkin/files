package SelenidePageObject;

import com.codeborne.selenide.Configuration;
import org.junit.Ignore;
import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class testGoogleTest {
    { Configuration.browser = "chrome"; }

    @Test
    public void testUserCanSearch() {
        open("https://google.com/ncr");
        new GooglePage().searchFor("selenide");

        SearchResultsPage results = new SearchResultsPage();
        results.getResults().shouldHave(sizeGreaterThan(1));
        results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
