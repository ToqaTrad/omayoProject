package com.omayoproject.rightpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.rightpageobject.DefaultSelectedCheckBoxPage;

public class DefaultSelectedCheckBoxTest extends BaseTest{
	private DefaultSelectedCheckBoxPage defaultSelectedCheckBoxPage;
	
	@Test()
	public void defaultSelectedCheckBoxTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  defaultSelectedCheckBoxPage = new DefaultSelectedCheckBoxPage();
		  defaultSelectedCheckBoxPage.defaultSelectedCheckBox();
	}

}
