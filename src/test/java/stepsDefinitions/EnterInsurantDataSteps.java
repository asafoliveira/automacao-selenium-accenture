package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.EnterInsurantDataPage;
import pageObjects.EnterVehicleDataPage;

public class EnterInsurantDataSteps {

	// Classe com os metodos gerados a partir do passo a passo descrito no Gherkin
	// das features do Cucumber. Os metodos dessa pagina chamam o metodo "Na" dentro
	// da Utils, passando como paramentro a classe e o metodo com a acao a ser executada
	
	/*********Steps*********/
	
	@Dado("que o usuario esteja acessando a pagina de inserir dados pessoais")
	public void queOUsuarioEstejaAcessandoAPaginaDeInserirDadosPessoais() {
		Na(EnterVehicleDataPage.class).preencherDadosDoVeiculo("1000", "2000", "200", "500", "35000", "K@3!90",
				"70000");
	}
	
	// Este metodo propositalmente nao executa nenhuma acao, conforme proposto no cenario
	@Dado("que o usuario nao preencha os campos de dropdown, radio e checkbox da pagina")
	public void queOUsuarioNaoPreenchaOsCamposDeDropdownRadioECheckboxDaPagina() {

	}
	
	// Este metodo propositalmente nao executa nenhuma acao, conforme proposto no cenario
	@Dado("que o usuario nao preencha os dados pessoais")
	public void queOUsuarioNaoPreenchaOsDadosPessoais() {

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

	@Quando("for selecionada a opcao employee")
	public void forSelecionadaAOpcaoEmployee() {
		Na(EnterInsurantDataPage.class).selecionarOpcaoEmployee();
	}

	@Quando("forem selecionadas todas as opcoes do campo Hobbies")
	public void foremSelecionadasTodasAsOpcoesDoCampoHobbies() {
		Na(EnterInsurantDataPage.class).selecionarHobbies();
	}

	@Quando("for preenchido o campo Website com {string}")
	public void forPreenchidoOCampoWebsiteCom(String website) {
		Na(EnterInsurantDataPage.class).preencherCampoWebsite(website);
	}

	@Quando("for acionado o segundo botao Next")
	public void forAcionadoOSegundoBotaoNext() {
		Na(EnterInsurantDataPage.class).acionarBotaoNextProductData();
	}

	@Quando("for preenchido o campo First Name com um texto maior que trezentos caracteres {string}")
	public void forPreenchidoOCampoFirstNameComUmTextoMaiorQueTrezentosCaracteres(String firstName) {
		Na(EnterInsurantDataPage.class).preencherCampoFirstNameTextoLongo(firstName);
	}

	@Quando("for preenchido o campo Last Name com um texto maior que trezentos caracteres {string}")
	public void forPreenchidoOCampoLastNameComUmTextoMaiorQueTrezentosCaracteres(String lastName) {
		Na(EnterInsurantDataPage.class).preencherCampoLastNameTextoLongo(lastName);
	}

	@Quando("for preenchido o campo Street Address com um texto maior que trezentos caracteres {string}")
	public void forPreenchidoOCampoStreetAddressComUmTextoMaiorQueTrezentosCaracteres(String streetAddress) {
		Na(EnterInsurantDataPage.class).preencherCampoStreetAddressTextoLongo(streetAddress);
	}

	@Quando("for preenchido o campo Webiste com um texto maior que trezentos caracteres {string}")
	public void forPreenchidoOCampoWebisteComUmTextoMaiorQueTrezentosCaracteres(String website) {
		Na(EnterInsurantDataPage.class).preencherCampoWebsiteTextoLongo(website);
	}
	
	/*********Validacoes*********/
	
	@Entao("o sistema direciona o usuario para a tela de inserir dados do produto")
	public void oSistemaDirecionaOUsuarioParaATelaDeInserirDadosDoProduto() {
		Na(EnterInsurantDataPage.class).validarRedirecionamentoProxPagina();
	}

	@Entao("o sistema nao direciona o usuario para a tela de inserir dados do produto")
	public void oSistemaNaoDirecionaOUsuarioParaATelaDeInserirDadosDoProduto() {
		Na(EnterInsurantDataPage.class).validarFalhaRedirecionamentoProxPagina();
	}

	@Entao("o sistema informa que o campo FirstName esta ok")
	public void oSistemaInformaQueOCampoFirstNameEstaOk() {
		Na(EnterInsurantDataPage.class).validarTamanhoCampoFirstName();
	}

	@Entao("o sistema informa que o campo LastName esta ok")
	public void oSistemaInformaQueOCampoLastNameEstaOk() {
		Na(EnterInsurantDataPage.class).validarTamanhoCampoLastName();
	}

	@Entao("o sistema informa que o campo Street Address esta ok")
	public void oSistemaInformaQueOCampoStreetAddressEstaOk() {
		Na(EnterInsurantDataPage.class).validarTamanhoCampoStreetAddress();
	}

	@Entao("o sistema informa que o campo Website esta ok")
	public void oSistemaInformaQueOCampoWebsiteEstaOk() {
		Na(EnterInsurantDataPage.class).validarTamanhoCampoWebsite();
	}

}
