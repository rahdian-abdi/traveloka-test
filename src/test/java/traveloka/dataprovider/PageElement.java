package traveloka.dataprovider;

import org.openqa.selenium.By;
import traveloka.pageobject.BasePage;

import java.util.Random;

public class PageElement extends BasePage {
    public void goToCarService(){
        click(By.xpath("//div[contains(text(), 'Car Rental')]"));
        takeScreenshot();
    }
    public void selectTabWithoutDriver(){
        takeScreenshot();
    }
    public void selectPickUpLocation(){
        inputText(By.xpath("//*[@data-testid=\"rental-search-form-location-input\"]"), "Jakarta");
        waitElementAppear(By.xpath("//div[contains(@class, \"css-901oao\") and contains(@class, \"css-bfa6kz\") and @data-testid=\"rental-search-form-location-item-subtitle\" and contains(text(), \"Jakarta Special Capital Region, Indonesia\")]"));
        click(By.xpath("//div[contains(@class, \"css-901oao\") and contains(@class, \"css-bfa6kz\") and @data-testid=\"rental-search-form-location-item-subtitle\" and contains(text(), \"Jakarta Special Capital Region, Indonesia\")]"));
        takeScreenshot();
    }
    public void selectPickUpTime(){
        click(By.xpath("//input[@data-testid=\"rental-search-form-date-input-start\"]"));
        takeScreenshot();
    }
    public void selectDropOffDate() throws InterruptedException {
        click(By.xpath("//input[@data-testid=\"rental-search-form-date-input-end\"]"));
        takeScreenshot();
    }
    public void searchCar() throws InterruptedException {
        click(By.xpath("//*[@data-testid=\"rental-search-form-cta\"]"));
        Thread.sleep(5000);
    }
    public void selectCar(){
        click(By.xpath("//*[@id=\"__next\"]/div/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]"));
        click(By.xpath("//*[@id=\"__next\"]/div/div[5]/div[2]/div[1]/div[2]/div[2]/div[3]/div[2]/div/div[2]"));
        click(By.xpath("//*[@id=\"__next\"]/div/div[5]/div[2]/div[2]/div/div/div[1]/div/div/div[2]/div[1]/h3"));
        click(By.xpath("//*[@id=\"__next\"]/div/div[5]/div[2]/div[2]/div/div/div[1]/div/div/div[3]/div[3]/div/div[2]/div"));
    }
    public void selectCarProvider() throws InterruptedException {
        takeScreenshot();
    }
    public void selectContinueProductDetail() throws InterruptedException {
        click(By.xpath("//*[@id=\"__next\"]/div/div[5]/div/div[4]/div/div[2]/div[2]/div/div[2]"));
        Thread.sleep(1000);
    }
    public void selectPickUpLocationWithOptions() throws InterruptedException {
        click(By.xpath("//*[@id=\"RENTAL_PICKUP_LOCATION\"]/div/div/div[3]/div[1]/div[2]/div/div/div[2]"));
        click(By.xpath("//*[@id=\"RENTAL_PICKUP_LOCATION\"]/div/div/div[3]/div[2]/div/div/div[1]/div[1]/div/div[1]/div"));
        click(By.xpath("//*[@id=\"RENTAL_PICKUP_LOCATION\"]/div/div/div[3]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div[1]"));
        takeScreenshot();
        Thread.sleep(2000);
    }
    public void selectDropOffWithOptions() throws InterruptedException {
        click(By.xpath("//*[@id=\"RENTAL_DROPOFF_LOCATION\"]/div/div/div[5]/div[1]/div[2]/div/div/div[2]"));
        click(By.xpath("//*[@id=\"RENTAL_DROPOFF_LOCATION\"]/div/div/div[5]/div[2]/div/div/div[1]/div/div[1]/input"));
        Thread.sleep(1000);
        click(By.xpath("//*[@id=\"RENTAL_DROPOFF_LOCATION\"]/div/div/div[5]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[5]/div[1]/div"));
        takeScreenshot();
        Thread.sleep(2000);
    }
    public void inputPickUpDropOffNotes(){
        inputText(By.xpath("//*[@id=\"RENTAL_DROPOFF_LOCATION\"]/div/div/div[5]/div[2]/div/div[2]/div/textarea"), "Please add charging port");
        takeScreenshot();
    }
    public void continueBookNow(){
        click(By.xpath("//*[@id=\"__next\"]/div/div[5]/div/div[1]/div/div[5]/div[3]/div/div[2]/div"));
    }
    public void humanIntervenePuzzleCaptcha() throws InterruptedException {
        takeScreenshot();
        Thread.sleep(10000); // Human Intervene
    }
    public void fillContactDetails(){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            char randomChar = (char) ('a' + random.nextInt(26));
            sb.append(randomChar);
        }
        inputText(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div/div[1]/input"), "Rahdian Abdi");
        inputText(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[1]/div[1]/input"), "81234567891");
        inputText(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div[1]/input"), "rahdian.abdi@"+sb.toString()+".com");
        takeScreenshot();
    }
    public void fillDriverDetails(){
        selectDropDown(By.xpath("//*[@id=\"adultForm0\"]/div/div/div[2]/div[1]/div/div/select"), "Mr.");
        inputText(By.xpath("//*[@id=\"adultForm0\"]/div/div/div[2]/div[2]/div/div[1]/input"), "Rahdian Abdi");
        inputText(By.xpath("//*[@id=\"adultForm0\"]/div/div/div[2]/div[3]/div[1]/input"), "81234567891");
        takeScreenshot();
        scrollDown();
    }
    public void continueToPayment(){
        click(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[4]/div/div/div/div[2]/div"));
    }
    public void addSpecialRequest(){
        inputText(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[9]/div/div/div[3]/div[1]/textarea"), "Please add baby car seat");
        takeScreenshot();
        scrollDown();
    }
    public void checkAllRequirement() throws InterruptedException {
        click(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[11]/div/div/div/div[2]"));
        Thread.sleep(1000);
        click(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[1]/div[2]"));
        takeScreenshot();
        scrollDown();
        click(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[2]"));
    }
    public void continueToPaymentGateway() throws InterruptedException {
        scrollDown();
        click(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[14]/div/div/div/div[2]/div"));
        Thread.sleep(2000);
        click(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[3]/div[2]/div"));
    }
    public void selectPaymentMethodAndProceedPayment() throws InterruptedException {
        waitElementAppear(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/div/div[2]/div/div/div"));
        click(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/div/div[3]/div/div/div"));
        takeScreenshot();
        click(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div[7]/div[2]/div[2]/div"));
        waitElementAppear(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/div/div[1]/div/div[2]/div[1]/h2"));
        isDisplayed(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/div/div[1]/div/div[1]/div[2]"));
    }
}
