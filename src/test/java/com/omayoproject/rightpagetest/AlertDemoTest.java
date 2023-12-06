package com.omayoproject.rightpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.rightpageobject.AlertDemoPage;

public class AlertDemoTest extends BaseTest{
	private AlertDemoPage alertDemoPage;
	
	
	@Test()
	public void alertTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 alertDemoPage = new AlertDemoPage();
		 alertDemoPage.AlertPage();
		
	}

}
