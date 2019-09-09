package GlebTests.Others;

import com.codeborne.selenide.Configuration;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class Google {

    private WebDriver driver;

    @BeforeClass
    public static void SetUpClass() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkazarkin\\Desktop\\Код\\Web\\src\\libs\\chromedriver.exe");
    }

    @Before
    public void SetUp() {
        open("https://www.google.com/");
    }

    @After
    public void tearDown() {
//        driver.quit();
        close();
    }

    @Test
    public void OpenSiteAndSearchIphone() {
        $(byName("q")).sendKeys("Iphone 8");
        $(byName("btnK")).click();
    }

    @Test
    public void Luxoft() {
        $(By.name("q")).setValue("Luxoft").pressEnter();
//        $(By.name("btnK")).click();
        $(By.xpath("//cite[1]")).shouldHave(text("https://www.luxoft.com"));
    }
}
