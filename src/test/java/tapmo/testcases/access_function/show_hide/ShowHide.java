package tapmo.testcases.access_function.show_hide;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
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
        assertEquals("password",
                getAttributeType(
                        By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/form/div/input")));
        inputText(By.cssSelector("input[class='w-full input input-bordered']"), "test");
        // When
        click(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/form/div/button"));
        // Then
        assertEquals("text",
                getAttributeType(
                        By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/form/div/input")));
    }
}
