package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

public class EnterVehicleDataPage extends BasePage {

	// Campos da pagina mapeados atraves da anotacao @FindBy
	@FindBy(id = "make")
	private WebElement campoMake;

	@FindBy(xpath = "//option[@value='Audi']")
	private WebElement opcaoAudi;

	@FindBy(name = "Model")
	private WebElement campoModel;

	@FindBy(xpath = "//option[@value='Scooter']")
	private WebElement opcaoScooter;

	@FindBy(id = "cylindercapacity")
	private WebElement campoCylinderCapacity;

	@FindBy(id = "engineperformance")
	private WebElement campoEnginePerformance;

	@FindBy(id = "opendateofmanufacturecalender")
	private WebElement botaoDateOfManufacture;

	@FindBy(xpath = "//a[@title='Prev']")
	private WebElement botaoMesAnterior;

	@FindBy(xpath = "//a[text()='1']")
	private WebElement data010723;

	@FindBy(xpath = "//select[@id='numberofseats']")
	private WebElement campoNumberOfSeats1;

	@FindBy(xpath = "//select[@id='numberofseats']//option[@value='1']")
	private WebElement opcao1CampoNumberOfSeats1;

	@FindBy(xpath = "//label[text()='Yes']")
	private WebElement opcaoYes;

	@FindBy(xpath = "//select[@id='numberofseatsmotorcycle']")
	private WebElement campoNumberOfSeats2;

	@FindBy(xpath = "//select[@id='numberofseatsmotorcycle']//option[@value='1']")
	private WebElement opcao1CampoNumberOfSeats2;

	@FindBy(id = "fuel")
	private WebElement campoFuelType;

	@FindBy(xpath = "//option[@value='Petrol']")
	private WebElement opcaoPetrol;

	@FindBy(name = "Payload")
	private WebElement campoPayload;

	@FindBy(name = "Total Weight")
	private WebElement campoTotalWeight;

	@FindBy(id = "listprice")
	private WebElement campoListPrice;

	@FindBy(id = "licenseplatenumber")
	private WebElement campoLicencePlateNumber;

	@FindBy(id = "annualmileage")
	private WebElement campoAnnualMileage;

	@FindBy(id = "nextenterinsurantdata")
	private WebElement botaoNextInsurantData;
	
	@FindBy(xpath = "//label[text()='First Name']")
	private WebElement tituloFirstName;	

	// Metodos de acoes encapsulando os campos mapeados da pagina
	public void acionarCampoMake() {
		clicar(campoMake);
	}

	public void selecionarOpcaoAudi() {
		clicar(opcaoAudi);
	}

	public void acionarCampoModel() {
		clicar(campoModel);
	}

	public void selecionarOpcaoScooter() {
		clicar(opcaoScooter);
	}

	public void preencherCampoCylinderCapacity(String cylinderCapacity) {
		escrever(campoCylinderCapacity, cylinderCapacity);
	}

	public void preencherCampoEnginePerformance(String enginePerformance) {
		escrever(campoEnginePerformance, enginePerformance);
	}

	public void acionarBotaoDateOfManufacture() {
		clicar(botaoDateOfManufacture);
	}

	public void acionarBotaoMesAnterior() {
		clicar(botaoMesAnterior);
	}

	public void selecionarData010723() {
		clicar(data010723);
	}

	public void acionarCampoNumberOfSeats1() {
		clicar(campoNumberOfSeats1);
	}

	public void selecionarOpcao1CampoNumberOfSeats1() {
		clicar(opcao1CampoNumberOfSeats1);
	}

	public void selecionarOpcaoYes() {
		clicar(opcaoYes);
	}

	public void acionarCampoNumberOfSeats2() {
		clicar(campoNumberOfSeats2);
	}

	public void selecionarOpcao1CampoNumberOfSeats2() {
		clicar(opcao1CampoNumberOfSeats2);
	}

	public void acionarCampoFuelType() {
		clicar(campoFuelType);
	}

	public void selecionarOpcaoPetrol() {
		clicar(opcaoPetrol);
	}

	public void preencherCampoPayload(String payload) {
		escrever(campoPayload, payload);
	}

	public void preenchertotalWeight(String totalWeight) {
		escrever(campoTotalWeight, totalWeight);
	}

	public void preencherCampoListPrice(String listPrice) {
		escrever(campoListPrice, listPrice);
	}

	public void preencherCampoLicencePlateNumber(String licencePlateNumber) {
		escrever(campoLicencePlateNumber, licencePlateNumber);
	}

	public void preencherCampoAnnualMileage(String annualMileage) {
		escrever(campoAnnualMileage, annualMileage);
	}

	public void acionarBotaoNextInsurantData() {
		clicar(botaoNextInsurantData);
	}

	//Validacao para verificar se o sistema nao redirecionou o usuario para a pagina
	//Enter Insurant Data, atraves de um AssertEquals
	public void validarRedirecionamentoProxPagina() {
		validacaoValorEsperado("First Name", tituloFirstName);
	}
	
	//Validacao para verificar se o sistema nao redirecionou o usuario para a pagina
	//Enter Insurant Data, atraves de um AssertNotEquals
	public void validarFalhaRedirecionamentoProxPagina() {
		validacaoValorNaoEsperado("First Name", tituloFirstName);
	}
	
	// Metodo que encapsula todos os metodos da page e realiza a rotina de
	// preenchimento dos dados do veiculo.
	public void preencherDadosDoVeiculo(String cylinderCapacity, String enginePerformance, String payload,
			String totalWeight, String listPrice, String licensePlateNumber, String annualMileage) {
		acionarCampoMake();
		selecionarOpcaoAudi();
		acionarCampoModel();
		selecionarOpcaoScooter();
		preencherCampoCylinderCapacity(cylinderCapacity);
		preencherCampoEnginePerformance(enginePerformance);
		acionarBotaoDateOfManufacture();
		acionarBotaoMesAnterior();
		selecionarData010723();
		acionarCampoNumberOfSeats1();
		selecionarOpcao1CampoNumberOfSeats1();
		selecionarOpcaoYes();
		acionarCampoNumberOfSeats2();
		selecionarOpcao1CampoNumberOfSeats2();
		acionarCampoFuelType();
		selecionarOpcaoPetrol();
		preencherCampoPayload(payload);
		preenchertotalWeight(totalWeight);
		preencherCampoListPrice(listPrice);
		preencherCampoLicencePlateNumber(licensePlateNumber);
		preencherCampoAnnualMileage(annualMileage);
		acionarBotaoNextInsurantData();
		validarRedirecionamentoProxPagina();
	}

}
