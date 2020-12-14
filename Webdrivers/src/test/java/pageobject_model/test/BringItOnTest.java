package pageobject_model.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject_model.page.SeleniumHQHomePage;
import pageobject_model.page.SeleniumHQResultPage;


public class BringItOnTest {

    private WebDriver driver;


    @BeforeMethod()
    public void browserSetup(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void FirstTest () {
      SeleniumHQHomePage expectedPasteResult = new SeleniumHQHomePage (driver);
        expectedPasteResult.openPage();
        expectedPasteResult.createNewCode("git config --global user.name  \"New Sheriff in Town\"\n" +
              "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
              "git push origin master --force");
        expectedPasteResult.syntaxHighlighting();
        expectedPasteResult.pasteExpiration();
        expectedPasteResult.createPasteName("how to gain dominance among developers");
        expectedPasteResult.create();
        SeleniumHQResultPage expectedResult = new SeleniumHQResultPage (driver);
        Assert.assertTrue(expectedResult.getCode().equals("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force"));
        Assert.assertTrue(expectedResult.getResultSyntaxHighlighting().equals("Bash"));
        Assert.assertTrue(expectedResult.getResultPasteExpiration().equals("10 MIN"));
        Assert.assertTrue(expectedResult.getResultPasteName().equals("how to gain dominance among developers"));

    }

    @AfterMethod()
    public void browserTearDown(){
        driver.quit();
        driver = null;
    }
}
