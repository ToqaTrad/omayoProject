package com.omayoproject.centerpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayoproject.base.BasePage;

public class TextAreaFieldPage extends BasePage {

	@FindBy(id = "ta1")
	private WebElement textAreaField;

	public void sendText() throws InterruptedException {
		action.sendText(textAreaField, "Hello world ^_^");
		Thread.sleep(4000);

	}

}
