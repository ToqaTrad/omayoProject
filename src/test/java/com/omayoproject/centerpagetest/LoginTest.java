package com.omayoproject.centerpagetest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;
import com.omayoproject.base.BaseTest;
import com.omayoproject.centerpageobject.LoginPage;

public class LoginTest extends BaseTest{
	private LoginPage loginPage;
	@Test(groups = { "smoke" })
	@Parameters({"userName","pass"})
	public void loginTest(String userName, String pass) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loginPage = new LoginPage();
		loginPage.loginWithValidUsernameAndPass(userName,pass);
	}
	

}
