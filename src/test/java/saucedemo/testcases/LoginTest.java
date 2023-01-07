package saucedemo.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
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

//    @BeforeTest
//    public void settingUp(){
//
//    }
//    @AfterTest
//    public void tearingDown(){
//
//    }
    @Parameters("baseUrl")
    @BeforeMethod
    public void goToUrl(String baseUrl){
        object.navigateUrl(baseUrl);
    }
    @AfterMethod
    public void deleteCookies(){
        driver.manage().deleteAllCookies();
    }
    @Parameters({"username", "password", "inventoryUrl"})
    @Test(priority = 1)
    public void loginWithValidCredentials(String username, String password, String inventoryUrl){
        object.inputText(By.id("user-name"), username);
        object.inputText(By.id("password"), password);
        object.click(By.id("login-button"));
        assertEquals(inventoryUrl, object.getUrl());
    }
    @Parameters({"invalidUsername", "password"})
    @Test(priority = 2)
    public void loginWithInvalidCredentials(String invalidUsername, String password){
        object.inputText(By.id("user-name"), invalidUsername);
        object.inputText(By.id("password"), password);
        object.click(By.id("login-button"));
        assertTrue(object.isDisplayed(By.className("error-button")));
    }
}
