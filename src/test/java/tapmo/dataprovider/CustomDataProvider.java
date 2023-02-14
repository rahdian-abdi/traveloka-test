package tapmo.dataprovider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name = "LoginData")
    public Object[][] login_credentials(){
        Object[][] data = {{"standard_user", "secret_sauce"}, {"locked_out_user", "secret_sauce"}};
        return data;
    }
}
