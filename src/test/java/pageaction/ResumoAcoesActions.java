package pageaction;

import org.openqa.selenium.WebDriver;

import pageobjects.ResumoAcoesObjects;

public class ResumoAcoesActions {

	static ResumoAcoesObjects objResumoAcoes;

	public ResumoAcoesActions(WebDriver driver) {

		objResumoAcoes = new ResumoAcoesObjects(driver);
	}

	public void resumoAcoes() {

		objResumoAcoes.getBtnAnaliseHorizontalBalancoFinanceiro().click();

	}

	public void analiseHorizontalBalancoPatrimonial() {

		objResumoAcoes.getBtnAnaliseHorizontalBalancoPatrimonial().click();

	}

	public void analiseBalancoDVP() {

		objResumoAcoes.getBtnAnaliseHorizontalBalancoDVP().click();

	}

	public void anliseHorizontaldoDemonstrativodeFluxodeCaixa() {

		objResumoAcoes.getBtnAnaliseHorizontalDemonstrativoFluxoCaixa().click();

	}

	public void analiseVerticalBalancoPatrimonial() {

		objResumoAcoes.getBtnAnaliseVerticalBalancoPatrimonial().click();

	}
}
