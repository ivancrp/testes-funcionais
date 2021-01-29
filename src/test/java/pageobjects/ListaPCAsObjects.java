package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListaPCAsObjects {

	
	private WebDriver driver;
	
	@FindBy(xpath = "//div[text()=' 2019 ']")
	private WebElement pcs2019;
	
	@FindBy(xpath = "//div[text()=' 2018 ']")
	private WebElement pcs2018;
	
	@FindBy(xpath = "//div[text()=' 2017 ']")
	private WebElement pcs2017;

	public ListaPCAsObjects(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPcs2019() {
		return pcs2019;
	}

	public void setPcs2019(WebElement pcs2019) {
		this.pcs2019 = pcs2019;
	}

	public WebElement getPcs2018() {
		return pcs2018;
	}

	public void setPcs2018(WebElement pcs2018) {
		this.pcs2018 = pcs2018;
	}

	public WebElement getPcs2017() {
		return pcs2017;
	}

	public void setPcs2017(WebElement pcs2017) {
		this.pcs2017 = pcs2017;
	}
	
	
}
