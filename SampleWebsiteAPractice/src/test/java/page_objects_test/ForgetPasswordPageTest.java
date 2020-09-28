package page_objects_test;

import browserdriver.BrowserDriver;
import junk.Data2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page_objects.ForgetPasswordPage;

public class ForgetPasswordPageTest extends BrowserDriver {
    ForgetPasswordPage forgetPasswordPage =null;

    @BeforeMethod
    public void initializeElements(){
        forgetPasswordPage = PageFactory.initElements(driver,ForgetPasswordPage.class);
    }

    @DataProvider
    public Object[] getData(){
        Object[] datavalue = Data2.storedata();
        return datavalue;
    }

    @Test(dataProvider = "storedata")
    public void testWriteEmailValue(String email) throws Exception {
        forgetPasswordPage.writeEMailValue(email);
        //Thread.sleep(3000);

    }
}
