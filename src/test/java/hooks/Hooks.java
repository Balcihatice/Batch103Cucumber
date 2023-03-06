package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    Her bir scenario yada Scenario Outline dan ONCE yada SONRA calismasini
    istedigimiz methodlar konur
    @Before ve @After methodlari icerir
    Burda onemli olan raporlama isleminin ekran goruntusuyle birlikte Hooks yardimiyla
    yapilmasidir
    Eger @Test deseydim jUnitten kullanirdim ama @Test anatosyonunu
    kullanmayacagim icin Cucumberdan kullanacagiz
     */
//    @Before
//    public void setUpScenario() {
//        System.out.println("Before Methodu");
//    }

    @After
    public void tearDownScenario(Scenario scenario) {
        System.out.println("After Methodu");
        //Eger bir scenario failed ederse ekran goruntusunu al ve rapora ekle
        if (scenario.isFailed()) {
            final byte[] failedScreenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                         //  ekran goruntusu            dosya tipi                 ekran goruntusunun adi
            scenario.attach(failedScreenShot, "image/png", "failed_scenario" + scenario.getName());
            Driver.closeDriver();
        }
    }
}
