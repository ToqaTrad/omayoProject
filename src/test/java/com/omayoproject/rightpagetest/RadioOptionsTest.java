package com.omayoproject.rightpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.rightpageobject.RadioOptionsPage;

public class RadioOptionsTest extends BaseTest{
	
	RadioOptionsPage radioOptionsPage;
	
	@Test
	public void radioMaleOptionTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		radioOptionsPage = new RadioOptionsPage();
		radioOptionsPage.radioMaleOption();
		
	}
	
	
	@Test
	public void radioFemaleOptionTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		radioOptionsPage = new RadioOptionsPage();
		radioOptionsPage.radioFemaleOption();
		
	}

}
