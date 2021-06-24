package selenium.webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteJavaScript {

	static WebDriver driver;

	public static void main(String[] args) {

		submarino();

	}

	public static void submarino() {

		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.submarino.com.br/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('h_search-input').value='livros';");
		js.executeScript("document.getElementById('h_search-btn').click();");

		js.executeScript("window.scrollBy(0,1100)");

		WebElement livro = driver.findElement(By.cssSelector(
				"img[src='https://images-submarino.b2w.io/produtos/imagens/440165108/440165141_1GG.jpg']"));

		js.executeScript("arguments[0].click();", livro);

	}

}
