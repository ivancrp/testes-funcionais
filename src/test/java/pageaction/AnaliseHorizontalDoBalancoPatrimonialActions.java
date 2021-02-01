
package pageaction;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.AnaliseHorizontalDoBalancoPatrimonialObjects;

public class AnaliseHorizontalDoBalancoPatrimonialActions {

	static AnaliseHorizontalDoBalancoPatrimonialObjects objBalancoFinanceiroPatrimonial;

	public AnaliseHorizontalDoBalancoPatrimonialActions(WebDriver driver) {

		objBalancoFinanceiroPatrimonial = new AnaliseHorizontalDoBalancoPatrimonialObjects(driver);
	}

	public void balancoFinanceiroPatrimonial() {
		// verifica se o CheckBox está marcado
		List<WebElement> checks = objBalancoFinanceiroPatrimonial.getCheckbox();
		for (int i = 0; i < checks.size(); i++) {

			if (checks.get(i).isSelected()) {
				checks.get(i).click();
			}

		}

	}

	public void campoParecerAnalista() {

		objBalancoFinanceiroPatrimonial.getParecerAnalista().sendKeys(
				"Mussum Ipsum, cacilds vidis litro abertis. Si u mundo tá muito paradis? Toma um mé que o mundo vai "
						+ "girarzis! Sapien in monti palavris qui num significa nadis i pareci latim. Quem manda na minha terra sou euzis! Quem num gosta di mé, boa gentis num é.");
		// js.executeScript ("window.scrollBy (0,3000)");

		objBalancoFinanceiroPatrimonial.getBtnVoltar().click();
	}

}
