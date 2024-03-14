package traveloka.testcases;

import io.qameta.allure.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import traveloka.dataprovider.PageElement;

public class CarServiceTest extends PageElement {
    @BeforeTest(alwaysRun = true)
    public void setUp(){
        initiateDriver();
        navigateUrl(BASE_URL);
    }
    @AfterTest(alwaysRun = true)
    public void tearDown(){
        closeDriver();
    }

    @Feature("Car Service")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Car Service Functionality")
    @Test(priority = 1, groups = "sanity")
    public void verifyUserCanMakeCarServiceTransactions() throws InterruptedException {
        Allure.step("Select Cars Product");
        goToCarService();
        Allure.step("Select tab Without Driver");
        selectTabWithoutDriver();
        Allure.step("Select Pick-up Location (e.g.: Jakarta)");
        selectPickUpLocation();
        Allure.step("Select Pick-up Date & Time (e.g.: today+2d 09:00)");
        selectPickUpTime();
        Allure.step("Select Drop-off Date & Time (e.g.: today+5d 11:00)");
        selectDropOffDate();
        Allure.step("Click button Search Car");
        searchCar();
        Allure.step("Select Car");
        selectCar();
        Allure.step("Select Car Provider");
        selectCarProvider();
        Allure.step("Click button Continue in Product Detail");
        selectContinueProductDetail();
        Allure.step("Select Pick-up Location in \"Rental Office\"");
        selectPickUpLocationWithOptions();
        Allure.step("Select Drop-off Location in \"Other Location\"");
        selectDropOffWithOptions();
        Allure.step(" Input Pick-up/Drop-off notes is optional");
        inputPickUpDropOffNotes();
        Allure.step("Click button Book Now");
        continueBookNow();
        humanIntervenePuzzleCaptcha();
        Allure.step("Fill Contact Details");
        fillContactDetails();
        Allure.step("Fill Driver Details");
        fillDriverDetails();
        Allure.step("Click Continue");
        continueToPayment();
        Allure.step("Add a special request is optional");
        addSpecialRequest();
        Allure.step("Check all rental requirements");
        checkAllRequirement();
        Allure.step("Click Continue");
        continueToPaymentGateway();
        Allure.step("Select payment method and proceed payment");
        selectPaymentMethodAndProceedPayment();
    }
}
