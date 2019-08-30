package Others;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertTrue;
public class Bank {

    @BeforeClass
    public static void SetUpClass() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkazarkin\\Desktop\\JavaAppiumAutomation\\Lessons\\" +
                "Web autotests\\src\\libs\\chromedriver2.exe");
    }

    @After
    public void tearDown() throws IOException {
        close();
    }

    @Test
    public void userCanLoginToBspbDemo() {
        open("http://idemo.bspb.ru/");
        $(By.name("username")).val("demo");
        $(By.name("password")).val("demo").pressEnter();
        $(By.name("otpCode")).val("0000").pressEnter();

        $("#user-greeting").shouldHave(text("Hello World!"));
        $("span").shouldHave(text("Королёва Ольга"));

        open("https://idemo.bspb.ru/overview");
    }

}