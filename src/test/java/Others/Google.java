package Others;

import com.codeborne.selenide.Configuration;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Google {

    private WebDriver driver;

    @BeforeClass
    public static void SetUpClass() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkazarkin\\Desktop\\JavaAppiumAutomation\\Lessons\\" +
                "Web autotests\\src\\libs\\chromedriver2.exe");
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
        WebElement searchField = driver.findElement(By.xpath("//input[@name='q']"));
        searchField.clear();
        searchField.sendKeys("Iphone 8");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement searchButton = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']"));
        searchButton.click();


    }

    @Test
    public void Luxoft() {
        $(By.name("q")).setValue("Luxoft").pressEnter();
//        $(By.name("btnK")).click();
        $(By.xpath("//cite[1]")).shouldHave(text("https://www.luxoft.com/"));
    }
}
