package CokGizli;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public static WebDriver driver;

    @Before
    public static void   launchBrowser(){
            System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--disable-popup-blocking");
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
            driver.get("https://catchylabs-webclient.testinium.com/signIn");

    }

   @After
    public static void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }


}
