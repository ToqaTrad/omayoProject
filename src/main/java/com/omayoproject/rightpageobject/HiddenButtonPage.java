package com.omayoproject.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class HiddenButtonPage extends BasePage{
	
	@FindBy(id = "hbutton")
	private WebElement hiddenButton;
	
	public void findHiddenButton() {
		
		boolean actualResult = action.findElement(hiddenButton);
		softAssert.assertFalse(actualResult);
		softAssert.assertAll();
		
		
	}

}
