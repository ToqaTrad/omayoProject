package com.omayoproject.leftpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.leftpageobject.UnorderedListPage;

public class UnorderedListTest extends BaseTest{
	
	UnorderedListPage unorderedListPage;
	
	
	@Test()

	public void unOrderedListTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		unorderedListPage = new UnorderedListPage() ;
		unorderedListPage.unOrderList();
		
	}

}
