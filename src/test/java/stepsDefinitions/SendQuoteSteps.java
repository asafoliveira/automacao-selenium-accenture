package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.SelectPriceOptionPage;
import pageObjects.SendQuotePage;

public class SendQuoteSteps {

	// Classe com os metodos gerados a partir do passo a passo descrito no Gherkin
	// das features do Cucumber. Os metodos dessa pagina chamam o metodo "Na" dentro
	// da Utils, passando como paramentro a classe e o metodo com a acao a ser executada
	
	/*********Steps*********/
	
	@Dado("que o usuario esteja acessando a tela de enviar comentarios")
	public void queOUsuarioEstejaAcessandoATelaDeEnviarComentarios() {
		Na(SelectPriceOptionPage.class).selecionarOpcaoDePrecoSilver();
	}

	@Dado("que o usuario nao preencha os campos da tela")
	public void queOUsuarioNaoPreenchaOsCamposDaTela() {

	}

	@Quando("for preenchido o campo e-mail com {string}")
	public void forPreenchidoOCampoEMailCom(String email) {
		Na(SendQuotePage.class).preencherCampoEmail(email);
	}

	@Quando("for preenchido o campo email com um texto maior que trezentos caracteres {string}")
	public void forPreenchidoOCampoEmailComUmTextoMaiorQueTrezentosCaracteres(String email) {
		Na(SendQuotePage.class).preencherCampoEmailTextoLongo(email);
	}

	@Quando("for preenchido o campo Phone com {string}")
	public void forPreenchidoOCampoPhoneCom(String phone) {
		Na(SendQuotePage.class).preencherCampoPhone(phone);
	}

	@Quando("for preencido o campo Username com {string}")
	public void forPreencidoOCampoUsernameCom(String username) {
		Na(SendQuotePage.class).preencherCampoUsername(username);
	}

	@Quando("for preenchido o campo Username com um texto maior que trinta e dois caracteres {string}")
	public void forPreenchidoOCampoUsernameComUmTextoMaiorQueTrintaEDoisCaracteres(String username) {
		Na(SendQuotePage.class).preencherCampoUsernameTextoLongo(username);
	}

	@Quando("for preencido o campo Password com {string}")
	public void forPreencidoOCampoPasswordCom(String password) {
		Na(SendQuotePage.class).preencherCampoPassword(password);
	}

	@Quando("for preenchido o campo Password com um texto maior que trezentos caracteres {string}")
	public void forPreenchidoOCampoPasswordComUmTextoMaiorQueTrezentosCaracteres(String password) {
		Na(SendQuotePage.class).preencherCampoPasswordTextoLongo(password);
	}

	@Quando("for preencido o campo Confirm Password com {string}")
	public void forPreencidoOCampoConfirmPasswordCom(String confirmarPassword) {
		Na(SendQuotePage.class).preencherCampoConfirmPassword(confirmarPassword);
	}

	@Quando("for preenchido o campo Confirm Password com um texto maior que trezentos caracteres {string}")
	public void forPreenchidoOCampoConfirmPasswordComUmTextoMaiorQueTrezentosCaracteres(String confirmarPassword) {
		Na(SendQuotePage.class).preencherCampoConfirmPasswordTextoLongo(confirmarPassword);
	}

	@Quando("for preencido o campo Comments com {string}")
	public void forPreencidoOCampoCommentsCom(String comments) {
		Na(SendQuotePage.class).preencherCampoComments(comments);
	}

	@Quando("for preenchido o campo Comments com um texto maior que trezentos caracteres {string}")
	public void forPreenchidoOCampoCommentsComUmTextoMaiorQueTrezentosCaracteres(String comments) {
		Na(SendQuotePage.class).preencherCampoCommentsTextoLongo(comments);
	}

	@Quando("for acionado o ultimo Botao Send")
	public void forAcionadoOUltimoBotaoSend() {
		Na(SendQuotePage.class).acionarBotaoSendEmail();
	}
	
	/*********Validacoes*********/

	@Entao("o sistema exibe a mensagem de e-mail enviado com sucesso")
	public void oSistemaExibeAMensagemDeEMailEnviadoComSucesso() {
		Na(SendQuotePage.class).validarEnvioDeEmail();
	}

	@Entao("o sistema informa o usuario que ha dados pendentes de preenchimento")
	public void oSistemaInformaOUsuarioQueHaDadosPendentesDePreenchimento() {
		Na(SendQuotePage.class).validarNaoEnvioDeEmail();
	}

	@Entao("o sistema informa que o campo email esta ok")
	public void oSistemaInformaQueOCampoEmailEstaOk() {
		Na(SendQuotePage.class).validarTamanhoCampoEmail();
	}

	@Entao("o sistema exibe a mensagem de erro do campo Username")
	public void oSistemaExibeAMensagemDeErroDoCampoUsername() {
		Na(SendQuotePage.class).validarTamanhoCampoUsername();
	}

	@Entao("o sistema informa que o campo Password esta ok")
	public void oSistemaInformaQueOCampoPasswordEstaOk() {
		Na(SendQuotePage.class).validarTamanhoCampoPassword();
	}

	@Entao("o sistema informa que o campo Confirm Password esta ok")
	public void oSistemaInformaQueOCampoConfirmPasswordEstaOk() {
		Na(SendQuotePage.class).validarTamanhoCampoConfirmPassword();
	}

	@Entao("o sistema informa que o campo Comments esta ok")
	public void oSistemaInformaQueOCampoCommentsEstaOk() {
		Na(SendQuotePage.class).validarTamanhoCampoComments();
	}

}
