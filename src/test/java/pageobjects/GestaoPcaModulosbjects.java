package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GestaoPcaModulosbjects {

	private WebDriver driver;

	public GestaoPcaModulosbjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//label[text()='Contabilidade']")
	private WebElement contabilidade;

	public WebElement getContabilidade() {
		return contabilidade;
	}

	public void setContabilidade(WebElement contabilidade) {
		this.contabilidade = contabilidade;
	}

		
}
