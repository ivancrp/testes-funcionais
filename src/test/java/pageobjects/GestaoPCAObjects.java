package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GestaoPCAObjects {
	
	private WebDriver driver;
	
	public GestaoPCAObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[text()='ADAGRI - AGÊNCIA DE DEFESA AGROPECUÁRIA DO ESTADO DO CEARÁ - 2019']")
	private WebElement adagri;


	public WebElement getAdagri() {
		return adagri;
	}

	public void setAdagri(WebElement adagri) {
		this.adagri = adagri;
	}
	
	
	

}
