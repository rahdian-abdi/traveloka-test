package saucedemo.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PageObject {
    WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public void navigateUrl(String url){
        driver.navigate().to(url);
    }
    public WebElement find(By by){
        return driver.findElement(by);
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
