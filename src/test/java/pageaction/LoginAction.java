package pageaction;

import org.openqa.selenium.WebDriver;

import pageobjects.LoginObjects;

public class LoginAction {

	
	static LoginObjects objLogin;
	
	public LoginAction(WebDriver driver) {
		objLogin = new LoginObjects(driver);
		
	}
	
	public void login() {
		// TODO Auto-generated method stub
		objLogin.getUsuario().sendKeys("Usuario");
		objLogin.getPassword().sendKeys("Senha");
		objLogin.getEntrar().click();
		

	}
}
