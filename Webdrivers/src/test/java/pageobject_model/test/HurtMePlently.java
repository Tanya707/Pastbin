package pageobject_model.test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject_model.page.HurtMePlentlyHomePage;
import pageobject_model.page.HurtMePlentlyResultPage;
import pageobject_model.page.SeleniumHQHomePage;
import pageobject_model.page.SeleniumHQResultPage;


public class HurtMePlently {

    private WebDriver driver;


    @BeforeMethod()
    public void browserSetup(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void Test () {
        HurtMePlentlyHomePage expectedCalculatorResults = new HurtMePlentlyHomePage (driver);
        expectedCalculatorResults.openPage()
        .searchCalculator("Google Cloud Platform Pricing Calculator")
        .searchResultClick();
        expectedCalculatorResults.numberOfInstances("4");
        expectedCalculatorResults.chooseInstanceType();
        expectedCalculatorResults.addGPUs();
        expectedCalculatorResults.chooseNumberOfGPUs();
        expectedCalculatorResults.chooseGPUtype();
        expectedCalculatorResults.chooseLocalSSD();
        expectedCalculatorResults.chooseDatacenterLocation();
        expectedCalculatorResults.chooseCommitedUsage();
        expectedCalculatorResults.addToEstimateClick();

        HurtMePlentlyResultPage expectedResult = new HurtMePlentlyResultPage (driver);
        Assert.assertTrue(expectedResult.getResultVMClass().contains("regular"));
        Assert.assertTrue(expectedResult.getResultRegion().contains("Frankfurt"));
        Assert.assertTrue(expectedResult.getResultLocalSSD().contains("2x375"));
        Assert.assertTrue(expectedResult.getResultInstancetype().contains("n1-standard-8"));
        Assert.assertTrue(expectedResult.getResultCommitmentTerm().contains("1 Year"));
        Assert.assertTrue(expectedResult.getResultCost().contains("1,082.77"));

    }

    @AfterMethod()
    public void browserTearDown(){
        driver.quit();
        driver = null;
    }
}
