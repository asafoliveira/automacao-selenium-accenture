package core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.openqa.selenium.WebElement;

public class BasePage {
	
	//Metodos que encapsulam as principais acoes do usuario 
	//Esta classe é extendida nas demais classes do pacote pageObjects do projeto
	
	//Acoes do usuario
	public void escrever(WebElement elemento, String texto){
		elemento.clear();
		elemento.sendKeys(texto);
	}

	public void clicar(WebElement elemento) {
		elemento.click();
	}
	
	//Validacoes
	public void validacaoValorEsperado(String esperado, WebElement elemento) {
		assertEquals(esperado, elemento.getText());
	}
	public void validacaoValorNaoEsperado(String esperado, WebElement elemento) {
		assertNotEquals(esperado, elemento.getText());
	}
	
}
