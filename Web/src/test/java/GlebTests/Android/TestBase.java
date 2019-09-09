package GlebTests.Android;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeSuite;

import com.codeborne.selenide.WebDriverRunner;

public class TestBase {
    @BeforeSuite
    public void initTestSuite() throws MalformedURLException{
        WebDriverRunner.setWebDriver(AndroidDriverProvider.getAndroidDriver());
    }
}
