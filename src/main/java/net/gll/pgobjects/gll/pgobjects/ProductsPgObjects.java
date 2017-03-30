package net.gll.pgobjects.gll.pgobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class ProductsPgObjects extends PageObject{
	@FindBy(xpath=".//*[@id='productList']/div[2]/div/div/div[1]/a[3]/span")
	WebElement prod;
	@FindBy(xpath=".//*[@id='productList']/div[2]/div[1]/div/div[1]/a[3]/span")
	WebElement prod2;
	@FindBy(xpath=".//*[@id='header']/div/div[2]/div[1]/div/a")
	WebElement cart;
	@FindBy(xpath=".//*[@id='header']/div/div[2]/div[1]/div/div/div[3]/a")
	WebElement checkout;
	
	
	
	public void clickProd1(){
		prod.click();
	}
	
	public void clickProd2(){
		prod2.click();
	}
	public void clickCart(){
		cart.click();
	}
	public void clickCheckOut(){
		checkout.click();
	}
	
}
