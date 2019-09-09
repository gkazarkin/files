package GlebTests.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class ArticlePage {
    private MenuSection menuSection = page(MenuSection.class);

    @FindBy(css = "h1.post-title")
    private SelenideElement postTitle;

    @FindBy(css = "a[href*='#about-me']")
    private SelenideElement author;

    @FindBy(css = ".post-entry")
    private SelenideElement postContent;

    public MenuSection fromMenuSection() {
        return menuSection;
    }

    public SelenideElement getPostTitle(){
        return postTitle;
    }

    public SelenideElement getPostContent(){
        return postContent;
    }
}
