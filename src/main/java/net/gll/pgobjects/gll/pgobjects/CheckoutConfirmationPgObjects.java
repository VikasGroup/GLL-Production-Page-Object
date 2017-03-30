package net.gll.pgobjects.gll.pgobjects;


import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;


public class CheckoutConfirmationPgObjects extends PageObject{
	@FindBy(xpath="html/body/div[2]/div[2]/div/div/div[1]/h4")
	WebElement id; 
	public String getConfirmation() {
		
		return id.getText();
	}
}
