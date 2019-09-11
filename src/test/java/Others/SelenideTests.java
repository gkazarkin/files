package Others;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTests {
    @Before
    public void setUp() {
        Configuration.browser = "chrome";
        open("https://duckduckgo.com");
    }

    @Test
    public void itShouldBePossibleToSearchThePhraseTest() {
        $("#search_form_input_homepage").setValue("Selenium");
        $("#search_button_homepage").click();
        $(".module__title__link").shouldHave(text("Selenium"));
    }
}
