package com.omayoproject.leftpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class TryItButtonPage extends BasePage{
	
	@FindBy(css = "[onclick='setTimeout(myFunctionABC,3000)']")
	private WebElement tryItButton;
	
	
	@FindBy(id = "myBtn")
	private WebElement myButton;
	
	public void tryItButtonPage() throws InterruptedException {
		action.click(tryItButton);
		Thread.sleep(4000);

		boolean actualResult = action.isEnabled(myButton);
		softAssert.assertFalse(actualResult);	
		softAssert.assertAll();
		
	}

}
