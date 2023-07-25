package tapmo.testcases.main_function.user_role;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import tapmo.dataprovider.PageElement;
import tapmo.pageobject.BasePage;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class UserRoleTest extends BasePage {

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
        click(By.xpath(PageElement.XPATH_USER_ROLE_MENU));
    }
    @AfterMethod(alwaysRun = true)
    public void tearingDown(){

    }
    /*
    @Test(priority = 1, groups = "smoke")
    public void verify_data_user_role_is_displayed(){

        // Then
        int i=1;
        while (i <= 3){
            try {
                isDisplayed(By.xpath(PageElement.XPATH_USER_ROLE_TITLE_LIST(i)));
                i++;
            } catch (Exception e){
                break;
            }
        }
    }

    @Test(priority = 2, groups = "smoke")
    public void search_user_role_title_with_registered_title(){
        // Given
        String target_title = "superadmin";

        // When
        inputText(By.xpath(PageElement.XPATH_USER_ROLE_SEARCH_BAR), target_title);
        click(By.xpath(PageElement.XPATH_USER_ROLE_SEARCH_BUTTON));

        // Then
        int startIndex = 1;
        int lengthIndex = 10;

        while (startIndex <= lengthIndex){
            try {
                assertTrue(getText(By.xpath(PageElement.XPATH_USER_ROLE_TITLE_LIST(startIndex))).toLowerCase().contains(target_title));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }
        click(By.xpath(PageElement.XPATH_CLEAR_BRANCH_BUTTON));
    }
    @Test(priority = 3, groups = "smoke")
    public void user_role_search_title_with_unregistered_title(){
        // Given
        String target_title = "xxxxx";

        // When
        inputText(By.xpath(PageElement.XPATH_USER_ROLE_SEARCH_BAR), target_title);
        click(By.xpath(PageElement.XPATH_USER_ROLE_SEARCH_BUTTON));

        // Then
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_USER_ROLE_DATA_NOT_FOUND)));
        click(By.xpath(PageElement.XPATH_CLEAR_BRANCH_BUTTON));
    }
     */
    @Test(priority = 4, groups = "smoke")
    public void create_user_role_with_valid_input(){
        // Given
        String target_create_status = "Active";
        String target_create_title = "Title";

        List<String> target = new ArrayList<>();
        target.add(target_create_status);
        target.add(target_create_title);

        // When
        click(By.xpath(PageElement.XPATH_USER_ROLE_CREATE_BUTTON));

        int indexCreate = 1;
        selectDropDown(By.xpath(PageElement.XPATH_USER_ROLE_STATUS(indexCreate, 1)), target_create_status);

        inputText(By.xpath(PageElement.XPATH_USER_ROLE_TITLE(indexCreate, 2)), target_create_title);

        click(By.xpath(PageElement.XPATH_USER_ROLE_SUBMIT(indexCreate, 3)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        int indexVerify = 3;
        assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_USER_ROLE_VERIFY(indexVerify)))));
    }

    @Test(priority = 5, groups = "smoke")
    public void edit_user_role_with_valid_input() {
        // Given
        String target_create_status = "Inactive";
        String target_create_title = "TitleUpdate";

        List<String> target = new ArrayList<>();
        target.add(target_create_status);
        target.add(target_create_title);

        // When
        click(By.xpath(PageElement.XPATH_USER_ROLE_EDIT_BUTTON));

        int indexCreate = 3;
        selectDropDown(By.xpath(PageElement.XPATH_USER_ROLE_STATUS(indexCreate, 2)), target_create_status);

        clearField(By.xpath(PageElement.XPATH_USER_ROLE_TITLE(indexCreate, 3)));
        inputText(By.xpath(PageElement.XPATH_USER_ROLE_TITLE(indexCreate, 3)), target_create_title);

        click(By.xpath(PageElement.XPATH_USER_ROLE_SUBMIT(indexCreate, 4)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        int indexVerify = 3;
        assertTrue(target.contains(getText(By.xpath(PageElement.XPATH_USER_ROLE_VERIFY(indexVerify)))));
    }

    @Test(priority = 6, groups = "smoke")
    public void verify_delete_user_role_functionality() {
        // Given
        String target_create_status = "Inactive";
        String target_create_title = "TitleUpdate";

        List<String> target = new ArrayList<>();
        target.add(target_create_status);
        target.add(target_create_title);

        // When
        click(By.xpath(PageElement.XPATH_USER_ROLE_DELETE_BUTTON));

        int indexCreate = 2;

        click(By.xpath(PageElement.XPATH_USER_ROLE_SUBMIT(indexCreate, 4)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        int indexVerify = 3;
        assertFalse(target.contains(getText(By.xpath(PageElement.XPATH_USER_ROLE_VERIFY(indexVerify)))));
    }
}
