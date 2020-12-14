package pageobject_model.test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject_model.page.HardcoreHomePage;
import pageobject_model.page.HardcoreResultPage;
import pageobject_model.page.HurtMePlentlyHomePage;
import pageobject_model.page.HurtMePlentlyResultPage;


public class Hardcore {

    private WebDriver driver;


    @BeforeMethod()
    public void browserSetup(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void Test () {
        HardcoreHomePage expectedCalculatorResults = new HardcoreHomePage (driver);
        expectedCalculatorResults.openPage();
        expectedCalculatorResults.searchCalculator("Google Cloud Platform Pricing Calculator");
        expectedCalculatorResults.searchResultClick();
        expectedCalculatorResults.numberOfInstances("4");
        expectedCalculatorResults.chooseInstanceType();
        expectedCalculatorResults.addGPUs();
        expectedCalculatorResults.chooseNumberOfGPUs();
        expectedCalculatorResults.chooseGPUtype();
        expectedCalculatorResults.chooseLocalSSD();
        expectedCalculatorResults.chooseDatacenterLocation();
        expectedCalculatorResults.chooseCommitedUsage();
        expectedCalculatorResults.addToEstimateClick();
        expectedCalculatorResults.addToEmailEstimateClick();
        expectedCalculatorResults.getEmailAddress();
        expectedCalculatorResults.inputEmailAddress();
        expectedCalculatorResults.sendEmail();

        HardcoreResultPage expectedResult = new HardcoreResultPage (driver);
        Assert.assertTrue(expectedResult.getResultNumberOfInstances().contains("4"));
        Assert.assertTrue(expectedResult.getResultInstancetype().contains("n1-standard-8"));
        Assert.assertTrue(expectedResult.getResultTotalHours().contains("2,920 total hours per month"));
        Assert.assertTrue(expectedResult.getResultCost().contains("1,082.77"));

    }

//    @AfterMethod()
//    public void browserTearDown(){
//        driver.quit();
//        driver = null;
//    }
}
