package selenium.webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLocator {
	
	static WebDriver driver;
	
	

	public static void main(String[] args) {
		
		TesteFacebook();
		
	}
	
	
	public static void TesteFacebook() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromeDriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//elemento identificado pela tag "id"
		driver.findElement(By.id("email")).sendKeys("vutu.goes@gmail.com");
		
		//elemento identificado pela tag "name"
		driver.findElement(By.name("pass")).sendKeys("140284");
		
		// elemento também identificado pela tag "name"
		driver.findElement(By.name("login")).click();
		
		
		
	}

}
