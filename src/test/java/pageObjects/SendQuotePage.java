package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

import core.BasePage;

public class SendQuotePage extends BasePage {
	
	// Campos da pagina mapeados atraves da anotacao @FindBy
	@FindBy(id = "email")
	private WebElement campoEmail;
	
	@FindBy(id = "phone")
	private WebElement campoPhone;
	
	@FindBy(id = "username")
	private WebElement campoUsername;
	
	@FindBy(id = "password")
	private WebElement campoPassword;
	
	@FindBy(id = "confirmpassword")
	private WebElement campoConfirmPassword;
	
	@FindBy(id = "Comments")
	private WebElement campoComments;
	
	@FindBy(id = "sendemail")
	private WebElement botaoSendEmail;
	
	@FindBy(xpath = "//h2[text()='Sending e-mail success!']")
	private WebElement mensagemEmailSucess;
	
	@FindBy(xpath = "//h2[text()='Not finished yet...']")
	private WebElement mensagemNotFinishedYet;
	
	@FindBy(xpath = "//section[5]/section/div[1]/i")
	private WebElement iconeOKCampoEmail;
	
	@FindBy(xpath = "//span[contains(text(), 'Must be between 4 and 32')]")
	private WebElement mensagemErroCampoUsername;
	
	@FindBy(xpath = "//section[5]/section/div[4]/i")
	private WebElement iconeOKCampoPassword;
	
	@FindBy(xpath = "//section[5]/section/div[5]/i")
	private WebElement iconeOKCampoConfirmPassword;
	
	@FindBy(xpath = "//span[text()='Must be under 300 characters']")
	private WebElement mensagemErroCampoComments;
	
	// Metodos de acoes encapsulando os campos mapeados da pagina
	public void preencherCampoEmail(String email) {
		escrever(campoEmail, email);
	}
	
	public void preencherCampoEmailTextoLongo(String email) {
		escrever(campoEmail, concatenarString("A", 300) + email);
	}
	
	public void preencherCampoPhone(String phone) {
		escrever(campoPhone, phone);
	}
	
	public void preencherCampoUsername(String username) {
		escrever(campoUsername, username);
	}
	
	public void preencherCampoUsernameTextoLongo(String username) {
		escrever(campoUsername, concatenarString("A",33) + username);
	}
	
	public void preencherCampoPassword(String password) {
		escrever(campoPassword, password);
	}
	
	public void preencherCampoPasswordTextoLongo(String password) {
		escrever(campoPassword, concatenarString("A", 300) + password);
	}
	
	public void preencherCampoConfirmPassword(String confirmarPassword) {
		escrever(campoConfirmPassword, confirmarPassword);
	}
	
	public void preencherCampoConfirmPasswordTextoLongo(String confirmarPassword) {
		escrever(campoConfirmPassword, concatenarString("A", 300) + confirmarPassword);
	}
	
	public void preencherCampoComments(String comments) {
		escrever(campoComments, comments);
	}
	
	public void preencherCampoCommentsTextoLongo(String comments) {
		escrever(campoComments, concatenarString("A", 300) + comments);
	}
	
	public void acionarBotaoSendEmail() {
		clicar(botaoSendEmail);
	}
	
	// Validacao para verificar se o E-mail foi enviado com sucesso
	public void validarEnvioDeEmail() {
		esperarElemento(mensagemEmailSucess);
		validacaoValorEsperado("Sending e-mail success!", mensagemEmailSucess);
	}
	
	// Validacao para verificar se o envio do E-mail falhou
	public void validarNaoEnvioDeEmail() {
		esperarElemento(mensagemNotFinishedYet);
		validacaoValorEsperado("Not finished yet...", mensagemNotFinishedYet);
	}
	
	// Validacoes para verificar se o sistema aceitou a inserçao dos dados, atraves
	// do mapeamento da mensagem de OK do campo
	public void validarTamanhoCampoEmail() {
		esperarElemento(iconeOKCampoEmail);
		validacaoValorEsperado(iconeOKCampoEmail);
	}
	
	public void validarTamanhoCampoUsername() {
		esperarElemento(mensagemErroCampoUsername);
		validacaoValorEsperado(mensagemErroCampoUsername);
	}
	
	public void validarTamanhoCampoPassword() {
		esperarElemento(iconeOKCampoPassword);
		validacaoValorEsperado(iconeOKCampoPassword);
	}
	
	public void validarTamanhoCampoConfirmPassword() {
		esperarElemento(iconeOKCampoConfirmPassword);
		validacaoValorEsperado(iconeOKCampoConfirmPassword);
	}
	
	public void validarTamanhoCampoComments() {
		esperarElemento(mensagemErroCampoComments);
		validacaoValorEsperado(mensagemErroCampoComments);
	}

}
