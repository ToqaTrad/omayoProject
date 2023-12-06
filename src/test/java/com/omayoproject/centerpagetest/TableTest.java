package com.omayoproject.centerpagetest;

import org.testng.annotations.Test;
import java.time.Duration;


import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.centerpageobject.TablePage;

public class TableTest extends BaseTest{
	TablePage tablePage;
	
	@Test()
	public void tableTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		tablePage = new TablePage();
//		tablePage.printColumnValues();
//		tablePage.printRowsValues();
//		tablePage.printSpecificValues();
		tablePage.prindRandomValues();
	}
	

}
