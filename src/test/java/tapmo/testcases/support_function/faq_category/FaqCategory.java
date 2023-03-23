package tapmo.testcases.support_function.faq_category;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import tapmo.dataprovider.PageElement;
import tapmo.pageobject.BasePage;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class FaqCategory extends BasePage {
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
        click(By.xpath(PageElement.XPATH_FAQ_CATEGORY_MENU));
    }
    @AfterMethod(alwaysRun = true)
    public void tearingDown(){

    }
    @Test(priority = 1, groups = "smoke")
    public void verify_data_faq_category_is_displayed(){

        // Then
        int i=1;
        while (i <= 10){
            isDisplayed(By.xpath(PageElement.XPATH_FAQ_CATEGORY_TITLE_LIST(i)));
            i++;
        }
    }

    @Test(priority = 2, groups = "smoke")
    public void search_faq_category_name_with_registered_title(){
        // Given
        String target_title = "new";

        // When
        inputText(By.xpath(PageElement.XPATH_FAQ_CATEGORY_SEARCH_BAR), target_title);
        click(By.xpath(PageElement.XPATH_FAQ_CATEGORY_SEARCH_BUTTON));

        // Then
        int startIndex = 1;
        int lengthIndex = 10;

        while (startIndex <= lengthIndex){
            try {
                assertTrue(getText(By.xpath(PageElement.XPATH_FAQ_CATEGORY_TITLE_LIST(startIndex))).toLowerCase().contains(target_title));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }
    }
    @Test(priority = 2, groups = "smoke")
    public void search_faq_category_name_with_unregistered_name(){
        // Given
        String target_title = "xxxxx";

        // When
        inputText(By.xpath(PageElement.XPATH_FAQ_CATEGORY_SEARCH_BAR), target_title);
        click(By.xpath(PageElement.XPATH_FAQ_CATEGORY_SEARCH_BUTTON));

        // Then
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_FAQ_CATEGORY_DATA_NOT_FOUND)));
    }
    @Test(priority = 2, groups = "smoke")
    public void create_faq_category_with_valid_input(){
        // Given
        String target_create_title = "TestCategory";

        List<String> target = new ArrayList<>();
        target.add(target_create_title);


        // When
        click(By.xpath(PageElement.XPATH_FAQ_CATEGORY_CREATE_BUTTON));

        int indexCreate = 1;

        inputText(By.xpath(PageElement.XPATH_FAQ_CATEGORY_TITLE(indexCreate)), target_create_title);
        click(By.xpath(PageElement.XPATH_FAQ_CATEGORY_SUBMIT(indexCreate)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_FAQ_CATEGORY_VERIFY(2)))));
    }
    @Test(priority = 2, groups = "smoke")
    public void create_faq_category_with_incomplete_input(){
        // Given

        // When
        click(By.xpath(PageElement.XPATH_FAQ_CATEGORY_CREATE_BUTTON));

        int indexCreate = 1;
        click(By.xpath(PageElement.XPATH_FAQ_CATEGORY_SUBMIT(indexCreate)));

        // Then
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_FAQ_CATEGORY_SUBMIT(indexCreate))));
    }
    // Can't Be Automated
    @Test(priority = 2, groups = "smoke")
    public void edit_faq_category_with_valid_input() {
        // Given
        String target_edit_title = "TestUpdate";

        List<String> target = new ArrayList<>();
        target.add(target_edit_title);


        // When
        click(By.xpath(PageElement.XPATH_FAQ_CATEGORY_EDIT_FIRST_ROW));

        int indexEdit = 2;
        clearField(By.xpath(PageElement.XPATH_FAQ_CATEGORY_TITLE(indexEdit)));
        inputText(By.xpath(PageElement.XPATH_FAQ_CATEGORY_TITLE(indexEdit)), target_edit_title);
        click(By.xpath(PageElement.XPATH_FAQ_CATEGORY_SUBMIT(indexEdit)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_FAQ_CATEGORY_VERIFY(2)))));
        assertNotNull(getText(By.xpath(PageElement.XPATH_FAQ_CATEGORY_VERIFY(4))));
    }

    @Test(priority = 2, groups = "smoke")
    public void verify_delete_faq_category_functionality() {
        // Given
        String target_edit_title = "TestUpdate";

        List<String> target = new ArrayList<>();
        target.add(target_edit_title);


        // When
        click(By.xpath(PageElement.XPATH_FAQ_CATEGORY_DELETE_FIRST_ROW));

        int indexDelete = 3;
        waitElementClickable(By.xpath(PageElement.XPATH_FAQ_CATEGORY_SUBMIT(indexDelete)));
        actionClick(By.xpath(PageElement.XPATH_FAQ_CATEGORY_SUBMIT(indexDelete)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        assertFalse(target.contains(getText(By.xpath(PageElement.XPATH_FAQ_CATEGORY_VERIFY(2)))));
    }
}
