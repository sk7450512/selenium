package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ICICbankpojo extends BaseClass{
	public ICICbankpojo() {
		PageFactory.initElements(driver, this);
	}
 @FindBy(xpath="//a[@id='login-btn']")
 private WebElement loginOuter;
 
 @FindBy(xpath="//input[@class='login-input type_UserPrincipal']")
 private WebElement userid;
 
 @FindBy(xpath="(//input[@type='password'])[4]")
 private WebElement pass;
 @CacheLookup
 @FindBy(xpath="//input[@name='Action.VALIDATE_CREDENTIALS']")
private WebElement loginbtn	;

public WebElement getLoginOuter() {
	return loginOuter;
}

public WebElement getUserid() {
	return userid;
}

public WebElement getPass() {
	return pass;
}

public WebElement getLoginbtn() {
	return loginbtn;
}
 
 
	
}

