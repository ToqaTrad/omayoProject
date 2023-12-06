package com.omayoproject.leftpagetest;

import org.testng.annotations.Test;
import java.time.Duration;
import com.omayoproject.base.BaseTest;
import com.omayoproject.leftpageobject.MultiSelectionBoxPage;

public class MultiSelectionBoxTest extends BaseTest {

	MultiSelectionBoxPage multiSelectionBoxPage;

	@Test(groups = { "retest" })
	public void multiSelectionBoxTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		multiSelectionBoxPage = new MultiSelectionBoxPage();
		multiSelectionBoxPage.multiSelectionBox();
	}

}
