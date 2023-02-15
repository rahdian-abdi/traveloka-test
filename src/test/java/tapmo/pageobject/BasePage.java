package tapmo.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import tapmo.dataprovider.PageElement;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class BasePage {
    public WebDriver driver;
    public String BASE_URL;
    public void initiateDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        BASE_URL = "http://tapfe.terralogiq.net:3001/login";
    }
    public void closeDriver(){
        driver.quit();
        driver = null;
    }
    public WebDriver getDriver(){
        return driver;
    }
    public String getUrl(){
        return getDriver().getCurrentUrl();
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
    public void waitWebToLoad(String url){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.urlToBe(url));
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
    public void clearField(By by){
        find(by).clear();
    }
    public String getAttributeType(By by){
        return find(by).getAttribute("type");
    }
    public void selectDropDown(By by, String selectBy){
        Select select = new Select(find(by));
        select.selectByVisibleText(selectBy);
    }

    public void login_cms(){
        // Given
        inputText(By.cssSelector(PageElement.CSS_INPUT_USERNAME_FIELD), "superadmin@gmail.com");
        inputText(By.cssSelector(PageElement.CSS_INPUT_PASSWORD_FIELD), "superadmin");
        // When
        click(By.cssSelector(PageElement.CSS_LOGIN_BUTTON));
        waitWebToLoad("http://tapfe.terralogiq.net:3001/dashboard");
        // Then
        assertEquals("http://tapfe.terralogiq.net:3001/dashboard", getUrl());
    }
}
