package com.omayoproject.rightpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.rightpageobject.GetPromptPage;

public class GetPromptTest extends BaseTest{
	private GetPromptPage getPromptPage;
	
	@Test()
	public void getPromptAcceptTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getPromptPage = new GetPromptPage();
		getPromptPage.getPromptAccept();
		
	}
	
	@Test()
	public void getPromptCacnelTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getPromptPage = new GetPromptPage();
		getPromptPage.getPromptCancel();
		
	}
	

}
