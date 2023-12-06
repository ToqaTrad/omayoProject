package com.omayoproject.leftpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class TextBoxWithPreloadedTextPage extends BasePage {

	@FindBy(name = "fname")
	private WebElement textBoxFiled;

	public void textBox() {
		String expectedResult = "TextBoxWithPreloadedText";
		action.sendText(textBoxFiled, expectedResult);
		String actualResult = textBoxFiled.getAttribute("value");
		softAssert.assertEquals(actualResult, expectedResult);
		softAssert.assertAll();
	}

}
