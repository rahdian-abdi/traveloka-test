package tapmo.testcases.main_function.ads_media;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import tapmo.dataprovider.PageElement;
import tapmo.pageobject.BasePage;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;

public class AdsMediaTest extends BasePage {


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
    @BeforeMethod(alwaysRun = true)
    public void settingUp(){
        // When
        click(By.xpath(PageElement.XPATH_ADS_MEDIA_MENU));
    }
    @AfterMethod(alwaysRun = true)
    public void tearingDown(){

    }
    /*
    @Test(priority = 1, groups = "smoke")
    public void verify_data_ads_media_is_displayed(){

        // Then
        int i=1;
        while (i <= 10){
            isDisplayed(By.xpath(PageElement.XPATH_ADS_MEDIA_TITLE_ADS_LIST(i)));
            i++;
        }
    }

    @Test(priority = 2, groups = "smoke")
    public void search_ads_media_title_with_registered_title(){
        // Given
        String target_title = "test";

        // When
        inputText(By.xpath(PageElement.XPATH_ADS_MEDIA_SEARCH_BAR), target_title);
        click(By.xpath(PageElement.XPATH_ADS_MEDIA_SEARCH_BUTTON));

        // Then
        int startIndex = 1;
        int lengthIndex = 10;

        while (startIndex <= lengthIndex){
            try {
                getText(By.xpath(PageElement.XPATH_ADS_MEDIA_TITLE_ADS_LIST(startIndex))).toLowerCase().contains(target_title);
                startIndex++;
            } catch (Exception e){
                break;
            }
        }
        click(By.xpath(PageElement.XPATH_CLEAR_BUTTON));
    }
    @Test(priority = 3, groups = "smoke")
    public void search_ads_media_status_with_registered_status(){
        // Given
        String target_status = "draft";

        // When
        inputText(By.xpath(PageElement.XPATH_ADS_MEDIA_SEARCH_BAR), target_status);
        click(By.xpath(PageElement.XPATH_ADS_MEDIA_SEARCH_BUTTON));

        int startIndex = 1;
        int lengthIndex = 10;

        while (startIndex <= lengthIndex){
            try {
                assertEquals(target_status, getText(By.xpath(PageElement.XPATH_ADS_MEDIA_STATUS_ADS_LIST(startIndex))));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }
        click(By.xpath(PageElement.XPATH_CLEAR_BUTTON));
    }
    @Test(priority = 4, groups = "smoke")
    public void search_ads_media_title_with_unregistered_title(){
        // Given
        String target_title = "xxxxx";

        // When
        inputText(By.xpath(PageElement.XPATH_ADS_MEDIA_SEARCH_BAR), target_title);
        click(By.xpath(PageElement.XPATH_ADS_MEDIA_SEARCH_BUTTON));

        // Then
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_ADS_MEDIA_DATA_NOT_FOUND)));
        click(By.xpath(PageElement.XPATH_CLEAR_BUTTON));
    }

     */
    @Test(priority = 5, groups = "smoke")
    public void create_ads_media_with_valid_input(){
        // Given
        String target_create_status = "publish";
        String target_create_title = "title media";
        String target_create_content = "content media";

        List<String> target = new ArrayList<>();
        target.add(target_create_title);
        target.add(target_create_status);
        target.add(target_create_content);


        // When
        click(By.xpath(PageElement.XPATH_ADS_MEDIA_ADD_BUTTON));

        int indexCreate = 1;

        selectDropDown(By.xpath(PageElement.XPATH_ADS_MEDIA_STATUS(indexCreate, 1)), target_create_status);

        inputText(By.xpath(PageElement.XPATH_ADS_MEDIA_TITLE(indexCreate, 2)), target_create_title);

        inputText(By.xpath(PageElement.XPATH_ADS_MEDIA_CONTENT(indexCreate, 3)), target_create_content);

        inputText(By.xpath(PageElement.XPATH_ADS_MEDIA_IMAGE_UPLOAD(indexCreate, 4)), uploadImage());

        click(By.xpath(PageElement.XPATH_ADS_MEDIA_SUBMIT(indexCreate, 5)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        int indexVerify = 3;
        int lengthIndex = 4;
        while (indexVerify <= lengthIndex){
            assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_ADS_MEDIA_VERIFY(indexVerify)))));
            indexVerify++;
        }
    }

    @Test(priority = 8, groups = "smoke")
    public void edit_ads_media_with_valid_input() {
        // Given
        String target_edit_status = "publish";
        String target_edit_title = "title media update";
        String target_edit_content = "content media update";

        List<String> target = new ArrayList<>();
        target.add(target_edit_title);
        target.add(target_edit_status);
        target.add(target_edit_content);


        // When
        click(By.xpath(PageElement.XPATH_ADS_MEDIA_EDIT_BUTTON_FIRST_ROW));

        int indexEdit = 3;

        selectDropDown(By.xpath(PageElement.XPATH_ADS_MEDIA_STATUS(indexEdit, 2)), target_edit_status);

        clearField(By.xpath(PageElement.XPATH_ADS_MEDIA_TITLE(indexEdit, 3)));
        inputText(By.xpath(PageElement.XPATH_ADS_MEDIA_TITLE(indexEdit, 3)), target_edit_title);

        clearField(By.xpath(PageElement.XPATH_ADS_MEDIA_CONTENT(indexEdit, 4)));
        inputText(By.xpath(PageElement.XPATH_ADS_MEDIA_CONTENT(indexEdit, 4)), target_edit_content);

        inputText(By.xpath(PageElement.XPATH_ADS_MEDIA_IMAGE_UPLOAD(indexEdit, 5)), uploadImage());

        click(By.xpath(PageElement.XPATH_ADS_MEDIA_SUBMIT(indexEdit, 6)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        int indexVerify = 3;
        int lengthIndex = 4;
        while (indexVerify <= lengthIndex) {
            assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_ADS_MEDIA_VERIFY(indexVerify)))));
            indexVerify++;
        }
    }

    @Test(priority = 10, groups = "smoke")
    public void verify_delete_ads_media_functionality() {
        // Given
        String target_edit_status = "draft";
        String target_edit_title = "title media update";
        String target_edit_content = "content media update";

        List<String> target = new ArrayList<>();
        target.add(target_edit_title);
        target.add(target_edit_status);
        target.add(target_edit_content);

        int indexDelete = 2;

        // When
        click(By.xpath(PageElement.XPATH_ADS_MEDIA_DELETE_FIRST_ROW));
        click(By.xpath(PageElement.XPATH_ADS_MEDIA_SUBMIT(indexDelete, 6)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        int indexVerify = 3;
        int lengthIndex = 4;
        while (indexVerify <= lengthIndex) {
            assertFalse(target.contains(getText(By.xpath(PageElement.XPATH_ADS_MEDIA_VERIFY(indexVerify)))));
            indexVerify++;
        }
    }
}
