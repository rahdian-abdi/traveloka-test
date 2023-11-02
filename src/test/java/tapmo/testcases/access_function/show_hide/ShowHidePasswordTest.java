package tapmo.testcases.access_function.show_hide;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tapmo.dataprovider.PageElement;
import tapmo.pageobject.BasePage;

import static org.junit.Assert.assertEquals;

public class ShowHidePasswordTest extends BasePage {
    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        initiateDriver();
        navigateUrl(LOGIN);
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        closeDriver();
    }
    @Feature("Authentications")
    @Story("User need to login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Show/Hide Password Functionality")
    @Test(priority = 1, groups = "login-test", description = "Show/Hide Password Functionality")
    public void verify_show_hide_password_functionality_is_working(){
        // Given
        assertEquals("password", getAttributeType(By.cssSelector(PageElement.CSS_INPUT_PASSWORD_FIELD)));
        inputText(By.cssSelector(PageElement.CSS_INPUT_PASSWORD_FIELD), "password");
        // When
        click(By.xpath(PageElement.XPATH_SHOW_HIDE_BUTTON));
        // Then
        assertEquals("text", getAttributeType(By.cssSelector(PageElement.CSS_INPUT_PASSWORD_FIELD)));
    }
}
