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
		objLogin.getUsuario().sendKeys("ivan.alves");
		objLogin.getPassword().sendKeys("Trigonometria@tce08");
		objLogin.getEntrar().click();
		

	}
}
