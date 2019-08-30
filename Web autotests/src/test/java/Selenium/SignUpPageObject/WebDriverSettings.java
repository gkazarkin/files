package Selenium.SignUpPageObject;

import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;

public class WebDriverSettings {
    public WebDriver driver;
    public WebDriver wait;


    @BeforeClass
    public static void SetUpClass() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkazarkin\\Desktop\\JavaAppiumAutomation\\Lessons\\" +
                "Web autotests\\src\\libs\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

    }

    @After
    public void tearDown() throws IOException {
        driver.quit();
    }
}
