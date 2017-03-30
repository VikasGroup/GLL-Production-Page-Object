package net.gll.pgobjects.gll.pgobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class RegistrationPgObjects extends PageObject{
	@FindBy(xpath=".//*[@id='Country']")
	WebElement country;
	@FindBy(xpath=".//*[@id='Nature']")
	WebElement reg;
	@FindBy(xpath=".//*[@id='Title']")
	WebElement title;
	@FindBy(xpath=".//*[@id='ReferrerID']")
	WebElement id;
	 @FindBy(xpath=".//*[@id='FirstName']")
	 WebElement name;
	@FindBy(xpath=".//*[@id='LastName']")
	WebElement lname;
	@FindBy(xpath=".//*[@id='datepicker']")
	WebElement bday;
	@FindBy(xpath=".//*[@id='PreferredLanguage']")
	WebElement lang;
	@FindBy(xpath=".//*[@id='MobileNo']")
	WebElement num;
	@FindBy(xpath=".//*[@id='Email']")
	WebElement email;
	@FindBy(xpath=".//*[@id='Email2']")
	WebElement email2;
	@FindBy(xpath=".//*[@id='subCollapseOne']/div/div[3]/button[2]")
	WebElement confirmbtn;
	@FindBy(xpath=".//*[@id='Password']")
	WebElement pass;
	@FindBy(xpath=".//*[@id='Password2']")
	WebElement pass2;
	@FindBy(xpath=".//*[@id='AddressLine1']")
	WebElement address;
	@FindBy(xpath=".//*[@id='AddressLine2']")
	WebElement address2;
	@FindBy(xpath=".//*[@id='City']")
	WebElement city;
	@FindBy(xpath=".//*[@id='State']")
	WebElement province;
	@FindBy(xpath=".//*[@id='ZipCode']")
	WebElement pcode;
	@FindBy(xpath=".//*[@id='BankName']")
	WebElement bname;
	@FindBy(xpath=".//*[@id='BankBranchName']")
	WebElement branch;
	@FindBy(xpath=".//*[@id='BankAccountNumber']")
	WebElement acn;
	@FindBy(xpath=".//*[@id='CompanyName']")
	WebElement cname;
	 @FindBy(xpath=".//*[@id='ContactPerson']")
	 WebElement designation;
	@FindBy(xpath=".//*[@id='OtherPosition']")
	WebElement conperson;
	
	@FindBy(xpath=".//*[@id='registration-details-form']/div[15]/button")
	WebElement cbtn2;
	@FindBy(xpath=".//*[@id='registration-details-form']/div[23]/button")
	WebElement cbtn;
	@FindBy(xpath=".//*[@id='registration-terms-form']/div[3]/button")
	WebElement acceptbtn;
	@FindBy(xpath="html/body/div[1]/div/div/div[2]/div/div/div[1]/div/div[1]/div[3]")
	WebElement closechat;
	@FindBy(xpath=".//*[@id='registration-terms-form']/div[2]/div/label/input")
	WebElement tc;
	@FindBy(xpath=".//*[@id='registration-terms-form']/div[2]/button")
	WebElement acceptbtn2;
	@FindBy(xpath=".//*[@id='registration-terms-form']/div[1]/div/label/input")
	WebElement tc2;
	@FindBy(xpath=".//*[@id='ecard-payment-form']/div[2]/div/input")
	WebElement glv;
	@FindBy(xpath=".//*[@id='ecard-payment-form']/div[3]/div/input")
	WebElement glv2;
	@FindBy(xpath=".//*[@id='ecard-payment-form']/div[2]/div[1]/div/input")
	WebElement glv3;
	@FindBy(xpath=".//*[@id='ecard-payment-form']/div[2]/div[2]/div/input")
	WebElement glv4;
	@FindBy(xpath=".//*[@id='ecard-payment-form']/div[4]/a")
	WebElement validatebtn;
	@FindBy(xpath=".//*[@id='ecard-payment-form']/div[5]/a[2]")
	WebElement confirmbtn2;
	
	@FindBy(xpath=".//*[@id='ecard-payment-form']/div[2]/div[3]/a")
	WebElement validatebtn2;
	
	public void selectCountry(String value) {
		Select cou=new Select(country);
		cou.selectByVisibleText(value);

	}
	public void selectRegType(String value) {
		Select regis=new Select(reg);
		regis.selectByVisibleText(value);

	}
	public void selectTitle(String value) {
		Select tit=new Select(title);
		tit.selectByVisibleText(value);

	}
	
	

	public void enterID(String value) {
		id.sendKeys(value);

	}

	public void enterFName(String value) {
		name.sendKeys(value);

	}
	public void enterLName(String value) {
		lname.sendKeys(value);

	}
	public void enterBday(String value) {
		bday.sendKeys(value);

	}
	
	public void selectLanguage(String value) {
		Select lan=new Select(lang);
		lan.selectByVisibleText(value);

	}
	
	public void enterMobNum(String value) {
		num.sendKeys(value);

	}
	
	public void enterEmail(String value) {
		email.sendKeys(value);

	}
	
	public void reenterEmail(String value) {
		email2.sendKeys(value);

	}
	
	
	public void enterPassword(String value) {
		pass.sendKeys(value);

	}
	public void reenterPassword(String value) {
		pass2.sendKeys(value);

	}
	public void enterAddressL1(String value) {
		address.sendKeys(value);

	}
	public void enterAddressL2(String value) {
		address2.sendKeys(value);

	}
	
	public void reenterCity(String value) {
		city.sendKeys(value);

	}
	public void enterProvince(String value) {
		province.sendKeys(value);

	}
	public void enterPCode(String value) {
		pcode.sendKeys(value);

	}
	
	
	
	public void selectBankName(String value) {
		Select bn=new Select(bname);
		bn.selectByVisibleText(value);

	}
	public void enterBranch(String value) {
		branch.sendKeys(value);

	}
	public void enterACN(String value) {
		acn.sendKeys(value);

	}
	public void enterCompanyName(String value) {
		cname.sendKeys(value);

	}
	public void enterDesignation(String value) {
		designation.sendKeys(value);

	}
	public void enterContactPerson(String value) {
		conperson.sendKeys(value);

	}
	
	public void clickContinueBtn() {
		cbtn.click();

	}
	public void clickContinueBtn2() {
		cbtn2.click();

	}
	
	public void acceptTC(){
		tc.click();
	}
	public void clickAcceptBtn(){
		acceptbtn.click();
	}
	public void acceptTC2(){
		tc2.click();
	}
	public void clickAcceptBtn2(){
		acceptbtn2.click();
	}
	public void enterGLVoucherNum(String value) {
		glv.sendKeys(value);

	}
	public void enterGLVoucherPIN(String value) {
		glv2.sendKeys(value);

	}
	
	public void enterGLVoucherNum2(String value) {
		glv3.sendKeys(value);

	}
	public void enterGLVoucherPIN2(String value) {
		glv4.sendKeys(value);

	}
	
	public void clickValidateBtn(){
		validatebtn.click();
	}
	
	public void clickConfirmBtn(){
		confirmbtn.click();
	}
	public void clickValidateBtn2(){
		validatebtn2.click();
	}
	
	public void clickConfirmBtn2(){
		confirmbtn2.click();
	}
	public void clickCloseChat(){
		closechat.click();
	}
}
