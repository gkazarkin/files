package GlebTests.Selenide;
import com.codeborne.selenide.Configuration;

import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class QuickStartTest {
    @Before
    public void setUp() {
        Configuration.browser = "chrome";
    }

    //Падает
    @Test
    public void articleDetailsShouldContainsCorrectData() {
        final String postTitle = "DEALING WITH ASSERTIONS IN SELENIUM TESTS";
        final String author = "Grzegorz Szczutkowski";

        ArticlesSection articlesSection = open("https://testcraftsmanship.com", MainPage.class)
                .fromMenuSection()
                .openArticlesSection()
                .fromArticlesSection();

        String articleShortContent = articlesSection.getArticleContent(postTitle, author);
        ArticlePage articlePage = articlesSection.openArticleByTitleAndAuthor(postTitle, author);

        articlePage
                .getPostTitle()
                .shouldHave(text(postTitle));
        articlePage
                .getPostContent()
                .shouldHave(text(articleShortContent));

    }
}
