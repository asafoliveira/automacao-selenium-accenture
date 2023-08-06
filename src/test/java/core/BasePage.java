package core;

import org.openqa.selenium.WebElement;

public class BasePage {
	
	//M�todos que encapsulam as principais acoes do usuario 
	//Esta classe � extendida nas demais classes do pacote pageObjects do projeto
	public void escrever(WebElement elemento, String texto){
		elemento.clear();
		elemento.sendKeys(texto);
	}

	public void clicar(WebElement elemento) {
		elemento.click();
	}
	
}
