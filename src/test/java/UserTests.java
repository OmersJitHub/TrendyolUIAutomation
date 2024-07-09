import Base.BaseLibrary;
import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;

import org.testng.annotations.Test;

public class UserTests extends BaseLibrary {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test(description = "Başarılı Login Kullanıcı Giriş Kontrol")
    public void loginSuccesful() throws InterruptedException {
        loginPage
                .emailDoldur(email)
                .passwordDoldur(password)
                .loginTikla();

        sleep(5000);
        homePage.hesabimKontrol();
    }

    @Test
    public void notValidLogin() throws InterruptedException {
        loginPage
                .emailDoldur(email)
                .passwordDoldur("aaaaaaaaa")
                .loginTikla();

        sleep(3000);
        loginPage.hataMesajiKontrolu(errorMessage);
    }

    @Test
    public void notValidWithEmail() throws InterruptedException {
        loginPage.emailDoldur("aaaaaaaaaaa@mail.com")
                .passwordDoldur(password)
                .loginTikla();
        sleep(3000);
        loginPage.hataMesajiKontrolu(errorMessage);
    }

    @Test
    public void requiredBlankControl() throws InterruptedException {
        loginPage.emailDoldur("")
                .passwordDoldur("")
                .loginTikla();
        sleep(3000);
        loginPage.hataMesajiKontrolu(errorMessage2);
        loginPage.emailDoldur(email)
                .loginTikla();
        sleep(3000);
        loginPage
                .hataMesajiKontrolu("Lütfen şifrenizi giriniz.")
                .passwordDoldur(password)
                .loginTikla();
        sleep(3000);
        homePage.hesabimKontrol();
    }

    @Test
    public void minControl() throws InterruptedException {
        loginPage.emailDoldur("1")
                .passwordDoldur("2")
                .loginTikla();
        sleep(3000);
        loginPage.hataMesajiKontrolu(errorMessage2);
        loginPage.emailDoldur(email)
                .passwordDoldur("2")
                .loginTikla();
        sleep(3000);
        ;
        loginPage.hataMesajiKontrolu(errorMessage);
    }

    @Test
    public void maxControl() throws InterruptedException {
        loginPage.emailDoldur("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111")
                .passwordDoldur(password);
        sleep(3000);
        loginPage.loginTikla();
        Thread.sleep(3000);
        loginPage.hataMesajiKontrolu(errorMessage2);
        sleep(3000);
        loginPage.emailTemizle()
                .passwordTemizle()
                .emailDoldur(email)
                .loginTikla();
        sleep(3000);
        homePage.hesabimKontrol();
    }

}
