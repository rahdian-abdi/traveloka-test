package saucedemo.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import saucedemo.dataprovider.CustomDataProvider;
import saucedemo.initiate.Initialize;
import saucedemo.pageobject.BasePage;

import static org.junit.Assert.*;
public class LoginTest extends BasePage {

    @BeforeTest
    public void setUp(){
        getDriver();
        Initialize.initiate();
    }
    @AfterTest
    public void tearDown(){
        Initialize.quit();
    }
    @Parameters("baseUrl")
    @BeforeMethod
    public void goToUrl(String baseUrl){
        navigateUrl(baseUrl);
    }
    @AfterMethod
    public void deleteCookies(){
    }
    @Parameters("inventoryUrl")
    @Test(dataProvider = "LoginData", dataProviderClass = CustomDataProvider.class)
    public void loginWithValidCredentials(String username, String password){
        inputText(By.id("user-name"), username);
        inputText(By.id("password"), password);
        click(By.id("login-button"));

        switch (username){
            case "secret_sauce":
                String urlInventory = "https://www.saucedemo.com/inventory.html";
                assertEquals(urlInventory, getUrl());
                break;
            case "locked_out_user":
                assertTrue(isDisplayed(By.className("error-button")));
                break; // It will execute all case unless put the break
        }
    }
}
