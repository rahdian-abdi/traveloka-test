package tapmo.dataprovider;

public class PageElement {
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
    public static String XPATH_DASHBOARD_MENU = "//*[@id=\"__next\"]/div[1]/div/div[1]/div/div[2]/ul/li[1]/a";
    public static String XPATH_PARTICIPANTS_MENU = "//*[@id=\"__next\"]/div[1]/div/div[1]/div/div[2]/ul/div[1]/li";
    public static String XPATH_PARTICIPANTS_ROW_TEN(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/table/tbody/tr[10]/td["+i+"]";
    }
    public static String XPATH_LISTED_NIK_PARTICIPANTS(int i){
        return "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/table/tbody/tr["+i+"]/td[2]";
    }
    public static String XPATH_SEARCH_PARTICIPANTS_BAR = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[3]/div/div/div[1]/div/div/input";
    public static String XPATH_SEARCH_PARTICIPANTS_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[3]/div/div/div[1]/div/button";
    public static String CSS_ROW_DATA_PARTICIPANTS = "td[class='min-w-[5rem] max-w-[20rem] whitespace-normal']";
    public static String XPATH_NIK_FIRST_ROW_DATA = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/table/tbody/tr/td[2]";
    public static String XPATH_CLEAR_PARTICIPANTS_BAR_BUTTON = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[2]/div[3]/div/div/div[1]/div/div/div[2]";

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





}
