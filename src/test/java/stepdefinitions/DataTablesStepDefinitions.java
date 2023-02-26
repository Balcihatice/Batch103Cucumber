package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.Driver;

public class DataTablesStepDefinitions {

    DataTablesPage datatablespage = new DataTablesPage();

    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);
    }

    @When("kullanici new butonuna tiklar")
    public void kullanici_new_butonuna_tiklar() {
        // datatablespage.newButonu.click();
        Driver.waitAndClick(datatablespage.newButonu, 3);
    }

    @When("kullanici first name {string} girer")
    public void kullanici_first_name_girer(String string) {
        //datatablespage.firstName.sendKeys(string);
        Driver.wait(1);
        Driver.waitAndSendText(datatablespage.firstName, string, 10);
        //firstName e yazi yazabilmek icin 10 saniye dinamik olarak beklicez
    }

    @When("kullanici last name {string} girer")
    public void kullanici_last_name_girer(String string) {
        datatablespage.lastName.sendKeys(string);
    }

    @When("kullanici positions {string} girer")
    public void kullanici_positions_girer(String string) {
        datatablespage.position.sendKeys(string);
    }

    @When("kullanici office {string} girer")
    public void kullanici_office_girer(String string) {
        datatablespage.office.sendKeys(string);
    }

    @When("kullanici extension {string} girer")
    public void kullanici_extension_girer(String string) {
        datatablespage.extentsion.sendKeys(string);
    }

    @When("kullanici start_date {string} girer")
    public void kullanici_start_date_girer(String string) {
        datatablespage.startDate.sendKeys(string);
    }

    @When("kullanici salary {string} girer")
    public void kullanici_salary_girer(String string) {
        datatablespage.salary.sendKeys(string);
    }

    @When("kullanici create buttonuna tiklar")
    public void kullanici_create_buttonuna_tiklar() {
        datatablespage.create.click();
    }

    @When("kullanici firstname ile {string} arar")
    public void kullanici_firstname_ile_arar(String string) {
        datatablespage.search.sendKeys(string);
    }

    @Then("firstname {string} in olustugunu test et")
    public void firstname_in_olustugunu_test_et(String string) {
        Assert.assertTrue(Driver.waitAndGetText(datatablespage.name,5).contains(string));
       // Assert.assertTrue(datatablespage.name.getText().contains(string));
    }

}
