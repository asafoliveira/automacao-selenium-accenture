package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

import core.BasePage;

public class SendQuotePage extends BasePage {
	
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
	private WebElement mensagemEmailEnviadoSucsso;
	
	public void preencherCampoEmail(String email) {
		escrever(campoEmail, email);
	}
	
	public void preencherCampoPhone(String phone) {
		escrever(campoPhone, phone);
	}
	
	public void preencherCampoUsername(String username) {
		escrever(campoUsername, username);
	}
	
	public void preencherCampoPassword(String password) {
		escrever(campoPassword, password);
	}
	
	public void preencherCampoConfirmPassword(String confirmarPassword) {
		escrever(campoConfirmPassword, confirmarPassword);
	}
	
	public void preencherCampoComments(String comments) {
		escrever(campoComments, comments);
	}
	
	public void acionarBotaoSendEmail() {
		clicar(botaoSendEmail);
	}
	
	public void validarEnvioDeEmail() {
		esperarElemento(mensagemEmailEnviadoSucsso);
		validacaoValorEsperado("Sending e-mail success!", mensagemEmailEnviadoSucsso);
	}

}
