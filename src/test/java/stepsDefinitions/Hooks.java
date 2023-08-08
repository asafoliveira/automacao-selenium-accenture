package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	// Metodo de setUp sempre sera executado antes da realizacao dos testes atraves
	// da anotacao @Before. Da mesma forma, o metodo de tearDown sempre sera
	// executado apos os testes atraves da anotacao @After
	
	//Funcao que chama o metodo acessarSistema da Utils
	@Before
	public void setUp() {
		acessarSistema();
	}
	
	//Funcao que chama os metodos capturarTela e fecharNavegador da Utils
	@After
	public void tearDown(Scenario scenario) {
		capturarTela(scenario);
		fecharNavegador();
	}

}
