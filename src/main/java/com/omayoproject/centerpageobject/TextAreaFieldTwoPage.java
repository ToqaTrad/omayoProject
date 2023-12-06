package com.omayoproject.centerpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayoproject.base.BasePage;

public class TextAreaFieldTwoPage extends BasePage {

	@FindBy(xpath = "//div[@id='HTML11']/div/textarea")
	private WebElement textAreaField;

	public void sendText() throws InterruptedException {

		action.sendText(textAreaField, "Is this clear");
		Thread.sleep(4000);

	}

}
