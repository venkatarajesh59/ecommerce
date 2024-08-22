package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	
	private WebDriver driver;
	private By accountsSections = By.cssSelector("div#center_column span");
	
	public AccountsPage(WebDriver driver) {

		this.driver = driver;

	}
	
	
	public int  getAccountsSectionCount() {
		return driver.findElements(accountsSections).size();
	}

	public List<String> getAccountsSectionList() {
		
		List<String> accountsList = new ArrayList<String>(); 
		List<WebElement> accountheaderList = driver.findElements(accountsSections);
		
		for (WebElement e : accountheaderList) {
			String text = e.getText();
			System.out.println(text);
			accountsList.add(text);
		}
		return accountsList;
	}
	
	
	public String getAccountsPageTitle() {
		return driver.getTitle();
	}
	
}
