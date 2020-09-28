package page_objects_test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_objects.FormAuthenticationPage;

public class FormAuthenticationPageTest extends BrowserDriver {

    FormAuthenticationPage formAuthenticationPage =null;
     public void initializedElements(){

         formAuthenticationPage = PageFactory.initElements(driver,FormAuthenticationPage.class);
     }

     @Test
     public void click() throws NullPointerException {

         //formAuthenticationPage.clickonAuthenicatonlink();
         formAuthenticationPage.CLICKLINK();
         //wait(300);
     }

//     @DataProvider
//     public Object[][] dataProvider(){
//         Object[][] data = new Data.dataSupplier();
//         return data;
//     }
//
//     @Test(dataProvider ="dataProvider")
//     public void testFormauthentication(String username,String password) throws Exception {
//         formAuthenticationPage.clickonAuthenicatonlink();
//         formAuthenticationPage.passingUserName(username);
//         formAuthenticationPage.passingPassword(password);
//         formAuthenticationPage.clickloginsubmit();
//         String actualErrorMessage = formAuthenticationPage.getErrorMessage();
//         Assert.assertEquals(actualErrorMessage,"Your username is invalid!");
//         //Thread.sleep(3000);
//     }

}
