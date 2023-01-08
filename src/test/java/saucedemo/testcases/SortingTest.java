package saucedemo.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import saucedemo.dataprovider.CustomDataProvider;
import saucedemo.initiate.Initialize;
import saucedemo.pageobject.BasePage;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SortingTest extends BasePage {
    @BeforeTest
    public void setUp(){
        getDriver();
        Initialize.initiate();
    }
    @AfterTest
    public void tearDown(){
        Initialize.quit();
    }
    @Parameters({"baseUrl", "username", "password"})
    @BeforeMethod
    public void login(String baseUrl, String username, String password){
        navigateUrl(baseUrl);
        inputText(By.id("user-name"), username);
        inputText(By.id("password"), password);
        click(By.id("login-button"));
    }
    @AfterMethod
    public void logout(){
        click(By.id("react-burger-menu-btn"));
        click(By.id("logout_sidebar_link"));
    }
    @Test(dataProvider = "SortData", dataProviderClass = CustomDataProvider.class)
    public void sortItem(String sortBy){
        selectDropDown(By.className("product_sort_container"), sortBy);
        List<WebElement> element = finds(By.className("inventory_item_name"));
        List<String> items = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        for (WebElement get : element){
            items.add(get.getText());
        }
        for (WebElement get : element){
            expected.add(get.getText());
        }
        switch (sortBy){
            case "Name (A to Z)":
                Collections.sort(expected);
                assertEquals(expected, items);
                break;
            case "Name (Z to A)":
                Collections.sort(expected, Collections.reverseOrder());
                assertEquals(expected, items);
                break;
        }
    }
}
