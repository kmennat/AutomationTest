package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    protected WebDriver driver;

    // create Constructor
    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
    protected static void klickBtn(WebElement btn){
        btn.click();
    }
    protected static void setTextElementsTxt(WebElement textElements, String value)
    {
        textElements.sendKeys(value);
    }
    protected static void checkElement(WebElement contentElement, String content)
    {
        contentElement.getText().contains(content);
    }

}
