package net.gll.pgobjects.gll.pgobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class ForgotPasswordPgObjects extends PageObject {
	@FindBy(xpath=".//*[@id='ForgotPasswordVerifyAccountId']")
	WebElement baid;
	@FindBy(xpath=".//*[@id='form2']/input[4]")
	WebElement submit;
	@FindBy(xpath=".//*[@id='form0']/input[3]")
	WebElement continuebtn;
	@FindBy(xpath=".//*[@id='forgot-password-verification-option-successful-modal']/div[2]/div/div[3]/input")
	WebElement okbtn;
	public void enterBAID(String value){
		baid.sendKeys(value);
	}
public void clickSubmit(){
	submit.click();
}
public void clickContinue(){
	continuebtn.click();
}
public void clickOk(){
	okbtn.click();
}
}
