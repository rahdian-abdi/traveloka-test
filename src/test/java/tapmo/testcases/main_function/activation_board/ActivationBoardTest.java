package tapmo.testcases.main_function.activation_board;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import tapmo.dataprovider.PageElement;
import tapmo.pageobject.BasePage;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ActivationBoardTest extends BasePage {
    PageElement pageElement;

    @BeforeTest(alwaysRun = true)
    public void setUp(){
        initiateDriver();
        navigateUrl(LOGIN);
        pageElement = new PageElement();
        login_cms();

        // When
        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_SCREEN_MENU));
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
    public void verify_data_activation_board_is_displayed(){

        // Then
        int i=1;
        while (i <= 10){
            isDisplayed(By.xpath(PageElement.XPATH_ACTIVE_BOARD_SCREEN_NAME_LIST(i)));
            i++;
        }
    }

    @Test(priority = 2, groups = "smoke")
    public void search_title_with_registered_title(){
        // Given
        String target_title = "terralogiq";

        // When
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_SCREEN_SEARCH_BAR), target_title);
        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_SCREEN_SEARCH_BUTTON));

        int startIndex = 1;
        int lengthIndex = 10;

        while (startIndex <= lengthIndex){
            try {
                assertTrue(getText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_SCREEN_NAME_LIST(startIndex))).toLowerCase().contains(target_title));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }
    }
    @Test(priority = 3, groups = "smoke")
    public void search_title_with_registered_status(){
        // Given
        String target_status = "draft";

        // When
        click(By.xpath(PageElement.XPATH_CLEAR_BUTTON));
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_SCREEN_SEARCH_BAR), target_status);
        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_SCREEN_SEARCH_BUTTON));

        // Then
        int startIndex = 1;
        int lengthIndex = 10;
        while (startIndex <= lengthIndex){
            try {
                assertEquals(target_status, getText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_SCREEN_STATUS_LIST(startIndex))));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }
        click(By.xpath(PageElement.XPATH_CLEAR_BUTTON));
    }
     */
    @Test(priority = 4, groups = "smoke")
    public void create_active_board_with_valid_input(){
        // Given
        String target_create_title = "Lorem";
        String target_create_description = "Ipsum";
        int target_create_no_urut = 28221;
        String target_create_status = "publish";

        List<String> target = new ArrayList<>();
        target.add(target_create_title);
        target.add(target_create_description);
        target.add(Integer.toString(target_create_no_urut));
        target.add(target_create_status);


        // When
        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_CREATE_BUTTON));

        int indexCreate = 1;

        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_JUDUL(indexCreate)), target_create_title);

        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_DESKRIPSI(indexCreate)), target_create_description);

        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_GAMBAR_UPLOAD(indexCreate)), uploadImage());

        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_NO_URUT(indexCreate)), Integer.toString(target_create_no_urut));

        selectDropDown(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_STATUS(indexCreate)), target_create_status);

        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_SUBMIT_BUTTON(indexCreate)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        int indexTarget = 0;
        int indexVerify = 2;
        int lengthIndex = 5;
        while (indexVerify <= lengthIndex){
            assertEquals(target.get(indexTarget), getText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_VERIFY(indexVerify))));
            indexTarget++;
            indexVerify++;
        }
    }

    @Test(priority = 5, groups = "smoke")
    public void edit_active_board_with_valid_input() {
        // Given
        String target_create_title = "LoremIpsum";
        String target_create_description = "DolorSit";
        int target_create_no_urut = 59988;
        String target_create_status = "draft";

        List<String> target = new ArrayList<>();
        target.add(target_create_title);
        target.add(target_create_description);
        target.add(Integer.toString(target_create_no_urut));
        target.add(target_create_status);


        // When
        actionClick(By.xpath(PageElement.XPATH_ACTIVE_BOARD_EDIT_BUTTON_FIRST_ROW));

        int indexEdit = 2;

        clearField(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_JUDUL(indexEdit)));
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_JUDUL(indexEdit)), target_create_title);

        clearField(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_DESKRIPSI(indexEdit)));
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_DESKRIPSI(indexEdit)), target_create_description);

        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_GAMBAR_UPLOAD(indexEdit)), uploadImage());

        clearField(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_NO_URUT(indexEdit)));
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_NO_URUT(indexEdit)), Integer.toString(target_create_no_urut));

        selectDropDown(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_STATUS(indexEdit)), target_create_status);

        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_SUBMIT_BUTTON(indexEdit)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        int indexTarget = 0;
        int indexVerify = 2;
        int lengthIndex = 5;
        while (indexVerify <= lengthIndex) {
            assertEquals(target.get(indexTarget), getText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_VERIFY(indexVerify))));
            indexTarget++;
            indexVerify++;
        }
    }

    @Test(priority = 6, groups = "smoke")
    public void verify_delete_active_board_functionality() {
        // Given
        String target_create_title = "LoremIpsum";
        String target_create_description = "DolorSit";
        int target_create_no_urut = 59988;

        List<String> target = new ArrayList<>();
        target.add(target_create_title);
        target.add(target_create_description);
        target.add(Integer.toString(target_create_no_urut));

        int indexDelete = 3;

        // When
        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_DELETE_DATA_FIRST_ROW));
        waitElementClickable(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_SUBMIT_BUTTON(indexDelete)));
        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_SUBMIT_BUTTON(indexDelete)));

        waitElementDisappear(By.xpath(PageElement.XPATH_SUCCESS_TOAST_MESSAGE));

        // Then
        int indexVerify = 2;
        int lengthIndex = 4;
        while (indexVerify <= lengthIndex) {
            assertFalse(target.contains(getText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_VERIFY(indexVerify)))));
            indexVerify++;
        }
    }
    /*
    @Test(priority = 7, groups = "smoke")
    public void search_title_with_unregistered_title(){
        // Given
        String target_title = "xxxxx";

        // When
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_SCREEN_SEARCH_BAR), target_title);
        actionClick(By.xpath(PageElement.XPATH_ACTIVE_BOARD_SCREEN_SEARCH_BUTTON));

        // Then
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_ACTIVE_BOARD_NO_DATA_FOUND)));
    }
    @Test(priority = 9, groups = "smoke")
    public void create_active_board_with_incomplete_input(){
        // Given
        String target_create_title = "person";
        String target_create_description = "this is incomplete";
        int target_create_no_urut = 28221;


        // When
        actionClick(By.xpath(PageElement.XPATH_ACTIVE_BOARD_CREATE_BUTTON));

        int indexCreate = 1;

        clearField(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_JUDUL(indexCreate)));
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_JUDUL(indexCreate)), target_create_title);

        clearField(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_DESKRIPSI(indexCreate)));
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_DESKRIPSI(indexCreate)), target_create_description);

        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_GAMBAR_UPLOAD(indexCreate)), uploadImage());

        clearField(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_NO_URUT(indexCreate)));
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_NO_URUT(indexCreate)), Integer.toString(target_create_no_urut));

        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_SUBMIT_BUTTON(indexCreate)));

        // Then
        isDisplayed(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_SUBMIT_BUTTON(indexCreate)));

        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_CANCEL_BUTTON(indexCreate)));
    }
     */
}
