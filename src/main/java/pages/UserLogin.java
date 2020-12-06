package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.FindBy;


public class UserLogin extends PageBase
{

    public UserLogin(WebDriver driver) {
        super(driver);

    }

    @FindBy(id="username")
    WebElement TxtBoxUsername;

    @FindBy(id="password")
    WebElement TxtBoxPassword;

    @FindBy(id="login")
    WebElement BtnLogin;

    @FindBy(id="headingComponent")
    WebElement FilterEinstellung;


    public void Login(String User, String Password,String content) {
        setTextElementsTxt(TxtBoxUsername,User);
        setTextElementsTxt(TxtBoxPassword,Password);
        klickBtn(BtnLogin);
        checkElement(FilterEinstellung,content);
        Assert.assertTrue(FilterEinstellung.getText().contains("Filtereinstellungen"));
    }
    public void checkIsElementPresent(){
        if(isElementPresent(By.id("login")))
        {
            WebElement BtnLogin = driver.findElement(By.id("login"));
        }else{
            Assert.fail("Element doesn't exist !!");
        }

    }
    private boolean isElementPresent(By by){
        try{
            driver.findElement(by);
            return true;
        }catch(NoSuchElementException e){
            return false;
        }
    }
    //neu gelernt
    //textElements.sendKeys(value);
    // textElements.submit();
    //TxtBoxUsername.clear();


}
