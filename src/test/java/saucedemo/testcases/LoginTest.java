package saucedemo.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import saucedemo.dataprovider.CustomDataProvider;
import saucedemo.initiate.Initialize;
import saucedemo.pageobject.PageObject;

import static org.junit.Assert.*;
public class LoginTest {
    public WebDriver driver;
    public PageObject object;

    @BeforeTest
    public void setUp(){
        Initialize.initiate();
        driver = Initialize.driver;
        object = Initialize.object;
    }
    @AfterTest
    public void tearDown(){
        Initialize.quit();
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
