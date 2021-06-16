package selenium.webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComandoWebElement {
	
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		webElement();
	}
	
	
	public static void webElement() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromeDriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("teste@teste.com.br");
		
		driver.findElement(By.id("email")).clear();
		
		
		boolean apareceu;
		apareceu = driver.findElement(By.id("email")).isDisplayed();
		System.out.println(apareceu);
		
		
		boolean habilitado;
		habilitado = driver.findElement(By.id("email")).isEnabled();
		System.out.println(habilitado);
		
		
		//pagina de login do facebook mudou
		//boolean selecionado;
		//selecionado = driver.findElement(By.name("sex")).isSelected();
		//System.out.println(selecionado);
		
				
		String textoLink = driver.findElement(By.linkText("Criar uma Página")).getText();
		System.out.println(textoLink);
		
		
		driver.findElement(By.name("login")).submit();
		
		driver.navigate().refresh();
		
		
		
		
		
		}
		
		
		
		


	}
	

