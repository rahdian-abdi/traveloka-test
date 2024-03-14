package tapmo.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tapmo.dataprovider.PageElement;

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

    @Test(priority = 1, groups = "sanity")
    public void verifyUserCanMakeCarServiceTransactions() throws InterruptedException {
        goToCarService();
        selectTabWithoutDriver();
        selectPickUpLocation();
        selectPickUpTime();
        selectDropOffDate();
        searchCar();
        selectCar();
        selectCarProvider();
        selectContinueProductDetail();
        selectPickUpLocationWithOptions();
        selectDropOffWithOptions();
        inputPickUpDropOffNotes();
        continueBookNow();
        humanIntervenePuzzleCaptcha();
        fillContactDetails();
        fillDriverDetails();
        continueToPayment();
        addSpecialRequest();
        checkAllRequirement();
        continueToPaymentGateway();
        selectPaymentMethodAndProceedPayment();
    }
}
