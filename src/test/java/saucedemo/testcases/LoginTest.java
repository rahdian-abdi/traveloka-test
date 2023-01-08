package saucedemo.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import saucedemo.CustomDataProvider;
import saucedemo.PageObject;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
public class LoginTest {
    public WebDriver driver;
    public PageObject object;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        object = new PageObject(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
        driver = null;
    }
    @Parameters("baseUrl")
    @BeforeMethod
    public void goToUrl(String baseUrl){
        object.navigateUrl(baseUrl);
    }
    @AfterMethod
    public void deleteCookies(){
        driver.manage().deleteAllCookies();
    }
    @Parameters("inventoryUrl")
    @Test(dataProvider = "LoginData", dataProviderClass = CustomDataProvider.class)
    public void loginWithValidCredentials(String username, String password){
        object.inputText(By.id("user-name"), username);
        object.inputText(By.id("password"), password);
        object.click(By.id("login-button"));

        switch (username){
            case "secret_sauce":
                String urlInventory = "https://www.saucedemo.com/inventory.html";
                assertEquals(urlInventory, object.getUrl());
                break;
            case "locked_out_user":
                assertTrue(object.isDisplayed(By.className("error-button")));
                break; // It will execute all case unless put the break
        }
    }
}
