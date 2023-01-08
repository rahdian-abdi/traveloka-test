package saucedemo.initiate;

import saucedemo.pageobject.BasePage;

import java.util.concurrent.TimeUnit;

public class Initialize {

    public static void initiate(){
        BasePage.driver.manage().window().maximize();
        BasePage.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        BasePage.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public static void quit(){
        BasePage.driver.quit();
        BasePage.driver = null;
    }
}
