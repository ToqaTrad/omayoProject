package com.omayoproject.rightpageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayoproject.base.BasePage;

public class DefaultSelectedCheckBoxPage extends BasePage{
	
	@FindBy(id="checkbox1")
	private WebElement orangeCheckBox;
	
	@FindBy(id="orangeCheckBox")
	private WebElement blueCheckBox;

	public void defaultSelectedCheckBox() {
		Boolean selectedCheckBox1 = action.isSelected(orangeCheckBox);
		Boolean selectedCheckBox2 = action.isSelected(blueCheckBox);
		
		if (selectedCheckBox1.equals(true)) {
		action.click(blueCheckBox);
		action.click(orangeCheckBox);}
		Boolean actualResult = action.isSelected(blueCheckBox);
		softAssert.assertTrue(actualResult);
		softAssert.assertAll();
	}
	
}
