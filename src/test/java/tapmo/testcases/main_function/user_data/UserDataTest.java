package tapmo.testcases.main_function.user_data;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import tapmo.dataprovider.PageElement;
import tapmo.pageobject.BasePage;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class UserDataTest extends BasePage {
    @BeforeTest(alwaysRun = true)
    public void setUp(){
        initiateDriver();
        navigateUrl(LOGIN);
        login_cms();
        // When
        click(By.xpath(PageElement.XPATH_USER_MENU));
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
    /*
    @Test(priority = 1, groups = "smoke")
    public void verify_data_user_is_displayed(){

        // Then
        int i=1;
        while (i <= 10){
            isDisplayed(By.xpath(PageElement.XPATH_USER_NAME_LIST(i)));
            i++;
        }
    }

    @Test(priority = 2, groups = "smoke")
    public void search_user_name_with_registered_name(){
        // Given
        String target_title = "test";

        // When
        inputText(By.xpath(PageElement.XPATH_USER_SEARCH_BAR), target_title);
        click(By.xpath(PageElement.XPATH_USER_SEARCH_BUTTON));

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
        click(By.xpath(PageElement.XPATH_CLEAR_BRANCH_BUTTON));
    }
    @Test(priority = 3, groups = "smoke")
    public void search_user_role_with_registered_role(){
        // Given
        String target_role = "maker";

        // When
        inputText(By.xpath(PageElement.XPATH_USER_SEARCH_BAR), target_role);
        click(By.xpath(PageElement.XPATH_USER_SEARCH_BUTTON));

        // Then
        int startIndex = 1;
        int lengthIndex = 10;

        while (startIndex <= lengthIndex){
            try {
                assertTrue(getText(By.xpath(PageElement.XPATH_USER_ROLE_LIST(startIndex))).contains(target_role));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }
        click(By.xpath(PageElement.XPATH_CLEAR_BRANCH_BUTTON));
    }
    @Test(priority = 4, groups = "smoke")
    public void search_user_name_with_unregistered_name(){
        // Given
        String target_name = "xxxxx";

        // When
        inputText(By.xpath(PageElement.XPATH_USER_SEARCH_BAR), target_name);
        click(By.xpath(PageElement.XPATH_USER_SEARCH_BUTTON));

        // Then
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_USER_DATA_NOT_FOUND)));
        click(By.xpath(PageElement.XPATH_CLEAR_BRANCH_BUTTON));
    }
     */
    @Test(priority = 5, groups = "smoke")
    public void create_user_with_valid_input(){
        // Given
        String target_create_status = "Active";
        String target_create_name = "Test";
        String target_create_email = "test@xyz.com";
        String target_create_password = "password";
        String target_create_role = "maker";
        String target_create_department = "PUSAT";

        List<String> target = new ArrayList<>();
        target.add(target_create_status);
        target.add(target_create_name);
        target.add(target_create_email);
        target.add(target_create_password);
        target.add(target_create_role);
        target.add(target_create_department);


        // When
        click(By.xpath(PageElement.XPATH_USER_CREATE_BUTTON));

        int indexCreate = 1;

        inputText(By.xpath(PageElement.XPATH_USER_IMAGE(indexCreate)), uploadImage());

        selectDropDown(By.xpath(PageElement.XPATH_USER_STATUS(indexCreate)), target_create_status);

        inputText(By.xpath(PageElement.XPATH_USER_NAME(indexCreate)), target_create_name);

        inputText(By.xpath(PageElement.XPATH_USER_EMAIL(indexCreate)), target_create_email);

        inputText(By.xpath(PageElement.XPATH_USER_PASSWORD(indexCreate)), target_create_password);

        selectDropDown(By.xpath(PageElement.XPATH_USER_ROLE(indexCreate)), target_create_role);

        selectDropDown(By.xpath(PageElement.XPATH_USER_DEPARTMENT(indexCreate)), target_create_department);

        click(By.xpath(PageElement.XPATH_USER_SUBMIT(indexCreate)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        int indexVerify = 3;
        int lengthIndex = 5;
        while (indexVerify <= lengthIndex){
            assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_NEWS_LIST_NEWS_VERIFY(indexVerify)))));
            indexVerify++;
        }
    }
    // Can't Be Automated
    @Test(priority = 6, groups = "smoke")
    public void edit_user_with_valid_input() {
        // Given
        String target_create_status = "Active";
        String target_create_name = "TestUpdate";
        String target_create_email = "test_update@xyz.com";
        String target_create_password = "passwordUpdate";
        String target_create_role = "superadmin";
        String target_create_department = "Test-3";

        List<String> target = new ArrayList<>();
        target.add(target_create_status);
        target.add(target_create_name);
        target.add(target_create_email);
        target.add(target_create_password);
        target.add(target_create_role);
        target.add(target_create_department);


        // When
        actionClick(By.xpath(PageElement.XPATH_USER_EDIT_FIRST_ROW));

        int indexEdit = 2;

        inputText(By.xpath(PageElement.XPATH_USER_IMAGE(indexEdit)), uploadImage());

        selectDropDown(By.xpath(PageElement.XPATH_USER_STATUS(indexEdit)), target_create_status);

        clearField(By.xpath(PageElement.XPATH_USER_NAME(indexEdit)));
        inputText(By.xpath(PageElement.XPATH_USER_NAME(indexEdit)), target_create_name);

        clearField(By.xpath(PageElement.XPATH_USER_EMAIL(indexEdit)));
        inputText(By.xpath(PageElement.XPATH_USER_EMAIL(indexEdit)), target_create_email);

        clearField(By.xpath(PageElement.XPATH_USER_PASSWORD(indexEdit)));
        inputText(By.xpath(PageElement.XPATH_USER_PASSWORD(indexEdit)), target_create_password);

        selectDropDown(By.xpath(PageElement.XPATH_USER_ROLE(indexEdit)), target_create_role);

        selectDropDown(By.xpath(PageElement.XPATH_USER_DEPARTMENT(indexEdit)), target_create_department);

        click(By.xpath(PageElement.XPATH_USER_SUBMIT(indexEdit)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        int indexVerify = 3;
        int lengthIndex = 5;
        while (indexVerify <= lengthIndex){
            assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_USER_VERIFY(indexVerify)))));
            indexVerify++;
        }
    }

    // Can't Be Automated

    @Test(priority = 7, groups = "smoke")
    public void verify_delete_user_functionality() throws InterruptedException {
        // Given
        String target_create_status = "Active";
        String target_create_name = "Test";
        String target_create_email = "test@xyz.com";
        String target_create_password = "password";
        String target_create_role = "maker";
        //String target_create_department = "PUSAT";

        List<String> target = new ArrayList<>();
        target.add(target_create_status);
        target.add(target_create_name);
        target.add(target_create_email);
        target.add(target_create_password);
        target.add(target_create_role);
        //target.add(target_create_department);


        // When
        actionClick(By.xpath(PageElement.XPATH_USER_DELETE_FIRST_ROW));

        int indexDelete = 3;
        Thread.sleep(1000);

        click(By.xpath(PageElement.XPATH_USER_SUBMIT(indexDelete)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        int indexVerify = 3;
        int lengthIndex = 4;
        while (indexVerify <= lengthIndex){
            assertFalse(target.contains(getText(By.xpath(PageElement.XPATH_NEWS_LIST_NEWS_VERIFY(indexVerify)))));
            indexVerify++;
        }
    }
}
