package com.omayoproject.leftpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.leftpageobject.TryItButtonPage;

public class TryItButtonTest extends BaseTest{
	
	TryItButtonPage tryItButtonPage;
	
	@Test()
	public void tryItButtonTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		tryItButtonPage = new TryItButtonPage();
		tryItButtonPage.tryItButtonPage();
	}

}
