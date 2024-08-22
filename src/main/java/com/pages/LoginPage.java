package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By SignInButton = By.id("SubmitLogin");
	private By forgotPassworLink = By.linkText("Forgot your password?");

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	public String getLoginpageTitle() {
		return driver.getTitle();
	}

	public void enterUserName(String userName) {

		driver.findElement(emailId).sendKeys(userName);

	}

	public void enterPassword(String pwd) {

		driver.findElement(password).sendKeys(pwd);

	}

	public void clickOnLogin() {
		driver.findElement(SignInButton).click();
	}
	
	public AccountsPage  doLogin(String userName, String pwd) {
		System.out.println("Login with username : "+ userName);
		driver.findElement(emailId).sendKeys(userName);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(SignInButton).click();
		return new AccountsPage(driver);

	}

}

