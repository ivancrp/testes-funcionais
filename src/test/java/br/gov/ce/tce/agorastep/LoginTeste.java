package br.gov.ce.tce.agorastep;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageaction.AnaliseVerticalBalancoPatrimonialActions;
import pageaction.AnaliseHorizontalDoBalancoDVPAtions;
import pageaction.AnliseHorizontalDoBalancoFinanceiroActions;
import pageaction.AnaliseHorizontalDoBalancoPatrimonialActions;
import pageaction.AnaliseHorizontalDoDemonstrativoDeFluxoDeCaixaActions;
import pageaction.GestaoPCAAction;
import pageaction.GestaoPcaModuloAction;
import pageaction.ListaPCAsAction;
import pageaction.LoginAction;
import pageaction.ResumoAcoesActions;

public class LoginTeste {
	static WebDriver driver;
	static LoginAction loginTst;
	static ListaPCAsAction listaPCAs;
	static GestaoPcaModuloAction gestaoModulo;
	static GestaoPCAAction gestaoPCA;
	static ResumoAcoesActions resumoAcoes;
	static AnliseHorizontalDoBalancoFinanceiroActions analiseBalancoFinanceiro;
	static AnaliseHorizontalDoBalancoPatrimonialActions balancoFinanceiroPatrimonial;
	static AnaliseHorizontalDoBalancoDVPAtions balancoDVP;
	static AnaliseHorizontalDoDemonstrativoDeFluxoDeCaixaActions demonstrativoFluxoCaixa;
	static AnaliseVerticalBalancoPatrimonialActions analiseVerticalBalancoPatrimonial;

	@BeforeAll
	static void abrirNavegador() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://agora-tst.tce.ce.gov.br/");

		loginTst = new LoginAction(driver);
		listaPCAs = new ListaPCAsAction(driver);
		gestaoPCA = new GestaoPCAAction(driver);
		gestaoModulo = new GestaoPcaModuloAction(driver);
		resumoAcoes = new ResumoAcoesActions(driver);
		analiseBalancoFinanceiro = new AnliseHorizontalDoBalancoFinanceiroActions(driver);
		balancoFinanceiroPatrimonial = new AnaliseHorizontalDoBalancoPatrimonialActions(driver);
		balancoDVP = new AnaliseHorizontalDoBalancoDVPAtions(driver);
		demonstrativoFluxoCaixa = new AnaliseHorizontalDoDemonstrativoDeFluxoDeCaixaActions(driver);
		analiseVerticalBalancoPatrimonial = new AnaliseVerticalBalancoPatrimonialActions(driver);
	}

	@Test
	void sistemaAgoraTst() {
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		loginTst.login();
		listaPCAs.ListaPCAs();
		gestaoPCA.gestaoPCA();
		gestaoModulo.gestaoModulo();

		/*
		 * // Análise Horizontal do Balanço Financeiro
		 * 
		 * resumoAcoes.resumoAcoes();
		 * analiseBalancoFinanceiro.analiseBalancoFinanceiro();
		 * analiseBalancoFinanceiro.campoParecerAnalista();
		 * 
		 * // Análise Horizontal do Balanço Patrimonial
		 * 
		 * resumoAcoes.analiseHorizontalBalancoPatrimonial();
		 * balancoFinanceiroPatrimonial.balancoFinanceiroPatrimonial();
		 * balancoFinanceiroPatrimonial.campoParecerAnalista();
		 * 
		 * // Análise Horizontal do Balanço DVP
		 * 
		 * resumoAcoes.analiseBalancoDVP(); balancoDVP.balancoDVP();
		 * balancoDVP.campoParecerAnalista();
		 * 
		 * // Análise Horizontal do Demonstrativo de Fluxo de Caixa
		 * 
		 * resumoAcoes.anliseHorizontaldoDemonstrativodeFluxodeCaixa();
		 * demonstrativoFluxoCaixa.demonstrativoFluxoCaixa();
		 * demonstrativoFluxoCaixa.campoParecerAnalista();
		 */

		//Análise Vertical do Balanço Patrimonial
		resumoAcoes.analiseVerticalBalancoPatrimonial();
		analiseVerticalBalancoPatrimonial.analiseVerticalBalancoPatrimonialObjects();
		//analiseVerticalBalancoPatrimonial.campoParecerAnalista();
		
		//Balanço Financeiro x Balanço Patrimonial

	}
}
