package tapmo.testcases.main_function.participants_data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import tapmo.dataprovider.PageElement;
import tapmo.pageobject.BasePage;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ParticipantsData extends BasePage {
    @BeforeTest(alwaysRun = true)
    public void setUp(){
        initiateDriver();
        navigateUrl(BASE_URL);
        login_cms();
    }
    @AfterTest(alwaysRun = true)
    public void tearDown(){
        closeDriver();
    }
    @Test(priority = 1, groups = "smoke")
    public void verify_data_participants_is_displayed(){
        // Given
        // When
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_MENU));

        // Then
        int i=1;
        while (i <= 5){
            isDisplayed(By.xpath(PageElement.XPATH_PARTICIPANTS_ROW_TEN(i)));
            i++;
        }
    }
    @Test(priority = 2, groups = "smoke")
    public void search_nik_with_registered_nik(){
        // Given
        String target_nik = "940407430886001";
        int data_target_length = 5;

        // When
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_MENU));
        inputText(By.xpath(PageElement.XPATH_SEARCH_PARTICIPANTS_BAR), target_nik);
        click(By.xpath(PageElement.XPATH_SEARCH_PARTICIPANTS_BUTTON));
        List<WebElement> row_length = finds(By.cssSelector(PageElement.CSS_ROW_DATA_PARTICIPANTS));
        String nik_no = getText(By.xpath(PageElement.XPATH_NIK_FIRST_ROW_DATA));

        // Then
        assertEquals(target_nik, nik_no);
        assertEquals(data_target_length, row_length.size());
    }
    @Test(priority = 3, groups = "smoke")
    public void search_nik_with_3_digit_number(){
        // Given
        String target_nik = "489";

        // When
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_MENU));
        inputText(By.xpath(PageElement.XPATH_SEARCH_PARTICIPANTS_BAR), target_nik);
        click(By.xpath(PageElement.XPATH_SEARCH_PARTICIPANTS_BUTTON));

        int lastIndex = 10;
        int startIndex = 1;
        List<String> listNik = new ArrayList<>();

        while (startIndex <= lastIndex){
            try {
                listNik.add(getText(By.xpath(PageElement.XPATH_LISTED_NIK_PARTICIPANTS(startIndex))));
            } catch (Exception e){
                break;
            }
            startIndex++;
        }

        for (String n : listNik){
            int isContain = n.indexOf(target_nik);
            assertTrue(isContain > -1);
        }
    }

    @Test(priority = 3, groups = "smoke")
    public void verify_clear_functionality_participants_is_working(){

        // When
        click(By.xpath(PageElement.XPATH_CLEAR_PARTICIPANTS_BAR_BUTTON));

        // Then
        int i=1;
        while (i <= 5){
            isDisplayed(By.xpath(PageElement.XPATH_PARTICIPANTS_ROW_TEN(i)));
            i++;
        }
    }

}
