package com.omayoproject.rightpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.rightpageobject.ConfirmationDialogPage;

public class ConfirmationDialogTest extends BaseTest{
	ConfirmationDialogPage confirmationDialogPage;
	
	
	@Test()
	public void getConfirmationAcceptTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		confirmationDialogPage = new ConfirmationDialogPage();
		confirmationDialogPage.getConfirmationAccept();
		
	}
	@Test()
	public void getConfirmationCancelTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		confirmationDialogPage = new ConfirmationDialogPage();
		confirmationDialogPage.getConfirmationCancel();
		
	}

}
