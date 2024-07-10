package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BaseLibrary {
    @Step("Kabul Et Alanı Kontrolü")
    public MainPage KabulEtTikla() throws InterruptedException {
        sleep(4000);
        WebElement element = driver.findElement(By.id("onetrust-accept-btn-handler"));
        if (element.isDisplayed())
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        return this;
    }
}