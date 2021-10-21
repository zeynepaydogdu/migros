package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import page.MigrosPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.JSUtil.scrollDownByJS;

public class MigrosStepDefinitions {

    MigrosPage page =new MigrosPage();

    @Given("kullanici migros anasayfasina gider")
    public void kullanici_migros_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("migros_url"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("migros_url"));
    }

    @And("teslimat yontemi belirleye tiklar")
    public void teslimatYontemiBelirleyeTiklar() {
        page.teslimatYontemiSec.click();
    }

    @And("magazadan alacagim secilir")
    public void magazadanAlacagimSecilir() {
        page.magazadanAlacagim.click();
    }

    @And("siparisini nerden almak istersin secenegi doldurulur")
    public void siparisiniNerdenAlmakIstersinSecenegiDoldurulur() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        page.ilDropdown.click();
        page.istanbul.click();
        //actions.sendKeys(Keys.TAB).perform();
        page.ilce.click();
        //Select select=new Select(page.atasehir);
        page.atasehir.click();
        page.magaza.click();
        page.mmmmigros.click();
        Assert.assertTrue(page.magazaDogrulama.isDisplayed());
    }
    @And("searchboxa {string} yazilir ve arama butonuna tiklanir")
    public void searchboxaYazilirVeAramaButonunaTiklanir(String arananUrun) {
        page.searchBox.sendKeys(ConfigReader.getProperty("arananUrun")+Keys.ENTER);
        Assert.assertTrue(page.arananUrunDogrulama.isDisplayed());
    }

    @And("cappy ve migros markalari secilir")
    public void cappyVeMigrosMarkalariSecilir() throws InterruptedException {
        Actions actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        page.capyCheckbox.click();
        Thread.sleep(3000);
        page.migrosCheckbox.click();
        Assert.assertTrue(page.filtreDogrulama.isDisplayed());
    }

    @And("en son urun sepete eklenir")
    public void enSonUrunSepeteEklenir() throws InterruptedException {

        Actions actions =new Actions(Driver.getDriver());
        scrollDownByJS();
        actions.sendKeys(Keys.PAGE_UP).perform();
        page.cerez.click();
        Thread.sleep(3000);
        page.plusIcon.get(page.plusIcon.size()-1).click();
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();
    }

    @Then("sepetim sayfasina gidilir urun sepette mi kontrolu yapilir")
    public void sepetimSayfasinaGidilirUrunSepetteMiKontroluYapilir() throws InterruptedException {
        page.sepetim.click();
        Thread.sleep(3000);
        page.sepeteGit.click();
        Actions actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(page.urunuDogrula.isDisplayed());
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
