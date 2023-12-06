package com.omayoproject.rightpageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class OtherSitesToPracticePage extends BasePage{
	@FindBy(xpath="//div[@id='LinkList1']//ul//li//a")
	private List<WebElement> links;
	
	
	public void otherSites() throws InterruptedException {
		for(WebElement link:links) {
			String expectedResult = "https://omayo.blogspot.com/";
			action.click(link);
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			String actualResult = action.getCurrentURL(driver);
			softAssert.assertEquals(actualResult, expectedResult);
			softAssert.assertAll();

		}
			
	}
	

}
