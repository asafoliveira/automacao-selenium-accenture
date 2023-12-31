package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

public class EnterProductDataPage extends BasePage {

	// Campos da pagina mapeados atraves da anotacao @FindBy
	@FindBy(id = "openstartdatecalender")
	private WebElement botaoStartDate;

	@FindBy(xpath = "//a[@title='Next']")
	private WebElement botaoProximoMes;

	@FindBy(xpath = "//a[text()='29']")
	private WebElement data290923;

	@FindBy(id = "insurancesum")
	private WebElement campoInsuranceSum;

	@FindBy(xpath = "//select[@id='insurancesum']//option[@value='15000000']")
	private WebElement opcaoQuinzeMilhoes;

	@FindBy(id = "meritrating")
	private WebElement campoMeritRating;

	@FindBy(xpath = "//select[@id='meritrating']//option[@value='Malus 12']")
	private WebElement opcaoMalus12;

	@FindBy(id = "damageinsurance")
	private WebElement campoDamageInsurance;

	@FindBy(xpath = "//select[@id='damageinsurance']//option[@value='Partial Coverage']")
	private WebElement opcaoPartialCoverage;

	@FindBy(xpath = "//label[text()='Euro Protection']")
	private WebElement opcaoEuroProtection;

	@FindBy(xpath = "//label[text()='Legal Defense Insurance']")
	private WebElement opcaoLegalDefenseInsurance;

	@FindBy(id = "courtesycar")
	private WebElement campoCourtesyCar;

	@FindBy(xpath = "//select[@id='courtesycar']//option[@value='Yes']")
	private WebElement opcaoYes;

	@FindBy(id = "nextselectpriceoption")
	private WebElement botaoNextPriceAction;
	
	@FindBy(xpath = "//th[text()='Silver']")
	private WebElement tituloSilver;
	
	// Metodos de acoes encapsulando os campos mapeados da pagina
	public void acionarBotaoStartDate() {
		clicar(botaoStartDate);
	}

	public void acionarBotaoProximoMes() {
		clicar(botaoProximoMes);
	}

	public void selecionarData290923() {
		clicar(data290923);
	}

	public void acionarCampoInsuranceSum() {
		clicar(campoInsuranceSum);
	}

	public void selecionarOpcaoQuinzeMilhoes() {
		clicar(opcaoQuinzeMilhoes);
	}

	public void acionarCampoMeritRating() {
		clicar(campoMeritRating);
	}

	public void selecionarOpcaoMalus12() {
		clicar(opcaoMalus12);
	}

	public void acionarCampoDamageInsurance() {
		clicar(campoDamageInsurance);
	}

	public void selecionarOpcaoPartialCoverage() {
		clicar(opcaoPartialCoverage);
	}

	public void selecionarProdutosOpcionais() {
		clicar(opcaoEuroProtection);
		clicar(opcaoLegalDefenseInsurance);
	}

	public void acionarCampoCourtesyCar() {
		clicar(campoCourtesyCar);
	}

	public void selecionarOpcaoYes() {
		clicar(opcaoYes);
	}

	public void acionarBotaoNextPriceAction() {
		clicar(botaoNextPriceAction);
	}
	
	// Validacao para verificar se o sistema redirecionou o usuario para a pagina
	// Select Price Options, atraves do mapeamento de um dos campos da pagina seguinte
	public void validarRedirecionamentoProxPagina() {
		validacaoValorEsperado("Silver", tituloSilver);
		
	}
	
	// Validacao para verificar se o sistema nao redirecionou o usuario para a
	// Select Price Options, atraves do mapeamento de um dos campos da pagina seguinte
	public void validarFalhaRedirecionamentoProxPagina() {
		validacaoValorNaoEsperado("Silver", tituloSilver);
	}

	public void preencherDadosDoProduto() {
		Na(EnterInsurantDataPage.class).preencherDadosPessoais("Tester", "Automation", "08/25/1990",
				"Rua Automacao, Av da Qualidade", "12345678", "Itapecuru", "QAccenture.will");
		acionarBotaoStartDate();
		acionarBotaoProximoMes();
		selecionarData290923();
		acionarCampoInsuranceSum();
		selecionarOpcaoQuinzeMilhoes();
		acionarCampoMeritRating();
		selecionarOpcaoMalus12();
		acionarCampoDamageInsurance();
		selecionarOpcaoPartialCoverage();
		selecionarProdutosOpcionais();
		acionarCampoCourtesyCar();
		selecionarOpcaoYes();
		acionarBotaoNextPriceAction();
		validarRedirecionamentoProxPagina();
	}

}
