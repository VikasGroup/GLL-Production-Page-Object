package net.gll.pgobjects.gll.pgobjects;


import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class RegConfirmationPgObjects extends PageObject{
	 @FindBy(xpath="html/body/div[2]/div[2]/div/div/div[1]/div/dl/dd[1]")
	 WebElement id;
	 @FindBy(xpath="html/body/div[2]/div[2]/div/div/div[1]/div/dl/dd[2]")
	 WebElement name;
	 @FindBy(xpath="html/body/div[2]/div[2]/div/div/div[1]/div/dl/dd[3]")
	 WebElement country;
	 @FindBy(xpath=".//*[@id='header']/div[1]/div[4]/div[3]/p")
		WebElement content;
	 @FindBy(className="welcome ")
		WebElement closevo;
	

	public String getID() {
		return id.getText();
	}

	public String getName() {
		return name.getText();
	}

	public String getCountry() {
		return country.getText();
	}
	public String getContent(){
		return content.getText();
	}
	public void clickCloseVO(){
		closevo.click();
	}
}
