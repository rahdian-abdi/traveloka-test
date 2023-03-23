package tapmo.testcases.access_function.login_to_administration_panel;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tapmo.dataprovider.PageElement;
import tapmo.pageobject.BasePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginToAdministrationPanel extends BasePage {
    public String DASHBOARD_URL;
    public String LOGIN_URL;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        initiateDriver();
        navigateUrl(LOGIN);
        LOGIN_URL = "http://tapfe.terralogiq.net:3001/login";
        DASHBOARD_URL = "http://tapfe.terralogiq.net:3001/dashboard";
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        closeDriver();
    }
    @Description("Login with Valid Credentials")
    @Test(priority = 1, groups = "smoke", description = "Login with Valid Credentials")
    public void login_with_valid_credentials(){
        // Given
        Allure.step("User Input Credentials");
        inputText(By.cssSelector(PageElement.CSS_INPUT_USERNAME_FIELD), "superadmin@gmail.com");
        inputText(By.cssSelector(PageElement.CSS_INPUT_PASSWORD_FIELD), "superadmin");

        // When
        Allure.step("User Click Login Button");
        click(By.cssSelector(PageElement.CSS_LOGIN_BUTTON));
        waitWebToLoad(DASHBOARD_URL);

        // Then
        Allure.step("User Directed to Dashboard");
        assertEquals(DASHBOARD_URL, getUrl());
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_DASHBOARD_MENU)));
    }

    @Test(priority = 2, groups = "smoke")
    public void login_with_invalid_credentials(){
        // Given
        inputText(By.cssSelector(PageElement.CSS_INPUT_USERNAME_FIELD), "superadmin@gmail.com");
        inputText(By.cssSelector(PageElement.CSS_INPUT_PASSWORD_FIELD), "superadmininvalid");

        // When
        click(By.cssSelector(PageElement.CSS_LOGIN_BUTTON));
        waitElementAppear(By.cssSelector(PageElement.CSS_TOAST_ERROR_LOGIN_MESSAGE));

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
    @Test(priority = 5, groups = "smoke")
    public void verify_logout_functionality_is_working(){
        // Given
        login_cms();
        // When
        click(By.xpath(PageElement.XPATH_PROFILE_MENU));
        click(By.xpath(PageElement.XPATH_LOGOUT_BUTTON));
        // Then
        waitWebToLoad(LOGIN_URL);
        assertEquals(LOGIN_URL, getUrl());
    }
}
