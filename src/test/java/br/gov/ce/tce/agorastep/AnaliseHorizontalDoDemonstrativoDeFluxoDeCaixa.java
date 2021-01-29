package br.gov.ce.tce.agorastep;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class AnaliseHorizontalDoDemonstrativoDeFluxoDeCaixa {

	WebDriver navegador;
	

	@Before
	public void inicializar() {
		// ABRE O NAVEGADOR NO SISTAMA AGORA
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.manage().window().maximize();
		navegador.get("http://agora-tst.tce.ce.gov.br/");
		navegador.findElement(By.cssSelector("input[type='text']")).sendKeys("ivan.alves");
		navegador.findElement(By.cssSelector("	input[type='password']")).sendKeys("Trigonometria@tce08");
		navegador.findElement(By.xpath("//span[text()='LOGIN']")).click();
		navegador.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		navegador.findElement(By.xpath("//div[text()=' 2019 ']")).click();
		navegador
				.findElement(
						By.xpath("//span[text()='ADAGRI - AGÊNCIA DE DEFESA AGROPECUÁRIA DO ESTADO DO CEARÁ - 2019']"))
				.click();
		navegador.findElement(By.xpath("//label[text()='Contabilidade']")).click();
		navegador.findElement(By.xpath("//button[@id='bnt-reset']")).click();
	}

	@Test
	
	@Story("Validar se pagina  está relacionada ao botao clicado ")
	public void balancoFinaceiroTest() {

		navegador.findElement(By.xpath("//ion-row[5]/ion-col[3]/ion-icon[@role='img']")).click();
		navegador.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		String texto = navegador
				.findElement(By.xpath("//ion-card-header[text()=' Análise Horizontal - Balanço Patrimonial ']"))			
				.getText();
		System.out.println(texto + "NOME DA PAGINA" );		
		
		assertEquals(texto, "Análise Horizontal - Balanço Patrimonial");
		navegador.findElement(By.xpath("//span[text()=' Voltar ']")).click();
		System.out.println(texto + "NOME DA PAGINA" );

	}

	@Test
	
	@Description("Validar o status da analise ")
	@Story(" Preenchendo o componete de texto para salvar a alteração do status da analise sem incluir descrição")
	public void statusAnaliseTest() throws InterruptedException {

		navegador.findElement(By.xpath("//ion-row[5]/ion-col[3]/ion-icon[@role='img']")).click();

		// Seleciona o componete de Texto quando esta em braco ou com conteudo
		navegador.findElement(By.xpath("//div[@class='ql-editor' or @class='ql-editor ql-blank']"))
				.sendKeys("Validar se o Status passa de Análise não realizada para Em análise ");
		navegador.findElement(By.cssSelector("label[class='nomeLabel']")).getText();
		// Seleciona um componete no top da pagina para o botaao salvar ficar visivel
		// para o Selenium
		WebElement element = navegador.findElement(By.name("arrow-dropright"));
		((JavascriptExecutor) navegador).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);

		// Clica no botao salvar e depois no ok do alerta e no botao voltar
		navegador.findElement(By.xpath("//span[text()=' Salvar ']")).click();
		navegador.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		navegador.findElement(By.xpath("//span[text()='OK']")).click();
		navegador.findElement(By.xpath("//span[text()=' Voltar ']")).click();

		// Testa se o Status passou de Análise não realizada para Em análise
		String textStatus = navegador.findElement(By.xpath("//ion-row[5]/ion-col[2]")).getText();
		assertEquals(textStatus, "Em análise");
		System.out.println(textStatus);
	}

	@Test

	@Description("Marca um checkbox e clica no botao salvar")
	@Story(" Marca um  checkbox e apaga o parecer do analista do campo texto")
	public void marcaUmCheckboxTestEmBranco() throws InterruptedException {

		navegador.findElement(By.xpath("//ion-row[5]/ion-col[3]/ion-icon[@role='img']")).click();

		// Marca um os checkbox

		navegador.findElement(By.xpath("//ion-row[1]/ion-col[5]/ion-checkbox[1]")).click();
		
		navegador.findElement(By.xpath("//div[@class='ql-editor' or @class='ql-editor ql-blank']")).sendKeys(
				"Validação do componete de Texto e verifica se Status passa de Análise não realizada para Em análise");

		navegador.findElement(By.xpath("//div[@class='ql-editor' or @class='ql-editor ql-blank']")).clear();

		navegador.findElement(By.cssSelector("label[class='nomeLabel']")).getText();

		// Seleciona um componete no top da pagina para o botao salvar ficar visivel
		WebElement element = navegador.findElement(By.name("arrow-dropright"));
		((JavascriptExecutor) navegador).executeScript("arguments[0].scrollIntoView(true);", element);
		
		// Clica no botao salvar e depois no ok do alerta e no botao voltar
		navegador.findElement(By.xpath("//span[text()=' Salvar ']")).click();
		

		String textStatus = navegador.findElement(By.xpath("//div[@id='alert-msg-0' or @id='alert-msg-1']")).getText();
		assertEquals(textStatus, "O Parecer do Analista é obrigatório.");
		navegador.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		navegador.findElement(By.xpath("//span[text()='OK']")).click();
		navegador.findElement(By.xpath("//span[text()=' Voltar ']")).click();

	}

	@Test

	@Description("Marca um os checkbox e preenche analise do parecer ")
	@Story(" Marca um  checkbox mas e preenche o componete de texto com a analise do parecer do analista")
	public void marcaUmCheckboxETextoTest() throws InterruptedException {

		navegador.findElement(By.xpath("//ion-row[5]/ion-col[3]/ion-icon[@role='img']")).click();

		// Marca um os checkbox

		navegador.findElement(By.xpath("//ion-row[1]/ion-col[5]/ion-checkbox[1]")).click();
		// Seleciona o componete de Texto quando esta em braco ou com conteudo
		navegador.findElement(By.xpath("//div[@class='ql-editor' or @class='ql-editor ql-blank']")).sendKeys(
				"Validação do componete de Texto e verifica se Status passa de Análise não realizada para Em análise");

		navegador.findElement(By.cssSelector("label[class='nomeLabel']")).getText();

		// localiza um componete no top da pagina
		// Seleciona um componete no top da pagina para o botaao salvar ficar visivel
		// Seleciona um componete no top da pagina para o botaao salvar ficar visivel
		WebElement element = navegador.findElement(By.name("arrow-dropright"));
		((JavascriptExecutor) navegador).executeScript("arguments[0].scrollIntoView(true);", element);
		

		// Clica no botao salvar e depois no ok do alerta e no botao voltar
		navegador.findElement(By.xpath("//span[text()=' Salvar ']")).click();
		navegador.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		navegador.findElement(By.xpath("//span[text()='OK']")).click();
		navegador.findElement(By.xpath("//span[text()=' Voltar ']")).click();

		// Testa se o Status passou de Análise não realizada para Em análise
		String textStatus = navegador.findElement(By.xpath(
				"//ion-row[5]/ion-col[2]"))
				.getText();
		assertEquals(textStatus, "Em análise");

	}

	@Test

	@Description("Teste do componete Texto")
	@Story("prenche o campo texto com varios paragrafo")
	public void componeteDeTextoTest() throws InterruptedException, IOException {

		navegador.findElement(By.xpath("//ion-row[5]/ion-col[3]/ion-icon[@role='img']")).click();

		// Seleciona o componete de Texto quando esta em braco ou com conteudo
		for (int i = 0; i < 5; i++) {
			navegador.findElement(By.xpath("//div[@class='ql-editor' or @class='ql-editor ql-blank']")).sendKeys(
					"Mussum Ipsum, cacilds vidis litro abertis. Si u mundo tá muito paradis? Toma um mé que o mundo vai girarzis! Sapien in monti palavris qui num significa nadis i pareci latim. Quem manda na minha terra sou euzis! Quem num gosta di mé, boa gentis num é.");
			System.out.println(i);
		}
		navegador.findElement(By.cssSelector("label[class='nomeLabel']")).getText();

		// Seleciona um componete no top da pagina para o botaao salvar ficar visivel
		// para o Selenium
		WebElement element = navegador.findElement(By.name("arrow-dropright"));
		((JavascriptExecutor) navegador).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);

		// Clica no botao salvar e depois no ok do alerta e no botao voltar

		navegador.findElement(By.xpath("//span[text()=' Salvar ']")).click();
		navegador.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		navegador.findElement(By.xpath("//span[text()='OK']")).click();
		navegador.findElement(By.xpath("//span[text()=' Voltar ']")).click();

		// Testa se o Status passou de Análise não realizada para Em análise
		String textStatus = navegador.findElement(By.xpath("//ion-row[5]/ion-col[2]")).getText();
		assertEquals(textStatus, "Em análise");

	}

	@Test
	
	@Description("Escrever um texto com a tecla ESPAÇO")
	@Story(" Usuario digita um Espaço em Branco no parecer do analista e clica em salvar")
	public void campotextEspacoEmBranco() throws InterruptedException {

		navegador.findElement(By.xpath("//ion-row[5]/ion-col[3]/ion-icon[@role='img']")).click();
		navegador.findElement(By.xpath("//div[@class='ql-editor' or @class='ql-editor ql-blank']")).clear();
		// Preenche o compo parecer so analista com espaço em branco
		navegador.findElement(By.xpath("//div[@class='ql-editor' or @class='ql-editor ql-blank']")).sendKeys(" ");

		navegador.findElement(By.cssSelector("label[class='nomeLabel']")).getText();

		// Seleciona um componete no top da pagina para o botaao salvar ficar visivel
		WebElement element = navegador.findElement(By.name("arrow-dropright"));
		((JavascriptExecutor) navegador).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
		// Clica no botao salvar e depois no ok do alerta e no botao voltar
		navegador.findElement(By.xpath("//span[text()=' Salvar ']")).click();

		
		String textStatus = navegador.findElement(By.xpath("//div[@id='alert-msg-0' or @id='alert-msg-1']")).getText();
		assertEquals(textStatus, "O Parecer do Analista é obrigatório.");
		navegador.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		navegador.findElement(By.xpath("//span[text()='OK']")).click();
		navegador.findElement(By.xpath("//span[text()=' Voltar ']")).click();

	}

	@After
	public void fecharNavegador() {

		//navegador.findElement(By.xpath("//button[@id='bnt-reset']")).click();
		navegador.quit();
	}
}
