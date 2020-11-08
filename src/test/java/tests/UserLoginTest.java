package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserLogin;

import java.util.concurrent.TimeUnit;

public class UserLoginTest extends TestBase{


    HomePage homeObj;
    UserLogin loginObj;

    @Test
    public void UserCanLogin()
    {
        homeObj =  new HomePage(driver);
        homeObj.clickLogo();
        loginObj = new UserLogin(driver);
        loginObj.Login("user","test");
        String AktuellTitle= driver.getTitle();
        //System.out.println("der Title ist  ------->>>>>>>>>>" +aktuellTitle);
        String ExceptedTitle = "Kommunikationsplattform Bau";
        Assert.assertEquals(AktuellTitle,ExceptedTitle);
    }
}
