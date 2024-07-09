package Pages;

import Base.BaseLibrary;
import Base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {
    public LoginPage emailDoldur(String email)
    {
        driver.findElement(By.name("login email")).sendKeys(email);
        return this;
    }

    public LoginPage passwordDoldur(String password)
    {
        driver.findElement(By.name("login-password")).sendKeys(password);
        return this;
    }

    public LoginPage loginTikla()
    {
        driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button")).click();
        return this;
    }

    public LoginPage hataMesajiKontrolu(String text)
    {
        String value = driver.findElement(By.cssSelector("[class='message']")).getText();
        Assert.assertEquals(text, value);
        return this;
    }

    public LoginPage emailTemizle()
    {
        driver.findElement(By.name("login email")).clear();
        return this;
    }

    public LoginPage passwordTemizle()
    {
        driver.findElement(By.name("login-password")).clear();
        return this;
    }


}
