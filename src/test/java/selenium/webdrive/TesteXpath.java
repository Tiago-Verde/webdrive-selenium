package selenium.webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteXpath {

	static WebDriver driver;

	public static void main(String[] args) {
		
		xpathRelativo(); 

	}

	public static void xpathRelativo() {

		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.magazineluiza.com.br");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='inpHeaderSearch']")).sendKeys("celular");
	}

}
