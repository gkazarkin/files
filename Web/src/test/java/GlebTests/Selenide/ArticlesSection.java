package GlebTests.Selenide;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class ArticlesSection {
    @FindBy(css = "div.post")
    private ElementsCollection articles;

    private static final String TITLE_CSS_SELECTOR = "h2.post-title";
    private static final String AUTHOR_CSS_SELECTOR = "div.post-meta > a";
    private static final String CONTENT_CSS_SELECTOR = ".post-entry";
    private static final String LINK_CSS_SELECTOR = ".more-link";


    public ArticlePage openArticleByTitleAndAuthor(String title, String author) {
        getMatchingArticleElement(title, author)
                .find(LINK_CSS_SELECTOR)
                .click();
        return page(ArticlePage.class);
    }

    public String getArticleContent(String title, String author) {
        return getMatchingArticleElement(title, author)
                .find(CONTENT_CSS_SELECTOR)
                .text();
    }

    private SelenideElement getMatchingArticleElement(String title, String author) {
        return articles.stream()
                .filter(el ->
                        el.find(TITLE_CSS_SELECTOR).getText().toLowerCase().equals(title.toLowerCase())
                                && el.find(AUTHOR_CSS_SELECTOR).getText().toLowerCase().equals(author.toLowerCase()))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No element with title: " + title));
    }
}
