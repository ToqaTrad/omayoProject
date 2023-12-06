package com.omayoproject.centerpagetest;


import org.testng.annotations.Test;
import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.centerpageobject.Iframe1andIfram2Page;

public class Iframe1andIfram2Test extends BaseTest{
	private Iframe1andIfram2Page ifram1AndIfram2Page;
	
	@Test()
	public void iframe1AndIfram2Test() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ifram1AndIfram2Page = new Iframe1andIfram2Page();
		ifram1AndIfram2Page.GetIframe1AndIframe2();
		
	}
	
	

}
