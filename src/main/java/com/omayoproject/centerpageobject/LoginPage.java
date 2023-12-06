package com.omayoproject.centerpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayoproject.base.BasePage;

public class LoginPage extends BasePage {

	@FindBy(name = "userid")
	private WebElement usernameField;

	@FindBy(name = "pswrd")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	public void loginWithValidUsernameAndPass(String userName, String pass) {
		action.sendText(usernameField,userName );
		action.sendText(passwordField, pass);
		action.click(loginButton);
		action.AlertAccept(driver);
		// Assert.assertTrue(false);
	}

}
