package GlebTests.Others;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {
    @BeforeClass
    public static void setUp() {
        Configuration.browser = "chrome";
    }

    @Test
    public void itShouldBePossibleToSearchThePhrase() {
        open("https://duckduckgo.com");
        $("#search_form_input_homepage").setValue("Selenium");
        $("#search_button_homepage").click();
        $(".module__title__link").shouldHave(text("Selenium"));
    }
}
