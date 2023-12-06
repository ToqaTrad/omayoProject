package com.omayoproject.rightpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.rightpageobject.HiddenButtonPage;

public class HiddenButtonTest extends BaseTest{
	HiddenButtonPage hiddenButtonPage;
	
	@Test()
	public void findHiddenButtonTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		hiddenButtonPage = new HiddenButtonPage();
		hiddenButtonPage.findHiddenButton();
}

}
