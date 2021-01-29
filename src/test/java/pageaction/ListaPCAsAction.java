package pageaction;

import org.openqa.selenium.WebDriver;

import pageobjects.ListaPCAsObjects;

public class ListaPCAsAction {

	static ListaPCAsObjects objListaPCAs;

	public ListaPCAsAction(WebDriver driver) {

		objListaPCAs = new ListaPCAsObjects(driver);

	}

	
	public void ListaPCAs() {
		
		//objListaPCAs.getPcs2017().click();
		//objListaPCAs.getPcs2018().click();
		objListaPCAs.getPcs2019().click();
	}
}
