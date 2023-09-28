package org.stepdefinition;
import org.bas.BaseClass;

import com.google.common.base.Preconditions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
public class HooksClass extends BaseClass {
@Before
private void precondition() {
	launchBrowser();
	WindowMaximize();
}
@After
private void postcondition() {
	closeEntireBrowser();

}

}



