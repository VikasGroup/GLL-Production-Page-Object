package net.gll.pgobjects.gll.pgobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;


public class CheckOutPgObjects extends PageObject{
	@FindBy(xpath=".//*[@id='checkout-details-form']/div/div[6]/a[2]")
	WebElement chkout;
	@FindBy(xpath=".//*[@id='checkout-details-form']/div/div[3]/div[1]/label/input")
	WebElement tc;
	@FindBy(xpath=".//*[@id='checkout-shipping-form']/div/div[6]/a")
	WebElement chkoutsp;
	@FindBy(xpath=".//*[@id='delivery-2210001001']")
	WebElement deliveryOption;
	@FindBy(xpath=".//*[@id='delivery-2912001004']")
	WebElement deliveryOption2;
	@FindBy(xpath=".//*[@id='collapseThree']/div[1]/div[3]/button")
	WebElement continuebtn;
	@FindBy(xpath=".//*[@id='bv-allocation-table']/div[3]/div[4]/button")
	WebElement bc02;
	@FindBy(xpath=".//*[@id='bv-allocation-table']/div[4]/div[4]/button")
	WebElement bc03;
	@FindBy(xpath=".//*[@id='ecard-payment-form']/div[2]/div[1]/div/input")
	WebElement vnum;
	@FindBy(xpath=".//*[@id='ecard-payment-form']/div[2]/div[2]/div/input")
	WebElement gllpin;
	@FindBy(xpath=".//*[@id='bv-allocation-table']/div[4]/div[4]/button")
	WebElement validate;
	@FindBy(xpath=".//*[@id='ecard-payment-form']/div[5]/a[2]")
	WebElement confirm;
	
	
	
	
	public void clickProceedCheckOut(){
		chkout.click();
	}
	public void acceptTC(){
		tc.click();
	}
	public void clickCheckOutSelectPayment(){
		chkoutsp.click();
	}
	public void selectDeliveryOption(String value){
		Select dilio=new Select(deliveryOption);
		dilio.selectByVisibleText(value);
	}
	public void selectDeliveryOption2(String value){
		Select dilio=new Select(deliveryOption2);
		dilio.selectByVisibleText(value);
	}
	public void selectDeliveryOption3(String value){
		Select dilio=new Select(deliveryOption);
		dilio.selectByVisibleText(value);
	}
	public void clickContinue(){
		continuebtn.click();
	}
	public void clickBC02(){
		bc02.click();
	}
	public void clickBC03(){
		bc03.click();
	}
	
	public void enterGLLVoucherNum(){
		vnum.click();
	}
	public void enterGLLPin(){
		gllpin.click();
	}
	public void clickValidate(){
		validate.click();
	}
	public void clickConfirmbtn(){
		confirm.click();
	}
}
