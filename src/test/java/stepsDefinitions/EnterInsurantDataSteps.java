package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.EnterInsurantDataPage;
import pageObjects.EnterVehicleDataPage;

public class EnterInsurantDataSteps {
	
	@Dado("que o usuario esteja acessando a pagina de Inserir Dados Pessoais")
	public void queOUsuarioEstejaAcessandoAPaginaDeInserirDadosPessoais() {
		Na(EnterVehicleDataPage.class).preencherDadosDoVeiculo("1000", "2000", "200", "500", "35000", "K@3!90",
				"70000");
	}
	
	@Quando("for preenchido o campo First Name com {string}")
	public void forPreenchidoOCampoFirstNameCom(String firstName) {
	    Na(EnterInsurantDataPage.class).preencherCampoFirstName(firstName);
	}

	@Quando("for preenchido o campo Last Name {string}")
	public void forPreenchidoOCampoLastName(String lastName) {
		Na(EnterInsurantDataPage.class).preencherCampoLastNane(lastName);
	}

	@Quando("for preenchido o campo Date of Birth com {string}")
	public void forPreenchidoOCampoDateOfBirthCom(String dateOfBirth) {
		Na(EnterInsurantDataPage.class).preencherCampoDateOfBirth(dateOfBirth);
	}

	@Quando("for selecionada a opcao Male no campo Gender")
	public void forSelecionadaAOpcaoMaleNoCampoGender() {
		Na(EnterInsurantDataPage.class).selecionarOpcaoGenderMale();
	}

	@Quando("for preenchido o campo Street Address com {string}")
	public void forPreenchidoOCampoStreetAddressCom(String streetAdress) {
		Na(EnterInsurantDataPage.class).preencherCampoStreetAddress(streetAdress);
	}

	@Quando("for acionado o campo Country")
	public void forAcionadoOCampoCountry() {
		Na(EnterInsurantDataPage.class).acionarCampoCountry();
	}

	@Quando("for selecionada a opcao Brazil")
	public void forSelecionadaAOpcaoBrazil() {
	    Na(EnterInsurantDataPage.class).selecionarOpcaoBrazil();
	}

	@Quando("for preenchido o campo Zip Code com {string}")
	public void forPreenchidoOCampoZipCodeCom(String zipCode) {
		Na(EnterInsurantDataPage.class).preencherCampoZipCode(zipCode);
	}

	@Quando("for preenchido o campo City com {string}")
	public void forPreenchidoOCampoCityCom(String city) {
		Na(EnterInsurantDataPage.class).preencherCampoCity(city);
	}

	@Quando("for acionado o campo Occupation")
	public void forAcionadoOCampoOccupation() {
		Na(EnterInsurantDataPage.class).acionarCampoOcuppation();
	}

	@Quando("for selecionada a opcao Employee")
	public void forSelecionadaAOpcaoEmployee() {
		Na(EnterInsurantDataPage.class).selecionarOpcaoEmployee();
	}

	@Quando("forem selecionadas todas as opcoes do campo Hobbies")
	public void foremSelecionadasTodasAsOpcoesDoCampoHobbies() {
		Na(EnterInsurantDataPage.class).selecionarHobbies();
	}

	@Quando("for preenchido o campo website com {string}")
	public void forPreenchidoOCampoWebsiteCom(String website) {
		Na(EnterInsurantDataPage.class).preencherCampoWebsite(website);
	}

	@Quando("for acionado o segundo botao Next")
	public void forAcionadoOSegundoBotaoNext() {
		Na(EnterInsurantDataPage.class).acionarBotaoNextProductData();
	}

	@Entao("o sistema direciona o usuario para a tela Enter Product Data")
	public void oSistemaDirecionaOUsuarioParaATelaEnterProductData() {
		Na(EnterInsurantDataPage.class).validarRedirecionamentoParaProxPagina();
	}

}
