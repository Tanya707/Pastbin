package MainMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BringItOn {

    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://pastebin.com");
        WebElement searchInputCode = driver.findElement(By.id("postform-text"));
        searchInputCode.sendKeys("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");


        WebElement elementExpiration = driver.findElement(By.cssSelector("#copy_address"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        elementExpiration.click();
        WebElement elementOptionExpiration = driver.findElement(By.xpath("//*[@class='select2-results__option' and text()='Bash']"));
        elementOptionExpiration.click();


        WebElement element = driver.findElement(By.xpath("//*[@id='select2-postform-expiration-container']"));
        element.click();
        WebElement elementOption = driver.findElement(By.xpath("//*[@class='select2-results__option' and text()='10 Minutes']"));
        elementOption.click();

        WebElement searchInputPasteName = driver.findElement(By.xpath("//*[@name=\'PostForm[name]\']"));
        searchInputPasteName.sendKeys("how to gain dominance among developers");
        WebElement searchButtonCreate = driver.findElement(By.xpath("//*[@id=\'w0\']/div[5]/div[1]/div[6]/button"));
        searchButtonCreate.click();
        Thread.sleep(4000);
        driver.quit();

    }
}
