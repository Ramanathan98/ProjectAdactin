package com.stepDefinition;


	import org.junit.Assert;

	import com.base.BaseClass;
	import com.pageManager.PageObjectManager;

	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class TC4_BookHotelStep extends BaseClass {
		
		PageObjectManager pom = new PageObjectManager();

		@When("User needs to book a hotel using {string},{string},{string} and credit card details")
		public void userNeedsToBookAHotelUsingAndCreditCardDetails(String firstName, String lastName, String billingAddress,
				io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			pom.getBookHotelPage().bookHotel(firstName, lastName, billingAddress, dataTable);
			Thread.sleep(6000);

		}

		@Then("User should verify the success message {string} and save order id")
		public void userShouldVerifyTheSuccessMessageAndSaveOrderId(String successMsgAfterBook) {

			System.out.println(pom.getBookingConfirmationPage().getSuccessMsg4().getText());
			Assert.assertEquals("Verify the success message", successMsgAfterBook,
					pom.getBookingConfirmationPage().getSuccessMsg4().getText());

		}

		@When("User click book now without enter any fields")
		public void userClickBookNowWithoutEnterAnyFields() {

			pom.getBookHotelPage().bookHotel();

		}

		@Then("User should verify with error message {string},{string},{string},{string},{string},{string} and {string}")
		public void userShouldVerifyWithErrorMessageAnd(String errorMsg1, String errorMsg2, String errorMsg3,
				String errorMsg4, String errorMsg5, String errorMsg6, String errorMsg7) {

			Assert.assertEquals("Verify the error message", errorMsg1, pom.getBookHotelPage().getErrorMsg6().getText());
			Assert.assertEquals("Verify the error message", errorMsg2, pom.getBookHotelPage().getErrorMsg7().getText());
			Assert.assertEquals("Verify the error message", errorMsg3, pom.getBookHotelPage().getErrorMsg8().getText());
			Assert.assertEquals("Verify the error message", errorMsg4, pom.getBookHotelPage().getErrorMsg9().getText());
			Assert.assertEquals("Verify the error message", errorMsg5, pom.getBookHotelPage().getErrorMsg10().getText());
			Assert.assertEquals("Verify the error message", errorMsg6, pom.getBookHotelPage().getErrorMsg11().getText());
			Assert.assertEquals("Verify the error message", errorMsg7, pom.getBookHotelPage().getErrorMsg12().getText());

		}

	}

