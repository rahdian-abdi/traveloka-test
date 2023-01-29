package saucedemo.dataprovider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name = "LoginData")
    public Object[][] getData(){
        Object[][] data = {{"standard_user", "secret_sauce"}, {"locked_out_user", "secret_sauce"}};
        return data;
    }
    @DataProvider(name = "SortData")
    public Object[][] sortData(){
        Object[][] data = {{"Name (A to Z)"}, {"Name (Z to A)"}};
        return data;
    }
}
