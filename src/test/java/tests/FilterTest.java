package tests;

import org.testng.annotations.Test;
import pages.FilterAnw;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class FilterTest extends TestBase{

    FilterAnw FilterObj;

        @Test
        public void Filteranwenden() throws InterruptedException {

            FilterObj =  new FilterAnw(driver);
            Thread.sleep(6000);
            FilterObj.useFilter("80");

        }

}
