package tapmo.testcases.support_function.faq;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import tapmo.dataprovider.PageElement;
import tapmo.pageobject.BasePage;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FaqTest extends BasePage {
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
        click(By.xpath(PageElement.XPATH_FAQ_MENU));
    }
    @AfterMethod(alwaysRun = true)
    public void tearingDown(){

    }
    /*
    @Test(priority = 1, groups = "smoke")
    public void verify_data_faq_is_displayed(){

        // Then
        int i=1;
        while (i <= 10){
            isDisplayed(By.xpath(PageElement.XPATH_FAQ_TITLE_LIST(i)));
            i++;
        }
    }

    @Test(priority = 2, groups = "smoke")
    public void search_faq_name_with_registered_title(){
        // Given
        String target_title = "test";

        // When
        inputText(By.xpath(PageElement.XPATH_FAQ_SEARCH_BAR), target_title);
        click(By.xpath(PageElement.XPATH_FAQ_SEARCH_BUTTON));

        // Then
        int startIndex = 1;
        int lengthIndex = 10;

        while (startIndex <= lengthIndex){
            try {
                assertTrue(getText(By.xpath(PageElement.XPATH_USER_NAME_LIST(startIndex))).toLowerCase().contains(target_title));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }
    }
    @Test(priority = 2, groups = "smoke")
    public void search_faq_role_with_registered_status(){
        // Given
        String target_status = "draft";

        // When
        inputText(By.xpath(PageElement.XPATH_FAQ_SEARCH_BAR), target_status);
        click(By.xpath(PageElement.XPATH_FAQ_SEARCH_BUTTON));

        // Then
        int startIndex = 1;
        int lengthIndex = 10;

        while (startIndex <= lengthIndex){
            try {
                assertTrue(getText(By.xpath(PageElement.XPATH_FAQ_STATUS_LIST(startIndex))).contains(target_status));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }
    }
    @Test(priority = 2, groups = "smoke")
    public void search_faq_name_with_unregistered_name(){
        // Given
        String target_title = "xxxxx";

        // When
        inputText(By.xpath(PageElement.XPATH_FAQ_SEARCH_BAR), target_title);
        click(By.xpath(PageElement.XPATH_FAQ_SEARCH_BUTTON));

        // Then
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_FAQ_DATA_NOT_FOUND)));
    }

     */
    @Test(priority = 2, groups = "smoke")
    public void create_faq_with_valid_input(){
        // Given
        String target_create_title = "TestQuestions";
        String target_create_description = "TestDescription";
        String target_create_category = "FAQ FLPP";
        String target_create_status = "draft";

        List<String> target = new ArrayList<>();
        target.add(target_create_title);
        target.add(target_create_description);
        target.add(target_create_category);
        target.add(target_create_status);


        // When
        click(By.xpath(PageElement.XPATH_FAQ_CREATE_BUTTON));

        int indexCreate = 1;

        inputText(By.xpath(PageElement.XPATH_FAQ_TITLE(indexCreate)), target_create_title);
        inputText(By.xpath(PageElement.XPATH_FAQ_ANSWER(indexCreate)), target_create_description);
        selectDropDown(By.xpath(PageElement.XPATH_FAQ_FAQ_CATEGORY(indexCreate)), target_create_category);
        selectDropDown(By.xpath(PageElement.XPATH_FAQ_STATUS(indexCreate)), target_create_status);
        click(By.xpath(PageElement.XPATH_FAQ_SUBMIT(indexCreate)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_FAQ_VERIFY(3)))));
        assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_FAQ_VERIFY(7)))));
    }
    /*
    @Test(priority = 2, groups = "smoke")
    public void create_faq_with_incomplete_input(){
        // Given
        String target_create_title = "TestQuestions";
        String target_create_description = "TestDescription";
        String target_create_category = "FAQ FLPP";
        String target_create_status = "draft";

        List<String> target = new ArrayList<>();
        target.add(target_create_title);
        target.add(target_create_description);
        target.add(target_create_category);
        target.add(target_create_status);


        // When
        click(By.xpath(PageElement.XPATH_USER_CREATE_BUTTON));

        int indexCreate = 1;

        inputText(By.xpath(PageElement.XPATH_FAQ_TITLE(indexCreate)), target_create_title);
        inputText(By.xpath(PageElement.XPATH_FAQ_ANSWER(indexCreate)), target_create_description);
        selectDropDown(By.xpath(PageElement.XPATH_FAQ_FAQ_CATEGORY(indexCreate)), target_create_category);
        click(By.xpath(PageElement.XPATH_FAQ_SUBMIT(indexCreate)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_FAQ_SUBMIT(indexCreate))));
    }
     */
    // Can't Be Automated
    @Test(priority = 2, groups = "smoke")
    public void edit_faq_with_valid_input() {
        // Given
        String target_edit_title = "TestQuestUpdate";
        String target_edit_description = "TestDescription";
        String target_edit_category = "FAQ SEPUTAR TAPERA";
        String target_edit_status = "publish";

        List<String> target = new ArrayList<>();
        target.add(target_edit_title);
        target.add(target_edit_description);
        target.add(target_edit_category);
        target.add(target_edit_status);


        // When
        click(By.xpath(PageElement.XPATH_FAQ_EDIT_FIRST_ROW));

        int indexEdit = 2;
        clearField(By.xpath(PageElement.XPATH_FAQ_TITLE(indexEdit)));
        inputText(By.xpath(PageElement.XPATH_FAQ_TITLE(indexEdit)), target_edit_title);
        clearField(By.xpath(PageElement.XPATH_FAQ_ANSWER(indexEdit)));
        inputText(By.xpath(PageElement.XPATH_FAQ_ANSWER(indexEdit)), target_edit_description);
        selectDropDown(By.xpath(PageElement.XPATH_FAQ_FAQ_CATEGORY(indexEdit)), target_edit_category);
        selectDropDown(By.xpath(PageElement.XPATH_FAQ_STATUS(indexEdit)), target_edit_status);
        click(By.xpath(PageElement.XPATH_FAQ_SUBMIT(indexEdit)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_FAQ_VERIFY(3)))));
        assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_FAQ_VERIFY(7)))));
        assertNotNull(getText(By.xpath(PageElement.XPATH_FAQ_VERIFY(6))));
    }

    @Test(priority = 2, groups = "smoke")
    public void verify_delete_faq_functionality() {
        // Given
        String target_edit_title = "TestQuestUpdate";
        String target_edit_description = "TestDescription";
        String target_edit_category = "FAQ SEPUTAR TAPERA";
        String target_edit_status = "publish";

        List<String> target = new ArrayList<>();
        target.add(target_edit_title);
        target.add(target_edit_description);
        target.add(target_edit_category);
        target.add(target_edit_status);


        // When
        click(By.xpath(PageElement.XPATH_FAQ_DELETE_FIRST_ROW));

        int indexDelete = 3;
        waitElementClickable(By.xpath(PageElement.XPATH_FAQ_SUBMIT(indexDelete)));
        actionClick(By.xpath(PageElement.XPATH_FAQ_SUBMIT(indexDelete)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        assertFalse(target.contains(getText(By.xpath(PageElement.XPATH_FAQ_VERIFY(3)))));
    }
}
