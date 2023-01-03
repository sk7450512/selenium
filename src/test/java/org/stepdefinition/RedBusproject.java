package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedBusproject extends BaseClass {

	
	  @When("To launch the url of the Redbus application") public void
	  to_launch_the_url_of_the_Redbus_application() { launchBrowser();
	  WindowMaximize(); launchURL("https://www.redbus.in/help/login"); }
	  
	  @When("user has to click  the signin button") public void
	  user_has_to_click_the_signin_button() {
		  WebElement cl =driver.findElement(By.xpath("//div[@class='login-question']"));
		  cl.click(); }
	  
	  @When("user has to valid phoneno") public void user_has_to_valid_phoneno()
	  throws InterruptedException { 
	  Thread.sleep(5000);
	   WebElement no =driver.findElement(By.xpath("//input[@type='tel']"));
	  no.sendKeys("1234567395"); }
	  
	  @When("user has to click  the signup button")
	  public void user_has_to_click_the_signup_button() {
		  WebElement cl =driver.findElement(By.xpath("//div[@class='login-question']"));
		  cl.click(); 
	  }

	  @When("user has to valid phoneno {string}in phono field")
	  public void user_has_to_valid_phoneno_in_phono_field(String phoneno) throws InterruptedException {
		  Thread.sleep(3000);
		  WebElement no =driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']"));
		  no.sendKeys(phoneno); 
	  }
	
	}
	 

