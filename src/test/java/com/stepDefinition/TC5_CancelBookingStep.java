package com.stepDefinition;


	import org.junit.Assert;

	import com.base.BaseClass;
	import com.pageManager.PageObjectManager;

	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class TC5_CancelBookingStep extends BaseClass {
		
		PageObjectManager pom = new PageObjectManager();

		@When("User should navigate to booked itinerary to cancel the order id")
		public void userShouldNavigateToBookedItineraryToCancelTheOrderId() {

			pom.getCancelBookingPage().cancelCurrentOrderId();

		}

		@Then("User should verify after cancel the order id with the success message {string}")
		public void userShouldVerifyAfterCancelTheOrderIdWithTheSuccessMessage(String cancelOrderSuccessMessage) {

			Assert.assertEquals("Verify the success message", cancelOrderSuccessMessage,
					pom.getCancelBookingPage().getsuccessMsg5().getText());

		}

		@When("User should navigate to booked itinerary to cancel the existing {string}")
		public void userShouldNavigateToBookedItineraryToCancelTheExisting(String exOrderId) {

			pom.getCancelBookingPage().cancelExistingOrderId(exOrderId);

		}

	}
