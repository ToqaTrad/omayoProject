package com.omayoproject.rightpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.rightpageobject.ReadOnlyTextBoxPage;

public class ReadOnlyTextBoxTest extends BaseTest{
	private ReadOnlyTextBoxPage readOnlyTextBoxPage;
	
	@Test()
	public void readOnlyTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		readOnlyTextBoxPage = new ReadOnlyTextBoxPage();
		readOnlyTextBoxPage.readOnlyTextBox();
		
	}

}
