package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.EnterInsurantDataPage;
import pageObjects.EnterVehicleDataPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class EnterInsurantDataSteps {
	
	@Dado("que eu esteja acessando a pagina de Enter Insurant Data")
	public void queEuEstejaAcessandoAPaginaDeEnterInsurantData() {
		Na(EnterVehicleDataPage.class).preencherDadosDoVeiculo("1000", "2000", "200", "500", "35000", "K@3!90",
				"70000");
	}
	
	@Quando("eu preencher o campo First Name com {string}")
	public void euPreencherOCampoFirstNameCom(String firstName) {
	    Na(EnterInsurantDataPage.class).preencherCampoFirstName(firstName);
	}

	@Quando("eu preeencher o campo Last Name {string}")
	public void euPreeencherOCampoLastName(String lastName) {
		Na(EnterInsurantDataPage.class).preencherCampoLastNane(lastName);
	}

	@Quando("preencher o campo Date of Birth com {string}")
	public void preencherOCampoDateOfBirthCom(String dateOfBirth) {
		Na(EnterInsurantDataPage.class).preencherCampoDateOfBirth(dateOfBirth);
	}

	@Quando("selecionar a opcao Male no campo Gender")
	public void selecionarAOpcaoMaleNoCampoGender() {
		Na(EnterInsurantDataPage.class).selecionarOpcaoGenderMale();
	}

	@Quando("preencher o campo Street Address com {string}")
	public void preencherOCampoStreetAddressCom(String streetAdress) {
		Na(EnterInsurantDataPage.class).preencherCampoStreetAddress(streetAdress);
	}

	@Quando("acionar o campo Country")
	public void acionarOCampoCountry() {
		Na(EnterInsurantDataPage.class).acionarCampoCountry();
	}

	@Quando("selecionar a opcao Brazil")
	public void selecionarAOpcaoBrazil() {
	    Na(EnterInsurantDataPage.class).selecionarOpcaoBrazil();
	}

	@Quando("preencher o campo Zip Code com {string}")
	public void preencherOCampoZipCodeCom(String zipCode) {
		Na(EnterInsurantDataPage.class).preencherCampoZipCode(zipCode);
	}

	@Quando("preencher o campo City com {string}")
	public void preencherOCampoCityCom(String city) {
		Na(EnterInsurantDataPage.class).preencherCampoCity(city);
	}

	@Quando("acionar o campo Occupation")
	public void acionarOCampoOccupation() {
		Na(EnterInsurantDataPage.class).acionarCampoOcuppation();
	}

	@Quando("selecionar a opcao Employee")
	public void selecionarAOpcaoEmployee() {
		Na(EnterInsurantDataPage.class).selecionarOpcaoEmployee();
	}

	@Quando("selecionar todas as opcoes do campo Hobbies")
	public void selecionarTodasAsOpcoesDoCampoHobbies() {
		Na(EnterInsurantDataPage.class).selecionarHobbies();
	}

	@Quando("preencher o campo website com {string}")
	public void preencherOCampoWebsiteCom(String website) {
		Na(EnterInsurantDataPage.class).preencherCampoWebsite(website);
	}

	@Quando("acionar o segundo botao Next")
	public void acionarOSegundoBotaoNext() {
		Na(EnterInsurantDataPage.class).acionarBotaoNextProductData();
	}

	@Entao("o sistema me direciona para a tela Enter Product Data")
	public void oSistemaMeDirecionaParaATelaEnterProductData() {
	    assertEquals("Start Date", driver.findElement(By.xpath("//label[text()='Start Date']")).getText());
	}

}
