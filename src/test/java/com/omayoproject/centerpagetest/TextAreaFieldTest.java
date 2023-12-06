package com.omayoproject.centerpagetest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;
import com.omayoproject.base.BaseTest;
import com.omayoproject.centerpageobject.TextAreaFieldPage;

public class TextAreaFieldTest extends BaseTest {

	private TextAreaFieldPage textAreaFieldPage;

	@Test()
	public void textAreaFiledTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		textAreaFieldPage = new TextAreaFieldPage();
		textAreaFieldPage.sendText();
	}

}
