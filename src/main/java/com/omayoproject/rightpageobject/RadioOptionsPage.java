package com.omayoproject.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class RadioOptionsPage extends BasePage{
	
	@FindBy(id = "radio1")
	private WebElement maleOption;
	
	@FindBy(id = "radio2")
	private WebElement femaleOption;
	
	
	public void radioMaleOption() throws InterruptedException {
		action.click(maleOption);
		Thread.sleep(3000);
		boolean actualResult = action.isSelected(maleOption);
		softAssert.assertTrue(actualResult);
		softAssert.assertAll();
	}
	
	public void radioFemaleOption() throws InterruptedException {
		action.click(femaleOption);
		Thread.sleep(3000);
		boolean actualResult = action.isSelected(femaleOption);
		softAssert.assertTrue(actualResult);
		softAssert.assertAll();
	}

}
