package pageaction;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.AnaliseHorizontalDoBalancoDVPObjects;

public class AnaliseHorizontalDoBalancoDVPAtions {
	
	static AnaliseHorizontalDoBalancoDVPObjects objBalancoDVP;

	public AnaliseHorizontalDoBalancoDVPAtions(WebDriver driver) {
		objBalancoDVP = new AnaliseHorizontalDoBalancoDVPObjects(driver);
		// TODO Auto-generated constructor stub
	}
	

	public void balancoDVP() {
		
		List<WebElement> checks = objBalancoDVP.getCheckbox();
		for (int i = 0; i < checks.size(); i++) {

			if (checks.get(i).isSelected()) {
				checks.get(i).click();
			}

		}

	}
	
	public void campoParecerAnalista() {

		objBalancoDVP.getParecerAnalista().sendKeys(
				"Mussum Ipsum, cacilds vidis litro abertis. Si u mundo tá muito paradis? Toma um mé que o mundo vai "
						+ "girarzis! Sapien in monti palavris qui num significa nadis i pareci latim. Quem manda na minha terra sou euzis! Quem num gosta di mé, boa gentis num é.");
		// js.executeScript ("window.scrollBy (0,3000)");

		objBalancoDVP.getBtnVoltar().click();
	}
	
}
