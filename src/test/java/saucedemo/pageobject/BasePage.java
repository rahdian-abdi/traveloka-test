package saucedemo.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public WebDriver driver;
    public String BASE_URL;
    public void initiateDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        BASE_URL = "https://www.saucedemo.com";
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
    public void click(By by){
        find(by).click();
    }
    public boolean isDisplayed(By by){
        return find(by).isDisplayed();
    }
    public void selectDropDown(By by, String sortBy){
        Select select = new Select(find(by));
        select.selectByVisibleText(sortBy);
    }
}
