package selenium.webdrive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteTabelaHtml {

	static WebDriver driver;

	public static void main(String[] args) {

		testeTabela();

	}

	public static void testeTabela() {

		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://test.juniorsbrissa.com/entradas-wpcf7/");

		driver.manage().window().maximize();

		List<WebElement> todasLinhas = driver.findElements(By.xpath("//table/tbody/tr"));

		System.out.println(todasLinhas.size());

		List<WebElement> todasColunas = driver.findElements(By.xpath("//table/tbody/tr/td"));

		System.out.println(todasColunas.size());

		for (int i = 0; i < todasLinhas.size(); i++) {

			for (int j = 0; j < todasColunas.size(); j++) {
				
				System.out.println(todasColunas.get(j).getText());

			}
		}
	}

}
