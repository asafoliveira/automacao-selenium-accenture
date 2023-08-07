package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.SelectPriceOptionPage;
import pageObjects.SendQuotePage;

public class SendQuoteSteps {
	
	@Dado("que o usuario esteja acessando a tela de enviar comentarios")
	public void queOUsuarioEstejaAcessandoATelaDeEnviarComentarios() {
	    Na(SelectPriceOptionPage.class).selecionarOpcaoDePrecoSilver();
	}

	@Quando("for preenchido o campo e-mail com {string}")
	public void forPreenchidoOCampoEMailCom(String email) {
	    Na(SendQuotePage.class).preencherCampoEmail(email);
	}

	@Quando("for preenchido o campo Phone com {string}")
	public void forPreenchidoOCampoPhoneCom(String phone) {
		 Na(SendQuotePage.class).preencherCampoPhone(phone);
	}

	@Quando("for preencido o campo Username com {string}")
	public void forPreencidoOCampoUsernameCom(String username) {
		 Na(SendQuotePage.class).preencherCampoUsername(username);
	}

	@Quando("for preencido o campo Password com {string}")
	public void forPreencidoOCampoPasswordCom(String password) {
		 Na(SendQuotePage.class).preencherCampoPassword(password);
	}

	@Quando("for preencido o campo Confirm Password com {string}")
	public void forPreencidoOCampoConfirmPasswordCom(String confirmarPassword) {
		Na(SendQuotePage.class).preencherCampoConfirmPassword(confirmarPassword);
	}

	@Quando("for preencido o campo Comments com {string}")
	public void forPreencidoOCampoCommentsCom(String comments) {
		Na(SendQuotePage.class).preencherCampoComments(comments);
	}

	@Quando("for acionado o ultimo Botao Send")
	public void forAcionadoOUltimoBotaoSend() {
		Na(SendQuotePage.class).acionarBotaoSendEmail();
	}
	
	@Entao("o sistema exibe a mensagem de e-mail enviado com sucesso")
	public void oSistemaExibeAMensagemDeEMailEnviadoComSucesso() {
		Na(SendQuotePage.class).validarEnvioDeEmail();
	}

}
