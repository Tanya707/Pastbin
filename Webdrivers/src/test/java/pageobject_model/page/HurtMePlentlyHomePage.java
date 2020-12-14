package pageobject_model.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HurtMePlentlyHomePage {

    private static final String HOMEPAGE_URL = "https://cloud.google.com/";
    private WebDriver driver;

    private WebDriverWait wait;
    private JavascriptExecutor executor;

    @FindBy(xpath = "/html/body/section/devsite-header/div/div[1]/div/div/div[2]/devsite-search/form/div[1]/div/input")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\'___gcse_0\']/div/div/div/div[5]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/div/a")
    private WebElement searchResult;

    @FindBy(xpath = "//*[@id=\"cloud-site\"]/devsite-iframe/iframe")
    private WebElement firstFrame;

    @FindBy(xpath = "//*[@id=\'input_60\']")
    private WebElement numberOfInstances;

    @FindBy(id = "select_container_87")
    private WebElement instanceTypeClick;

    @FindBy(xpath = "//*[@id=\"select_option_236\"]/div[1]")
    private WebElement instanceType;

    @FindBy(xpath = "//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[8]/div[1]/md-input-container/md-checkbox/div[2]")
    private WebElement addGPUs;

    @FindBy(id = "select_container_373")
    private WebElement numberOfGPUsClick;

    @FindBy(xpath = "//*[@id=\"select_option_377\"]/div[1]")
    private WebElement numberOfGPUs;

    @FindBy(id = "select_container_375")
    private WebElement GPUtypeClick;

    @FindBy(xpath = "//*[@id=\"select_option_384\"]/div")
    private WebElement GPUtype;

    @FindBy(id = "select_container_194")
    private WebElement localSSDClick;

    @FindBy(xpath = "//*[@id=\"select_option_257\"]/div[1]")
    private WebElement localSSD;

    @FindBy(id = "select_container_89")
    private WebElement datacenterLocationClick;

    @FindBy(xpath = "//*[@id=\"select_option_204\"]/div")
    private WebElement datacenterLocation;

    @FindBy(id = "select_container_96")
    private WebElement commitedUsageClick;

    @FindBy(xpath = "//*[@id=\"select_option_93\"]")
    private WebElement commitedUsage;

    @FindBy(css = "div.layout-align-end-start:nth-child(17) > button:nth-child(1)")
    private WebElement addToEstimate;


    public HurtMePlentlyHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HurtMePlentlyHomePage openPage(){
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public HurtMePlentlyHomePage searchCalculator (String text){
        searchButton.sendKeys(text);
        searchButton.sendKeys(Keys.ENTER);
        return this;
    }

    public HurtMePlentlyHomePage searchResultClick(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(searchResult));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        searchResult.click();
        return this;
    }

    public HurtMePlentlyHomePage numberOfInstances(String number){
        driver.switchTo().frame(firstFrame);
        driver.switchTo().frame("myFrame");
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(numberOfInstances));
        numberOfInstances.sendKeys(number);
        return this;
    }

    public HurtMePlentlyHomePage chooseInstanceType (){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,instanceTypeClick);
        executor.executeScript("arguments[0].click();", instanceTypeClick);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,instanceType);
        executor.executeScript("arguments[0].click();", instanceType);
        return this;
    }

    public HurtMePlentlyHomePage addGPUs(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,addGPUs);
        executor.executeScript("arguments[0].click();", addGPUs);
        return this;
    }

    public HurtMePlentlyHomePage chooseNumberOfGPUs(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,numberOfGPUsClick);
        executor.executeScript("arguments[0].click();", numberOfGPUsClick);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,numberOfGPUs);
        executor.executeScript("arguments[0].click();", numberOfGPUs);
        return this;
    }

    public HurtMePlentlyHomePage chooseGPUtype(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,GPUtypeClick);
        executor.executeScript("arguments[0].click();", GPUtypeClick);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,GPUtype);
        executor.executeScript("arguments[0].click();", GPUtype);
        return this;
    }

    public HurtMePlentlyHomePage chooseLocalSSD(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,localSSDClick);
        executor.executeScript("arguments[0].click();", localSSDClick);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,localSSD);
        executor.executeScript("arguments[0].click();", localSSD);
        return this;
    }

    public HurtMePlentlyHomePage chooseDatacenterLocation(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,datacenterLocationClick);
        executor.executeScript("arguments[0].click();", datacenterLocationClick);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,datacenterLocation);
        executor.executeScript("arguments[0].click();", datacenterLocation);
        return this;
    }

    public HurtMePlentlyHomePage chooseCommitedUsage(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,commitedUsageClick);
        executor.executeScript("arguments[0].click();", commitedUsageClick);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,commitedUsage);
        executor.executeScript("arguments[0].click();", commitedUsage);
        return this;
    }

    public HurtMePlentlyHomePage addToEstimateClick(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,addToEstimate);
        executor.executeScript("arguments[0].click();", addToEstimate);
        return this;
    }

}
