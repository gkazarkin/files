package GlebTests.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class MenuSection {
    @FindBy(css = ".menu-about-me")
    private SelenideElement aboutMeButton;

    @FindBy(css = ".menu-home")
    private SelenideElement homeButton;

    @FindBy(css = ".studies")
    private SelenideElement studiesButton;

    @FindBy(css = "a[href*='articles']")
    private SelenideElement articlesButton;

    @FindBy(css = ".contact")
    private SelenideElement contactButton;

    public MainPage openArticlesSection() {
        articlesButton.click();
        return page(MainPage.class);
    }
}
