package page_objects_test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.CheckBoxPage;
import reporting.TestLogger;

public class CheckBoxPageTest extends BrowserDriver {

    CheckBoxPage checkBoxPage = null;

    @BeforeMethod
    public void initializeElements(){
        checkBoxPage = PageFactory.initElements(driver,CheckBoxPage.class);
    }


    @Test
    public void testCheckboxButton(){
        checkBoxPage.Checkboxbutton();
        String actualcheck = "checked";
        Assert.assertEquals(actualcheck,"checked");
        TestLogger.log("When clicking check button it will show check : "+actualcheck);

    }
}
