package Selenium.Delivery;

import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.sun.activation.registries.LogSupport.log;

public class DeliveryClub extends DeliverySettings{

    @Test
    public void firstTest() {
    String title = driver.getTitle();
    Assert.assertTrue(title.equals("FNX"));
    System.out.println("Тест пройден успешно!");
    log("PASS: Успешно!");
    }

}
