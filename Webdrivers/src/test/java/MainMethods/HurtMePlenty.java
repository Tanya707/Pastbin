package MainMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HurtMePlenty {
    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://cloud.google.com/");

        WebElement searchButton = driver.findElement(By.xpath("/html/body/section/devsite-header/div/div[1]/div/div/div[2]/devsite-search/form/div[1]/div/input"));
        searchButton.sendKeys("Google Cloud Platform Pricing Calculator");
        searchButton.sendKeys(Keys.ENTER);


       WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'___gcse_0\']/div/div/div/div[5]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/div/a")));

        WebElement searchResult = driver.findElement(By.xpath("//*[@id=\'___gcse_0\']/div/div/div/div[5]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/div/a"));
          JavascriptExecutor executor = (JavascriptExecutor)driver;
        searchResult.click();

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"cloud-site\"]/devsite-iframe/iframe")));
        driver.switchTo().frame("myFrame");

        WebElement numberOfInstances = driver.findElement(By.xpath("//*[@id=\'input_60\']"));
        wait.until(ExpectedConditions.elementToBeClickable(numberOfInstances));
        numberOfInstances.sendKeys("4");

        WebElement instanceTypeClick = driver.findElement(By.id("select_container_87"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,instanceTypeClick);
        executor.executeScript("arguments[0].click();", instanceTypeClick);

        WebElement instanceType = driver.findElement(By.xpath("//*[@id=\"select_option_236\"]/div[1]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,instanceType);
        executor.executeScript("arguments[0].click();", instanceType);

        WebElement addGPUs = driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[8]/div[1]/md-input-container/md-checkbox/div[2]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
             ,addGPUs);
        executor.executeScript("arguments[0].click();", addGPUs);

        WebElement numberOfGPUsClick = driver.findElement(By.id("select_container_373"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,numberOfGPUsClick);
        executor.executeScript("arguments[0].click();", numberOfGPUsClick);

        WebElement numberOfGPUs = driver. findElement(By.xpath("//*[@id=\"select_option_377\"]/div[1]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,numberOfGPUs);
        executor.executeScript("arguments[0].click();", numberOfGPUs);

        WebElement GPUtypeClick = driver.findElement(By.id("select_container_375"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
             ,GPUtypeClick);
        executor.executeScript("arguments[0].click();", GPUtypeClick);

        WebElement GPUtype = driver. findElement(By.xpath("//*[@id=\"select_option_384\"]/div"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
             ,GPUtype);
        executor.executeScript("arguments[0].click();", GPUtype);

        WebElement localSSDClick = driver.findElement(By.id("select_container_194"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,localSSDClick);
        executor.executeScript("arguments[0].click();", localSSDClick);

        WebElement localSSD = driver.findElement(By.xpath("//*[@id=\"select_option_257\"]/div[1]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,localSSD);
        executor.executeScript("arguments[0].click();", localSSD);

        WebElement datacenterLocationClick = driver.findElement(By.id("select_container_89"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,datacenterLocationClick);
        executor.executeScript("arguments[0].click();", datacenterLocationClick);

        WebElement datacenterLocation = driver.findElement(By.xpath("//*[@id=\"select_option_204\"]/div"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,datacenterLocation);
        executor.executeScript("arguments[0].click();", datacenterLocation);

        WebElement  commitedUsageClick = driver.findElement(By.id("select_container_96"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,commitedUsageClick);
        executor.executeScript("arguments[0].click();", commitedUsageClick);

        WebElement commitedUsage = driver.findElement(By.xpath("//*[@id=\"select_option_93\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,commitedUsage);
        executor.executeScript("arguments[0].click();", commitedUsage);

        WebElement addToEstimate = driver.findElement(By.cssSelector("div.layout-align-end-start:nth-child(17) > button:nth-child(1)"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,addToEstimate);
        executor.executeScript("arguments[0].click();", addToEstimate);
        Thread.sleep(4000);
        driver.quit();

    }
}
