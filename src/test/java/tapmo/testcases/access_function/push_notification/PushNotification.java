package tapmo.testcases.access_function.push_notification;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tapmo.dataprovider.PageElement;
import tapmo.pageobject.BasePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PushNotification extends BasePage {
    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        initiateDriver();
        navigateUrl(LOGIN);
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        closeDriver();
    }
    @Test(priority = 1, groups = "smoke")
    public void verify_push_notification_is_exist(){
        // Given
        login_cms();

        // When
        click(By.xpath(PageElement.XPATH_NOTIFICATION_BUTTON));

        // Then
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_NOTIFICATION_BOARD)));
    }
}
