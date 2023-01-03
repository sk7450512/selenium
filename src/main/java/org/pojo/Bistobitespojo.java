package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bistobitespojo extends BaseClass {

	public Bistobitespojo() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(xpath="(//li[@class='lte-nav-profile '])[2]")
	private WebElement account;
	@FindBy(xpath="(//input[@id='phone'])[1]")
	private WebElement loginphone; 
	@FindBy(xpath="(//input[@name='password'])[1]")
	private WebElement loginpass;
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement loginbtnb;
	
	

	@FindBy(xpath="//input[@id='name']")
	private WebElement RegName;
	@FindBy(xpath="//input[@type='email']")
	private WebElement Regemail;
	@FindBy(xpath="(//input[@name='phone'])[2]")
	private WebElement Regphone;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement Regpassword;
	@FindBy(xpath = "(//input[@type='password'])[3]")
	private WebElement Regconfirmpass;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement Registerbtn;
	
	@FindBy(xpath="//a[@id='lte-top-search-ico']")
	private WebElement Searchbtn;
	@FindBy(xpath="(//input[@placeholder='Search'])[2]")
	private WebElement Searchitem;
	
	@FindBy(xpath="(//h2[@class='woocommerce-loop-product__title'])[1]")
	private WebElement MasalaDosaclick;
	@FindBy(xpath="(//h2[@class='woocommerce-loop-product__title'])[1]")
	private WebElement Cokeclick;
	@FindBy(xpath="(//h2[@class='woocommerce-loop-product__title'])[1]")
	private WebElement SpanishOmlet;
	
	@FindBy(xpath="//li[@id='menu-item-3557']")
	private WebElement ourstory;

	public WebElement getRegpassword() {
		return Regpassword;
	}

	public WebElement getRegconfirmpass() {
		return Regconfirmpass;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getLoginphone() {
		return loginphone;
	}

	public WebElement getLoginpass() {
		return loginpass;
	}
	

	public WebElement getLoginbtnb() {
		return loginbtnb;
	}

	public WebElement getRegName() {
		return RegName;
	}

	public WebElement getRegemail() {
		return Regemail;
	}

	public WebElement getRegphone() {
		return Regphone;
	}

	public WebElement getRegisterbtn() {
		return Registerbtn;
	}

	public WebElement getSearchbtn() {
		return Searchbtn;
	}

	public WebElement getSearchitem() {
		return Searchitem;
	}

	public WebElement getMasalaDosaclick() {
		return MasalaDosaclick;
	}

	public WebElement getCokeclick() {
		return Cokeclick;
	}

	public WebElement getSpanishOmlet() {
		return SpanishOmlet;
	}

	public WebElement getOurstory() {
		return ourstory;
	}
	
	
}
