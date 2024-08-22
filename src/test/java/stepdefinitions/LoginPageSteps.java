package stepdefinitions;

import org.testng.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverManager.getDriver());
	private static String title;
	
	public LoginPageSteps() {
		
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		DriverManager.getDriver().get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		
	    
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginPage.getLoginpageTitle();
		System.out.println("Login Page title is : " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		
		
		Assert.assertTrue(title.contains(expectedTitle));
	    
	}

	@When("user enters username {string}")
	public void user_enters_username(String userName) {
		
		loginPage.enterUserName(userName);
	    
	}

	@When("user enters password {string}")
	public void user_enters_password(String pwd) {
		
		loginPage.enterPassword(pwd);
	    
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    
		loginPage.clickOnLogin();
	}

	
}
