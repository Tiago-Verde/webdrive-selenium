package selenium.webdrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComandosBrowser {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		comandosBrowser();

	}
	
	public static void comandosBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromeDriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		// abre o navegador na URl informada	
		driver.get("https://www.facebook.com");
		
		// pega o titulo da pagina atribui a variavel titulo e imprime na tela
		String titulo = driver.getTitle();
		System.out.println(titulo);
		
		// pega a url da pagina atribui a variavel url e imprime na tela
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		// pega o codigo fonte da pagina atibui a variavel codigoFonte e imprime na tela
		//String codigoFonte = driver.getPageSource();
		//System.out.println(codigoFonte);

		
		driver.close();
		
		
		
	}

}
