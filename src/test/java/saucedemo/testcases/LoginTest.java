package saucedemo.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import saucedemo.dataprovider.CustomDataProvider;
import saucedemo.pageobject.BasePage;

import static org.junit.Assert.*;
public class LoginTest extends BasePage {
    public String INVENTORY_URL;
    @BeforeMethod
    public void setUp(){
        initiateDriver();
        navigateUrl(BASE_URL);
        INVENTORY_URL = "https://www.saucedemo.com/inventory.html";
        System.out.println("check in");
    }
    @AfterMethod
    public void tearDown(){
        closeDriver();
        System.out.println("check out");
    }
    @Parameters("inventoryUrl")
    @Test(dataProvider = "LoginData", dataProviderClass = CustomDataProvider.class)
    public void login_to_the_web(String username, String password){
        inputText(By.id("user-name"), username);
        inputText(By.id("password"), password);
        click(By.id("login-button"));

        switch (username){
            case "secret_sauce":
                assertEquals(INVENTORY_URL, getUrl());
                break;
            case "locked_out_user":
                assertTrue(isDisplayed(By.className("error-button")));
                break; // It will execute all case unless put the break
        }
    }
}
