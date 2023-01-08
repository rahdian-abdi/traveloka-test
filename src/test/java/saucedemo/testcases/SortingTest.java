package saucedemo.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import saucedemo.CustomDataProvider;
import saucedemo.PageObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SortingTest  {
    public WebDriver driver;
    public PageObject object;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        object = new PageObject(driver);
        System.out.println("Open browser");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @AfterTest
    public void tearDown(){
        System.out.println("Close browser");
        driver.quit();
        driver = null;
    }
    @Parameters({"baseUrl", "username", "password"})
    @BeforeMethod
    public void login(String baseUrl, String username, String password){
        System.out.println("CheckIn");
        object.navigateUrl(baseUrl);
        object.inputText(By.id("user-name"), username);
        object.inputText(By.id("password"), password);
        object.click(By.id("login-button"));
    }
    @AfterMethod
    public void logout(){
        System.out.println("CheckOut");
        object.click(By.id("react-burger-menu-btn"));
        object.click(By.id("logout_sidebar_link"));
    }
    @Test(dataProvider = "SortData", dataProviderClass = CustomDataProvider.class)
    public void sortItem(String sortBy){
        object.selectDropDown(By.className("product_sort_container"), sortBy);
        List<WebElement> element = object.finds(By.className("inventory_item_name"));
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
//    @Parameters("sortByDesc")
//    @Test
//    public void sortItemDesc(String sortByDesc){
//        object.selectDropDown(By.className("product_sort_container"), sortByDesc);
//        List<WebElement> element = object.finds(By.className("inventory_item_name"));
//        List<String> items = new ArrayList<>();
//        List<String> expected = new ArrayList<>();
//        for (WebElement get : element){
//            items.add(get.getText());
//        }
//        for (WebElement get : element){
//            expected.add(get.getText());
//        }
//        Collections.sort(expected, Collections.reverseOrder());
//        assertEquals(expected, items);
//    }
}
