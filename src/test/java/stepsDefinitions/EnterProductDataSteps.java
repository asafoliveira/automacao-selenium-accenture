package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.EnterInsurantDataPage;
import pageObjects.EnterProductDataPage;

public class EnterProductDataSteps {

	@Dado("que o usuario esteja acessando a tela de Preencher Dados do Produto")
	public void queOUsuarioEstejaAcessandoATelaDePreencherDadosDoProduto() {
		Na(EnterInsurantDataPage.class).preencherDadosPessoais("Tester", "Automation", "08/25/1990",
				"Rua Automação, Av da Qualidade", "35537667", "Itapecuru", "QAccenture.com");
	}

	@Quando("for acionado o botao do campo Start Date")
	public void forAcionadoOBotaoDoCampoStartDate() {
		Na(EnterProductDataPage.class).acionarBotaoStartDate();
	}

	@Quando("for acionado o botao de avancar um mes no calendario")
	public void forAcionadoOBotaoDeAvancarUmMesNoCalendario() {
		Na(EnterProductDataPage.class).acionarBotaoProximoMes();
	}

	@Quando("for selecionada a data Vinte e Nove de Setembro de Dois Mil e Vinte e Tres")
	public void forSelecionadaADataVinteENoveDeSetembroDeDoisMilEVinteETres() {
		Na(EnterProductDataPage.class).selecionarData290923();
	}

	@Quando("for acionado o campo Insurance Sum")
	public void forAcionadoOCampoInsuranceSum() {
		Na(EnterProductDataPage.class).acionarCampoInsuranceSum();
	}

	@Quando("for selecionada a opcao Quinze Milhoes")
	public void forSelecionadaAOpcaoQuinzeMilhoes() {
		Na(EnterProductDataPage.class).selecionarOpcaoQuinzeMilhoes();
	}
	
	@Quando("for acionado o campo Merit Rating")
	public void forAcionadoOCampoMeritRating() {
		Na(EnterProductDataPage.class).acionarCampoMeritRating();
	}

	@Quando("for selecionada a opcao Malus Doze")
	public void forSelecionadaAOpcaoMalusDoze() {
		Na(EnterProductDataPage.class).selecionarOpcaoMalus12();
	}

	@Quando("for acionado o campo Damage Insurance")
	public void forAcionadoOCampoDamageInsurance() {
		Na(EnterProductDataPage.class).acionarCampoDamageInsurance();
	}

	@Quando("for selecionada a opcao Partial Coverage")
	public void forSelecionadaAOpcaoPartialCoverage() {
		Na(EnterProductDataPage.class).selecionarOpcaoPartialCoverage();
	}

	@Quando("forem seleciondas as todas as opcoes do campo Optional Products")
	public void foremSeleciondasAsTodasAsOpcoesDoCampoOptionalProducts() {
		Na(EnterProductDataPage.class).selecionarProdutosOpcionais();
	}

	@Quando("for acionado o campo Courtesy Car")
	public void forAcionadoOCampoCourtesyCar() {
		Na(EnterProductDataPage.class).acionarCampoCourtesyCar();
	}
	
	@Quando("for selecionada a opcao Yes")
	public void forSelecionadaAOpcaoYes() {
		Na(EnterProductDataPage.class).selecionarOpcaoYes();
	}

	@Quando("for acionado o terceiro botao Next")
	public void forAcionadoOTerceiroBotaoNext() {
		Na(EnterProductDataPage.class).acionarBotaoNextPriceAction();
	}

	@Entao("o sistema me direciona para a tela de Opcoes de selecao de Preco")
	public void oSistemaMeDirecionaParaATelaDeOpcoesDeSelecaoDePreco() {
		Na(EnterProductDataPage.class).validarRedirecionamentoParaProxPagina();
	}

}
