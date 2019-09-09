package GlebTests.Selenide;

import static com.codeborne.selenide.Selenide.page;

public class MainPage {
    private MenuSection menuSection = page(MenuSection.class);
    private ArticlesSection articlesSection = page(ArticlesSection.class);

    public MenuSection fromMenuSection() {
        return menuSection;
    }

    public ArticlesSection fromArticlesSection() {
        return articlesSection;
    }
}
