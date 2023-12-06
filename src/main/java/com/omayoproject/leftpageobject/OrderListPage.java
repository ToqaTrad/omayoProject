package com.omayoproject.leftpageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class OrderListPage extends BasePage{
	
	@FindBy(xpath= "//div/ol/li")
	private List<WebElement> orderList;

	
	
	public void orderList() {
		action.implicitWait(driver, 20);
		for(WebElement order: orderList) {
			String text = action.getText(order);
			System.out.println(text);
		}
	}
}
