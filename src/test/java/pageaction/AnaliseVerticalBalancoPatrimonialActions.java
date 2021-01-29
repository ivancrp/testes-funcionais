package pageaction;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.AnaliseVerticalBalancoPatrimonialObjects;

public class AnaliseVerticalBalancoPatrimonialActions {

	static AnaliseVerticalBalancoPatrimonialObjects objAnaliseVerticalBalancoPatrimonial;

	public AnaliseVerticalBalancoPatrimonialActions(WebDriver driver) {

		objAnaliseVerticalBalancoPatrimonial = new AnaliseVerticalBalancoPatrimonialObjects(driver);

	}

	public void analiseVerticalBalancoPatrimonialObjects() {

		// verifica se o CheckBox está marcado
		List<WebElement> checks = objAnaliseVerticalBalancoPatrimonial.getCheckbox();
		for (int i = 0; i < checks.size(); i++) {

			if (!checks.get(i).isEnabled()) {
				checks.get(i).click();
			}

		}

	}
	
	public void campoParecerAnalista() {

		objAnaliseVerticalBalancoPatrimonial.getParecerAnalista().sendKeys(
				"Mussum Ipsum, cacilds vidis litro abertis. Si u mundo tá muito paradis? Toma um mé que o mundo vai "
						+ "girarzis! Sapien in monti palavris qui num significa nadis i pareci latim. Quem manda na minha terra sou euzis! Quem num gosta di mé, boa gentis num é.");
		// js.executeScript ("window.scrollBy (0,3000)");

		objAnaliseVerticalBalancoPatrimonial.getBtnVoltar().click();
	}
	

}
