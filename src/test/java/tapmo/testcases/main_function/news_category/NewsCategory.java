package tapmo.testcases.main_function.news_category;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import tapmo.dataprovider.PageElement;
import tapmo.pageobject.BasePage;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class NewsCategory extends BasePage {
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
        click(By.xpath(PageElement.XPATH_NEWS_CATEGORY_MENU));
    }
    @AfterMethod(alwaysRun = true)
    public void tearingDown(){

    }
    @Test(priority = 1, groups = "smoke")
    public void verify_data_news_category_is_displayed(){

        // Then
        int i=1;
        while (i <= 10){
            isDisplayed(By.xpath(PageElement.XPATH_NEWS_CATEGORY_TITLE_LIST(i)));
            i++;
        }
    }

    @Test(priority = 2, groups = "smoke")
    public void search_news_category_title_with_registered_title(){
        // Given
        String target_title = "test";

        // When
        inputText(By.xpath(PageElement.XPATH_NEWS_CATEGORY_SEARCH_BAR), target_title);
        click(By.xpath(PageElement.XPATH_NEWS_CATEGORY_SEARCH_BUTTON));

        // Then
        int startIndex = 1;
        int lengthIndex = 10;
        int isContain = -1;

        while (startIndex <= lengthIndex){
            try {
                assertEquals(isContain, getText(By.xpath(PageElement.XPATH_ADS_MEDIA_TITLE_ADS_LIST(startIndex))).toLowerCase().indexOf(target_title));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }
        click(By.xpath(PageElement.XPATH_CLEAR_BRANCH_BUTTON));
    }
    @Test(priority = 3, groups = "smoke")
    public void search_news_category_title_with_unregistered_title(){
        // Given
        String target_title = "xxxxx";

        // When
        inputText(By.xpath(PageElement.XPATH_NEWS_CATEGORY_SEARCH_BAR), target_title);
        click(By.xpath(PageElement.XPATH_NEWS_CATEGORY_SEARCH_BUTTON));

        // Then
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_NEWS_CATEGORY_DATA_NOT_FOUND)));
        click(By.xpath(PageElement.XPATH_CLEAR_BRANCH_BUTTON));
    }
    @Test(priority = 4, groups = "smoke")
    public void create_news_category_with_valid_input(){
        // Given
        String target_create_title = "title";
        String target_create_status = "Active";

        List<String> target = new ArrayList<>();
        target.add(target_create_title);
        target.add(target_create_status);


        // When
        click(By.xpath(PageElement.XPATH_NEWS_CATEGORY_CREATE_BUTTON));

        int indexCreate = 1;

        inputText(By.xpath(PageElement.XPATH_NEWS_CATEGORY_TITLE(indexCreate)), target_create_title);

        selectDropDown(By.xpath(PageElement.XPATH_NEWS_CATEGORY_STATUS(indexCreate)), target_create_status);

        click(By.xpath(PageElement.XPATH_NEWS_CATEGORY_SUBMIT(indexCreate)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        int indexVerify = 2;
        assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_NEWS_CATEGORY_VERIFY(indexVerify)))));
        assertEquals("active", getText(By.xpath(PageElement.XPATH_NEWS_CATEGORY_SLIDER)).toLowerCase());
    }

    @Test(priority = 5, groups = "smoke")
    public void edit_news_category_with_valid_input() {
        // Given
        String target_edit_title = "TitleUpdate";
        String target_edit_status = "Inactive";

        List<String> target = new ArrayList<>();
        target.add(target_edit_title);
        target.add(target_edit_status);


        // When
        click(By.xpath(PageElement.XPATH_NEWS_CATEGORY_EDIT_BUTTON));

        int indexCreate = 2;

        clearField(By.xpath(PageElement.XPATH_NEWS_CATEGORY_TITLE(indexCreate)));
        inputText(By.xpath(PageElement.XPATH_NEWS_CATEGORY_TITLE(indexCreate)), target_edit_title);

        selectDropDown(By.xpath(PageElement.XPATH_NEWS_CATEGORY_STATUS(indexCreate)), target_edit_status);

        click(By.xpath(PageElement.XPATH_NEWS_CATEGORY_SUBMIT(indexCreate)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        int indexVerify = 2;
        assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_NEWS_CATEGORY_VERIFY(indexVerify)))));
        assertEquals("inactive", getText(By.xpath(PageElement.XPATH_NEWS_CATEGORY_SLIDER)).toLowerCase());
    }


    @Test(priority = 6, groups = "smoke")
    public void verify_delete_news_category_functionality() {
        // Given
        String target_create_title = "TitleUpdate";

        List<String> target = new ArrayList<>();
        target.add(target_create_title);


        // When
        click(By.xpath(PageElement.XPATH_NEWS_CATEGORY_DELETE_BUTTON));

        int indexCreate = 3;

        click(By.xpath(PageElement.XPATH_NEWS_CATEGORY_SUBMIT(indexCreate)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        int indexVerify = 2;
        assertFalse(target.contains(getText(By.xpath(PageElement.XPATH_NEWS_CATEGORY_VERIFY(indexVerify)))));
    }
}
