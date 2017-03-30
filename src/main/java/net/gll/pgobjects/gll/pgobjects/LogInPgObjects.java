package net.gll.pgobjects.gll.pgobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class LogInPgObjects extends PageObject{
	@FindBy(xpath=".//*[@id='UserName']")
	WebElement id;
	@FindBy(xpath=".//*[@id='Password']")
	WebElement pass;
	@FindBy(xpath=".//*[@id='form2']/input[3]")
	WebElement logbtn;
	@FindBy(xpath=".//*[@id='LoginFormBody']/div[1]/div/div[2]/div/div[2]/a")
	WebElement regbtn;
	@FindBy(xpath=".//*[@id='LoginFormBody']/div[1]/div/div[2]/div/div[1]/a")
	WebElement shopemail;
	@FindBy(xpath=".//*[@id='form2']/p/a")
	WebElement forgpass;
	
	
	
      public void enterID(String value){
    	
    	id.sendKeys(value);
    	
      }
      public void clickForgotPass(){
      	
      	forgpass.click();
      	
        }
      public void enterPassword(String value){
      	pass.sendKeys(value);
      	
        }
      public void clickLogInBtn(){
      		logbtn.click();
        }
      public void clickRegBtn(){
        	regbtn.click();
          }
      public void clickRetailBtn(){
    	  shopemail.click();
        }
}
