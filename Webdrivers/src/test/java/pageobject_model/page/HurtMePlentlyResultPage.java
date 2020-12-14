package pageobject_model.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HurtMePlentlyResultPage {
    private WebDriver driver;

    @FindBy (css = "md-list-item.md-1-line:nth-child(4) > div:nth-child(1)")
    private WebElement resultVMClass;


    @FindBy (css = "md-list-item.md-1-line:nth-child(6) > div:nth-child(1)")
    private WebElement resultInstancetype;

    @FindBy (css = "md-list-item.md-1-line:nth-child(8) > div:nth-child(1)")
    private WebElement resultRegion;

    @FindBy (css = "md-list-item.md-1-line:nth-child(10) > div:nth-child(1)")
    private WebElement resultLocalSSD;

    @FindBy (css = "md-list-item.md-1-line:nth-child(12) > div:nth-child(1)")
    private WebElement resultCommitmentTerm;

    @FindBy (css = "md-list-item.md-1-line:nth-child(14) > div:nth-child(1) > b:nth-child(1)")
    private WebElement resultCost;



    public HurtMePlentlyResultPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getResultVMClass(){
        return resultVMClass.getText();
    }

    public String getResultInstancetype(){
        return resultInstancetype.getText();
    }

    public String getResultRegion(){
        return resultRegion.getText();
    }

    public String getResultLocalSSD(){
        return resultLocalSSD.getText();
    }

    public String getResultCommitmentTerm(){
        return resultCommitmentTerm.getText();
    }

    public String getResultCost(){
        return resultCost.getText();
    }

}
