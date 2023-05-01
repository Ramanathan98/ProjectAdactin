package com.stepDefinition;


	import org.junit.Assert;

	import com.base.BaseClass;
	import com.pageManager.PageObjectManager;

	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class TC3_SelectHotelStep extends BaseClass {
		
		PageObjectManager pom = new PageObjectManager();

		@When("User should select hotel and continue")
		public void userShouldSelectHotelAndContinue() {

			pom.getSelectHotelPage().selectHotel();

		}

		@Then("User should navigate to book hotel and verify the success message {string}")
		public void userShouldNavigateToBookHotelAndVerifyTheSuccessMessage(String successMsgAfterSelectHotel) {

			Assert.assertEquals("Verify the success message", successMsgAfterSelectHotel,
					pom.getBookHotelPage().getSuccessMsg3().getText());

		}

		@When("User should continue without select hotel")
		public void userShouldContinueWithoutSelectHotel() {

			pom.getSelectHotelPage().clickContinue();

		}

		@Then("User should verify after continue with the error message {string}")
		public void userShouldVerifyAfterContinueWithTheErrorMessage(String selectHotelError) {

			Assert.assertEquals("Verify the error message", selectHotelError,
					pom.getSelectHotelPage().getErrorMsg5().getText());

		}


	}
