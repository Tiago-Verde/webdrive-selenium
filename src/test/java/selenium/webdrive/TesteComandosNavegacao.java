package selenium.webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TesteComandosNavegacao {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void navegacao() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromeDriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://www,facebook.com");
				
		// navega até o site 
		driver.navigate().to("https://www.google.com");
				
		// localiza o campo de busca do site e digita a busca
		driver.findElement(By.name("q")).sendKeys("celular");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.linkText("Shopping")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		
	}

}
