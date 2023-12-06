package com.omayoproject.leftpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class MultiSelectionBoxPage extends BasePage{
	
	@FindBy(id="multiselect1")
	private WebElement Selector;
	
	public void multiSelectionBox() throws InterruptedException {
		action.selectByValue(Selector, "volvox");
		Thread.sleep(3000);
	}

}
