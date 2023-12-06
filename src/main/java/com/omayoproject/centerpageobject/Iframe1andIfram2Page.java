package com.omayoproject.centerpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayoproject.base.BasePage;

public class Iframe1andIfram2Page extends BasePage {

	@FindBy(name = "")
	private WebElement Ifrme1;

	@FindBy(name = "")
	private WebElement Ifrme2;

	public void GetIframe1AndIframe2() {
		action.switchToFrameById(driver, "iframe2");
		driver.switchTo().parentFrame();
		action.switchToFrameById(driver, "iframe1");
	}

}
