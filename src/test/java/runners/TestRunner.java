package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

//Classe construida para executar os testes
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-report"},
		features = "src/test/resources/features",
		glue = "stepsDefinitions",
		tags = "@PreencherDadosPessoaisSucesso",
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		dryRun = false
		)

public class TestRunner {

}
