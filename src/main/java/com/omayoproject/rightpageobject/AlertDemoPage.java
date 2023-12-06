package com.omayoproject.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class AlertDemoPage extends BasePage{
	
	@FindBy(id = "alert1")
	private WebElement alert;
	
	public void AlertPage() throws InterruptedException {
		action.click(alert);
		Thread.sleep(2000);
		boolean actualResult = action.AlertAccept(driver);		
		softAssert.assertTrue(actualResult);
		softAssert.assertAll();
		
		
	}

}
