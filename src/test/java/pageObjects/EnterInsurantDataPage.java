package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

public class EnterInsurantDataPage extends BasePage {

	// Campos da página mapeados através da anotacao @FindBy
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

	// Métodos de acoes encapsulando os campos mapeados da página
	public void preencherCampoFirstName(String firstName) {
		escrever(campoFirstName, firstName);
	}

	public void preencherCampoLastNane(String lastName) {
		escrever(campoLastName, lastName);
	}

	public void preencherCampoDateOfBirth(String dateOfBirth) {
		escrever(campoDateOfBirth, dateOfBirth);
	}

	public void selecionarOpcaoGenderMale() {
		clicar(opcaoGenderMale);
	}

	public void acionarCampoCountry() {
		clicar(campoCountry);
	}

	public void preencherCampoStreetAddress(String streetAdress) {
		escrever(campoStreetAddress, streetAdress);
	}

	public void selecionarOpcaoBrazil() {
		clicar(opcaoBrazil);
	}

	public void preencherCampoZipCode(String zipCode) {
		escrever(campoZipcode, zipCode);
	}

	public void preencherCampoCity(String city) {
		escrever(campoCity, city);
	}

	public void acionarCampoOcuppation() {
		clicar(campoOcuppation);
	}

	public void selecionarOpcaoEmployee() {
		clicar(opcaoEmployee);
	}

	public void selecionarHobbies() {
		clicar(opcaoSpeeding);
		clicar(opcaoBungeeJumping);
		clicar(opcaoCliffDiving);
		clicar(opcaoSkyDiving);
		clicar(opcaoOther);
	}

	public void preencherCampoWebsite(String website) {
		escrever(campoWebsite, website);
	}

	public void acionarBotaoNextProductData() {
		clicar(botaoNextProductData);
	}

	//Validacao para verificar se o sistemar redirecionou o usuario para a página
	//Enter Insurant Data, atraves do mapeamento de um dos campos da página seguinte 
	public void validarRedirecionamentoParaProxPagina() {
		assertEquals("Start Date", driver.findElement(By.xpath("//label[text()='Start Date']")).getText());
	}

	//Método que encapsula todos os métodos da page e realiza a rotina de
	//preenchimento dos dados pessoais.
	public void preencherDadosPessoais(String firstName, String lastName, String dateOfBirth, String streetAddress,
			String zipCode, String city, String website) {
		Na(EnterVehicleDataPage.class).preencherDadosDoVeiculo("1000", "2000", "200", "500", "35000", "54321@",
				"70000");
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
