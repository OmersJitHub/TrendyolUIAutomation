package Pages;

import Base.BaseLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BaseLibrary {
    public MainPage KabulEtTikla() throws InterruptedException {
        sleep(4000);
        WebElement element= driver.findElement(By.id("onetrust-accept-btn-handler"));
        if(element.isDisplayed())
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        return this;
    }
}