package page_objects_test;

import browserdriver.BrowserDriver;
import junk.Data;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page_objects.FormAuthenticationPage;

public class FormAuthenticationPageTest extends BrowserDriver {

    FormAuthenticationPage formAuthenticationPage =null;
    @BeforeMethod
    public void initializedElements(){

         formAuthenticationPage = PageFactory.initElements(driver,FormAuthenticationPage.class);
     }


     @DataProvider
     public Object[][] dataProvider(){
         Object[][] data = Data.dataSupplier();
         return data;
     }

     @Test(dataProvider ="dataProvider")
     public void testFormauthentication(String username,String password) throws Exception {
         formAuthenticationPage.clickonAuthenicatonlink();
         formAuthenticationPage.passingUserName(username);
         formAuthenticationPage.passingPassword(password);
         formAuthenticationPage.clickloginsubmit();
         String actualErrorMessage = formAuthenticationPage.getErrorMessage();
         Assert.assertEquals(actualErrorMessage,"Your username is invalid!\n" +
                 "×");
         Thread.sleep(3000);
     }

}
