package page_objects_test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.BasicAuthPage;
import reporting.TestLogger;

public class BasicAuthPageTest extends BrowserDriver{
    BasicAuthPage basicAuthPage = null;

    @BeforeMethod
    public void initializedElements(){
        basicAuthPage = PageFactory.initElements(driver,BasicAuthPage.class);

    }
@Test
    public void testbasicAuthButton(){
        String actualLocation = basicAuthPage.basicAuthButton("http://the-internet.herokuapp.com/basic_auth");
    Assert.assertEquals(actualLocation,"http://the-internet.herokuapp.com/basic_auth");
    TestLogger.log("It will give the Location : "+actualLocation);
    }

}
