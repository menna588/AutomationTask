package pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class BasePage {

	//private final String baseURL = System.getProperty("baseURL");
	private final String HomePageURL = System.getProperty("homepageURL");
    //Home Page elements
    public static By Logo(){return By.xpath("//a[@id='jawwy-logo-web']");}
    public static By countrybtn(){return By.xpath("//a[@id='country-btn']");}
    public static By countryfield(){return By.xpath("//span[@id='country-name']");}
    //Packages elements
    public static By packageLight(){return By.xpath("//strong[@id='name-لايت']");}
    public static By packageLight_Price(){return By.xpath("//div[@id='currency-لايت']/b");}
    public static By packageLight_PriceCurrency(){return By.xpath("//div[@id='currency-لايت']/i");}
    public static By packageBasic_Price(){return By.xpath("//div[@id='currency-الأساسية']/b");}
    public static By packageBasic_PriceCurrency(){return By.xpath("//div[@id='currency-الأساسية']/i");}
    public static By packagePremium_Price(){return By.xpath("//div[@id='currency-بريميوم']/b");}
    public static By packagePremium_PriceCurrency(){return By.xpath("//div[@id='currency-بريميوم']/i");}
    public static By packageLight_Startbtn(){return By.xpath("//a[@id='لايت-selection']");}
    public static By packageBasic(){return By.xpath("//strong[@id='name-الأساسية']");}
    public static By packageBasic_Startbtn() {return By.xpath("//a[@id='الأساسية-selection']");}
    public static By packagePremium() { return By.xpath("//strong[@id='name-بريميوم']");}
    public static By packagePremium_Startbtn(){return By.xpath("//a[@id='بريميوم-selection']");}
    public static By Country_Egypt(){return By.xpath("//a[@id='eg']");}
    public static By Country_UAE(){return By.xpath("//a[@id='ae']");}
    public static By Country_Algeria(){return By.xpath("//a[@id='dz']");}
    public static By Country_Djibouti(){return By.xpath("//a[@id='dj']");}
    public static By Country_chad(){return By.xpath("//a[@id='td']");}
    public static By Country_iraq(){return By.xpath("//a[@id='iq']");}
    public static By Country_Jordan(){return By.xpath("//a[@id='jo']");}
    public static By Country_Lebanon(){return By.xpath("//a[@id='lb']");}
    public static By Country_morocco(){return By.xpath("//a[@id='ma']");}
    public static By Country_oman(){return By.xpath("//a[@id='om']");}
    public static By Country_Tunisia(){return By.xpath("//a[@id='tn']");}
    public static By Country_Yemen(){return By.xpath("//a[@id='ye']");}
    public static By Country_Palestine(){return By.xpath("//a[@id='ps']");}



    private SHAFT.GUI.WebDriver driver;

    public BasePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    @Step("Navigate to Home page.")
    public BasePage navigate() {
        driver.browser().navigateToURL(HomePageURL);
        return this;
    }

    @Step("Assert on Home Page URL.")
    public BasePage assertonHomePageURL() {
    	driver.assertThat().browser().url().equalsIgnoringCaseSensitivity(HomePageURL).withCustomReportMessage("User is Navigated to Jawwy URL").perform();
    	return this;
    }
    @Step("Assert on Logo.")
    public BasePage assertonLogoIsDisplayed() {
    	driver.assertThat().element(Logo()).isVisible().withCustomReportMessage("Logo is Displayed successfully").perform();
    	return this;
    }
    @Step("click on country button.")
    public BasePage clickonCountryButton(){
    	driver.element().waitToBeReady(countrybtn()).click(countrybtn());
    	return this;
    }
    @Step("assert on Light package.")
    public BasePage assertonPackageLight(){
    	driver.assertThat().element(packageLight()).isVisible().withCustomReportMessage("Light package is displayed successfully.").perform();
    	driver.assertThat().element(packageLight_Startbtn()).isVisible().perform();
    	return this;
    }
    @Step("assert on Light package price.")
    public BasePage assertonPackageLightPrice(){
    	String price = driver.element().getText(packageLight_Price());
    	String currency = driver.element().getText(packageLight_PriceCurrency());
    	driver.assertThat().element(packageLight_Price()).text().contains(price)
    	.withCustomReportMessage("the price of the light pacjage is:" +price).perform();
    	driver.assertThat().element(packageLight_PriceCurrency()).text().contains(currency)
    	.withCustomReportMessage("the currency of the light pacjage is:" +currency).perform();
    	return this;
    }
    @Step("assert on basic package.")
    public BasePage assertonPackageBasic(){
    	driver.assertThat().element(packageBasic()).isVisible().perform();
    	driver.assertThat().element(packageBasic_Startbtn()).isVisible().perform();
    	return this;
    }
    @Step("assert on Basic package price.")
    public BasePage assertonPackageBasicPrice(){
    	String price = driver.element().getText(packageBasic_Price());
    	String currency = driver.element().getText(packageBasic_PriceCurrency());
    	driver.assertThat().element(packageBasic_Price()).text().contains(price)
    	.withCustomReportMessage("the price of the basic pacjage is:" +price).perform();
    	driver.assertThat().element(packageBasic_PriceCurrency()).text().contains(currency)
    	.withCustomReportMessage("the currency of the basic pacjage is:" +currency).perform();
    	return this;
    }
    @Step("assert on Premium package.")
    public BasePage assertonPackagePremium(){
    	driver.assertThat().element(packagePremium()).isVisible().perform();
    	driver.assertThat().element(packagePremium_Startbtn()).isVisible().perform();
    	return this;
    }
    @Step("assert on Basic package price.")
    public BasePage assertonPackagePremiumPrice(){
    	String price = driver.element().getText(packageBasic_Price());
    	String currency = driver.element().getText(packageBasic_PriceCurrency());
    	driver.assertThat().element(packageBasic_Price()).text().contains(price)
    	.withCustomReportMessage("the price of the Premium pacjage is:" +price).perform();
    	driver.assertThat().element(packageBasic_PriceCurrency()).text().contains(currency)
    	.withCustomReportMessage("the currency of the Premium pacjage is:" +currency).perform();
    	return this;
    }
    @Step
    public BasePage SelectCountry(By country){
      driver.element().waitToBeReady(country).click(country)
      .waitToBeReady(packageBasic_PriceCurrency());      
      return this;
    }
    @Step
    public BasePage assertonCurrentCountry(){
      String country = "مصر";
      driver.assertThat().element(countryfield()).text().contains(country).perform();
      return this;
    }

}
