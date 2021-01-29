package pageaction;

import org.openqa.selenium.WebDriver;

import pageobjects.GestaoPCAObjects;

public class GestaoPCAAction {


	static GestaoPCAObjects objGestaoPCA;
	
	
	
	public GestaoPCAAction(WebDriver driver){
		
		objGestaoPCA = new  GestaoPCAObjects(driver);
	}
	
	
	public void gestaoPCA() {
		
		objGestaoPCA.getAdagri().click();
		
	}
}
