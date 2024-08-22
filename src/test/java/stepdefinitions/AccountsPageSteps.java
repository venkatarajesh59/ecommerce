package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverManager;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountsPageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverManager.getDriver());
	private AccountsPage accountsPage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable dataTable) {
		
		List<Map<String,String>> credList = dataTable.asMaps();
		String uname = credList.get(0).get("username");
		String pwd = credList.get(0).get("passwd");
		DriverManager.getDriver().get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		accountsPage = loginPage.doLogin(uname, pwd);
	    
	}
	
	
	@Given("user is on accounts page")
	public void user_is_on_accounts_page() {
	   
	    System.out.println("Title is : " + accountsPage.getAccountsPageTitle());
	}
	@Then("user gets accounts section")
	public void user_gets_accounts_section(DataTable sectionTable) {
		List<String> expectedAccountSectionList = sectionTable.asList();
		System.out.println("Expected List : " + expectedAccountSectionList);
		List<String> actualAccountSectionList = accountsPage.getAccountsSectionList();
		System.out.println("Actual List : " + actualAccountSectionList);
		
		Assert.assertTrue(expectedAccountSectionList.containsAll(actualAccountSectionList));
	}
	@Then("account could should be {int}")
	public void account_could_should_be(Integer expectedcount) {
	   Assert.assertTrue(accountsPage.getAccountsSectionCount()==expectedcount);   
	}

}
