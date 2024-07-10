package Pages;

import Base.BaseLibrary;
import Base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends BaseLibrary {
    @Step("Email Alanı Doldurulur")
    public LoginPage emailDoldur(String email) {
        driver.findElement(By.name("login email")).sendKeys(email);
        return this;
    }

    @Step("Parola Alanı Doldurulur")
    public LoginPage passwordDoldur(String password) {
        driver.findElement(By.name("login-password")).sendKeys(password);
        return this;
    }

    @Step("Login Butonuna Tıklanır")
    public LoginPage loginTikla() {
        driver.findElements(By.xpath("//*[contains(text(),'Giriş Yap')]")).get(3).click();
        return this;
    }

    @Step("Hata Mesajı Kontrolü: {text}")
    public LoginPage hataMesajiKontrolu(String text) {
        String value = driver.findElement(By.cssSelector("[class='message']")).getText();
        Assert.assertEquals(text, value);
        return this;
    }

    @Step("Email Alanı İçeriği Temizlenir")
    public LoginPage emailTemizle() {
        driver.findElement(By.name("login email")).clear();
        return this;
    }
    @Step("Password İçeriğini Temizler")
    public LoginPage passwordTemizle() {
        driver.findElement(By.name("login-password")).clear();
        return this;
    }
}