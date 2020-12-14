package pageobject_model.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHQResultPage {
    private WebDriver driver;

    @FindBy (className = "textarea")
    private WebElement resultCode;


    @FindBy (css = ".info-top > h1:nth-child(1)")
    private WebElement resultPastName;

    @FindBy (linkText = "Bash")
    private WebElement resultSyntaxHighlighting;

    @FindBy (xpath = "//*[@class='expire' and text()='\n" +
            "                    10 min                ']")

    private WebElement resultPasteExpiration;

    public SeleniumHQResultPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getCode(){
        return resultCode.getText();
    }

    public String getResultSyntaxHighlighting(){
        return resultSyntaxHighlighting.getText();
    }

    public String getResultPasteExpiration(){
        return resultPasteExpiration.getText();
    }

    public String getResultPasteName(){
        return resultPastName.getText();
    }

}
