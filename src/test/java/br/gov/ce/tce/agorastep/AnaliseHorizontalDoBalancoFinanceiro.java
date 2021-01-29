package br.gov.ce.tce.agorastep;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("Modolo Comtabilidade")
@Feature("An?lise Horizontal do Balan?o Financeiro")
public class AnaliseHorizontalDoBalancoFinanceiro {

	WebDriver driver;
	

	@Before
	public void inicializar() {
		// ABRE O NAVEGADOR NO SISTAMA AGORA
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://agora-tst.tce.ce.gov.br/");
	
	}

	@Test
	@Description("Escrever um texto com a tecla ESPAÇO")
	@Story(" Usuario digita um Espaço em Branco no parecer do analista e clica em salvar")
	public void marcaTodosCheckbox() throws InterruptedException {

		

		List<WebElement> checks = driver.findElements(By.xpath("//ion-checkbox"));

		for (int i = 0; i < checks.size(); i++) {
			checks.get(i).click();

		}

		// Preenche o compo parecer so analista com espaço em branco
		driver.findElement(By.xpath("//div[@class='ql-editor' or @class='ql-editor ql-blank']"))
				.sendKeys("Todos  os Checkbox Marcados ");

		
		driver.findElement(By.cssSelector("label[class='nomeLabel']")).getText();
		// Seleciona um componete no top da pagina para o botaao salvar ficar visivel
		WebElement element = driver.findElement(By.name("arrow-dropright"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
		// Clica no botao salvar e depois no ok do alerta e no botao voltar
		driver.findElement(By.xpath("//span[text()=' Salvar ']")).click();

		String textStatus = driver.findElement(By.xpath("//div[@id='alert-msg-0' or @id='alert-msg-1']")).getText();
		assertEquals(textStatus, "Salvo com sucesso.");
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//span[text()='OK']")).click();
		driver.findElement(By.xpath("//span[text()=' Voltar ']")).click();

	}

	@After
	public void fecharNavegador() {

		// navegador.findElement(By.xpath("//button[@id='bnt-reset']")).click();
		driver.quit();
	}

}
