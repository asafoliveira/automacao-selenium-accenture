package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

public class EnterInsurantDataPage extends BasePage {

	// Campos da pagina mapeados atraves da anotacao @FindBy
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

	@FindBy(xpath = "//section[2]/div[1]/i")
	private WebElement iconeOKCampoFirstName;

	@FindBy(xpath = "//section[2]/div[2]/i")
	private WebElement iconeOKCampoLastName;

	@FindBy(xpath = "//section[2]/div[5]/i")
	private WebElement iconeOKCampoStreetAddress;

	@FindBy(xpath = "//section[2]/div[11]/i")
	private WebElement iconeOKCampoWebsite;

	@FindBy(xpath = "//label[text()='Start Date']")
	private WebElement tituloStartDate;

	// Metodos de acoes encapsulando os campos mapeados da pagina
	public void preencherCampoFirstName(String firstName) {
		escrever(campoFirstName, firstName);
	}

	public void preencherCampoFirstNameTextoLongo(String firstName) {
		escrever(campoFirstName, firstName + concatenarString("A", 300));
	}

	public void preencherCampoLastNane(String lastName) {
		escrever(campoLastName, lastName);
	}

	public void preencherCampoLastNameTextoLongo(String lastName) {
		escrever(campoLastName, lastName + concatenarString("A", 300));
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

	public void preencherCampoStreetAddressTextoLongo(String streetAdress) {
		escrever(campoStreetAddress, streetAdress + concatenarString("A12@", 300));
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

	public void preencherCampoWebsiteTextoLongo(String website) {
		escrever(campoWebsite, concatenarString("A", 300) + website);
	}

	public void acionarBotaoNextProductData() {
		clicar(botaoNextProductData);
	}

	// Validacao para verificar se o sistema redirecionou o usuario para a pagina
	// Enter Insurant Data, atraves do mapeamento de um dos campos da pagina seguinte
	public void validarRedirecionamentoProxPagina() {
		validacaoValorEsperado("Start Date", tituloStartDate);
	}

	// Validacao para verificar se o sistema nao redirecionou o usuario para a
	// pagina Enter Insurant Data, atraves do mapeamento de um dos campos da pagina seguinte
	public void validarFalhaRedirecionamentoProxPagina() {
		validacaoValorNaoEsperado("Start Date", tituloStartDate);
	}

	// Validacoes para verificar se o sistema aceitou a inserçao dos dados, atraves
	// do mapeamento da mensagem de OK do campo
	public void validarTamanhoCampoFirstName() {
		esperarElemento(iconeOKCampoFirstName);
		validacaoValorEsperado(iconeOKCampoFirstName);
	}

	public void validarTamanhoCampoLastName() {
		esperarElemento(iconeOKCampoLastName);
		validacaoValorEsperado(iconeOKCampoLastName);
	}

	public void validarTamanhoCampoStreetAddress() {
		esperarElemento(iconeOKCampoStreetAddress);
		validacaoValorEsperado(iconeOKCampoStreetAddress);
	}

	public void validarTamanhoCampoWebsite() {
		esperarElemento(iconeOKCampoWebsite);
		validacaoValorEsperado(iconeOKCampoWebsite);
	}

	// Metodo que encapsula os metodos essenciais da page e realiza a rotina de
	// preenchimento dos dados pessoais
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
		validarRedirecionamentoProxPagina();
	}

}
