package com.omayoproject.rightpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.rightpageobject.OtherSitesToPracticePage;

public class OtherSitesToPracticeTest extends BaseTest{
	private OtherSitesToPracticePage otherSitesToPracticePage;
	
	@Test
	public void otherSitesTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		otherSitesToPracticePage= new OtherSitesToPracticePage();
		otherSitesToPracticePage.otherSites();

		
	}

}
