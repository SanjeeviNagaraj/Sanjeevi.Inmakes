package org.cuc;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigNpojo extends BaseClass {
public SigNpojo() {
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createNewAccount;
	@FindBy(xpath="(//Input[@type='text'])[2]")
	private WebElement firstNameTxtBox;
	@FindBy(name="lastname")
	private WebElement secondNameTxtBox;
	@FindBy(name="reg_email__")
	private WebElement mobileOrEmailTextBox;
	@FindBy(name="reg_passwd__")
	private WebElement newPassword;
	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}
	public WebElement getFirstNameTxtBox() {
		return firstNameTxtBox;
	}
	public WebElement getSecondNameTxtBox() {
		return secondNameTxtBox;
	}
	public WebElement getMobileOrEmailTextBox() {
		return mobileOrEmailTextBox;
	}
	public WebElement getNewPassword() {
		return newPassword;
	}
	
	
	

}
