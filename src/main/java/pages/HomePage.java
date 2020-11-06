package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //@FindBy(id = "logo")
    @FindBy(xpath = "//img[@id=\"logo\"]")
    WebElement klickLogo;

    public void clickLogo()
    {
        klickBtn(klickLogo);
    }
}
