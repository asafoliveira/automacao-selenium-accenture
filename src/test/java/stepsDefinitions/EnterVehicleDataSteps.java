package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.EnterVehicleDataPage;

public class EnterVehicleDataSteps {

	@Dado("que o usuario acione o campo Make")
	public void queOUsuarioAcioneOCampoMake() {
		Na(EnterVehicleDataPage.class).acionarCampoMake();
	}
	
	//Este metodo propositalmente nao executa nenhuma acao, conforme proposto no cenario
	@Dado("que o usuario nao preencha os campos de dropdown e radio da pagina")
	public void queOUsuarioNaoPreenchaOsCamposDeDropdownERadioDaPagina() {
	    
	}
	
	//Este metodo propositalmente nao executa nenhuma acao, conforme proposto no cenario
	@Dado("que o usuario nao preencha os dados do veiculo")
	public void queOUsuarioNaoPreenchaOsDadosDoVeiculo() {
	    
	}

	@Quando("for selecionada a Opcao Audi")
	public void forSelecionadaAOpcaoAudi() {
		Na(EnterVehicleDataPage.class).selecionarOpcaoAudi();
	}

	@Quando("for acionado o campo Model")
	public void forAcionadoOCampoModel() {
		Na(EnterVehicleDataPage.class).acionarCampoModel();
	}

	@Quando("for selecionada a opcao Scooter")
	public void forSelecionadaAOpcaoScooter() {
		Na(EnterVehicleDataPage.class).selecionarOpcaoScooter();
	}

	@Quando("for preenchido o campo Cylinder Capacity com {string}")
	public void forPreenchidoOCampoCylinderCapacityCom(String cylinderCapacity) {
		Na(EnterVehicleDataPage.class).preencherCampoCylinderCapacity(cylinderCapacity);
	}

	@Quando("for preenchido o campo engine performance com {string}")
	public void forPreenchidoOCampoEnginePerformanceCom(String enginePerformance) {
		Na(EnterVehicleDataPage.class).preencherCampoEnginePerformance(enginePerformance);
	}

	@Quando("for acionado o botao do campo Date of Manufacture")
	public void forAcionadoOBotaoDoCampoDateOfManufacture() {
		Na(EnterVehicleDataPage.class).acionarBotaoDateOfManufacture();
	}

	@Quando("for acionado o botao de voltar um mes no calendario")
	public void forAcionadoOBotaoDeVoltarUmMesNoCalendario() {
		Na(EnterVehicleDataPage.class).acionarBotaoMesAnterior();
	}

	@Quando("for selecionada a data um de julho de dois mil e vinte e tres")
	public void forSelecionadaADataUmDeJulhoDeDoisMilEVinteETres() {
		Na(EnterVehicleDataPage.class).selecionarData010723();
	}

	@Quando("for acionado o primeiro campo Number of Seats")
	public void forAcionadoOPrimeiroCampoNumberOfSeats() {
		Na(EnterVehicleDataPage.class).acionarCampoNumberOfSeats1();
	}

	@Quando("for selecionada a opcao um")
	public void forSelecionadaAOpcaoUm() {
		Na(EnterVehicleDataPage.class).selecionarOpcao1CampoNumberOfSeats1();
	}

	@Quando("for selecionada a opcao Yes no campo Right Hand Drive")
	public void forSelecionadaAOpcaoYesNoCampoRightHandDrive() {
		Na(EnterVehicleDataPage.class).selecionarOpcaoYes();
	}

	@Quando("for acionado o segundo campo Number of Seats")
	public void forAcionadoOSegundoCampoNumberOfSeats() {
		Na(EnterVehicleDataPage.class).acionarCampoNumberOfSeats2();
	}

	@Quando("for selecionada a primeira opcao")
	public void forSelecionadaAPrimeiraOpcao() {
		Na(EnterVehicleDataPage.class).selecionarOpcao1CampoNumberOfSeats2();
	}

	@Quando("for acionado o campo Fuel Type")
	public void forAcionadoOCampoFuelType() {
		Na(EnterVehicleDataPage.class).acionarCampoFuelType();
	}

	@Quando("for selecionada a opcao Petrol")
	public void forSelecionadaAOpcaoPetrol() {
		Na(EnterVehicleDataPage.class).selecionarOpcaoPetrol();
	}

	@Quando("for preenchido o campo Payload com {string}")
	public void forPreenchidoOCampoPayloadCom(String payload) {
		Na(EnterVehicleDataPage.class).preencherCampoPayload(payload);
	}

	@Quando("for preenchido o campo Total Weight com {string}")
	public void forPreenchidoOCampoTotalWeightCom(String totalWeight) {
		Na(EnterVehicleDataPage.class).preenchertotalWeight(totalWeight);
	}

	@Quando("for preenchido o campo List Price com {string}")
	public void forPreenchidoOCampoListPriceCom(String listPrice) {
		Na(EnterVehicleDataPage.class).preencherCampoListPrice(listPrice);
	}

	@Quando("for preenchido o campo License Plate Number com {string}")
	public void forPreenchidoOCampoLicensePlateNumberCom(String licensePlateNumber) {
		Na(EnterVehicleDataPage.class).preencherCampoLicencePlateNumber(licensePlateNumber);
	}

	@Quando("for preenchido o campo Annual Mileage com {string}")
	public void forPreenchidoOCampoAnnualMileageCom(String annualMileage) {
		Na(EnterVehicleDataPage.class).preencherCampoAnnualMileage(annualMileage);
	}

	@Quando("for acionado o primeiro botao Next")
	public void forAcionadoOPrimeiroBotaoNext() {
		Na(EnterVehicleDataPage.class).acionarBotaoNextInsurantData();
	}

	@Entao("o sistema direciona o usuario para a tela de inserir dados pessoais")
	public void oSistemaDirecionaOUsuarioParaATelaDeInserirDadosPessoais() {
		Na(EnterVehicleDataPage.class).validarRedirecionamentoProxPagina();
	}
	
	@Entao("o sistema nao direciona o usuario para a tela de inserir dados pessoais")
	public void oSistemaNaoDirecionaOUsuarioParaATelaDeInserirDadosPessoais() {
		Na(EnterVehicleDataPage.class).validarFalhaRedirecionamentoProxPagina();
	}

}
