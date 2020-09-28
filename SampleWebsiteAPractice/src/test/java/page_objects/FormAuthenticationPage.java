package page_objects;

import helper.ApplicationHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class FormAuthenticationPage {

    @FindBy(how=How.XPATH,using = "//*[@id=\"content\"]/ul/li[21]/a")
    WebElement authenticationLink;

    @FindBy (how=How.CSS,using = "#username")
    WebElement userNamebox;

    @FindBy(how=How.CSS,using = "#password")
    WebElement passwordBox;

    @FindBy(how=How.XPATH,using = "//*[@id=\"login\"]/button/i")
    WebElement loginSubmitButton;

    @FindBy(how=How.CSS,using = "#flash")
    WebElement errorMessage;

    @FindBy(how=How.CSS,using = "#content > ul > li:nth-child(21) > a")
    WebElement clicklink;

    public void CLICKLINK(){
        clicklink.click();
    }

    public void clickonAuthenicatonlink(){
        authenticationLink.click();
        TestLogger.log("Clicked on the FOrm Authentication Page");
    }

    public void passingUserName(String username){
        ApplicationHelper.sendKeys("userNameBox",userNamebox,username);

    }

    public void passingPassword(String password){
        ApplicationHelper.sendKeys("passwordBox",passwordBox,password);
       // clickloginsubmit();
    }

    public void clickloginsubmit(){
        loginSubmitButton.click();
        TestLogger.log("Clicked Submit Button");
    }


    public String getErrorMessage(){
        String message = errorMessage.getText();
        return message;
    }


}
