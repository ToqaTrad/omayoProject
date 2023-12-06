package com.omayoproject.leftpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.leftpageobject.UploadFilePage;

public class UploadFileTest extends BaseTest{
	UploadFilePage uploadFilePage;
	
	
	@Test()
	public void uploadFileTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		uploadFilePage = new UploadFilePage();
		uploadFilePage.uploadFile();
	}
	

}
