package pageobject_model.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHQHomePage {

    private static final String HOMEPAGE_URL = "https://pastebin.com";
    private WebDriver driver;
    private JavascriptExecutor driverForButtons;

    @FindBy(id = "postform-text")
    private WebElement searchInputCode;

    @FindBy(xpath = "//*[@id='select2-postform-format-container']")
    private WebElement elementExpiration;

    @FindBy(xpath = "//*[@class='select2-results__option' and text()='Bash']")
    private WebElement elementOptionExpiration;

    @FindBy(xpath = "//*[@id='select2-postform-expiration-container']")
    private WebElement element;

    @FindBy(xpath = "//*[@class='select2-results__option' and text()='10 Minutes']")
    private WebElement elementOption;

    @FindBy(xpath = "//*[@name=\'PostForm[name]\']")
    private WebElement searchInputPasteName;

    @FindBy(xpath = "//*[@id=\'w0\']/div[5]/div[1]/div[6]/button")
    private WebElement searchButtonCreate;


    public SeleniumHQHomePage(WebDriver driver){
        this.driver = driver;
       PageFactory.initElements(driver, this);
    }

    public SeleniumHQHomePage openPage(){
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, 20);
        return this;
    }

    public SeleniumHQHomePage createNewCode (String text){
        searchInputCode.sendKeys(text);
        return this;
    }

    public SeleniumHQHomePage syntaxHighlighting() {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        elementExpiration.click();
        elementOptionExpiration.click();
        return this;
    }

    public SeleniumHQHomePage pasteExpiration(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        element.click();
        elementOption.click();
        return this;
    }

    public SeleniumHQHomePage createPasteName (String text){
        searchInputPasteName.sendKeys(text);
        return this;
    }

    public SeleniumHQHomePage create(){
        searchButtonCreate.click();
        return this;
    }

}
