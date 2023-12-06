package com.omayoproject.leftpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.leftpageobject.PopupWindowPage;

public class PopupWindowTest extends BaseTest{
	
	PopupWindowPage popupWindowPage;
	
	@Test()
	public void popupWindowTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		popupWindowPage = new PopupWindowPage();
		popupWindowPage.popupWindow();
	}

}
