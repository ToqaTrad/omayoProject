package com.omayoproject.leftpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.leftpageobject.EnabledIn10SecondsPage;

public class EnabledIn10SecondsTest extends BaseTest{
	
	EnabledIn10SecondsPage enabledIn10SecondsPage;
	
	@Test()
	public void EnableCheckBoxTest() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		enabledIn10SecondsPage = new EnabledIn10SecondsPage();
		enabledIn10SecondsPage.EnableCheckBox();
	}

}
