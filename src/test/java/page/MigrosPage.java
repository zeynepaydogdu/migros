package page;

import org.jsoup.helper.W3CDom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MigrosPage {
    public MigrosPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//fa-icon[@class='ng-fa-icon ng-tns-c298-2']")
    public WebElement teslimatYontemiSec;

    @FindBy(xpath = "(//div[@class='subtitle-1 text-align-center'])[2]")
    public WebElement magazadanAlacagim;

    @FindBy(xpath = "//span[@class='mat-mdc-select-placeholder mat-mdc-select-min-line ng-tns-c191-14 ng-star-inserted']")
    public WebElement ilDropdown;

    @FindBy(xpath = "(//span[@class='mdc-list-item__primary-text'])[1]")
    public WebElement istanbul;

    @FindBy(xpath = "//div[@class='mat-mdc-form-field-infix ng-tns-c177-15']")
    public WebElement ilce;

    @FindBy(xpath = "(//span[@class='mdc-list-item__primary-text'])[2]")
    public WebElement atasehir;

    @FindBy(xpath = "//div[@class='mat-mdc-select-value ng-tns-c191-18']")
    public WebElement magaza;

    @FindBy(xpath = "(//span[@class='mdc-list-item__primary-text'])[3]")
    public WebElement mmmmigros;

    @FindBy(xpath = "//img[@class='tikla-gel-al-logo ng-tns-c298-2']")
    public WebElement magazaDogrulama;

    @FindBy(id = "product-search-combobox--trigger")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='mat-caption-normal text-color-grey']")
    public WebElement arananUrunDogrulama;

//    @FindBy(xpath = "//input[@id='mat-input-0']")
//    public WebElement markaAra;

    @FindBy(xpath = "//input[@id='mat-mdc-checkbox-2-input']")
    public WebElement capyCheckbox;

    @FindBy(xpath = "//*[@data-icon= 'plus']")
    public List<WebElement> plusIcon;

    @FindBy(xpath ="(//div[@class='mdc-form-field'])[7]")
    public WebElement migrosCheckbox;

    @FindBy(xpath = "//div[@class='mat-chip-list-wrapper']")
    public WebElement filtreDogrulama;

    @FindBy(xpath = "//button[@class='mat-caption-normal ok-btn ng-tns-c266-0']")
    public WebElement cerez;

    @FindBy(xpath = "(//fa-icon[@class='ng-fa-icon add-to-cart-button ng-star-inserted'])[10]")
    public WebElement enSonUrun;

    @FindBy(xpath = "//div[@class='toggle-layer ng-tns-c294-3']")
    public WebElement sepetim;

    @FindBy(xpath = "//button[@class='subtitle-2']")
    public WebElement sepeteGit;

    @FindBy(id = "20000008054617")
    public WebElement urunuDogrula;
}
