package Selenium.SignUpPageObject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUp extends WebDriverSettings {

    @Test
    public void signUp() {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.getStarted();

        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        signUpPage.opensignUpForm();

//        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"error error-msg\"]")));
//        WebElement nameFirst = driver.findElement(By.id("name-first"));
//        WebElement nameFirstParent = nameFirst.findElement(By.xpath(".."));
//        String nameFirstError = nameFirstParent.findElement(By.cssSelector("p")).getText();
//        Assert.assertEquals(nameFirstError, "PLEASE ADD A FIRST NAME");
//        WebElement nameLast = driver.findElement(By.id("name-last"));
//        WebElement namelastParent = nameFirst.findElement(By.xpath(".."));
//        Assert.assertEquals(namelastParent.findElement(By.cssSelector("p")).getText(), "PLEASE ADD A LAST NAME");

    }
}
