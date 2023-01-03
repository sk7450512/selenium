package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.ICICbankpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ICICbank extends BaseClass {
	@Given("To launch the Chrome browser and maximize window")
	public void to_launch_the_Chrome_browser_and_maximize_window() {
	  launchBrowser();
	  WindowMaximize();
	}

	@When("To launch url of the icic bank application")
	public void to_launch_url_of_the_icic_bank_application() {
	  launchURL("https://www.icicibank.com/nri-banking/pay-view-online-quick");
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
	  ICICbankpojo i = new ICICbankpojo();
	  clickBtn(i.getLoginOuter());
	}

	@When("User has to pass the username in userid field")
	public void user_has_to_pass_the_username_in_userid_field() throws InterruptedException {
		ICICbankpojo i = new ICICbankpojo();
		Thread.sleep(5000);
		WebElement a = driver.findElement(By.id("user-id-goahead"));
		a.click();
		passtext("sk7450512", i.getUserid());
	}

	@When("User has to pass the password in password field")
	public void user_has_to_pass_the_password_in_password_field() {
		ICICbankpojo i = new ICICbankpojo();
		passtext("tamil1234", i.getPass());
	}

	

	@Then("user close the browser")
	public void user_close_the_browser() {
	    CloseEntireBrowser();
	}


}
