package Others;

import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class googleTests {

    private WebDriver driver;

    @Before
    public void SetUpClass() {
        Configuration.browser = "chrome";
    }

    @Before
    public void SetUp() {
        open("https://www.google.com/");
    }

    @After
    public void tearDown() {
        close();
    }

    @Test
    public void openSiteAndSearchIphoneTest() {
        $(byName("q")).sendKeys("Iphone 8");
        $(byName("btnK")).click();
    }

    @Test
    public void luxoftTest() {
        $(By.name("q")).setValue("Luxoft").pressEnter();
//        $(By.name("btnK")).click();
        $(By.xpath("//cite[1]")).shouldHave(text("https://www.luxoft.com"));
    }
}
