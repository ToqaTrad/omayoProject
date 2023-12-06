package com.omayoproject.leftpageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class UnorderedListPage extends BasePage{
	
	@FindBy(xpath="//div[@id='HTML26']//ul/li")
	private List<WebElement> unorderedList;
	
	
	public void unOrderList() {
		for(WebElement unorder:unorderedList ) {
			String text = unorder.getText();
			System.out.println(text);
		}
	}

}
