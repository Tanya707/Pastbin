package MainMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class ICanWin {

    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://pastebin.com");
        WebElement searchInputCode = driver.findElement(By.id("postform-text"));
        searchInputCode.sendKeys("Hello from WebDriver");

        WebElement element = driver.findElement(By.xpath("//*[@id='select2-postform-expiration-container']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        element.click();
        WebElement elementOption = driver.findElement(By.xpath("//*[@class='select2-results__option' and text()='10 Minutes']"));
        elementOption.click();

        WebElement searchInputPasteName = driver.findElement(By.xpath("//*[@name=\'PostForm[name]\']"));
        searchInputPasteName.sendKeys("helloweb");
        WebElement searchButtonCreate = driver.findElement(By.xpath("//*[@id=\'w0\']/div[5]/div[1]/div[6]/button"));
        searchButtonCreate.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
