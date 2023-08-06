package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

public class EnterProductDataPage extends BasePage {
	
	// Campos da página mapeados através da anotacao @FindBy
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
	
	public void selecionarOpcaoMalus12 () {
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
	
	public void validarRedirecionamentoParaProxPagina() {
		assertEquals("Silver", driver.findElement(By.xpath("//th[text()='Silver']")).getText());
	}
		
}
