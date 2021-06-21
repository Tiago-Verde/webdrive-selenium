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
		
		TesteTeclado();

	}
	
	public static void TesteTeclado() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromeDriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://test.juniorsbrissa.com/pagina-de-exemplo/");
		
		WebElement elementoNome = driver.findElement(By.name("inputName"));
		WebElement elementoEmail = driver.findElement(By.name("inputEmail"));
		
		Actions act = new Actions(driver);
		
		//sendKeys
		//act.sendKeys(elementoEmail, "teste@gmail.com").build().perform();
		//act.sendKeys(elementoPassword, "123456").build().perform();
		
		
		//KeyDown e KeyUp
		
		act.keyDown(elementoNome, Keys.SHIFT).build().perform();
		act.sendKeys(elementoNome, "teste@gmail.com");
		
		act.keyUp(elementoEmail, Keys.SHIFT).build().perform();
		act.sendKeys(elementoEmail, "teste").build().perform();
		
		
		
		
		
	}

}
