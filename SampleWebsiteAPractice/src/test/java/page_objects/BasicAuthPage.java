package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasicAuthPage {

    @FindBy (how= How.CSS,using = "a[href^=\"/basic_auth\"]")
    WebElement basicAuth;





    public String basicAuthButton(String Location){
        basicAuth.click();
        return Location;
    }
}
