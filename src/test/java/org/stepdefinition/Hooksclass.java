package org.stepdefinition;


import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooksclass extends BaseClass {
	
	@Before(order=2)
	private void precondition() {
		WindowMaximize();
		System.out.println("window maximize");
	}
@Before(order=1)
private void precondition2() {
	launchBrowser();
	System.out.println("launch browser");

}
@After(order=33)
private void postcondition() {
	CloseEntireBrowser();
	System.out.println("closing browser");
}


}
