package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterAnw extends PageBase{
    public FilterAnw(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="zugnummer-0")
    WebElement TxtBoxZugNr;
    ////input[@id="zugnummer-0" and @name="zugnummer"]

    @FindBy(id="applyFilter")
    WebElement BtnFilter;

    public void useFilter(String zugnummer) throws InterruptedException {
        setTextElementsTxt(TxtBoxZugNr,zugnummer);
        Thread.sleep(6000);
        klickBtn(BtnFilter);
        Thread.sleep(6000);
    }
}
