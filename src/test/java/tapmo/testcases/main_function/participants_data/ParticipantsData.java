package tapmo.testcases.main_function.participants_data;

import org.openqa.selenium.By;
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
        navigateUrl(LOGIN);
        login_cms();
    }
    @AfterTest(alwaysRun = true)
    public void tearDown(){
        closeDriver();
    }
    @BeforeMethod
    public void settingUp(){
        // When
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_MENU));
    }
    @Test(priority = 1, groups = "smoke")
    public void verify_data_participants_is_displayed(){


        // Then
        int i=1;
        while (i <= 10){
            isDisplayed(By.xpath(PageElement.XPATH_LISTED_NIK_PARTICIPANTS(i)));
            i++;
        }
    }
    @Test(priority = 2, groups = "smoke")
    public void search_nik_with_registered_nik(){
        // Given
        String target_nik = "940407430886001";

        // When
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_MENU));
        inputText(By.xpath(PageElement.XPATH_PARTICIPANTS_SEARCH_BAR), target_nik);
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_SEARCH_BUTTON));

        int startIndex = 1;
        int lengthIndex = 10;
        List<String> getNik = new ArrayList<>();

        while (startIndex <= lengthIndex){
            try {
                getNik.add(getText(By.xpath(PageElement.XPATH_LISTED_NIK_PARTICIPANTS(startIndex))));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }

        // Then
        for (String nik : getNik){
            int isContain = nik.indexOf(target_nik);
            assertTrue(isContain > -1);
        }
    }
    @Test(priority = 3, groups = "smoke")
    public void search_nik_with_registered_3_digit_number(){
        // Given
        String target_nik = "489";

        // When
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_MENU));
        inputText(By.xpath(PageElement.XPATH_PARTICIPANTS_SEARCH_BAR), target_nik);
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_SEARCH_BUTTON));

        int lastIndex = 10;
        int startIndex = 1;
        List<String> listNik = new ArrayList<>();

        while (startIndex <= lastIndex){
            try {
                listNik.add(getText(By.xpath(PageElement.XPATH_LISTED_NIK_PARTICIPANTS(startIndex))));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }

        // Then
        for (String n : listNik){
            int isContain = n.indexOf(target_nik);
            assertTrue(isContain > -1);
        }
    }

    @Test(priority = 3, groups = "smoke")
    public void search_nik_with_unregistered_nik(){
        // Given
        String target_nik = "000000000000000";

        // When
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_MENU));
        inputText(By.xpath(PageElement.XPATH_PARTICIPANTS_SEARCH_BAR), target_nik);
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_SEARCH_BUTTON));

        // Then
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_PARTICIPANTS_DATA_NOT_FOUND)));
    }

    @Test(priority = 3, groups = "smoke")
    public void verify_clear_functionality_participants_is_working(){

        // When
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_CLEAR_BAR_BUTTON));

        // Then
        int i=1;
        while (i <= 10){
            isDisplayed(By.xpath(PageElement.XPATH_LISTED_NIK_PARTICIPANTS(i)));
            i++;
        }
    }

    @Test(priority = 2, groups = "smoke")
    public void search_name_with_registered_name(){
        // Given
        String target_name = "Tono Martian";

        // When
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_MENU));
        inputText(By.xpath(PageElement.XPATH_PARTICIPANTS_SEARCH_BAR), target_name);
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_SEARCH_BUTTON));

        int startIndex = 1;
        int lengthIndex = 10;
        List<String> getName = new ArrayList<>();

        while (startIndex <= lengthIndex){
            try {
                getName.add(getText(By.xpath(PageElement.XPATH_LISTED_NAME_PARTICIPANTS(startIndex))));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }

        // Then
        for (String nik : getName){
            int isContain = nik.indexOf(target_name);
            assertTrue(isContain > -1);
        }
    }

    @Test(priority = 2, groups = "smoke")
    public void search_name_with_registered_short_name(){
        // Given
        String target_name = "Tono";

        // When
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_MENU));
        inputText(By.xpath(PageElement.XPATH_PARTICIPANTS_SEARCH_BAR), target_name);
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_SEARCH_BUTTON));

        int startIndex = 1;
        int lengthIndex = 10;
        List<String> getName = new ArrayList<>();

        while (startIndex <= lengthIndex){
            try {
                getName.add(getText(By.xpath(PageElement.XPATH_LISTED_NAME_PARTICIPANTS(startIndex))));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }

        // Then
        for (String nik : getName){
            int isContain = nik.indexOf(target_name);
            assertTrue(isContain > -1);
        }
    }

    @Test(priority = 2, groups = "smoke")
    public void search_name_with_unregistered_name(){
        // Given
        String target_name = "xxxxx";

        // When
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_MENU));
        inputText(By.xpath(PageElement.XPATH_PARTICIPANTS_SEARCH_BAR), target_name);
        click(By.xpath(PageElement.XPATH_PARTICIPANTS_SEARCH_BUTTON));

        // Then
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_PARTICIPANTS_DATA_NOT_FOUND)));
    }
}
