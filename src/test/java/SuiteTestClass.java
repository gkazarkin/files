import CL2.ClTests;
import MathApi.MatchersTests;
import MathApi.MathTest;
import MathApi.testApiTest;
import Others.BankTests;
import Others.SelenideTests;
import Others.googleTests;
import SelenidePageObject.testGoogleTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ClTests.class, MatchersTests.class, MathTest.class, testApiTest.class, BankTests.class,
        googleTests.class, SelenideTests.class, testGoogleTest.class} )
public class SuiteTestClass {
}
