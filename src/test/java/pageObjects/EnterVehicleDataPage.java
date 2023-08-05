package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterVehicleDataPage {

	//Campos
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

	//Métodos
	public void acionarCampoMake() {
		campoMake.click();
	}

	public void selecionarOpcaoAudi() {
		opcaoAudi.click();
	}

	public void acionarCampoModel() {
		campoModel.click();
	}

	public void selecionarOpcaoScooter() {
		opcaoScooter.click();
	}

	public void preencherCampoCylinderCapacity(String cylinderCapacity) {
		campoCylinderCapacity.sendKeys(cylinderCapacity);
	}

	public void preencherCampoEnginePerformance(String enginePerformance) {
		campoEnginePerformance.sendKeys(enginePerformance);
	}

	public void preencherDateOfManufacture(String dateOfManufacture) {
		campoEnginePerformance.sendKeys(dateOfManufacture);
	}

	public void acionarBotaoDateOfManufacture() {
		botaoDateOfManufacture.click();
	}

	public void acionarBotaoMesAnterior() {
		botaoMesAnterior.click();
	}

	public void selecionarData010723() {
		data010723.click();
	}

	public void acionarCampoNumberOfSeats1() {
		campoNumberOfSeats1.click();
	}

	public void selecionarOpcao1CampoNumberOfSeats1() {
		opcao1CampoNumberOfSeats1.click();
	}

	public void selecionarOpcaoYes() {
		opcaoYes.click();
	}

	public void acionarCampoNumberOfSeats2() {
		campoNumberOfSeats2.click();
	}

	public void selecionarOpcao1CampoNumberOfSeats2() {
		opcao1CampoNumberOfSeats2.click();
	}

	public void acionarCampoFuelType() {
		campoFuelType.click();
	}

	public void selecionarOpcaoPetrol() {
		opcaoPetrol.click();
	}

	public void preencherCampoPayload(String payload) {
		campoPayload.sendKeys(payload);
	}

	public void preenchertotalWeight(String totalWeight) {
		campoTotalWeight.sendKeys(totalWeight);
	}

	public void preencherCampoListPrice(String listPrice) {
		campoListPrice.sendKeys(listPrice);
	}

	public void preencherCampoLicencePlateNumber(String licencePlateNumber) {
		campoLicencePlateNumber.sendKeys(licencePlateNumber);
	}

	public void preencherCampoAnnualMileage(String annualMileage) {
		campoAnnualMileage.sendKeys(annualMileage);
	}

	public void acionarBotaoNextInsurantData() {
		botaoNextInsurantData.click();
	}

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
	}

}
