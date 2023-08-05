package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterInsurantDataPage {

	@FindBy(id = "firstname")
	private WebElement campoFirstName;

	@FindBy(id = "lastname")
	private WebElement campoLastName;

	@FindBy(id = "birthdate")
	private WebElement campoDateOfBirth;

	@FindBy(xpath = "//label[text()='Male']")
	private WebElement opcaoGenderMale;

	@FindBy(name = "Street Address")
	private WebElement campoStreetAddress;

	@FindBy(id = "country")
	private WebElement campoCountry;

	@FindBy(xpath = "//select[@id='country']//option[@value='Brazil']")
	private WebElement opcaoBrazil;

	@FindBy(id = "zipcode")
	private WebElement campoZipcode;

	@FindBy(id = "city")
	private WebElement campoCity;

	@FindBy(id = "occupation")
	private WebElement campoOcuppation;

	@FindBy(xpath = "//select[@id='occupation']//option[@value='Employee']")
	private WebElement opcaoEmployee;

	@FindBy(xpath = "//label[text()=' Speeding']")
	private WebElement opcaoSpeeding;

	@FindBy(xpath = "//label[text()=' Bungee Jumping']")
	private WebElement opcaoBungeeJumping;

	@FindBy(xpath = "//label[text()=' Cliff Diving']")
	private WebElement opcaoCliffDiving;

	@FindBy(xpath = "//label[text()=' Skydiving']")
	private WebElement opcaoSkyDiving;

	@FindBy(xpath = "//label[text()=' Other']")
	private WebElement opcaoOther;

	@FindBy(name = "Website")
	private WebElement campoWebsite;

	@FindBy(id = "nextenterproductdata")
	private WebElement botaoNextProductData;

	public void preencherCampoFirstName(String firstName) {
		campoFirstName.sendKeys(firstName);
	}

	public void preencherCampoLastNane(String lastName) {
		campoLastName.sendKeys(lastName);
	}

	public void preencherCampoDateOfBirth(String dateOfBirth) {
		campoDateOfBirth.sendKeys(dateOfBirth);
	}

	public void selecionarOpcaoGenderMale() {
		opcaoGenderMale.click();
	}

	public void acionarCampoCountry() {
		campoCountry.click();
	}

	public void preencherCampoStreetAddress(String streetAdress) {
		campoStreetAddress.sendKeys(streetAdress);
	}

	public void selecionarOpcaoBrazil() {
		opcaoBrazil.click();
	}

	public void preencherCampoZipCode(String zipCode) {
		campoZipcode.sendKeys(zipCode);
	}

	public void preencherCampoCity(String city) {
		campoCity.sendKeys(city);
	}

	public void acionarCampoOcuppation() {
		campoOcuppation.click();
	}

	public void selecionarOpcaoEmployee() {
		opcaoEmployee.click();
	}

	public void selecionarHobbies() {
		opcaoSpeeding.click();
		opcaoBungeeJumping.click();
		opcaoCliffDiving.click();
		opcaoSkyDiving.click();
		opcaoOther.click();
	}

	public void preencherCampoWebsite(String website) {
		campoWebsite.sendKeys(website);
	}
	
	public void acionarBotaoNextProductData() {
		botaoNextProductData.click();
	}
	
	public void preencherDadosPessoais(String firstName, String lastName, String dateOfBirth, String streetAddress,
			String zipCode, String city, String website) {
		preencherCampoFirstName(firstName);
		preencherCampoLastNane(lastName);
		preencherCampoDateOfBirth(dateOfBirth);
		selecionarOpcaoGenderMale();
		preencherCampoStreetAddress(streetAddress);
		acionarCampoCountry();
		selecionarOpcaoBrazil();
		preencherCampoZipCode(zipCode);
		preencherCampoCity(city);
		acionarCampoOcuppation();
		selecionarOpcaoEmployee();
		selecionarHobbies();
		preencherCampoWebsite(website);
		acionarBotaoNextProductData();
	}

}
