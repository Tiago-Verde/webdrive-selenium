package selenium.webdrive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLocator {

	static WebDriver driver;

	public static void main(String[] args) {

		TestClassName();

	}

	public static void TesteFacebook() {

		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		// elemento mapeado pelo "id"
		driver.findElement(By.id("email")).sendKeys("vutu.goes@gmail.com");

		// elemento mapeado pelo "name"
		driver.findElement(By.name("pass")).sendKeys("140284");

		// elemento também mapeado pelo "name"
		driver.findElement(By.name("login")).click();

	}

	public static void TesteTagName() {

		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://jundiai.sp.gov.br/");

		// elemento mapeado pela tag "a" - armazenado em uma list
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (WebElement webElement : links) {

			System.out.println(webElement.getText());
		}

	}

	public static void TestClassName() {

		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://trivago.com.br/");
		
		//elemento mapeado pelo nome da classe		
		driver.findElement(By.className("siteheader__nav-list-string")).click();
		
		

	}

}
