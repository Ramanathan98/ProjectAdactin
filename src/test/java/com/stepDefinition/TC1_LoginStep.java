package com.stepDefinition;



	import java.awt.AWTException;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.junit.Assert;
	import org.openqa.selenium.WebElement;

	import com.base.BaseClass;
	import com.pageManager.PageObjectManager;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class TC1_LoginStep extends BaseClass {
		PageObjectManager pom = new PageObjectManager();

		@Given("User is on the adactin page")
		public void userIsOnTheAdactinPage() throws FileNotFoundException, IOException {

		}

		@When("User should perform login {string} , {string}")
		public void userShouldPerformLogin(String username, String password) {

			pom.getLoginPage().login(username, password);

		}

		@When("User should perform login {string} , {string} with Enterkey")
		public void userShouldPerformLoginWithEnterkey(String username, String password) throws AWTException {

			pom.getLoginPage().loginWithEnterKey(username, password);

		}

		@Then("User should verify after login with invalid credentials error message contains {string}")
		public void userShouldVerifyAfterLoginWithInvalidCredentialsErrorMessageContains(String loginErrorMsg) {

			WebElement errorMsg1 = pom.getLoginPage().getErrorMsg1();
			String elementGetText = elementGetText(errorMsg1);
			boolean b = elementGetText.contains(loginErrorMsg);
			Assert.assertTrue("Verify the error message", b);

		}

	}
