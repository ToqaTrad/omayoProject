package com.omayoproject.leftpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.leftpageobject.TextBoxWithPreloadedTextPage;

public class TextBoxWithPreloadedTextTest extends BaseTest{
	TextBoxWithPreloadedTextPage textBoxWithPreloadedTextPage;
	
	@Test()
	public void TextBoxTest()  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		textBoxWithPreloadedTextPage = new TextBoxWithPreloadedTextPage();
		textBoxWithPreloadedTextPage.textBox();

}
}