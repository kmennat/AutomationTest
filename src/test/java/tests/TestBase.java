package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase
{
    public static WebDriver driver;

    @BeforeSuite
    public void startDriver(){
        String browserType = System.getProperty("browser.type");
        System.out.println("anbei der ausgewählte browser:" +browserType);
        if (browserType.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir")+"/drivers/geckodriver.exe");
            driver =  new FirefoxDriver();
        }
        else
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
            driver =  new ChromeDriver();

        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.navigate().to("https://kombau-au.dbnetze.com/login");

    }
    @AfterSuite

    public void stopDriver() {
        driver.quit();

    }
}
