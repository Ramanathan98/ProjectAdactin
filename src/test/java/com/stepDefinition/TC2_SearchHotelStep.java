package com.stepDefinition;


	import org.junit.Assert;

	import com.base.BaseClass;
	import com.pageManager.PageObjectManager;

	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class TC2_SearchHotelStep extends BaseClass {
		
		PageObjectManager pom = new PageObjectManager();

		@When("User needs to search hotel using {string},{string},{string},{string},{string},{string},{string} and {string}")
		public void userNeedsToSearchHotelUsingAnd(String location, String hotels, String roomType, String noOfRooms,
				String checkInDate, String checkOutDate, String adultsPerRoom, String childrenPerRoom) {

			pom.getSearchHotelPage().searchHotels(location, hotels, roomType, noOfRooms, checkInDate, checkOutDate,
					adultsPerRoom, childrenPerRoom);

		}

		@Then("User should navigate to select hotel and verify the success message {string}")
		public void userShouldNavigateToSelectHotelAndVerifyTheSuccessMessage(String searchHotelSuccessMsg) {

			Assert.assertEquals("Verify the success message", searchHotelSuccessMsg,
					pom.getSelectHotelPage().getSuccessMsg2().getText());

		}

		@When("User needs to search hotel using mandatory fields {string},{string},{string},{string} and {string}")
		public void userNeedsToSearchHotelUsingMandatoryFieldsAnd(String location, String noOfRooms, String checkInDate,
				String checkOutDate, String adultsPerRoom) {

			pom.getSearchHotelPage().searchHotels(location, noOfRooms, checkInDate, checkOutDate, adultsPerRoom);

		}

		@Then("User should verify after search with the date error message {string} and {string}")
		public void userShouldVerifyAfterSearchWithTheDateErrorMessageAnd(String checkInDateErrorMsg,
				String checkOutDateErrorMsg) {

			Assert.assertEquals("Verify the error message", checkInDateErrorMsg,
					pom.getSearchHotelPage().getErrorMsg2().getText());
			Assert.assertEquals("Verify the error message", checkOutDateErrorMsg,
					pom.getSearchHotelPage().getErrorMsg3().getText());

		}

		@When("User should click search without entering any fields")
		public void userShouldClickSearchWithoutEnteringAnyFields() {

			pom.getSearchHotelPage().searchHotels();

		}

		@Then("User should verify after search with the error message {string}")
		public void userShouldVerifyAfterSearchWithTheErrorMessage(String enterAnyFields) {

			Assert.assertEquals("Verify the error msg about not entering any fields", enterAnyFields,
					pom.getSearchHotelPage().getErrorMsg4().getText());

		}


	}
