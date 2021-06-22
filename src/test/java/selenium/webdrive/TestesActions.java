package selenium.webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestesActions {

	public static WebDriver driver;

	public static void main(String[] args) {

		TestesContextClick();

	}

	public static void TesteTeclado() {

		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://test.juniorsbrissa.com/pagina-de-exemplo/");

		WebElement elementoNome = driver.findElement(By.name("inputName"));
		WebElement elementoEmail = driver.findElement(By.name("inputEmail"));

		Actions act = new Actions(driver);

		// sendKeys
		// act.sendKeys(elementoEmail, "teste@gmail.com").build().perform();
		// act.sendKeys(elementoPassword, "123456").build().perform();

		// KeyDown e KeyUp

		act.keyDown(elementoNome, Keys.SHIFT).build().perform();
		act.sendKeys(elementoNome, "teste@gmail.com");

		act.keyUp(elementoEmail, Keys.SHIFT).build().perform();
		act.sendKeys(elementoEmail, "teste").build().perform();

	}

	public static void TestesMouse() {

		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/login");

		Actions act = new Actions(driver);

		WebElement inputUserName = driver.findElement(By.cssSelector("input[name='username']"));
		WebElement inputUserSenha = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement btnEntrar = driver.findElement(By.cssSelector("button[type='submit']"));

		act.sendKeys(inputUserName, "tomsmith111").build().perform();
		act.doubleClick(inputUserName).build().perform();

		act.sendKeys(inputUserName, "tomsmith").build().perform();
		act.sendKeys(inputUserSenha, "SuperSecretPassword!").build().perform();
		act.click(btnEntrar).build().perform();

	}

	public static void TestesContextClick() {

		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act = new Actions(driver);
		
		WebElement botao = driver.findElement(By.cssSelector("span.context-menu-one"));
		
		act.contextClick(botao).build().perform();
		act.sendKeys(botao, Keys.ARROW_DOWN).sendKeys(botao, Keys.ARROW_DOWN).build().perform();
		
		
		act.sendKeys(botao, Keys.ENTER).build().perform();
		
		
		

	}

}
