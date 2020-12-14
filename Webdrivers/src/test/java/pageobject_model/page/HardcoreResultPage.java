package pageobject_model.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HardcoreResultPage {
    private WebDriver driver;

    @FindBy (css = "span.ng-binding")
    private WebElement resultNumberOfInstances;

    @FindBy (css = "md-list-item.md-1-line:nth-child(6) > div:nth-child(1)")
    private WebElement resultInstancetype;

    @FindBy (css = "md-list-item.md-1-line:nth-child(2) > div:nth-child(1)")
    private WebElement resultTotalHours;

    @FindBy (css = "md-list-item.md-1-line:nth-child(14) > div:nth-child(1) > b:nth-child(1)")
    private WebElement resultCost;



    public HardcoreResultPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getResultNumberOfInstances(){ return resultNumberOfInstances.getText();
    }

    public String getResultInstancetype(){
        return resultInstancetype.getText();
    }

    public String getResultTotalHours(){
        return resultTotalHours.getText();
    }

    public String getResultCost(){
        return resultCost.getText();
    }

}
