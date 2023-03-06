package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {
    HomePage homePage;
    LoginPage loginPage;

    ExcelUtils excelUtils;
    List<Map<String,String>> excelData;

    @Given("kullanici {string} bilgileri ile giris yapar")
    public void kullanici_bilgileri_ile_giris_yapar(String sayfaAdi) throws IOException {
        String path="src/test/resources/testdata/mysmoketestdata (1).xlsx";
       // String sayfa = "customer_info";
        excelUtils = new ExcelUtils(path,sayfaAdi);
        excelData=excelUtils.getDataList();//Excel datalarini aldik
//        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
//        home page logine tikla
        for (Map<String,String> data:excelData) {
            //        Sayfaya git
            Driver.getDriver().get(ConfigReader.getProperty("app_url"));//HOME SAYFASINA
            homePage= new HomePage();
            loginPage = new LoginPage();
            homePage.firstLogin.click();
            ReusableMethods.waitFor(1);// 1 saniye bekle
            loginPage.email.sendKeys(data.get("username"));
            ReusableMethods.waitFor(1);
            loginPage.password.sendKeys(data.get("password"));
            ReusableMethods.waitFor(1);
            loginPage.loginSubmitButton.click();
            //            GIRIS YAPILDI
            ReusableMethods.waitFor(1);
            ReusableMethods.verifyElementDisplayed(homePage.userID);//ASSERTION
            ReusableMethods.waitFor(1);
            ReusableMethods.getScreenshot("EkranGoruntusu");
            ReusableMethods.waitFor(1);
            homePage.userID.click();
            ReusableMethods.waitFor(1);
            homePage.logOutLink.click();
            ReusableMethods.waitFor(1);
            homePage.OK.click();
        }
        Driver.closeDriver();

    }
}
