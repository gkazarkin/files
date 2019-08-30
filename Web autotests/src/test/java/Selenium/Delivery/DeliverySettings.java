package Selenium.Delivery;

import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class DeliverySettings {

    public ChromeDriver driver;
    @Before
    public void setUp() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkazarkin\\Desktop\\JavaAppiumAutomation\\Lessons\\" +
                "Web autotests\\src\\libs\\chromedriver2.exe");
        driver = new ChromeDriver();
        driver.get("http://fnx-dev.ntrlab.ru/");
        System.out.println("Сайт загрузился!");
    }

    @After
    public void close() {
        driver.quit();
    }

}
