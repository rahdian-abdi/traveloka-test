package tapmo.testcases.main_function.activation_board;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import tapmo.dataprovider.PageElement;
import tapmo.pageobject.BasePage;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ActivationBoard extends BasePage {
    PageElement pageElement;

    @BeforeTest(alwaysRun = true)
    public void setUp(){
        initiateDriver();
        navigateUrl(BASE_URL);
        pageElement = new PageElement();
        login_cms();
    }
    @AfterTest(alwaysRun = true)
    public void tearDown(){
        closeDriver();
    }
    @BeforeMethod(alwaysRun = true)
    public void settingUp(){
        // When
        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_SCREEN_MENU));
    }
    @AfterMethod(alwaysRun = true)
    public void tearingDown(){

    }
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
        String target_title = "Terralogiq";

        // When
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_SCREEN_SEARCH_BAR), target_title);
        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_SCREEN_SEARCH_BUTTON));

        int startIndex = 1;
        int lengthIndex = 10;
        List<String> getTitle = new ArrayList<>();

        while (startIndex <= lengthIndex){
            try {
                getTitle.add(getText(By.xpath(PageElement.XPATH_LISTED_NIK_PARTICIPANTS(startIndex))));
                startIndex++;
            } catch (Exception e){
                break;
            }
        }

        // Then
        for (String nik : getTitle){
            int isContain = nik.indexOf(target_title);
            assertTrue(isContain > -1);
        }
    }
    @Test(priority = 2, groups = "smoke")
    public void search_title_with_unregistered_title(){
        // Given
        String target_title = "xxxxx";

        // When
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_SCREEN_SEARCH_BAR), target_title);
        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_SCREEN_SEARCH_BUTTON));

        // Then
        assertTrue(isDisplayed(By.xpath(PageElement.XPATH_ACTIVE_BOARD_NO_DATA_FOUND)));
    }
    @Test(priority = 2, groups = "smoke")
    public void create_active_board_with_valid_input(){
        // Given
        String target_create_title = "person-in-test";
        String target_create_description = "this is the testing";
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

        clearField(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_JUDUL(indexCreate)));
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_JUDUL(indexCreate)), target_create_title);

        clearField(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_DESKRIPSI(indexCreate)));
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_DESKRIPSI(indexCreate)), target_create_description);

        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_GAMBAR_UPLOAD(indexCreate)), uploadImage());

        clearField(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_NO_URUT(indexCreate)));
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_NO_URUT(indexCreate)), Integer.toString(target_create_no_urut));

        selectDropDown(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_STATUS(indexCreate)), target_create_status);

        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_SUBMIT_BUTTON(indexCreate)));

        waitElementDisappear(By.xpath(PageElement.XPATH_ACTIVE_BOARD_TOAST_MESSAGE));

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
    @Test(priority = 2, groups = "smoke")
    public void create_active_board_with_incomplete_input(){
        // Given
        String target_create_title = "person";
        String target_create_description = "this is incomplete";
        int target_create_no_urut = 28221;

        List<String> target = new ArrayList<>();
        target.add(target_create_title);
        target.add(target_create_description);
        target.add(Integer.toString(target_create_no_urut));


        // When
        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_CREATE_BUTTON));

        int indexCreate = 1;

        clearField(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_JUDUL(indexCreate)));
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_JUDUL(indexCreate)), target_create_title);

        clearField(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_DESKRIPSI(indexCreate)));
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_DESKRIPSI(indexCreate)), target_create_description);

        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_GAMBAR_UPLOAD(indexCreate)), uploadImage());

        clearField(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_NO_URUT(indexCreate)));
        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_NO_URUT(indexCreate)), Integer.toString(target_create_no_urut));

        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_MODAL_SUBMIT_BUTTON(indexCreate)));

        waitElementDisappear(By.xpath(PageElement.XPATH_ACTIVE_BOARD_TOAST_MESSAGE));

        // Then
        int indexTarget = 0;
        int indexVerify = 2;
        int lengthIndex = target.size();
        while (indexVerify <= lengthIndex){
            assertNotEquals(target.get(indexTarget), getText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_VERIFY(indexVerify))));
            indexTarget++;
            indexVerify++;
        }
    }





    @Test(priority = 2, groups = "smoke")
    public void edit_active_board_with_valid_input(){
        // Given
        String target_edit_title = "person-in-test";
        String target_edit_description = "this is the testing";
        int target_edit_no_urut = 28221;
        String target_edit_status = "publish";
        List<String> target = new ArrayList<>();
        target.add(target_edit_title);
        target.add(target_edit_description);
        target.add(uploadImage());
        target.add(Integer.toString(target_edit_no_urut));
        target.add(target_edit_status);


        // When


//        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_EDIT_BUTTON_FIRST_ROW));
//
//        clearField(By.xpath(PageElement.XPATH_ACTIVE_BOARD_EDIT_MODAL_JUDUL));
//        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_EDIT_MODAL_JUDUL), target_edit_title);
//
//        clearField(By.xpath(PageElement.XPATH_ACTIVE_BOARD_EDIT_MODAL_DESKRIPSI));
//        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_EDIT_MODAL_DESKRIPSI), target_edit_description);
//
//        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_EDIT_MODAL_GAMBAR_UPLOAD), uploadImage());
//
//        clearField(By.xpath(PageElement.XPATH_ACTIVE_BOARD_EDIT_MODAL_NO_URUT));
//        inputText(By.xpath(PageElement.XPATH_ACTIVE_BOARD_EDIT_MODAL_NO_URUT), Integer.toString(target_edit_no_urut));
//
//        selectDropDown(By.xpath(PageElement.XPATH_ACTIVE_BOARD_EDIT_MODAL_STATUS), target_edit_status);
//
//        click(By.xpath(PageElement.XPATH_ACTIVE_BOARD_EDIT_MODAL_SUBMIT_BUTTON));
//
//        waitElementDisappear(By.xpath(PageElement.XPATH_ACTIVE_BOARD_EDIT_TOAST_MESSAGE));

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
}
