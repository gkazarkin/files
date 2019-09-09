package GlebTests.Others;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import io.github.bonigarcia.seljup.SeleniumExtension;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


    @ExtendWith(SeleniumExtension.class)
    public class SelenideJupiter {

        @BeforeClass
        public static void SetUpClass() {
//            SelenideConfig selenideConfig = new SelenideConfig().browser(CHROME).startMaximized(true);
            Configuration.browser = "chrome";
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkazarkin\\Desktop\\Код\\Web\\src\\libs\\chromedriver.exe");
        }

        @Before
        public void SetUp() {
            open("https://bonigarcia.github.io/selenium-jupiter/");
        }

        @After
        public void tearDown() {
            close();
        }

    @Test
    public void testSelenide() {
        $(linkText("About")).shouldBe(visible).click();
    }

    private void exercise(SelenideDriver... drivers) {
        for (SelenideDriver driver : drivers) {
            assertThat(driver.title(),
                    containsString("JUnit 5 extension for Selenium"));
        }
    }

    @Test
    public void testSelenideConfig() {
        $(linkText("About")).shouldBe(visible).click();
    }
}
