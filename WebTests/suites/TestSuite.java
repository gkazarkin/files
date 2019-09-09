package GlebTests.suites;

import GlebTests.OOP.Math;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import GlebTests.CL2.*;
import GlebTests.OOP.*;
import GlebTests.Others.*;
import GlebTests.REST_API.*;
import GlebTests.Selenide.*;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ClMain.class,
        Human.class,
        Math.class,
        Person.class,
        Student.class,
        Bank.class,
        Google.class,
        SelenideJupiter.class,
        SelenideTest.class,
        matchers.class,
        testsApi.class,
        ArticlePage.class,
        ArticlesSection.class,
        MainPage.class,
        MenuSection.class,
        QuickStartTest.class
})

public class TestSuite {
}
