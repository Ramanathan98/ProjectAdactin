package com.stepDefinition;


	import org.junit.Assert;

	import com.base.BaseClass;
	import com.pageManager.PageObjectManager;

	import io.cucumber.java.en.Then;

	public class CommonStep extends BaseClass {
		
		PageObjectManager pom = new PageObjectManager();

		@Then("User should verify after login success message {string}")
		public void userShouldVerifyAfterLoginSuccessMessage(String welcomeMsg) {

			Assert.assertEquals("Verify the success message", welcomeMsg,
					pom.getSearchHotelPage().getSuccessMsg1().getAttribute("value"));

		}

	}
