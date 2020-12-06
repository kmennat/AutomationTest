package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FilterAnw;
import pages.HomePage;
import pages.UserLogin;

import java.util.concurrent.TimeUnit;

public class FilterTest extends TestBase{

    FilterAnw FilterObj;
    UserLogin loginObj;

        @Test
        public void Filteranwenden() throws InterruptedException {

            loginObj = new UserLogin(driver);
            loginObj.Login("user","test","");
            Thread.sleep(6000);
            FilterObj =  new FilterAnw(driver);
            Thread.sleep(6000);
            String AktuellTitle= driver.getTitle();
            System.out.println("der Title ist  ------->>>>>>>>>>" +AktuellTitle);
            String ExceptedTitle = "Kommunikationsplattform Bau";
            Assert.assertEquals(AktuellTitle,ExceptedTitle);
            FilterObj.useFilter("80");


        }

}
