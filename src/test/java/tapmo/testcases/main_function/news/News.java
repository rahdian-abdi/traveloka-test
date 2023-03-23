package tapmo.testcases.main_function.news;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import tapmo.dataprovider.PageElement;
import tapmo.pageobject.BasePage;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class News extends BasePage {

    @BeforeTest(alwaysRun = true)
    public void setUp(){
        initiateDriver();
        navigateUrl(LOGIN);
        login_cms();
        // When
        click(By.xpath(PageElement.XPATH_NEWS_LIST_MENU));
    }
    @AfterTest(alwaysRun = true)
    public void tearDown(){
        closeDriver();
    }
    @BeforeMethod(alwaysRun = true)
    public void settingUp(){

    }
    @AfterMethod(alwaysRun = true)
    public void tearingDown(){

    }
    @Test(priority = 1, groups = "smoke")
    public void verify_data_news_is_displayed(){

        // Then
        int i=1;
        while (i <= 10){
            try {
                isDisplayed(By.xpath(PageElement.XPATH_NEWS_LIST_TITLE_LIST(i)));
                i++;
            } catch (Exception e){
                break;
            }
        }
    }

    @Test(priority = 2, groups = "smoke")
    public void search_news_title_with_registered_title(){
        // Given
        String target_title = "test";

        // When
        inputText(By.xpath(PageElement.XPATH_NEWS_LIST_SEARCH_BAR), target_title);
        click(By.xpath(PageElement.XPATH_NEWS_LIST_SEARCH_BUTTON));

        // Then
        int startIndex = 1;
        int lengthIndex = 10;
        int isContain = -1;

        while (startIndex <= lengthIndex){
            try {
                assertNotEquals(isContain, getText(By.xpath(PageElement.XPATH_NEWS_LIST_TITLE_LIST(startIndex))).toLowerCase().indexOf(target_title));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }
        click(By.xpath(PageElement.XPATH_CLEAR_BRANCH_BUTTON));
    }
    @Test(priority = 3, groups = "smoke")
    public void news_search_category_with_registered_category(){
        // Given
        String target_category = "Breaking News Tapera 2";

        // When
        inputText(By.xpath(PageElement.XPATH_NEWS_LIST_SEARCH_BAR), target_category);
        click(By.xpath(PageElement.XPATH_NEWS_LIST_SEARCH_BUTTON));

        // Then
        int startIndex = 1;
        int lengthIndex = 10;
        int isNotContain = -1;

        while (startIndex <= lengthIndex){
            try {
                assertNotEquals(isNotContain, getText(By.xpath(PageElement.XPATH_NEWS_LIST_CATEGORY_LIST(startIndex))).indexOf(target_category));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }
        click(By.xpath(PageElement.XPATH_CLEAR_BRANCH_BUTTON));
    }
    @Test(priority = 4, groups = "smoke")
    public void news_search_status_with_registered_status(){
        // Given
        String target_status = "draft";

        // When
        inputText(By.xpath(PageElement.XPATH_NEWS_LIST_SEARCH_BAR), target_status);
        click(By.xpath(PageElement.XPATH_NEWS_LIST_SEARCH_BUTTON));

        int startIndex = 1;
        int lengthIndex = 10;

        while (startIndex <= lengthIndex){
            try {
                assertEquals(target_status, getText(By.xpath(PageElement.XPATH_NEWS_LIST_STATUS_LIST(startIndex))));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }
        click(By.xpath(PageElement.XPATH_CLEAR_BRANCH_BUTTON));
    }
    @Test(priority = 5, groups = "smoke")
    public void news_search_title_with_unregistered_title(){
        // Given
        String target_title = "xxxxx";

        // When
        inputText(By.xpath(PageElement.XPATH_NEWS_LIST_SEARCH_BAR), target_title);
        click(By.xpath(PageElement.XPATH_NEWS_LIST_SEARCH_BUTTON));

        // Then
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_NEWS_LIST_DATA_NOT_FOUND)));
        click(By.xpath(PageElement.XPATH_CLEAR_BRANCH_BUTTON));
    }
    @Test(priority = 6, groups = "smoke")
    public void create_news_with_valid_input(){
        // Given
        String target_create_title = "Lorem";
        String target_create_description = "Ipsum";
        String target_create_category = "Lorem";
        String target_create_status = "publish";

        List<String> target = new ArrayList<>();
        target.add(target_create_title);
        target.add(target_create_description);
        target.add(target_create_category);
        target.add(target_create_status);


        // When
        click(By.xpath(PageElement.XPATH_NEWS_LIST_NEW_NEWS_BUTTON));

        int indexCreate = 1;

        inputText(By.xpath(PageElement.XPATH_NEWS_LIST_TITLE(indexCreate)), target_create_title);

        inputText(By.xpath(PageElement.XPATH_NEWS_LIST_DESCRIPTION(indexCreate)), target_create_description);

        inputText(By.xpath(PageElement.XPATH_NEWS_LIST_THUMBNAIL_NEWS(indexCreate)), uploadImage());

        selectDropDown(By.xpath(PageElement.XPATH_NEWS_LIST_NEWS_CATEGORY(indexCreate)), target_create_category);

        selectDropDown(By.xpath(PageElement.XPATH_NEWS_LIST_NEWS_STATUS(indexCreate)), target_create_status);

        click(By.xpath(PageElement.XPATH_NEWS_LIST_NEWS_SUBMIT(indexCreate)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        int indexVerify = 2;
        int lengthIndex = 5;
        while (indexVerify <= lengthIndex){
            assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_NEWS_LIST_NEWS_VERIFY(indexVerify)))));
            indexVerify++;
        }
    }

    // Can't Be Automated
    @Test(priority = 7, groups = "smoke")
    public void edit_news_with_valid_input() {
        // Given
        String target_update_title = "TitleUpdate";
        String target_update_description = "Update";
        String target_update_status = "publish";

        List<String> target = new ArrayList<>();
        target.add(target_update_title);
        target.add(target_update_description);
        target.add(target_update_status);


        // When
        click(By.xpath(PageElement.XPATH_NEWS_LIST_EDIT_NEWS_FIRST_ROW));

        int indexUpdate = 2;

        clearField(By.xpath(PageElement.XPATH_NEWS_LIST_TITLE(indexUpdate)));
        inputText(By.xpath(PageElement.XPATH_NEWS_LIST_TITLE(indexUpdate)), target_update_title);

        clearField(By.xpath(PageElement.XPATH_NEWS_LIST_DESCRIPTION(indexUpdate)));
        inputText(By.xpath(PageElement.XPATH_NEWS_LIST_DESCRIPTION(indexUpdate)), target_update_description);

        inputText(By.xpath(PageElement.XPATH_NEWS_LIST_THUMBNAIL_NEWS(indexUpdate)), uploadImage());

        selectDropDown(By.xpath(PageElement.XPATH_NEWS_LIST_NEWS_STATUS(indexUpdate)), target_update_status);

        click(By.xpath(PageElement.XPATH_NEWS_LIST_NEWS_SUBMIT(indexUpdate)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_NEWS_LIST_NEWS_VERIFY(2)))));
        assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_NEWS_LIST_NEWS_VERIFY(4)))));
        assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_NEWS_LIST_NEWS_VERIFY(5)))));
    }

    @Test(priority = 8, groups = "smoke")
    public void verify_delete_news_functionality() {
        // Given
        String target_update_title = "TitleUpdate";

        List<String> target = new ArrayList<>();
        target.add(target_update_title);

        int indexDelete = 3;

        // When
        waitElementClickable(By.xpath(PageElement.XPATH_NEWS_LIST_DELETE_NEWS_FIRST_ROW));
        click(By.xpath(PageElement.XPATH_NEWS_LIST_DELETE_NEWS_FIRST_ROW));
        waitElementClickable(By.xpath(PageElement.XPATH_NEWS_LIST_NEWS_SUBMIT(indexDelete)));
        click(By.xpath(PageElement.XPATH_NEWS_LIST_NEWS_SUBMIT(indexDelete)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        assertFalse(target.contains(getText(By.xpath(PageElement.XPATH_NEWS_LIST_NEWS_VERIFY(2)))));
    }
}
