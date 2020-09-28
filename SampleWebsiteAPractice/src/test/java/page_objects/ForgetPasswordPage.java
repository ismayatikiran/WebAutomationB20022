package page_objects;

import helper.ApplicationHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ForgetPasswordPage {

    @FindBy(how = How.XPATH,using = "//*[@id=\"content\"]/ul/li[20]/a")
    WebElement forgetpasswordbutton;

    @FindBy(how =How.CSS,using = "#email")
    WebElement emailbox;

    @FindBy(how = How.ID,using = "form_submit")
    WebElement submitButton;

    public void writeEMailValue(String email){
        forgetpasswordbutton.click();
        ApplicationHelper.sendKeys("EmailBox",emailbox,email);
        submitButton.click();

    }
}
