package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class RentAllCarsDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("kullanici ana sayfada")
    public void kullanici_ana_sayfada() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

    @When("kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {
        loginPage.loginButton.click();
    }

    @When("kullanıcı email alanina {string} bilgilerini yazar")
    public void kullanıcı_email_alanina_bilgilerini_yazar(String string) {
        loginPage.email.sendKeys(string);
    }

    @When("password alanina {string} bilgilerini yazar")
    public void password_alanina_bilgilerini_yazar(String string) {
        loginPage.password.sendKeys(string);
    }

    @When("login buttonuna basar")
    public void login_buttonuna_basar() {
        loginPage.loginSubmitButton.click();
    }

    @Then("login islemi gerçekleşir")
    public void login_islemi_gerçekleşir() {
       assert homePage.userID.isDisplayed();
    }

    /*
    USER STORY : US167854_manager_login_test
NAME:kullanici tum manager login bilgileriyle giriş yapabilmeli
AC:
Given kullanici ana sayfada
When kullanici login sayfasina gider
And kullanıcı adini girer->>>>>parametre
And sifreyi girer->>>>>parametre
And login buttoning basar
Then login islemi gerçekleşir
ARTIFACT:
url : https://www.bluerentalcars.com/
Credentials:
                {"sam.walker@bluerentalcars.com","c!fas_art"},
                {"kate.brown@bluerentalcars.com","tad1$Fas"},
                {"raj.khan@bluerentalcars.com","v7Hg_va^"},
                {“pam.raymond@bluerentalcars.com”,"Nga^g6!"}
NOT: scenario outline kullanalim
     */
}
