package com.omayoproject.rightpageobject;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class GetPromptPage extends BasePage{
	@FindBy(id = "prompt")
	private WebElement getPromptButton;
	
	
	public void getPromptAccept() throws InterruptedException {
		action.click(getPromptButton);
		Thread.sleep(3000);
		action.AlertText(driver, "tutu", Duration.ofSeconds(30));
		boolean actualResult = action.AlertAccept(driver);		
		softAssert.assertTrue(actualResult);
		softAssert.assertAll();
	}
	
	public void getPromptCancel() throws InterruptedException {
		action.click(getPromptButton);
		Thread.sleep(3000);
		action.AlertText(driver, "tutu", Duration.ofSeconds(30));
		boolean actualResult = action.AlertCancel(driver);	
		softAssert.assertTrue(actualResult);
		softAssert.assertAll();
	}

}
