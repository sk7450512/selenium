package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.Bistobitespojo;
import org.testng.annotations.Test;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automationsamplebites extends BaseClass {
	@When("The user has to launching url in Bisto bites application")
	public void the_user_has_to_launching_url_in_Bisto_bites_application() {
		launchBrowser();
		WindowMaximize();
	    launchURL("https://bistrobitesdc.com/");
	}

	@When("User click the “Account” button")
	public void user_click_the_Account_button() throws InterruptedException {
	 Bistobitespojo b = new Bistobitespojo();
	 Thread.sleep(5000);
	 clickBtn(b.getAccount());	
	}

	@When("User has to pass the invalid username")
	public void user_has_to_pass_the_invalid_username() throws InterruptedException {
		 Bistobitespojo b = new Bistobitespojo();
		 Thread.sleep(5000);
		 passtext("sk7450512", b.getLoginphone());
	}

	@When("User has to pass the invalid password")
	public void user_has_to_pass_the_invalid_password() {
		 Bistobitespojo b = new Bistobitespojo();
		 passtext("12345",b.getLoginpass());
	}


   
	@When("The user has to Click the search button")
	public void the_user_has_to_Click_the_search_button() {
		 Bistobitespojo b = new Bistobitespojo();
	
		 clickBtn(b.getSearchbtn());
		 
	}

	@When("The user has to search the Masala dosa")
	public void the_user_has_to_search_the_Masala_dosa() throws AWTException {
		 Bistobitespojo b = new Bistobitespojo();
		 passtext("M"
		 		+ "asala dosa", b.getSearchitem());
		 Robot a = new Robot();
		 a.keyPress(KeyEvent.VK_ENTER);
	     a.keyRelease(KeyEvent.VK_ENTER);
	}

	//@When("The user scroll in to down to view the dosa")
	//public void the_user_scroll_in_to_down_to_view_the_dosa() {
		//WebElement j = driver.findElement(By.xpath("//h1[text()='Login & Register']"));
	   //ScrollThePage(j);
	//}

	@When("The user to select the Masala Dosa option")
	public void the_user_to_select_the_Masala_Dosa_option() {
		 Bistobitespojo b = new Bistobitespojo();
		clickBtn(b.getMasalaDosaclick()); 
	}

	@When("The user to click the Account button")
	public void the_user_to_click_the_Account_button() throws InterruptedException {
		 Bistobitespojo b = new Bistobitespojo();
		 Thread.sleep(3000);
		 clickBtn(b.getAccount());
	}

	@When("The user scroll into down to view name field")

	public void the_user_scroll_into_down_to_view_name_field() throws InterruptedException {
		Thread.sleep(5000);
		Bistobitespojo b = new Bistobitespojo();
		 System.out.println("scroll the page");
	}

	@When("The user has to pass the name in name field")
	public void the_user_has_to_pass_the_name_in_name_field() {
		 Bistobitespojo b = new Bistobitespojo();
		 passtext("tamilselvan", b.getRegName());
	}

	@When("the user has to pass the Email in Email field")
	public void the_user_has_to_pass_the_Email_in_Email_field() {
		 Bistobitespojo b = new Bistobitespojo();
		 passtext("sk7450512", b.getRegemail());
	}

	@When("The  user has to pass the phone in phone field")
	public void the_user_has_to_pass_the_phone_in_phone_field() {
		 Bistobitespojo b = new Bistobitespojo();
		 passtext("4564345676", b.getRegphone());
	}
	@When("The  user has to pass the password field in password field")
	public void theUserHasToPassThePasswordFieldInPasswordField() {
		 Bistobitespojo b = new Bistobitespojo();
		 passtext("123456", b.getRegpassword());
	}
   @Test(enabled=false)
	@When("The user  has to  pass the confirm password field in confirm password")
	public void theUserHasToPassTheConfirmPasswordFieldInConfirmPassword() {
		 Bistobitespojo b = new Bistobitespojo();
		 passtext("123456", b.getRegconfirmpass());
	}

	@When("user has to click the register button")
	public void user_has_to_click_the_register_button() {
		 Bistobitespojo b = new Bistobitespojo();
		 clickBtn(b.getRegisterbtn());
	}

	@When("user has seeing the popup print the popup")
	public void user_has_seeing_the_popup_print_the_popup() {
		System.out.println("pleae fil out the password");
							
	}

	@When("The user has to Click the search")
	public void the_user_has_to_Click_the_search() {
		 Bistobitespojo b = new Bistobitespojo();
		 clickBtn(b.getSearchbtn());
	}

	@When("The user has to search the Coke")
	public void the_user_has_to_search_the_Coke() throws AWTException {
		 Bistobitespojo b = new Bistobitespojo();
		 passtext("Coke", b.getSearchitem());
		 Robot a = new Robot();
		 a.keyPress(KeyEvent.VK_ENTER);
	     a.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("The user has to  check the can dollar is $ {double}")
	public void the_user_has_to_check_the_can_dollar_is_$(Double double1) throws InterruptedException {
		 Bistobitespojo b = new Bistobitespojo();
		 Thread.sleep(5000);
		 WebElement ge = driver.findElement(By.xpath("(//span[@class='woocommerce-Price-currencySymbol'])[1]"));
	     String text = ge.getText();
	     System.out.println(text);
	
	}


	@When("The user has to Click the search icon{int}")
	public void the_user_has_to_Click_the_search_icon(Integer int1) {
		 Bistobitespojo b = new Bistobitespojo();
		 clickBtn(b.getSearchbtn());
	}

	@When("The user Find out the Spanish Omelet and Click the icon")
	public void the_user_Find_out_the_Spanish_Omelet_and_Click_the_icon() throws AWTException {
		 Bistobitespojo b = new Bistobitespojo();
		 passtext("Spanish Omelete", b.getSearchitem());
		 Robot a = new Robot();
		 a.keyPress(KeyEvent.VK_ENTER);
	     a.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("check the dollar")
	public void check_the_dollar() {
	   WebElement get = driver.findElement(By.xpath("(//span[@class='woocommerce-Price-currencySymbol'])[1]"));
	get.getText();
	
	}

	@When("The user has to Click the Our Story option")
	public void the_user_has_to_Click_the_Our_Story_option() {
		 Bistobitespojo b = new Bistobitespojo();
		 clickBtn(b.getOurstory());
	}

	@When("Check the spelling mistake")
	public void check_the_spelling_mistake() throws InterruptedException {
		Thread.sleep(5000);
	  WebElement get = driver.findElement(By.xpath("//h4[contains(text(),'Every')]"));
	  String text = get.getText();
	  System.out.println(text);
	  WebElement nes1 = driver.findElement(By.xpath("//p[contains(text(),'true!')]"));
	String text2 = nes1.getText();
	System.out.println(text2);
	
	 WebElement nex1 = driver.findElement(By.xpath("//p[contains(text(),'created')]"));
		String text3 = nex1.getText();
		System.out.println(text3);
		 WebElement nex2 = driver.findElement(By.xpath("//p[contains(text(),'At')]"));
			String text4 = nex2.getText();
			System.out.println(text4);
	
	}

	@Then("The user has to close the browser")
	public void the_user_has_to_close_the_browser() {
	    CloseEntireBrowser();
	}


}
