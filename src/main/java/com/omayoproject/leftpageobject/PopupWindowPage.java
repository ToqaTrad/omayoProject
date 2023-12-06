package com.omayoproject.leftpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class PopupWindowPage extends BasePage{
	@FindBy(xpath="//div[@id='HTML37']//p/a")
	private WebElement popupWindowLink;
	
	
	public void popupWindow() throws InterruptedException {
		action.click(popupWindowLink);
		String expectedResult = "https://the-internet.herokuapp.com/windows/new";
		action.switchToNewWindow(driver);
		String actualResult= action.getCurrentURL(driver);
		softAssert.assertEquals(actualResult, expectedResult);
		softAssert.assertAll();
		}

}
