package com.omayoproject.centerpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.github.javafaker.Faker;
import com.omayoproject.base.BasePage;

public class HTMLFormPage extends BasePage {
	
	Faker faker = new Faker();

	@FindBy(xpath = "//form[@name = 'form1']/input[1]")
	private WebElement usernameFiled;

	@FindBy(xpath = "//form[@name = 'form1']/input[@type = 'password']")
	private WebElement passwordFiled;

	@FindBy(xpath = "//form[@name = 'form1']/button[@type = 'button']")
	private WebElement loginButton;

	public void HTMLFormLogin() throws InterruptedException {
		String firstName = faker.name().firstName();
		String lastName = faker.name().firstName();
		String email = firstName+lastName+"@gmail.com";
		String pass = faker.number().digits(5);
		String phoneNumber = "079"+faker.number().numberBetween(1000000, 3000000);
		action.sendText(usernameFiled, email);
		action.sendText(passwordFiled, pass);
		action.click(loginButton);
		Thread.sleep(4000);
	}

}
