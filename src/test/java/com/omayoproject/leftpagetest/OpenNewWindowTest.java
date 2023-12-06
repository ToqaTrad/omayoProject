package com.omayoproject.leftpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.leftpageobject.OpenNewWindowPage;

public class OpenNewWindowTest extends BaseTest{
	
	private OpenNewWindowPage openNewWindowPage;
	
	@Test()
	public void openNewWindowTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		openNewWindowPage = new OpenNewWindowPage();
		openNewWindowPage.openNewWindowPage();

	}
}
