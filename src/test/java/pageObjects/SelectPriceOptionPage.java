package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

public class SelectPriceOptionPage extends BasePage {
	
	// Campos da pagina mapeados atraves da anotacao @FindBy
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

	// Metodos de acoes encapsulando os campos mapeados da pagina
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
	
	// Validacao para verificar se o sistema redirecionou o usuario para a pagina
	// Send Quotes, atraves do mapeamento de um dos campos da pagina seguinte
	public void validarRedirecionamentoProxPagina() {
		validacaoValorEsperado("E-Mail", tituloEmail);
	}
	
	// Validacao para verificar se o sistema nao redirecionou o usuario para a pagina
	// Send Quotes, atraves do mapeamento de um dos campos da pagina seguinte
	public void validarFalhaRedirecionamentoProxPagina() {
		validacaoValorNaoEsperado("E-Mail", tituloEmail);
	}
	
	// Metodos que encapsulam os metodos essenciais da page e realiza a rotina de
	// Selecao de Opcao de Preco, com as opcoes disponiveis na pagina
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
