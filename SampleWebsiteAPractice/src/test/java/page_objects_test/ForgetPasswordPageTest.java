package page_objects_test;

import browserdriver.BrowserDriver;
import junk.Data2;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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

    @Test(dataProvider = "getData")
    public void testWriteEmailValue(String email) throws Exception {
        forgetPasswordPage.clickonForgetPassword();
        forgetPasswordPage.writeEMailValue(email);
        forgetPasswordPage.submit();
        String actualmessage = forgetPasswordPage.getPageMessage();
        Assert.assertEquals(actualmessage,"Your e-mail's been sent!");
        Thread.sleep(3000);

    }
}
