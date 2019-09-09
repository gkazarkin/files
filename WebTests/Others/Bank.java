package GlebTests.Others;
import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertTrue;
public class Bank {

    @BeforeClass
    public static void SetUpClass() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkazarkin\\Desktop\\Код\\Web\\src\\libs\\chromedriver.exe");
    }

    @After
    public void tearDown() throws IOException {
        close();
    }

    //  # = id
    //  . = class
    @Test
    public void userLogin() {
        open("http://idemo.bspb.ru/");
        $(By.name("username")).val("demo");
        $(By.name("password")).val("demo").pressEnter();

        $(".uneditable-input").shouldHave(text("Королёва Ольга"));
        $("#login-crypto-button").click();
        $("#user-greeting").shouldHave(text("Hello World!"));
        $("#bank-overview").shouldHave(text("Обзор")).click();

        $(".icon-close").click();
        $("#login-button").shouldHave(text("Войти"));
    }

}