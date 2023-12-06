package com.omayoproject.centerpagetest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.time.Duration;

import com.omayoproject.base.BaseTest;

import com.omayoproject.centerpageobject.TextAreaFieldTwoPage;

public class TextAreaFieldTwoTest extends BaseTest {
	TextAreaFieldTwoPage textAreaFieldTwoPage;

	@Test()
	public void textAreaFieldTwoTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		textAreaFieldTwoPage = new TextAreaFieldTwoPage();
		textAreaFieldTwoPage.sendText();

	}

}
