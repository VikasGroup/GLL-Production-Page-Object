package net.gll.pgobjects.gll.pgobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;


public class HomePgObjects extends PageObject {
	@FindBy(xpath="/html/body/div[1]/header/div/div/div[4]/div[2]/a")
	WebElement loginreg; 
	@FindBy(xpath=".//*[@id='mainNavi']/ul/li[1]/a")
	WebElement products; 
	@FindBy(xpath=".//*[@id='mainNavi']/ul/li[1]/div/div/div[2]/ul/li/ul/li[1]/a")
	WebElement homepure; 
	@FindBy(xpath=".//*[@id='header']/div[1]/div[4]/div[2]/a")
	WebElement virtualoffice; 
	@FindBy(xpath=".//*[@id='header']/div[1]/div[2]/div[1]/div/div/div[2]/div/a/span")
	WebElement removeitems; 
	@FindBy(xpath=".//*[@id='header']/div[1]/div[2]/div[1]/div/a/span[2]")
	WebElement itemvalue; 
	
       public void clickLogInReg(){
    	   
    	   loginreg.click();
       }
       public void clickVirtualOffice(){
    	   virtualoffice.click();
       }
       public void clickProductsTab(){
    	   products.click();
       }
       public void clickSITEQLIK(){
    	   homepure.click();
       }
       public void removeItems(){
    	   removeitems.click();
       }
       public int getItemValue(){
    	   try{
    	  return Integer.parseInt(itemvalue.getText());
    	   }catch(org.openqa.selenium.ElementNotVisibleException ex){
    		   return 0;
    	   }
    	  
       }
}
