package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

public class SelectPriceOptionPage extends BasePage {
	
	@FindBy(xpath = "//th[2]/label[1]/span")
	private WebElement opcaoSilver;
	
	@FindBy(xpath = "//th[2]/label[2]/span")
	private WebElement opcaoGold;
	
	@FindBy(xpath = "//th[2]/label[3]/span")
	private WebElement opcaoPlatinum;
	
	@FindBy(xpath = "//th[2]/label[4]/span")
	private WebElement opcaoUltimate;
	
	@FindBy(id = "nextsendquote")
	private WebElement botaoNextSendQuote;
	
	@FindBy(xpath = "//label[text()='E-Mail']")
	private WebElement tituloEmail;

	
	public void selecionarOpcaoSilver() {
		clicar(opcaoSilver);
	}
	
	public void selecionarOpcaoGold() {
		clicar(opcaoGold);
	}
	
	public void selecionarOpcaoPlatinum() {
		clicar(opcaoPlatinum);
	}
	
	
	public void selecionarOpcaoUltimate() {
		clicar(opcaoUltimate);
	}
	
	public void acionarBotaoNextSendQuote() {
		clicar(botaoNextSendQuote);
	}

	public void validarRedirecionamentoProxPagina() {
		validacaoValorEsperado("E-Mail", tituloEmail);
	}
	
	public void validarFalhaRedirecionamentoProxPagina() {
		validacaoValorNaoEsperado("E-Mail", tituloEmail);
	}
	
	public void selecionarOpcaoDePrecoSilver() {
		Na(EnterProductDataPage.class).preencherDadosDoProduto();
		selecionarOpcaoSilver();
		acionarBotaoNextSendQuote();
		validarRedirecionamentoProxPagina();
	}
	
	public void selecionarOpcaoDePrecoGold() {
		Na(EnterProductDataPage.class).preencherDadosDoProduto();
		selecionarOpcaoGold();
		acionarBotaoNextSendQuote();
		validarRedirecionamentoProxPagina();
	}
	
	public void selecionarOpcaoDePrecoPlatinum() {
		Na(EnterProductDataPage.class).preencherDadosDoProduto();
		selecionarOpcaoPlatinum();
		acionarBotaoNextSendQuote();
		validarRedirecionamentoProxPagina();
	}
	
	public void selecionarOpcaoDePrecoUltimate() {
		Na(EnterProductDataPage.class).preencherDadosDoProduto();
		selecionarOpcaoUltimate();
		acionarBotaoNextSendQuote();
		validarRedirecionamentoProxPagina();
	}
	
}
