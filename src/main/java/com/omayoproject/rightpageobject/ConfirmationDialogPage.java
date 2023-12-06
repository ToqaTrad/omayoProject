package com.omayoproject.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class ConfirmationDialogPage extends BasePage{
	@FindBy(id="confirm")
	private WebElement getConfirmation;
	
	public void getConfirmationAccept() throws InterruptedException {
		action.click(getConfirmation);
		Thread.sleep(2000);
		boolean actualResult = action.AlertAccept(driver);		
		softAssert.assertTrue(actualResult);
		softAssert.assertAll();
		
	}
	
	public void getConfirmationCancel() throws InterruptedException {
		action.click(getConfirmation);
		Thread.sleep(2000);
		boolean actualResult = action.AlertAccept(driver);		
		softAssert.assertTrue(actualResult);
		softAssert.assertAll();
	}

}
