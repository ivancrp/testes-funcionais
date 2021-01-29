package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResumoAcoesObjects {
	
	private WebDriver driver;
	
	@FindBy (xpath = "//ion-row[1]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnPecasProcessuais;
	
	@FindBy (xpath = "//ion-row[2]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnAnaliseHorizontalBalancoFinanceiro;
	
	@FindBy (xpath = "//ion-row[3]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnAnaliseHorizontalBalancoPatrimonial;
	
	@FindBy (xpath = "//ion-row[4]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnAnaliseHorizontalBalancoDVP;
	
	@FindBy (xpath = "//ion-row[5]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnAnaliseHorizontaldoDemonstrativodeFluxodeCaixa;
	
	@FindBy (xpath = "//ion-row[6]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnAnaliseVerticalBalancoPatrimonialActions;
	
	public WebElement getBtnAnaliseVerticalBalancoPatrimonialActions() {
		return btnAnaliseVerticalBalancoPatrimonialActions;
	}


	public void setBtnAnaliseVerticalBalancoPatrimonialActions(WebElement btnAnaliseVerticalBalancoPatrimonialActions) {
		this.btnAnaliseVerticalBalancoPatrimonialActions = btnAnaliseVerticalBalancoPatrimonialActions;
	}


	public WebElement getBtnAnaliseHorizontaldoDemonstrativodeFluxodeCaixa() {
		return btnAnaliseHorizontaldoDemonstrativodeFluxodeCaixa;
	}


	public void setBtnAnaliseHorizontaldoDemonstrativodeFluxodeCaixa(
			WebElement btnAnaliseHorizontaldoDemonstrativodeFluxodeCaixa) {
		this.btnAnaliseHorizontaldoDemonstrativodeFluxodeCaixa = btnAnaliseHorizontaldoDemonstrativodeFluxodeCaixa;
	}


	public ResumoAcoesObjects(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getBtnPecasProcessuais() {
		return btnPecasProcessuais;
	}


	public void setBtnPecasProcessuais(WebElement btnPecasProcessuais) {
		this.btnPecasProcessuais = btnPecasProcessuais;
	}


	public WebElement getBtnAnaliseHorizontalBalancoFinanceiro() {
		return btnAnaliseHorizontalBalancoFinanceiro;
	}


	public void setBtnAnaliseHorizontalBalancoFinanceiro(WebElement btnAnaliseHorizontalBalancoFinanceiro) {
		this.btnAnaliseHorizontalBalancoFinanceiro = btnAnaliseHorizontalBalancoFinanceiro;
	}


	public WebElement getBtnAnaliseHorizontalBalancoPatrimonial() {
		return btnAnaliseHorizontalBalancoPatrimonial;
	}


	public void setBtnAnaliseHorizontalBalancoPatrimonial(WebElement btnAnaliseHorizontalBalancoPatrimonial) {
		this.btnAnaliseHorizontalBalancoPatrimonial = btnAnaliseHorizontalBalancoPatrimonial;
	}


	public WebElement getBtnAnaliseHorizontalBalancoDVP() {
		return btnAnaliseHorizontalBalancoDVP;
	}


	public void setBtnAnaliseHorizontalBalancoDVP(WebElement btnAnaliseHorizontalBalancoDVP) {
		this.btnAnaliseHorizontalBalancoDVP = btnAnaliseHorizontalBalancoDVP;
	}


	public WebElement getBtnAnaliseHorizontalDemonstrativoFluxoCaixa() {
		return btnAnaliseHorizontalDemonstrativoFluxoCaixa;
	}


	public void setBtnAnaliseHorizontalDemonstrativoFluxoCaixa(WebElement btnAnaliseHorizontalDemonstrativoFluxoCaixa) {
		this.btnAnaliseHorizontalDemonstrativoFluxoCaixa = btnAnaliseHorizontalDemonstrativoFluxoCaixa;
	}


	public WebElement getBtnAnaliseVerticalBalancoPatrimonial() {
		return btnAnaliseVerticalBalancoPatrimonial;
	}


	public void setBtnAnaliseVerticalBalancoPatrimonial(WebElement btnAnaliseVerticalBalancoPatrimonial) {
		this.btnAnaliseVerticalBalancoPatrimonial = btnAnaliseVerticalBalancoPatrimonial;
	}


	public WebElement getBtnBalancoFinanceiroXBalancoPatrimonial() {
		return btnBalancoFinanceiroXBalancoPatrimonial;
	}


	public void setBtnBalancoFinanceiroXBalancoPatrimonial(WebElement btnBalancoFinanceiroXBalancoPatrimonial) {
		this.btnBalancoFinanceiroXBalancoPatrimonial = btnBalancoFinanceiroXBalancoPatrimonial;
	}


	public WebElement getBtnExecucaoRestosPagar() {
		return btnExecucaoRestosPagar;
	}


	public void setBtnExecucaoRestosPagar(WebElement btnExecucaoRestosPagar) {
		this.btnExecucaoRestosPagar = btnExecucaoRestosPagar;
	}


	public WebElement getBtnExecucaoValoresRestituíveisXValoresRestituíveis() {
		return btnExecucaoValoresRestituíveisXValoresRestituíveis;
	}


	public void setBtnExecucaoValoresRestituíveisXValoresRestituíveis(
			WebElement btnExecucaoValoresRestituíveisXValoresRestituíveis) {
		this.btnExecucaoValoresRestituíveisXValoresRestituíveis = btnExecucaoValoresRestituíveisXValoresRestituíveis;
	}


	public WebElement getBtnSaldoEspecieExercicioAnteriorXSaldoEspecieExercicioSeguinte() {
		return btnSaldoEspecieExercicioAnteriorXSaldoEspecieExercicioSeguinte;
	}


	public void setBtnSaldoEspecieExercicioAnteriorXSaldoEspecieExercicioSeguinte(
			WebElement btnSaldoEspecieExercicioAnteriorXSaldoEspecieExercicioSeguinte) {
		this.btnSaldoEspecieExercicioAnteriorXSaldoEspecieExercicioSeguinte = btnSaldoEspecieExercicioAnteriorXSaldoEspecieExercicioSeguinte;
	}


	public WebElement getBntValidacaoConsistenciaEntreExerciciosBalancoPatrimonial() {
		return bntValidacaoConsistenciaEntreExerciciosBalancoPatrimonial;
	}


	public void setBntValidacaoConsistenciaEntreExerciciosBalancoPatrimonial(
			WebElement bntValidacaoConsistenciaEntreExerciciosBalancoPatrimonial) {
		this.bntValidacaoConsistenciaEntreExerciciosBalancoPatrimonial = bntValidacaoConsistenciaEntreExerciciosBalancoPatrimonial;
	}


	public WebElement getBtnValidacaoConsistenciaEntreExercíciosBalancoFinanceiro() {
		return btnValidacaoConsistenciaEntreExercíciosBalancoFinanceiro;
	}


	public void setBtnValidacaoConsistenciaEntreExercíciosBalancoFinanceiro(
			WebElement btnValidacaoConsistenciaEntreExercíciosBalancoFinanceiro) {
		this.btnValidacaoConsistenciaEntreExercíciosBalancoFinanceiro = btnValidacaoConsistenciaEntreExercíciosBalancoFinanceiro;
	}


	public WebElement getBtmValidacaoConsistenciaEntreExerciciosBalancoDVP() {
		return btmValidacaoConsistenciaEntreExerciciosBalancoDVP;
	}


	public void setBtmValidacaoConsistenciaEntreExerciciosBalancoDVP(
			WebElement btmValidacaoConsistenciaEntreExerciciosBalancoDVP) {
		this.btmValidacaoConsistenciaEntreExerciciosBalancoDVP = btmValidacaoConsistenciaEntreExerciciosBalancoDVP;
	}


	public WebElement getBtnValidacaoConsistenciaEntreExerciciosDemonstrativoFluxoCaixa() {
		return btnValidacaoConsistenciaEntreExerciciosDemonstrativoFluxoCaixa;
	}


	public void setBtnValidacaoConsistenciaEntreExerciciosDemonstrativoFluxoCaixa(
			WebElement btnValidacaoConsistenciaEntreExerciciosDemonstrativoFluxoCaixa) {
		this.btnValidacaoConsistenciaEntreExerciciosDemonstrativoFluxoCaixa = btnValidacaoConsistenciaEntreExerciciosDemonstrativoFluxoCaixa;
	}


	public WebElement getBtnValidacaoContasTotalizadorasDemonstrativoFluxoCaixa() {
		return btnValidacaoContasTotalizadorasDemonstrativoFluxoCaixa;
	}


	public void setBtnValidacaoContasTotalizadorasDemonstrativoFluxoCaixa(
			WebElement btnValidacaoContasTotalizadorasDemonstrativoFluxoCaixa) {
		this.btnValidacaoContasTotalizadorasDemonstrativoFluxoCaixa = btnValidacaoContasTotalizadorasDemonstrativoFluxoCaixa;
	}


	public WebElement getBtnValidacaoContasTotalizadorasBalancoOrcamentario() {
		return btnValidacaoContasTotalizadorasBalancoOrcamentario;
	}


	public void setBtnValidacaoContasTotalizadorasBalancoOrcamentario(
			WebElement btnValidacaoContasTotalizadorasBalancoOrcamentario) {
		this.btnValidacaoContasTotalizadorasBalancoOrcamentario = btnValidacaoContasTotalizadorasBalancoOrcamentario;
	}


	public WebElement getBtnValidacaoContasTotalizadorasBalancoPatrimonial() {
		return btnValidacaoContasTotalizadorasBalancoPatrimonial;
	}


	public void setBtnValidacaoContasTotalizadorasBalancoPatrimonial(
			WebElement btnValidacaoContasTotalizadorasBalancoPatrimonial) {
		this.btnValidacaoContasTotalizadorasBalancoPatrimonial = btnValidacaoContasTotalizadorasBalancoPatrimonial;
	}


	public WebElement getBtnValidacaoContasTotalizadorasBalancoFinanceiro() {
		return btnValidacaoContasTotalizadorasBalancoFinanceiro;
	}


	public void setBtnValidacaoContasTotalizadorasBalancoFinanceiro(
			WebElement btnValidacaoContasTotalizadorasBalancoFinanceiro) {
		this.btnValidacaoContasTotalizadorasBalancoFinanceiro = btnValidacaoContasTotalizadorasBalancoFinanceiro;
	}


	public WebElement getBtnValidacaoContasTotalizadorasBalancoDVP() {
		return btnValidacaoContasTotalizadorasBalancoDVP;
	}


	public void setBtnValidacaoContasTotalizadorasBalancoDVP(WebElement btnValidacaoContasTotalizadorasBalancoDVP) {
		this.btnValidacaoContasTotalizadorasBalancoDVP = btnValidacaoContasTotalizadorasBalancoDVP;
	}


	public WebElement getBtnVoltar() {
		return btnVoltar;
	}


	public void setBtnVoltar(WebElement btnVoltar) {
		this.btnVoltar = btnVoltar;
	}


	public WebElement getBtnResetTeste() {
		return btnResetTeste;
	}


	public void setBtnResetTeste(WebElement btnResetTeste) {
		this.btnResetTeste = btnResetTeste;
	}


	public WebElement getBtnPreVisualizar() {
		return btnPreVisualizar;
	}


	public void setBtnPreVisualizar(WebElement btnPreVisualizar) {
		this.btnPreVisualizar = btnPreVisualizar;
	}


	@FindBy (xpath = "//ion-row[5]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnAnaliseHorizontalDemonstrativoFluxoCaixa;
	
	@FindBy (xpath = "//ion-row[6]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnAnaliseVerticalBalancoPatrimonial;
	
	@FindBy (xpath = "//ion-row[7]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnBalancoFinanceiroXBalancoPatrimonial;
	
	@FindBy (xpath = "//ion-row[8]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnExecucaoRestosPagar;
	
	@FindBy (xpath = "//ion-row[9]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnExecucaoValoresRestituíveisXValoresRestituíveis;
	
	@FindBy (xpath = "//ion-row[10]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnSaldoEspecieExercicioAnteriorXSaldoEspecieExercicioSeguinte;
	
	@FindBy (xpath = "//ion-row[11]/ion-col[3]/ion-icon[@role='img']")
	private WebElement bntValidacaoConsistenciaEntreExerciciosBalancoPatrimonial;
	
	@FindBy (xpath = "//ion-row[12]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnValidacaoConsistenciaEntreExercíciosBalancoFinanceiro;
	
	@FindBy (xpath = "//ion-row[13]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btmValidacaoConsistenciaEntreExerciciosBalancoDVP;
	
	@FindBy (xpath = "//ion-row[14]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnValidacaoConsistenciaEntreExerciciosDemonstrativoFluxoCaixa;
	
	@FindBy (xpath = "//ion-row[15]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnValidacaoContasTotalizadorasDemonstrativoFluxoCaixa;
	
	@FindBy (xpath = "//ion-row[16]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnValidacaoContasTotalizadorasBalancoOrcamentario;
	
	@FindBy (xpath = "//ion-row[17]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnValidacaoContasTotalizadorasBalancoPatrimonial;	
	
	@FindBy (xpath = "//ion-row[18]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnValidacaoContasTotalizadorasBalancoFinanceiro;	
	
	@FindBy (xpath = "//ion-row[19]/ion-col[3]/ion-icon[@role='img']")
	private WebElement btnValidacaoContasTotalizadorasBalancoDVP;	
	
	@FindBy (xpath = "//span[text()=' Voltar ']")
	private WebElement btnVoltar;	

	
	@FindBy (xpath = "//button[@id='bnt-reset']")
	private WebElement btnResetTeste;	

	
	@FindBy (xpath = "//span[text()=' Pré-Visualizar ']")
	private WebElement btnPreVisualizar;	
	


}
