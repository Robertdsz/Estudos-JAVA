import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.GerenciamentoDriver;

public class CasoDeTeste1 {

	private WebDriver driver;
	GerenciamentoDriver gerenciamentoDriver;
	
	@Before
	public void setUp() throws Exception {
		gerenciamentoDriver = new GerenciamentoDriver();
		driver 				= gerenciamentoDriver.browser("chrome");
	}

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		driver.get("C:/Users/rober/OneDrive/AulaTeste/calculadora.html");
		
		WebElement inputValor1 = driver.findElement(By.id("iValor1"));
		inputValor1.sendKeys("20");
		
		WebElement inputValor2 = driver.findElement(By.id("iValor2"));
		inputValor2.sendKeys("4");
		
		WebElement operacao = driver.findElement(By.id("soma"));
		operacao.click();
		
		WebElement calcular = driver.findElement(By.id("submit-button"));
		calcular.click();
		
		Thread.sleep(10000);
	}

}
