package com.omayoproject.leftpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class EnableAndDisablePage extends BasePage{
	
	@FindBy(id="but2")
	private WebElement button2;

	@FindBy(id="but1")
	private WebElement button1;
	
	public void enableButton() throws InterruptedException {
		
		action.isEnabled(button1);
		action.isEnabled(button2);

		
	}
	
	
	public void displayedButton() {
		action.findElement(button1);
		action.findElement(button2);
	}




}
