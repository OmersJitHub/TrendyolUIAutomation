package Base;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest extends Data {

    public static WebDriver driver = new ChromeDriver();
    @Before
    public void setUp()
    {
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.trendyol.com/giris");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
