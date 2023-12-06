package com.omayoproject.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class ReadOnlyTextBoxPage extends BasePage {
	
	@FindBy(id="rotb")
	private WebElement readOnly;
	

	public void readOnlyTextBox() {
		boolean actualResult;
				if(action.sendText(readOnly, "no writing")) {
					actualResult = true;
				}
				else actualResult = false;
				
		softAssert.assertFalse(actualResult);
		softAssert.assertAll();
		
	}
}
