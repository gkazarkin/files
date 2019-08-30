package Bizintex;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class testBizintex {

    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception {
//        File app = downloadApk();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "AndroidTestDevice");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("AutomationName", "Appium");
        capabilities.setCapability("appPackage", "com.bizintexmobile");
        capabilities.setCapability("appActivity", "com.bizintexmobile.MainActivity");
        capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("app",
                "C:\\Users\\gkazarkin\\Desktop\\JavaAppiumAutomation\\Lessons\\Web autotests\\src\\libs\\bizintex.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        WebDriverRunner.setWebDriver(driver);
    }

    @After
    public void closeAppiumDriver() throws Exception {
        driver.rotate(ScreenOrientation.PORTRAIT);
        driver.quit();
    }

    private String enterLogin = "//android.widget.FrameLayout[@content-desc=\"ComponentLayout\"]/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]\n";
    private String teleph = "//android.widget.FrameLayout[@content-desc=\"ComponentLayout\"]/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";
    private String password = "//android.widget.FrameLayout[@content-desc=\"ComponentLayout\"]/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText";
    private String pressLogin = "//android.widget.FrameLayout[@content-desc=\"ComponentLayout\"]/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView\n";
    private String myResultText = "//android.widget.FrameLayout[@content-desc=\"ComponentLayout\"]/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView\n";
    private String menuButton = "//android.widget.FrameLayout[@content-desc=\"ComponentLayout\"]/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]\n";
    private String exitButton = "(//android.widget.FrameLayout[@content-desc=\"ComponentLayout\"])[2]/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.TextView[1]\n";
    private String registrationButton = "//android.widget.FrameLayout[@content-desc=\"ComponentLayout\"]/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]\n";
    private String telephoneReg = "//android.widget.FrameLayout[@content-desc=\"ComponentLayout\"]/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText\n";
    private String secondNameReg = "//android.widget.FrameLayout[@content-desc=\"ComponentLayout\"]/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText\n";
    private String nameReg = "//android.widget.FrameLayout[@content-desc=\"ComponentLayout\"]/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText\n";
    private String passwordReg = "//android.widget.FrameLayout[@content-desc=\"ComponentLayout\"]/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText\n";
    private String companyReg = "//android.widget.FrameLayout[@content-desc=\"ComponentLayout\"]/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText\n";
    private String nextRegButton = "//android.widget.FrameLayout[@content-desc=\"ComponentLayout\"]/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]\n";
    private String smsCodeButton = "//android.widget.FrameLayout[@content-desc=\"ComponentLayout\"]/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText\n";
    private String codeNextButton = "//android.widget.FrameLayout[@content-desc=\"ComponentLayout\"]/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]\n";
    @Test
    public void testLogIn() {
        $(byXpath(registrationButton)).shouldBe(visible).click();
        $(byXpath(telephoneReg)).shouldBe(visible).setValue("9539234800");
        $(byXpath(secondNameReg)).shouldBe(visible).setValue("Казаркин");
        $(byXpath(nameReg)).shouldBe(visible).setValue("Глеб");
        $(byXpath(passwordReg)).shouldBe(visible).setValue("1234567");
        $(byXpath(companyReg)).shouldBe(visible).setValue("Автотест");
        $(byXpath(nextRegButton)).shouldBe(visible).click();
        $(byXpath(smsCodeButton)).shouldBe(visible).setValue("580388");
        $(byXpath(codeNextButton)).shouldBe(visible).click();

        System.out.println("Тест регистрации до ввода смс-кода успешен");
    }

    @Test
    public void testSearch() {
        $(byXpath(enterLogin)).shouldBe(visible).click();
        $(byXpath(teleph)).shouldBe(visible).setValue("9539234800");
        $(byXpath(password)).shouldBe(visible).setValue("1234567");
        $(byXpath(pressLogin)).shouldBe(visible).click();
        $(byXpath(myResultText)).shouldBe(visible);
        System.out.println("Тест логина прошёл успешно");
    }

    @Test
    public void testLogOut() {
        $(byXpath(enterLogin)).shouldBe(visible).click();
        $(byXpath(teleph)).shouldBe(visible).setValue("9539234800");
        $(byXpath(password)).shouldBe(visible).setValue("1234567");
        $(byXpath(pressLogin)).shouldBe(visible).click();
        $(byXpath(menuButton)).shouldBe(visible).click();
        $(byXpath(exitButton)).shouldBe(visible).click();
        $(byXpath(enterLogin)).shouldBe(visible);
        System.out.println("Тест разлогина прошёл успешно");
    }
}


//        $(byText("Вход")).shouldBe(visible);

//        $("#android.widget.TextView[text='Вход']").click();

//       $(byXpath("//android.widget.FrameLayout[@content-desc='My lists']")).click();
//        $(byXpath(enterLogin)).shouldHave(text("Object-oriented programming language")).click();

