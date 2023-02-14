package tapmo.testcases.main_function.participants_data;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tapmo.pageobject.BasePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParticipantsData extends BasePage {
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
    public void verify_data_participants_is_displayed(){
        // Given
        login_cms();

        // When
        click(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[1]/div/div[2]/ul/div[1]/li"));

        // Then
        int i=1;
        while (i <= 5){
            isDisplayed(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/table/tbody/tr[10]/td["+i+"]"));
            i++;
        }
    }
}
