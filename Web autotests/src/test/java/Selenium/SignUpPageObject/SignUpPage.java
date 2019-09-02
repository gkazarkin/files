package Selenium.SignUpPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(css = "[href=\"/signup/talent#form-anchor\"]")
    private WebElement formAnchor;

    By formLocator = By.cssSelector("form");

    public void opensignUpForm() {
        formAnchor.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(formLocator));
    }
}
