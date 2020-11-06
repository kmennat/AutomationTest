package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public void Login(String User, String Password){
        setTextElementsTxt(TxtBoxUsername,User);
        setTextElementsTxt(TxtBoxPassword,Password);
        klickBtn(BtnLogin);
    }

}
