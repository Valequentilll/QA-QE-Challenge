package CokGizli;


import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class StepImplementation extends BaseTest{

    protected static Methods methods;

    public StepImplementation() {

        methods = new Methods();
    }


    @Step("<Key> saniye bekle")
    public void waitSeconds(int key) throws InterruptedException{
       methods.waitbySeconds(key);
    }


    @Step({"<Key> elementine tıkla"})
    public void elementeTikla(By key){
        methods.findElement(key).click();
    }


    @Step("Username Alaninini Doldur")
    public void sendKeystoElement(){
        methods.sendKeys(By.xpath("//input[@placeholder='Username']"), "KKarakaya");

        }

    @Step("Password Alaninini Yanlis Doldur")
    public void yanlisSifre(){
        methods.sendKeys(By.xpath("//input[@placeholder='Password']"), "Yanlissifre123.");

    }

    @Step("Login Butonuna Tikla")
    public void LoginTikla(){
        methods.tiklaa(By.cssSelector(".css-146c3p1.r-jwli3a.r-1b43r93"));

    }

    @Step("Gecersiz Login Kontrol Edilir")
    public void GecersizLogin(){
        methods.isElementPresent(By.cssSelector(".css-146c3p1.r-howw7u.r-1b43r93"));

    }


    @Step("Password Alaninini Dogru Doldur")
    public void dogruSifre(){
        methods.sendKeys(By.xpath("//input[@placeholder='Password']"), "899899k");

    }

    @Step("Open Money Transfer Butonuna Tiklanir")
    public void OpenMoneyTransferTikla(){
        methods.tiklaa(By.cssSelector(".css-146c3p1.r-jwli3a.r-1b43r93"));

    }

    @Step("Edit Account Butonuna Tiklanir")
    public void EditAccountTikla(){
        methods.tiklaa(By.xpath("//div[contains(text(),'Edit account')]"));

    }

    @Step("Account Name Alanina Sayi Girilir")
    public void AccountNameSayiGir(){
        methods.clearText(By.cssSelector(".css-11aywtz.r-6taxm2.r-1eh6qqt.r-z2wwpe.r-rs99b7.r-h3s6tt.r-1qhn6m8"));
        methods.sendKeys(By.cssSelector(".css-11aywtz.r-6taxm2.r-1eh6qqt.r-z2wwpe.r-rs99b7.r-h3s6tt.r-1qhn6m8"), "123456");

    }

    @Step("Update Butonuna Tiklanir")
    public void UpdateTikla(){
        methods.tiklaa(By.xpath("//div[contains(text(),'UPDATE')]"));

    }

    @Step("Sadece Sayi Account Name Kontrol Edilir")
    public void SadeceSayiKontrol(){
        methods.isElementPresent(By.xpath("//div[normalize-space()='123456']"));

    }
    @Step("OpenMoneyTransfer Gorunur Oldugu Kontrol Edilir")
    public void OpenMoneyTransferKontrol(){
        methods.isElementPresent(By.cssSelector(".css-146c3p1.r-jwli3a.r-1b43r93"));

    }

    @Step("Transfer Money Butonuna Tiklanir")
    public void TransferMoneyTikla(){
        methods.tiklaa(By.xpath("//div[contains(text(),'Transfer money')]"));

    }

    @Step("Amount Alanina Deger Girilir")
    public void AmountAlaniDoldurulur(){
        methods.sendKeys(By.cssSelector(".css-11aywtz.r-6taxm2.r-1eh6qqt.r-z2wwpe.r-rs99b7.r-h3s6tt.r-1qhn6m8"), "100");

    }

    @Step("Send Butonuna Tiklanir")
    public void SendButonunaTikla(){
        methods.tiklaa(By.cssSelector("div[class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-h3s6tt r-1777fci r-tsynxw r-13qz1uu']"));

    }

}
