package CL2;

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
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;

public class ClMain {

    @BeforeClass
    public static void SetUpClass() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkazarkin\\Desktop\\JavaAppiumAutomation\\Lessons\\" +
                "Web autotests\\src\\libs\\chromedriver2.exe");
    }

    @Before
    public void SetUp() {
        open("http://fnx-dev.ntrlab.ru/sign-in");
    }

    @After
    public void tearDown() {
        close();
    }

//    # = id
//    . = class
    private String loginButton = "#mat-input-0";
    private String passwordButton = "#mat-input-1";
    private String SignIn = ".mat-button-wrapper";
    private String Foenix = ".cl-logo";
    private String LogOutButton1 = "//button[contains(text(),'Account')]";
    private String LogOutButton2 = "//button[contains(text(),'Sign Out')]";
    private String SureButton = "//span[contains(text(),'Sign out')]";
    private String ForgotText = "//a[contains(text(),'Forgot your password?')]";

    private String Book = "//span[contains(text(),'Book a trade')]";
    private String Client = "/html[1]/body[1]/fnx-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/" +
            "ng-component[1]/div[1]/div[1]/div[1]/fnx-convert-form[1]/form[1]/div[1]/div[1]/div[1]/fnx-search-user[1]/div[1]/" +
            "mat-form-field[1]/div[1]/div[1]/div[1]/input[1]";
    private String Client2 = "//span[contains(text(),'testf testl (Test client)')]";
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




    @Test
    public void testRegistration() {
        $(byXpath(ForgotText)).shouldHave(text("Forgot your password?"));
        $(loginButton).setValue("gkazarkin@sinergo.ru");
        $(passwordButton).setValue("123qweASD");
        $(SignIn).click();
        $(Foenix).click();
        $(By.xpath(LogOutButton1)).hover();
        $(By.xpath(LogOutButton2)).click();
        $(By.xpath(SureButton)).click();
        $(By.xpath(ForgotText)).shouldHave(text("Forgot your password?"));
        $(byText("Forgot your password?")).shouldBe(visible);
        System.out.println("Тест отработал до конца!");
    }

    @Test
    public void testBookATrade() {
        $(loginButton).setValue("gkazarkin@sinergo.ru");
        $(passwordButton).setValue("123qweASD");
        $(SignIn).click();
        $(byXpath(Book)).click();

        $(byXpath(Client)).click();
        $(byXpath(Client)).setValue("test");
        $(byXpath(Client2)).click();
        $(byXpath(CurSell)).click();
        $(byText("British Pound (GBP)")).click();
        $(byXpath(CurBuy)).click();
        $(byText("Euro (EUR)")).click();
        $(byXpath(Amount)).click();
        $(byXpath(Amount)).setValue("10000");
        $(byXpath(SellByu)).click();
        $(byText("Buy currency")).click();
        $(byXpath(TradeType)).click();
        $(byText("Spot")).click();
        $(byXpath(Date)).click();
        $(byText("27")).click();
        $(byText("Get a quote")).click();

        $(byXpath(CheckBox)).click();
        $(byText("Convert")).click();

        $(byXpath(Skip)).click();
        $(byXpath(FundingBy)).click();
        $(byText("Direct debit")).click();
        $(byText("Confirm")).click();

        $(byText("View trades")).click();

        $(byText("Export")).shouldBe(visible);
    }

    @Test
    public void ClientCreation() {
        $(loginButton).setValue("gkazarkin@sinergo.ru");
        $(passwordButton).setValue("123qweASD");
        $(SignIn).click();

        $(byXpath(Foenix)).click();
        $(byText("Administration")).hover();
        $(byText("Clients")).click();
        $(byText("Add a client")).click();
        $(byXpath(ClientName)).click();
        $(byXpath(ClientName)).setValue("test");
        $(byXpath(FirstName)).setValue("First");
        $(byXpath(LastName)).setValue("Last");
        $(byXpath(Email)).setValue("gkazarkin+100@sinergo.ru");

    }
}
