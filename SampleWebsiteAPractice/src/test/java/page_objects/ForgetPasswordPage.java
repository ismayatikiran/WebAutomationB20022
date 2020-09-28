package page_objects;

import helper.ApplicationHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;


public class ForgetPasswordPage {

    @FindBy(how = How.XPATH,using = "//*[@id=\"content\"]/ul/li[20]/a")
    WebElement forgetpasswordbutton;

    @FindBy(how =How.CSS,using = "#email")
    WebElement emailbox;

    @FindBy(how = How.ID,using = "form_submit")
    WebElement submitButton;

    @FindBy(how=How.XPATH,using = "/html/body/h1")
    WebElement pageErrorMessage;

    @FindBy(how = How.XPATH,using = "//*[@id=\"content\"]")
    WebElement emailHassend;



    public void clickonForgetPassword(){
        forgetpasswordbutton.click();
        TestLogger.log("Clicking on the forget page button");
    }
    public void writeEMailValue(String email){
        ApplicationHelper.sendKeys("EmailBox",emailbox,email);
    }

    public void submit(){
        submitButton.click();
        TestLogger.log("Clicking on the submit button");
    }

    public String getPageMessage(){
        String Text= emailHassend.getText();
        return Text;
    }
}
