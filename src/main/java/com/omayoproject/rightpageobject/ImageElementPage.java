package com.omayoproject.rightpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class ImageElementPage extends BasePage{
	
	@FindBy(css = "[src='https://assets.about.me/background/www.softwaretestingcollege.blogspot.com_1330713399_12.jpg']")
	private WebElement image;
	
	public void imageElement() {
		boolean actualResult = action.findElement(image);
		softAssert.assertTrue(actualResult);
		softAssert.assertAll();
	}

}
