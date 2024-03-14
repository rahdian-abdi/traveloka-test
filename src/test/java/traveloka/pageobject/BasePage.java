package traveloka.pageobject;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import lombok.Getter;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class BasePage {
    @Getter
    public WebDriver driver;
    public String BASE_URL = "https://www.traveloka.com/en-id";
    public void initiateDriver(){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void closeDriver(){
        driver.quit();
        driver = null;
    }
    public void navigateUrl(String url){
        getDriver().navigate().to(url);
    }
    public WebElement find(By by){
        return getDriver().findElement(by);
    }
    public List<WebElement> finds(By by){
        return driver.findElements(by);
    }
    public void inputText(By by, String text){
        find(by).sendKeys(text);
    }
    public String getText(By by){
        return find(by).getText();
    }
    public void waitElementAppear(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public void click(By by){
        find(by).click();
    }
    public boolean isDisplayed(By by){
        return find(by).isDisplayed();
    }
    public void selectDropDown(By by, String selectBy){
        Select select = new Select(find(by));
        select.selectByVisibleText(selectBy);
    }
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");

    }
    @Attachment(value = "Screenshot", type = "image/png")
    public void takeScreenshot(){
        Allure.addAttachment("Screenshot", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }
}
