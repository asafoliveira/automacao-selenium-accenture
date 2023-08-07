package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.EnterProductDataPage;
import pageObjects.SelectPriceOptionPage;

public class SelectPriceOptionSteps {
	
	@Dado("que o usuario esteja acessando a tela de Selecao de Opcoes de Preco")
	public void queOUsuarioEstejaAcessandoATelaDeSelecaoDeOpcoesDePreco() {
		Na(EnterProductDataPage.class).preencherDadosDoProduto();
	}

	@Quando("for selecionada a Opcao Silver no campo Select Option")
	public void forSelecionadaAOpcaoSilverNoCampoSelectOption() {
		Na(SelectPriceOptionPage.class).selecionarOpcaoSilver();
	}

	@Quando("for selecionada a Opcao Gold no campo Select Option")
	public void forSelecionadaAOpcaoGoldNoCampoSelectOption() {
		Na(SelectPriceOptionPage.class).selecionarOpcaoGold();
	}

	@Quando("for selecionada a Opcao Platinum no campo Select Option")
	public void forSelecionadaAOpcaoPlatinumNoCampoSelectOption() {
		Na(SelectPriceOptionPage.class).selecionarOpcaoPlatinum();
	}

	@Quando("for selecionada a Opcao Ultimate no campo Select Option")
	public void forSelecionadaAOpcaoUltimateNoCampoSelectOption() {
		Na(SelectPriceOptionPage.class).selecionarOpcaoUltimate();
	}
	
	@Quando("nao for selecionada uma Opcao de Preco")
	public void naoForSelecionadaUmaOpcaoDePreco() {
	    
	}

	
	@Quando("for acionado o quarto botao Next")
	public void forAcionadoOQuartoBotaoNext() {
		Na(SelectPriceOptionPage.class).acionarBotaoNextSendQuote();
	}
	
	@Entao("o sistema direciona o usuario para a tela de enviar comentarios")
	public void oSistemaDirecionaOUsuarioParaATelaDeEnviarComentarios() {
		Na(SelectPriceOptionPage.class).validarRedirecionamentoProxPagina();
	}
	
	@Entao("o sistema nao direciona o usuario para a tela de enviar comentarios")
	public void oSistemaNaoDirecionaOUsuarioParaATelaDeEnviarComentarios() {
		Na(SelectPriceOptionPage.class).validarFalhaRedirecionamentoProxPagina();
	}

}
