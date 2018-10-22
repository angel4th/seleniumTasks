package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Functions {

    public void fillText(WebElement element, String text){
        element.sendKeys(text);
    }

    public void selectClickOption(WebElement web){
        web.click();
    }

    public void selectIndexOption(WebElement web, int index){
        Select var = new Select(web);
        var.selectByIndex(index);
    }

}
