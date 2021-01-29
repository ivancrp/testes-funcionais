package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnaliseVerticalBalancoPatrimonialObjects {

	private WebDriver driver;

	@FindBy(xpath = "//ion-grid[2]//span[text()=' Voltar ']")
	private WebElement btnVoltar;

	@FindBy(xpath = "//span[text()=' Salvar ']")
	private WebElement btnSalvar;

	@FindBy(xpath = "//span[text()=' Submeter ']")
	private WebElement btnSubmeter;

	@FindBy(xpath = "//ion-checkbox")
	private List<WebElement> checkbox;

	@FindBy(css = "label[class='nomeLabel']")
	private WebElement labelUser;

	@FindAll({ @FindBy(xpath = "//div[@class='ql-editor']"), @FindBy(xpath = "//div[@class='ql-editor ql-blank']") })
	private WebElement parecerAnalista;

	@FindBy(xpath = "//span[text()='OK']")
	private WebElement btnOK;

	@FindBy(xpath = "//span[text()=' Cancelar ']")
	private WebElement btnCancelar;

	public WebElement getLabelUser() {
		return labelUser;
	}
	
	public AnaliseVerticalBalancoPatrimonialObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBtnVoltar() {
		return btnVoltar;
	}

	public void setBtnVoltar(WebElement btnVoltar) {
		this.btnVoltar = btnVoltar;
	}

	public WebElement getBtnSalvar() {
		return btnSalvar;
	}

	public void setBtnSalvar(WebElement btnSalvar) {
		this.btnSalvar = btnSalvar;
	}

	public WebElement getBtnSubmeter() {
		return btnSubmeter;
	}

	public void setBtnSubmeter(WebElement btnSubmeter) {
		this.btnSubmeter = btnSubmeter;
	}

	public List<WebElement> getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(List<WebElement> checkbox) {
		this.checkbox = checkbox;
	}

	public WebElement getParecerAnalista() {
		return parecerAnalista;
	}

	public void setParecerAnalista(WebElement parecerAnalista) {
		this.parecerAnalista = parecerAnalista;
	}

	public WebElement getBtnOK() {
		return btnOK;
	}

	public void setBtnOK(WebElement btnOK) {
		this.btnOK = btnOK;
	}

	public WebElement getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(WebElement btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public void setLabelUser(WebElement labelUser) {
		this.labelUser = labelUser;
	}
	
}
