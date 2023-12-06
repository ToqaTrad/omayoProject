package com.omayoproject.rightpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.rightpageobject.ImageElementPage;

public class ImageElementTest extends BaseTest{
	private ImageElementPage imageElementPage;
	
	@Test()
	public void imageElementTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 imageElementPage = new ImageElementPage();
		 imageElementPage.imageElement();
	}

}
