package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjects {

	
	private WebDriver driver;
	
	@FindBy (xpath ="//input[@type='text']") 
	private WebElement usuario;
	
	@FindBy (css="input[type='password']")
	private WebElement password;
	
	@FindBy (xpath = "//span[text()='LOGIN']")
	private WebElement entrar;

	public LoginObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsuario() {
		return usuario;
	}

	public void setUsuario(WebElement usuario) {
		this.usuario = usuario;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getEntrar() {
		return entrar;
	}

	public void setEntrar(WebElement entrar) {
		this.entrar = entrar;
	}
	
	
}


