package com.omayoproject.leftpageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class ButtonWithSameNamePage extends BasePage{
	
	@FindBy(name= "samename")
	private List <WebElement> samenameButton;
	
	public void buttonWithSameName() {
		for(int i = 0; i<samenameButton.size(); i++) {
			action.click(samenameButton.get(i));
		}
	}

}
