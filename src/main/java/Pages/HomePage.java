package Pages;

import Base.BaseLibrary;
import Base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends BaseLibrary {
    public HomePage hesabimKontrol()
    {
        String value4 = driver.findElement(By.cssSelector("[class='link account-user'] p")).getText();
        Assert.assertEquals("Hesabım", value4);
        return this;
    }
}
