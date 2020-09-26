package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.LINK_TEXT, using = "Dropdown")
    WebElement dropdown;

@FindBy(how = How.XPATH,using = "//*[@id=\"content\"]/h1")
WebElement title;





public void pageTitle(){
    String Title = title.getText();

}

    public void goToDropdownPage(){
        dropdown.click();
    }


}
