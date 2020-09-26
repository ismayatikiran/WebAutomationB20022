package page_objects_test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.HomePage;
import reporting.TestLogger;

public class HomePageTest extends BrowserDriver {
    HomePage homePage= null;

@BeforeMethod
    public void initializeElements() {
    homePage = PageFactory.initElements(driver, HomePage.class);
}


       @Test
        public void testPagetitle(){
            homePage.pageTitle();
            String actualtitle = "Welcome to the-internet";
           Assert.assertEquals(actualtitle,"Welcome to the-internet");
           TestLogger.log("Page Title : " +actualtitle);
    }

    }


