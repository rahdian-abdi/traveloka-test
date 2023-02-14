package tapmo.testcases.access_function.login_to_administration_panel;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tapmo.pageobject.BasePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginToAdministrationPanel extends BasePage {
    public String DASHBOARD_URL;
    public String LOGIN_URL;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        initiateDriver();
        navigateUrl(BASE_URL);
        LOGIN_URL = "http://tapfe.terralogiq.net:3001/login";
        DASHBOARD_URL = "http://tapfe.terralogiq.net:3001/dashboard";
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        closeDriver();
    }
    @Test(priority = 1, groups = "smoke")
    public void login_with_valid_credentials(){
        // Given
        inputText(By.cssSelector("input[class='input input-bordered w-full']"), "superadmin@gmail.com");
        inputText(By.cssSelector("input[class='w-full input input-bordered']"), "superadmin");

        // When
        click(By.cssSelector("button[class='btn bg-green-600 border-none mt-4 hover:bg-green-700 ']"));
        waitWebToLoad(DASHBOARD_URL);

        // Then
        assertEquals(DASHBOARD_URL, getUrl());
        assertTrue(isDisplayed(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[1]/div/div[2]/ul/li[1]/a")));
    }

    @Test(priority = 2, groups = "smoke")
    public void login_with_invalid_credentials(){
        // Given
        inputText(By.cssSelector("input[class='input input-bordered w-full']"), "superadmin@gmail.com");
        inputText(By.cssSelector("input[class='w-full input input-bordered']"), "superadmininvalid");

        // When
        click(By.cssSelector("button[class='btn bg-green-600 border-none mt-4 hover:bg-green-700 ']"));
        waitElementAppear(By.cssSelector("div[class='Toastify__toast-container Toastify__toast-container--top-center']"));

        // Then
        assertEquals(LOGIN_URL, getUrl());
    }
    @Test(priority = 3, groups = "smoke")
    public void access_dashboard_page_without_login(){
        // Given

        // When
        navigateUrl(DASHBOARD_URL);
        // Then
        assertEquals(LOGIN_URL, getUrl());
    }
    @Test(priority = 4, groups = "smoke")
    public void access_login_page_without_logout(){
        // Given
        login_cms();
        // When
        navigateUrl(LOGIN_URL);
        // Then
        waitWebToLoad(DASHBOARD_URL);
        assertEquals(DASHBOARD_URL, getUrl());
    }
    @Test(priority = 4, groups = "smoke")
    public void verify_logout_functionality_is_working(){
        // Given
        login_cms();
        // When
        click(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div/button/div"));
        click(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/ul"));
        // Then
        waitWebToLoad(LOGIN_URL);
        assertEquals(LOGIN_URL, getUrl());
    }
}
