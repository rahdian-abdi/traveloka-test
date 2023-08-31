package tapmo.dataprovider;

import tapmo.pageobject.BasePage;

public class PageElement extends BasePage {
    public static String CSS_INPUT_USERNAME_FIELD = "input[class='input input-bordered w-full']";
    public static String CSS_INPUT_PASSWORD_FIELD = "input[class='w-full input input-bordered']";
    public static String CSS_LOGIN_BUTTON = "button[class='btn bg-green-600 border-none mt-4 hover:bg-green-700 ']";
    public static String CSS_TOAST_ERROR_LOGIN_MESSAGE = "div[class='Toastify__toast-container Toastify__toast-container--top-center']";
    public static String XPATH_PROFILE_MENU = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div/button/div";
    public static String XPATH_LOGOUT_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/ul";
    public static String XPATH_NOTIFICATION_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[1]/div/div[2]/div[1]/label";
    public static String XPATH_NOTIFICATION_BOARD = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[1]/div/div[2]/div[1]/div/div";
    public static String XPATH_SHOW_HIDE_BUTTON = "//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/form/div/button";
    public static String XPATH_SITARA_GRAPH = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div/div/div/div[1]";
    public static String XPATH_FLPP_GRAPH = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div/div/div/div[2]";
    public static String XPATH_DASHBOARD_MENU = "//*[@id=\"__next\"]/div[1]/div/div[1]/div/div[2]/ul/div[1]/li";
    public static String XPATH_PARTICIPANTS_MENU = "//*[@id=\"__next\"]/div[1]/div/div[1]/div/div[2]/ul/div[2]/li";
    public static String XPATH_LISTED_NIK_PARTICIPANTS(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/table/tbody/tr["+i+"]/td[2]";
    }
    public static String XPATH_LISTED_NAME_PARTICIPANTS(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/table/tbody/tr["+i+"]/td[3]";
    }
    public static String XPATH_PARTICIPANTS_SEARCH_BAR = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[3]/div/div/div[1]/div/div/input";
    public static String XPATH_PARTICIPANTS_SEARCH_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[3]/div/div/div[1]/div/button";
    public static String XPATH_PARTICIPANTS_CLEAR_BAR_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[3]/div/div/div[1]/div/div/div[2]";
    public static String XPATH_PARTICIPANTS_DATA_NOT_FOUND = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[3]/div/div/div[2]/p";

    public static String XPATH_PARTICIPANTS_UPDATE_BUTTON_FIRST_ROW = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/table/tbody/tr[1]/td[5]";
    public static String XPATH_PARTICIPANTS_EDIT_NIK = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[1]/input";
    public static String XPATH_PARTICIPANTS_EDIT_FULL_NAME = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[2]/input";
    public static String XPATH_PARTICIPANTS_EDIT_TEMPAT_LAHIR = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[3]/input";
    public static String XPATH_PARTICIPANTS_EDIT_TANGGAL_LAHIR = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[4]/input";
    public static String XPATH_PARTICIPANTS_EDIT_MARITAL_STATUS = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[5]/select";
    public static String XPATH_PARTICIPANTS_EDIT_GENDER = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[6]/select";
    public static String XPATH_PARTICIPANTS_EDIT_RELIGION = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[7]/select";
    public static String XPATH_PARTICIPANTS_EDIT_NATIONALITY = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[8]/select";
    public static String XPATH_PARTICIPANTS_EDIT_EDUCATION = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[9]/select";
    public static String XPATH_PARTICIPANTS_EDIT_RT_KTP = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[10]/div[1]/input";
    public static String XPATH_PARTICIPANTS_EDIT_RW_KTP = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[10]/div[2]/input";
    public static String XPATH_PARTICIPANTS_EDIT_ALAMAT_KTP = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[11]/input";
    public static String XPATH_PARTICIPANTS_EDIT_PROVINCE_KTP = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[12]/input";
    public static String XPATH_PARTICIPANTS_EDIT_CITY_KTP = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[13]/input";
    public static String XPATH_PARTICIPANTS_EDIT_KELURAHAN_KTP = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[14]/input";
    public static String XPATH_PARTICIPANTS_EDIT_KECAMATAN_KTP = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[15]/input";
    public static String XPATH_PARTICIPANTS_EDIT_RT_DOMISILI = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[16]/div[1]/input";
    public static String XPATH_PARTICIPANTS_EDIT_RW_DOMISILI = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[16]/div[2]/input";
    public static String XPATH_PARTICIPANTS_EDIT_ALAMAT_DOMISILI = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[17]/input";
    public static String XPATH_PARTICIPANTS_EDIT_PROVINCE_DOMISILI = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[18]/input";
    public static String XPATH_PARTICIPANTS_EDIT_CITY_DOMISILI = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[19]/input";
    public static String XPATH_PARTICIPANTS_EDIT_KELURAHAN_DOMISILI = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[20]/input";
    public static String XPATH_PARTICIPANTS_EDIT_KECAMATAN_DOMISILI = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[21]/input";
    public static String XPATH_PARTICIPANTS_EDIT_EMAIL = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[22]/input";
    public static String XPATH_PARTICIPANTS_EDIT_NO_TELP = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[23]/input";
    public static String XPATH_PARTICIPANTS_EDIT_PERUSHAAN = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[24]/input";
    public static String XPATH_PARTICIPANTS_EDIT_GAJI = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[25]/input";
    public static String XPATH_PARTICIPANTS_EDIT_REK_BANK = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[26]/input";
    public static String XPATH_PARTICIPANTS_EDIT_JENIS_BANK = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[27]/select";
    public static String XPATH_PARTICIPANTS_EDIT_NPWP = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div[28]/input";

    public static String XPATH_PARTICIPANTS_EDIT_CANCEL_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[2]/button[1]";
    public static String XPATH_PARTICIPANTS_EDIT_SAVE_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/form/div[2]/button[2]";


    public static String XPATH_ACTIVE_BOARD_SCREEN_MENU = "//*[@id=\"__next\"]/div[1]/div/div[1]/div/div[2]/ul/div[3]/li";
    public static String XPATH_ACTIVE_BOARD_SCREEN_NAME_LIST(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[2]/div/table/tbody/tr["+i+"]/td[2]";
    }
    public static String XPATH_ACTIVE_BOARD_SCREEN_STATUS_LIST(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[2]/div/table/tbody/tr["+i+"]/td[5]";
    }
    public static String XPATH_ACTIVE_BOARD_SCREEN_SEARCH_BAR = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[1]/div/div/input";
    public static String XPATH_ACTIVE_BOARD_SCREEN_SEARCH_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[1]/div/button";
    public static String XPATH_CLEAR_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[1]/div/div/div[2]";
    public static String XPATH_CLEAR_BRANCH_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/div/div/div[2]";
    public static String XPATH_ACTIVE_BOARD_NO_DATA_FOUND = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[2]/p";
    public static String XPATH_ACTIVE_BOARD_CREATE_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[1]/button";
    public static String XPATH_ACTIVE_BOARD_EDIT_BUTTON_FIRST_ROW = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[2]/div/table/tbody/tr[1]/td[6]/div/button[2]";
    public static String XPATH_ACTIVE_BOARD_DELETE_DATA_FIRST_ROW = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[2]/div/table/tbody/tr[1]/td[6]/div/button[1]";


    public static String XPATH_ACTIVE_BOARD_MODAL_JUDUL(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/input[1]";
    }
    public static String XPATH_ACTIVE_BOARD_MODAL_DESKRIPSI(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/textarea";
    }
    public static String XPATH_ACTIVE_BOARD_MODAL_GAMBAR_UPLOAD(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[1]/div/div/div/input";
    }
    public static String XPATH_ACTIVE_BOARD_MODAL_NO_URUT(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/input[2]";
    }
    public static String XPATH_ACTIVE_BOARD_MODAL_STATUS(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[2]/select";
    }


    public static String XPATH_ACTIVE_BOARD_MODAL_SUBMIT_BUTTON(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[3]/button[2]";
    }
    public static String XPATH_ACTIVE_BOARD_MODAL_CANCEL_BUTTON(int i){
        return  "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[3]/button[1]";
    }
    public static String XPATH_ACTIVE_BOARD_VERIFY(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[2]/div/table/tbody/tr[1]/td["+i+"]";
    }
    public static String XPATH_SUCCESS_TOAST_MESSAGE = "//*[@id=\"__next\"]/div[2]/div";
    public static String XPATH_FAIL_TOAST_MESSAGE = "//*[@id=\"1\"]/div[1]";


    public static String XPATH_ADS_MEDIA_MENU = "//*[@id=\"__next\"]/div[1]/div/div[1]/div/div[2]/ul/div[4]/li";
    public static String XPATH_ADS_MEDIA_TITLE_ADS_LIST(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[2]/div/table/tbody/tr["+i+"]/td[3]";
    }
    public static String XPATH_ADS_MEDIA_STATUS_ADS_LIST(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[2]/div/table/tbody/tr["+i+"]/td[4]";
    }
    public static String XPATH_ADS_MEDIA_SEARCH_BAR = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[1]/div/div/input";
    public static String XPATH_ADS_MEDIA_SEARCH_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[1]/div/button";
    public static String XPATH_ADS_MEDIA_DATA_NOT_FOUND = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[2]/p";
    public static String XPATH_ADS_MEDIA_ADD_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[1]/button";
    public static String XPATH_ADS_MEDIA_EDIT_BUTTON_FIRST_ROW = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[2]/div/table/tbody/tr[1]/td[5]/div/button[2]";
    public static String XPATH_ADS_MEDIA_DELETE_FIRST_ROW = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[2]/div/table/tbody/tr[1]/td[5]/div/button[1]";

    public static String XPATH_ADS_MEDIA_STATUS(int indexAction, int indexColumn){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+indexAction+"]/div/div[2]/form/div["+indexColumn+"]/select";
    }
    public static String XPATH_ADS_MEDIA_TITLE(int indexAction, int indexColumn){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+indexAction+"]/div/div[2]/form/div["+indexColumn+"]/input";
    }
    public static String XPATH_ADS_MEDIA_CONTENT(int indexAction, int indexColumn){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+indexAction+"]/div/div[2]/form/div["+indexColumn+"]/div/div[2]/div[1]";
    }
    public static String XPATH_ADS_MEDIA_IMAGE_UPLOAD(int indexAction, int indexColumn){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+indexAction+"]/div/div[2]/form/div["+indexColumn+"]/div/div/input";
    }
    public static String XPATH_ADS_MEDIA_SUBMIT(int indexAction, int indexColumn){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+indexAction+"]/div/div[2]/form/div["+indexColumn+"]/button[2]";
    }
    public static String XPATH_ADS_MEDIA_VERIFY(int indexColumn){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div[2]/div/table/tbody/tr[1]/td["+3+"]";
    }

    public static String XPATH_NEWS_LIST_MENU = "//*[@id=\"__next\"]/div[2]/div/div[1]/div/div[2]/ul/div[5]/div/div[2]/ul/div[1]/li/a";
    public static String XPATH_NEWS_LIST_SEARCH_BAR = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/div/div/input";
    public static String XPATH_NEWS_LIST_SEARCH_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/div/button";
    public static String XPATH_NEWS_LIST_DATA_NOT_FOUND = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/p";
    public static String XPATH_NEWS_LIST_TITLE_LIST(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr["+i+"]/td[2]";
    }
    public static String XPATH_NEWS_LIST_CATEGORY_LIST(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]";
    }
    public static String XPATH_NEWS_LIST_STATUS_LIST(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr["+i+"]/td[5]";
    }
    public static String XPATH_NEWS_LIST_NEW_NEWS_BUTTON = "//*[@id=\"__next\"]/div[2]/div/div[2]/div[2]/div[4]/div/div[1]/button";
    public static String XPATH_NEWS_LIST_EDIT_NEWS_FIRST_ROW = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[2]";
    public static String XPATH_NEWS_LIST_DELETE_NEWS_FIRST_ROW = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[1]";

    public static String XPATH_NEWS_LIST_TITLE(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[1]/input";
    }
    public static String XPATH_NEWS_LIST_DESCRIPTION(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[2]/div/div[2]/div[1]";
    }
    public static String XPATH_NEWS_LIST_THUMBNAIL_NEWS(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[3]/div/div[1]/div/div/input";
    }
    public static String XPATH_NEWS_LIST_NEWS_CATEGORY(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[4]/select";
    }
    public static String XPATH_NEWS_LIST_NEWS_STATUS(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[5]/select";
    }
    public static String XPATH_NEWS_LIST_NEWS_SUBMIT(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[6]/button[2]";
    }
    public static String XPATH_NEWS_LIST_NEWS_VERIFY(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td["+i+"]";
    }


    public static String XPATH_NEWS_CATEGORY_MENU = "//*[@id=\"__next\"]/div[1]/div/div[1]/div/div[2]/ul/div[5]/div/div[2]/ul/div[2]/li";
    public static String XPATH_NEWS_CATEGORY_SEARCH_BAR = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/div/div/input";
    public static String XPATH_NEWS_CATEGORY_SEARCH_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/div/button";
    public static String XPATH_NEWS_CATEGORY_DATA_NOT_FOUND = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/p";
    public static String XPATH_NEWS_CATEGORY_CREATE_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/button";
    public static String XPATH_NEWS_CATEGORY_EDIT_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/button[2]";
    public static String XPATH_NEWS_CATEGORY_DELETE_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/button[1]";
    public static String XPATH_NEWS_CATEGORY_TITLE(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[1]/input";
    }
    public static String XPATH_NEWS_CATEGORY_STATUS(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[1]/div/select";
    }
    public static String XPATH_NEWS_CATEGORY_SUBMIT(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[2]/button[2]";
    }
    public static String XPATH_NEWS_CATEGORY_TITLE_LIST(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr["+i+"]/td[2]";
    }
    public static String XPATH_NEWS_CATEGORY_VERIFY(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td["+i+"]";
    }
    public static String XPATH_NEWS_CATEGORY_SLIDER = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td[4]/div/div/label/div/div/span";


    public static String XPATH_USER_ROLE_MENU = "//*[@id=\"__next\"]/div[1]/div/div[1]/div/div[2]/ul/div[6]/div/div[2]/ul/div[2]/li";
    public static String XPATH_USER_ROLE_SEARCH_BAR = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/div/div/input";
    public static String XPATH_USER_ROLE_SEARCH_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/div/button";
    public static String XPATH_USER_ROLE_DATA_NOT_FOUND = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/p";
    public static String XPATH_USER_ROLE_CREATE_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/button";
    public static String XPATH_USER_ROLE_EDIT_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td[4]/div/button[2]";
    public static String XPATH_USER_ROLE_DELETE_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td[4]/div/button[1]";
    public static String XPATH_USER_ROLE_STATUS(int indexAction, int indexColumn){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+indexAction+"]/div/div[2]/form/div["+indexColumn+"]/select";
    }
    public static String XPATH_USER_ROLE_TITLE(int indexAction, int indexColumn){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+indexAction+"]/div/div[2]/form/div["+indexColumn+"]/input";
    }
    public static String XPATH_USER_ROLE_SUBMIT(int indexAction, int indexColumn){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+indexAction+"]/div/div[2]/form/div["+indexColumn+"]/button[2]";
    }
    public static String XPATH_USER_ROLE_TITLE_LIST(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]";
    }
    public static String XPATH_USER_ROLE_VERIFY(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td["+i+"]";
    }
    public static String XPATH_USER_ROLE_MODAL = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[1]/div";


    public static String XPATH_USER_MENU = "//*[@id=\"__next\"]/div[1]/div/div[1]/div/div[2]/ul/div[6]/div/div[2]/ul/div[3]/li";
    public static String XPATH_USER_SEARCH_BAR = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/div/div/input";
    public static String XPATH_USER_SEARCH_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/div/button";
    public static String XPATH_USER_DATA_NOT_FOUND = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/p";
    public static String XPATH_USER_NAME_LIST(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]";
    }
    public static String XPATH_USER_ROLE_LIST(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr["+i+"]/td[4]";
    }
    public static String XPATH_USER_CREATE_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/button";
    public static String XPATH_USER_EDIT_FIRST_ROW = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[2]";
    public static String XPATH_USER_DELETE_FIRST_ROW = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[1]";
    public static String XPATH_USER_IMAGE(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[1]/div/input";
    }
    public static String XPATH_USER_STATUS(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[2]/select";
    }
    public static String XPATH_USER_NAME(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[3]/input";
    }
    public static String XPATH_USER_EMAIL(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[4]/input";
    }
    public static String XPATH_USER_PASSWORD(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[5]/div/input";
    }
    public static String XPATH_USER_ROLE(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[6]/select";
    }
    public static String XPATH_USER_DEPARTMENT(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[7]/select";
    }
    public static String XPATH_USER_SUBMIT(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[8]/button[2]";
    }
    public static String XPATH_USER_VERIFY(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td["+i+"]";
    }

    public static String XPATH_FAQ_MENU = "//*[@id=\"__next\"]/div[1]/div/div[1]/div/div[2]/ul/div[7]/div/div[2]/ul/div[1]/li";
    public static String XPATH_FAQ_SEARCH_BAR = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/div/div/input";
    public static String XPATH_FAQ_SEARCH_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/div/button";
    public static String XPATH_FAQ_DATA_NOT_FOUND = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/p";
    public static String XPATH_FAQ_TITLE_LIST(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]";
    }
    public static String XPATH_FAQ_STATUS_LIST(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr["+i+"]/td[7]";
    }
    public static String XPATH_FAQ_CREATE_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/button";
    public static String XPATH_FAQ_EDIT_FIRST_ROW = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td[8]/div/button[2]";
    public static String XPATH_FAQ_DELETE_FIRST_ROW = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td[8]/div/button[1]";
    public static String XPATH_FAQ_TITLE(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[1]/input";
    }
    public static String XPATH_FAQ_ANSWER(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[2]/div/div[2]/div[1]";
    }
    public static String XPATH_FAQ_FAQ_CATEGORY(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[3]/select";
    }
    public static String XPATH_FAQ_STATUS(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[4]/select";
    }
    public static String XPATH_FAQ_SUBMIT(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[5]/button[2]";
    }
    public static String XPATH_FAQ_VERIFY(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td["+i+"]";
    }

    public static String XPATH_FAQ_CATEGORY_MENU = "//*[@id=\"__next\"]/div[2]/div/div[1]/div/div[2]/ul/div[7]/div/div[2]/ul/div[2]/li/a";
    public static String XPATH_FAQ_CATEGORY_SEARCH_BAR = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/div/div/input";
    public static String XPATH_FAQ_CATEGORY_SEARCH_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[1]/div/button";
    public static String XPATH_FAQ_CATEGORY_DATA_NOT_FOUND = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/p";
    public static String XPATH_FAQ_CATEGORY_TITLE_LIST(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr["+i+"]/td[2]";
    }
    public static String XPATH_FAQ_CATEGORY_CREATE_BUTTON = "//*[@id=\"__next\"]/div[2]/div/div[2]/div[2]/div[4]/div/div[1]/button";
    public static String XPATH_FAQ_CATEGORY_EDIT_FIRST_ROW = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td[5]/div/button[2]";
    public static String XPATH_FAQ_CATEGORY_DELETE_FIRST_ROW = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td[5]/div/button[1]";
    public static String XPATH_FAQ_CATEGORY_TITLE(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[1]/input";
    }
    public static String XPATH_FAQ_CATEGORY_SUBMIT(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div["+i+"]/div/div[2]/form/div[2]/button[2]";
    }
    public static String XPATH_FAQ_CATEGORY_VERIFY(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div/table/tbody/tr[1]/td["+i+"]";
    }

}
