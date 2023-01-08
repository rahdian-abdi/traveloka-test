package saucedemo.initiate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import saucedemo.pageobject.PageObject;

import java.util.concurrent.TimeUnit;

public class Initialize {
    public static WebDriver driver;
    public static PageObject object;

    public static void initiate(){
        driver = new ChromeDriver();
        object = new PageObject(driver);
        System.out.println("Open browser");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public static void quit(){
        driver.quit();
        driver = null;
    }
}
