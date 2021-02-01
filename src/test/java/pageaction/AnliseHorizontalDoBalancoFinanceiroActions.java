package pageaction;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.AnliseHorizontalDoBalancoFinanceiroObjects;

public class AnliseHorizontalDoBalancoFinanceiroActions {

	static AnliseHorizontalDoBalancoFinanceiroObjects objBalancoFinanceiro;
	

	public AnliseHorizontalDoBalancoFinanceiroActions(WebDriver driver) {

		
		objBalancoFinanceiro = new AnliseHorizontalDoBalancoFinanceiroObjects(driver);
	}

	public void analiseBalancoFinanceiro() {
		// verifica se o CheckBox está marcado
		List<WebElement> checks = objBalancoFinanceiro.getCheckbox();
		for (int i = 0; i < checks.size(); i++) {

			if (!checks.get(i).isSelected()) {
				checks.get(i).click();
			}

		}

	}

	public void campoParecerAnalista() {

		objBalancoFinanceiro.getParecerAnalista().sendKeys(
				"Mussum Ipsum, cacilds vidis litro abertis. Si u mundo tá muito paradis? Toma um mé que o mundo vai "
						+ "girarzis! Sapien in monti palavris qui num significa nadis i pareci latim. Quem manda na minha terra sou euzis! Quem num gosta di mé, boa gentis num é.");
		// js.executeScript ("window.scrollBy (0,3000)");

		objBalancoFinanceiro.getBtnVoltar().click();
	}

}
