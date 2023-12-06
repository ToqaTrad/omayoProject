package com.omayoproject.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class LocateUsingAttributePage extends BasePage{
	
	@FindBy(name = "textboxn")
	private WebElement nameAttribute;
	
	
	public void locateUsingAttributePage(String text) {
		action.sendText(nameAttribute, text);
		
	}

}
