package Others;
import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
public class BankTests {

    //  # = id
    //  . = class
    @Ignore
    @Test
    public void userLoginTest() {
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