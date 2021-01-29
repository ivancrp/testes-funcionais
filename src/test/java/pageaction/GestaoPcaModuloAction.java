package pageaction;

import org.openqa.selenium.WebDriver;

import pageobjects.GestaoPcaModulosbjects;

public class GestaoPcaModuloAction {

	
	static GestaoPcaModulosbjects objGestaoPcaModulos;
	
	
	public GestaoPcaModuloAction(WebDriver driver) {
		
	objGestaoPcaModulos = new GestaoPcaModulosbjects(driver);

	}
	
	public void gestaoModulo () {
		
		objGestaoPcaModulos.getContabilidade().click();
		
	}
}
