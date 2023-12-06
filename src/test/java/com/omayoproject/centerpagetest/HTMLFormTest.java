package com.omayoproject.centerpagetest;

import org.testng.annotations.Test;
import java.time.Duration;

import com.omayoproject.base.BaseTest;
import com.omayoproject.centerpageobject.HTMLFormPage;

public class HTMLFormTest extends BaseTest {

	HTMLFormPage htmlFormPage;

	@Test()
	public void HTMLLoginTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		htmlFormPage = new HTMLFormPage();
		htmlFormPage.HTMLFormLogin();

	}

}
