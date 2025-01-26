package CokGizli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import javax.lang.model.element.Element;
import java.sql.Driver;
import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class Methods {
   WebDriver driver;
   FluentWait<WebDriver> wait;

   public Methods(){
       driver = BaseTest.driver;
       wait = new FluentWait<>(driver);
       wait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(300)).ignoring(NoSuchFieldException.class);
   }

    public WebElement findElement(By xd) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(xd));
    }

    public void tiklaa(By xd){
        findElement(xd).click();
    }

    public void waitbySeconds(long seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void sendKeys(By xd, String text){
        findElement(xd).sendKeys(text);
    }

    public boolean isElementPresent(By xd) {
        try {
            driver.findElement(xd);
            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void clearText(By xd){

        findElement(xd).clear();
    }


}
