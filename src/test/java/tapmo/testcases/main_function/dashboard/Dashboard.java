package tapmo.testcases.main_function.dashboard;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tapmo.dataprovider.PageElement;
import tapmo.pageobject.BasePage;

import static org.junit.Assert.assertTrue;

public class Dashboard extends BasePage {
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
    public void verify_dashboard_information_is_exist(){
        // Given
        login_cms();
        // When
        // Then
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_SITARA_GRAPH)));
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_FLPP_GRAPH)));
    }
}
