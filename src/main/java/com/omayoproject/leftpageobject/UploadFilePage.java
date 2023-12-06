package com.omayoproject.leftpageobject;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omayoproject.base.BasePage;

public class UploadFilePage extends BasePage{
	
	@FindBy(id = "uploadfile")
	private WebElement chooseFile;
	
	public void uploadFile() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String expectedResult = "25.jpeg";
		action.sendText(chooseFile, path+"/UploadFile/25.jpeg");
		String actualResult = chooseFile.getAttribute("value").substring(12);
		softAssert.assertEquals(actualResult, expectedResult);
		softAssert.assertAll();
		
	}

}
