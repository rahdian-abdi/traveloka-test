package tapmo.testcases.access_function.show_hide;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tapmo.dataprovider.PageElement;
import tapmo.pageobject.BasePage;

import static org.junit.Assert.assertEquals;

public class ShowHide extends BasePage {
    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        initiateDriver();
        navigateUrl(BASE_URL);
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        closeDriver();
    }
    @Test(priority = 1, groups = "smoke")
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
