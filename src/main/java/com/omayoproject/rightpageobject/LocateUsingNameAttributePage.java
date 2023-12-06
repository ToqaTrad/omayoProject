package com.omayoproject.rightpageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayoproject.base.BasePage;

public class LocateUsingNameAttributePage extends BasePage {

	@FindBy(name = "textboxn")
	private WebElement LocateUsingName;


	public void locateUsingNameAttribute(String text) throws InterruptedException {
		action.sendText(LocateUsingName, text);
//		softAssert.assertFalse(errorMeessage.isDisplayed());
//		softAssert.assertAll();

	}

}
