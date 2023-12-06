package com.omayoproject.leftpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.leftpageobject.ButtonWithSameNamePage;

public class ButtonWithSameNameTest extends BaseTest{

	ButtonWithSameNamePage buttonWithSameNamePage;
	
	@Test()
	public void buttonWithSameNameTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		buttonWithSameNamePage = new ButtonWithSameNamePage();
		buttonWithSameNamePage.buttonWithSameName();
	}
}
