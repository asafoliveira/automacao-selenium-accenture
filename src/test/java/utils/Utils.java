package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Propriedades;
import io.cucumber.core.api.Scenario;

public class Utils {

	/***** Classe onde ficam os metodos uteis do projeto *****/

	// Construtor
	public Utils() {
	}

	// Driver
	public static WebDriver driver;

	// Metodo construido para acessar sistema, a logica do Switch sera aplicada
	// conforme o browser estiver setado na Properties
	public static WebDriver acessarSistema() {

		switch (Propriedades.browser) {

		case FIREFOX: {
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}

		case CHROME: {
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}

		}
		driver.get("http://sampleapp.tricentis.com/101/app.php");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		return driver;
	}

	// metodo que encapsula o driver.quit();
	public static void fecharNavegador() {
		driver.quit();
	}

	// Metodo que elimina a necessidade de instancia dos
	// objetos das classes para execucao das acoes
	public static <T> T Na(Class<T> classe) {
		return PageFactory.initElements(driver, classe);
	}

	// Metodo que vai gerar uma String de acordo com os parametros
	public static String concatenarString(String caracter, int length) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < length; i++) {
			sb.append(caracter);
		}

		return sb.toString();
	}

	// Metodo que tira print da tela ao final da realizacao de cada teste
	public static void capturarTela(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}

	// Metodo utilizado para esperar que elementos que levam tempo para carregar
	// estejam visiveis na pagina
	public static void esperarElemento(WebElement elemento) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(elemento));
	}

}
