package com.omayoproject.rightpagetest;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.omayoproject.base.BaseTest;
import com.omayoproject.dataprovider.ExcelDataProvider;
import com.omayoproject.rightpageobject.LocateUsingNameAttributePage;
import com.omayoproject.utility.ExcelUtils;
public class LocateUsingNameAttributeTest extends  BaseTest{
	private LocateUsingNameAttributePage locateUsingNameAttributePage;
	 ExcelUtils excelUtils = new ExcelUtils();
	 
	@BeforeClass
	public void setUp() throws IOException {
		excelUtils.addRandomDataRows(2,0);
	}
	
	@Test(dataProvider = "LocateUsingNameAttributePage", dataProviderClass = ExcelDataProvider.class, groups = "smoke", priority = 1)
	public void nameAttributeTest(Object[] testData) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String textQA = (String) testData[0];
		locateUsingNameAttributePage = new LocateUsingNameAttributePage();
		locateUsingNameAttributePage.locateUsingNameAttribute(textQA);

	}

}