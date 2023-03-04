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
    HomePage blueRentalHomePage;
    LoginPage blueRentalLoginPage;

    ExcelUtils excelUtils;
    List<Map<String,String>> excelData;

    @Given("kullanici {string} bilgileri ile giris yapar")
    public void kullanici_bilgileri_ile_giris_yapar(String string) throws IOException {
        String path="src/test/resources/testdata/mysmoketestdata (1).xlsx";
        String sayfa = "customer_info";
        excelUtils = new ExcelUtils(path,sayfa);
        excelData=excelUtils.getDataList();//Excel datalarini aldik
//        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
//        home page logine tikla
        for (Map<String,String> data:excelData) {
            //        Sayfaya git
            Driver.getDriver().get(ConfigReader.getProperty("app_url"));//HOME SAYFASINA
            blueRentalHomePage= new HomePage();
            blueRentalLoginPage = new LoginPage();
            blueRentalHomePage.firstLogin.click();
            ReusableMethods.waitFor(1);// 1 saniye bekle
            blueRentalLoginPage.email.sendKeys(data.get("username"));
            ReusableMethods.waitFor(1);
            blueRentalLoginPage.password.sendKeys(data.get("password"));
            ReusableMethods.waitFor(1);
            blueRentalLoginPage.loginSubmitButton.click();
            //            GIRIS YAPILDI
            ReusableMethods.waitFor(1);
            ReusableMethods.verifyElementDisplayed(blueRentalHomePage.userID);//ASSERTION
            ReusableMethods.waitFor(1);
            ReusableMethods.getScreenshot("EkranGoruntusu");
            ReusableMethods.waitFor(1);
            blueRentalHomePage.userID.click();
            ReusableMethods.waitFor(1);
            blueRentalHomePage.logOutLink.click();
            ReusableMethods.waitFor(1);
            blueRentalHomePage.OK.click();
        }
        Driver.closeDriver();

    }
}
