package com.omayoproject.leftpageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class EnabledIn10SecondsPage extends BasePage{

	@FindBy(xpath="//button[@onclick='setTimeout(myFunctionAXD,10000)']")
	private WebElement checkButton;
	@FindBy(xpath="//input[@id='dte']")
	private WebElement checkBox;
	
	
	public void EnableCheckBox() throws InterruptedException {
		action.click(checkButton);
		Thread.sleep(14000);
		action.click(checkBox);
		boolean actualResult = action.isEnabled(checkBox);
		softAssert.assertTrue(actualResult);;
		softAssert.assertAll();

		
	}
}
