package com.omayoproject.leftpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class OpenNewWindowPage extends BasePage{

	@FindBy(xpath="//div[@id='HTML5']//a[@target='_blank']")
	private WebElement seleniumTutorial;
	
	
	
	public void openNewWindowPage() throws InterruptedException {
		action.click(seleniumTutorial);
		Thread.sleep(5000);
		String expectedResult = "http://selenium143.blogspot.com/";
		action.switchToNewWindow(driver);
		String actualResult = action.getCurrentURL(driver);
		softAssert.assertEquals(actualResult, expectedResult);
		softAssert.assertAll();
	}
}
