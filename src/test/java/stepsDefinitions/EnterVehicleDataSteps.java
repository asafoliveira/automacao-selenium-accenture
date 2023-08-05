package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.EnterVehicleDataPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class EnterVehicleDataSteps {

	@Dado("que eu acione o campo Make")
	public void queEuAcioneOCampoMake() {
	    Na(EnterVehicleDataPage.class).acionarCampoMake();
	}

	@Quando("eu selecionar a Opcao Audi")
	public void euSelecionarAOpcaoAudi() {
		Na(EnterVehicleDataPage.class).selecionarOpcaoAudi();
	}
	
	@Quando("acionar o campo Model")
	public void acionarOCampoModel() {
		Na(EnterVehicleDataPage.class).acionarCampoModel();
	}

	@Quando("selecionar a opcao Scooter")
	public void selecionarAOpcaoScooter() {
		Na(EnterVehicleDataPage.class).selecionarOpcaoScooter();
	}

	
	@Quando("preencher o campo Cylinder Capacity com {string}")
	public void preencherOCampoCylinderCapacityCom(String cylinderCapacity) {
		Na(EnterVehicleDataPage.class).preencherCampoCylinderCapacity(cylinderCapacity);
	}

	@Quando("preencher o campo Engine Performance com {string}")
	public void preencherOCampoEnginePerformanceCom(String enginePerformance) {
		Na(EnterVehicleDataPage.class).preencherCampoEnginePerformance(enginePerformance);
	}

	@Quando("acionar o botao do campo Date of Manufacture")
	public void acionarOConeDeDataDoCampoDateOfManufacture() {
		Na(EnterVehicleDataPage.class).acionarBotaoDateOfManufacture();;
	}
	
	@Quando("acionar o botao de voltar um mes no calendario")
	public void acionarOBotaoDeVoltarUmMesNoCalendario() {
		Na(EnterVehicleDataPage.class).acionarBotaoMesAnterior();
	}

	@Quando("selecionar a data um de julho de dois mil e vinte e tres")
	public void selecionarADataUmDeJulhoDeDoisMilEVinteETres() {
	    Na(EnterVehicleDataPage.class).selecionarData010723();
	}

	@Quando("acionar o primeiro campo Number of seats")
	public void acionarOPrimeiroCampoNumberOfSeats() {
		Na(EnterVehicleDataPage.class).acionarCampoNumberOfSeats1();
	}

	@Quando("escolher a opcao um")
	public void escolherAOpcaoUm() {
		Na(EnterVehicleDataPage.class).selecionarOpcao1CampoNumberOfSeats1();
	}
	
	@Quando("escolher a opcao Yes no campo Right Hand Drive")
	public void escolherAOpcaoYesNoCampoRightHandDrive() {
		Na(EnterVehicleDataPage.class).selecionarOpcaoYes();
	}
	
	@Quando("acionar o segundo campo Number of seats")
	public void acionarOSegundoCampoNumberOfSeats() {
		Na(EnterVehicleDataPage.class).acionarCampoNumberOfSeats2();
	}

	@Quando("selecionar a primeira opcao")
	public void selecionarAPrimeiraOpcao() {
		Na(EnterVehicleDataPage.class).selecionarOpcao1CampoNumberOfSeats2();
	}

	@Quando("acessar o campo Fuel Type")
	public void acessarOCampoFuelType() {
		Na(EnterVehicleDataPage.class).acionarCampoFuelType();
	}

	@Quando("selecionar a opcao Petrol")
	public void selecionarAOpcaoPetrol() {
		Na(EnterVehicleDataPage.class).selecionarOpcaoPetrol();
	}
	
	@Quando("preencher o campo Payload com {string}")
	public void preencherOCampoPayloadCom(String payload) {
		Na(EnterVehicleDataPage.class).preencherCampoPayload(payload);
	}

	@Quando("preencher o campo Total Weight com {string}")
	public void preencherOCampoTotalWeightCom(String totalWeight) {
		Na(EnterVehicleDataPage.class).preenchertotalWeight(totalWeight);
	}

	@Quando("preencher o campo List Price com {string}")
	public void preencherOCampoListPriceCom(String listPrice) {
		Na(EnterVehicleDataPage.class).preencherCampoListPrice(listPrice);
	}

	@Quando("preencher o campo License Plate Number com {string}")
	public void preencherOCampoLicensePlateNumberCom(String licensePlateNumber) {
		Na(EnterVehicleDataPage.class).preencherCampoLicencePlateNumber(licensePlateNumber);
	}

	@Quando("preencher o campo Annual Mileage com {string}")
	public void preencherOCampoAnnualMileageCom(String annualMileage) {
		Na(EnterVehicleDataPage.class).preencherCampoAnnualMileage(annualMileage);
	}

	@Quando("acionar o primeiro botao Next")
	public void acionarOPrimeiroBotONext() {
		Na(EnterVehicleDataPage.class).acionarBotaoNextInsurantData();
	}

	@Entao("o sistema me direciona para a tela Enter Insurance Data")
	public void oSistemaMeDirecionaTelaEnterInsuranceData() {
	    assertEquals("First Name", driver.findElement(By.xpath("//label[text()='First Name']")).getText());
	}

}
