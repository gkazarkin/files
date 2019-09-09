package GlebTests.CL2;

import com.codeborne.selenide.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;

public class ClMain {

    {
        Configuration.baseUrl = "http://fnx-dev.ntrlab.ru/sign-in";
    }

    @BeforeClass
    public static void SetUpClass() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkazarkin\\Desktop\\Код\\Web\\src\\libs\\chromedriver.exe");
    }

    @Before
    public void SetUp() {
        open("/");
    }

    @After
    public void tearDown() {
        close();
    }

//    private SelenideElement container = $(".ui-dialog");
    private String loginButton = "#mat-input-0";
    private String passwordButton = "#mat-input-1";
    private String SignIn = ".mat-button-wrapper";
    private String logo = ".cl-logo";
    private String LogOutButton1 = "//button[contains(text(),'Account')]";
    private String LogOutButton2 = "//button[contains(text(),'Sign Out')]";
    private String SureButton = "//span[contains(text(),'Sign out')]";
    private String ForgotText = "//a[contains(text(),'Forgot your password?')]";

    private String Book = "//span[contains(text(),'Book a trade')]";
    private String clientSearch = "/html[1]/body[1]/fnx-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/" +
            "ng-component[1]/div[1]/div[1]/div[1]/fnx-convert-form[1]/form[1]/div[1]/div[1]/div[1]/fnx-search-user[1]/div[1]/" +
            "mat-form-field[1]/div[1]/div[1]/div[1]/input[1]";
    private String clientSelect = "//*[@id=\"mat-option-65\"]/span";
    private String CurSell = "/html[1]/body[1]/fnx-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/ng-component[1]/div[1]/" +
            "div[1]/div[1]/fnx-convert-form[1]/form[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]";
    private String GBP = "//span[contains(text(),'British Pound (GBP)')]";
    private String CurBuy = "/html[1]/body[1]/fnx-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/ng-component[1]/div[1]/div[1]/" +
            "div[1]/fnx-convert-form[1]/form[1]/div[1]/div[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]";
    private String EUR = "//span[contains(text(),'Euro (EUR)')]";
    private String Amount = "/html[1]/body[1]/fnx-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/ng-component[1]/div[1]/div[1]/" +
            "div[1]/fnx-convert-form[1]/form[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]";
    private String SellByu = "/html[1]/body[1]/fnx-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/ng-component[1]/div[1]/div[1]/" +
            "div[1]/fnx-convert-form[1]/form[1]/div[1]/div[4]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]";
    private String ByuCur = "//span[@class='mat-option-text'][contains(text(),'Buy currency')]";
    private String TradeType = "/html[1]/body[1]/fnx-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/ng-component[1]/div[1]/" +
            "div[1]/div[1]/fnx-convert-form[1]/form[1]/div[1]/div[5]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]";
    private String Spot = "//span[contains(text(),'Spot')]";
    private String Date = "/html[1]/body[1]/fnx-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/ng-component[1]/div[1]/div[1]/div[1]/" +
            "fnx-convert-form[1]/form[1]/div[1]/div[6]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]";
    private String Date26 = "//div[contains(text(),'28')]";
    private String GetQuote = "//span[contains(text(),'Get a quote')]";
    private String CheckBox = "//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']";
    private String Convert = "//span[contains(text(),'Convert')]";
    private String Skip = "//span[contains(text(),'Skip')]";
    private String FundingBy = "//div[@class='mat-form-field-infix']";
    private String Bank= "//span[contains(text(),'Bank')]";
    private String ConfirmBook = "//span[@class='mat-button-wrapper']";

    private String ClientName = "/html[1]/body[1]/fnx-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/ng-component[1]/" +
            "div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/fnx-client-form[1]/form[1]/div[1]/div[1]/div[1]/mat-form-field[1]/" +
            "div[1]/div[1]/div[3]/input[1]";
    private String FirstName = "/html[1]/body[1]/fnx-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/ng-component[1]/" +
            "div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/fnx-client-form[1]/form[1]/div[1]/div[2]/div[1]/mat-form-field[1]/" +
            "div[1]/div[1]/div[3]/input[1]";
    private String LastName = "/html[1]/body[1]/fnx-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/ng-component[1]/" +
            "div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/fnx-client-form[1]/form[1]/div[1]/div[2]/div[2]/mat-form-field[1]/" +
            "div[1]/div[1]/div[3]/input[1]";
    private String Email = "/html[1]/body[1]/fnx-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/ng-component[1]/div[1]/" +
            "mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/fnx-client-form[1]/form[1]/div[1]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/" +
            "div[3]/input[1]";

//    # = id
//    . = class

    //Падает
    @Test
    public void testRegistration() {
        $(byXpath(ForgotText)).shouldHave(text("Forgot your password?"));
        $(loginButton).setValue("user.foenix@sinergo.ru");
        $(passwordButton).setValue("Ab34C21");
        $(SignIn).click();
        $(logo).click();
        $(By.xpath(LogOutButton1)).hover();
        $(By.xpath(LogOutButton2)).click();
        $(By.xpath(SureButton)).click();
        $(By.xpath(ForgotText)).shouldHave(text("Forgot your password?"));
        $(byText("Forgot your password?")).shouldBe(visible);
        System.out.println("Тест отработал до конца!");
    }

    @Test
    public void ClientCreation() {
        $(loginButton).setValue("user.foenix@sinergo.ru");
        $(passwordButton).setValue("Ab34C21");
        $(SignIn).click();

        $(logo).click();
        $(byText("Administration")).hover();
        $(byText("Clients")).click();
        $(byText("Add a client")).click();
        $(byXpath(ClientName)).click();
        $(byXpath(ClientName)).setValue("test");
        $(byXpath(FirstName)).setValue("First");
        $(byXpath(LastName)).setValue("Last");
        $(byXpath(Email)).setValue("gkazarkin+101@sinergo.ru");
    }
}
