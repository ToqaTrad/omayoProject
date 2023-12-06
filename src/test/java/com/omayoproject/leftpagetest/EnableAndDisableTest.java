package com.omayoproject.leftpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.leftpageobject.EnableAndDisablePage;

public class EnableAndDisableTest extends BaseTest{
	
	private EnableAndDisablePage enableAndDisablePage;
	
	@Test()

	public void enableTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		enableAndDisablePage = new EnableAndDisablePage();
		enableAndDisablePage.enableButton();
		enableAndDisablePage.displayedButton();
	}

}
