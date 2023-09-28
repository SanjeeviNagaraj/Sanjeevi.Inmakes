package org.cuc;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogin extends BaseClass {
private void FbLoginPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(id = "email")
private WebElement email;
@FindBy(xpath = "//input[@aria-label='password']")
private WebElement password;
@FindBy(name="login")
private WebElement loginBtn;

public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return loginBtn;
}


}