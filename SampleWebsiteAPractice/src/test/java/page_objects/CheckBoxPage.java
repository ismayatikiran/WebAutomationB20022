package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckBoxPage {

    @FindBy(how = How.CSS, using = "#content > ul > li:nth-child(6) > a")
    WebElement checkbox;

    @FindBy(how = How.CSS,using = "#checkboxes > input[type=checkbox]:nth-child(1)")
    WebElement checkboxradiobutton1;



    public void Checkboxbutton(){
        checkbox.click();
        checkboxradiobutton1.click();
        //String checkedtitle = checkboxradiobutton1.getText(che);

    }


}
