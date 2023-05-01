
	package com.pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.base.BaseClass;

	public class SearchHotelPage extends BaseClass {
		
		public SearchHotelPage() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//select[@id='location']")
		private WebElement dDnLocation;

		@FindBy(id = "hotels")
		private WebElement dDnHotels;

		@FindBy(id = "room_type")
		private WebElement dDnRoomType;

		@FindBy(name = "room_nos")
		private WebElement dDnNoOfRooms;

		@FindBy(id = "datepick_in")
		private WebElement txtCheckInDate;

		@FindBy(id = "datepick_out")
		private WebElement txtCheckOutDate;

		@FindBy(id = "adult_room")
		private WebElement dDnAdultsPerRoom;

		@FindBy(id = "child_room")
		private WebElement dDnChildrenPerRoom;

		@FindBy(id = "Submit")
		private WebElement btnSubmit;

		@FindBy(xpath = "//input[@id='username_show']")
		private WebElement successMsg1;

		@FindBy(xpath = "//span[@id='checkin_span']")
		private WebElement errorMsg2;

		@FindBy(xpath = "//span[@id='checkout_span']")
		private WebElement errorMsg3;

		@FindBy(xpath = "//span[@id='location_span']")
		private WebElement errorMsg4;

		public WebElement getdDnLocation() {
			return dDnLocation;
		}

		public WebElement getdDnHotels() {
			return dDnHotels;
		}

		public WebElement getdDnRoomType() {
			return dDnRoomType;
		}

		public WebElement getdDnNoOfRooms() {
			return dDnNoOfRooms;
		}

		public WebElement getTxtCheckInDate() {
			return txtCheckInDate;
		}

		public WebElement getTxtCheckOutDate() {
			return txtCheckOutDate;
		}

		public WebElement getdDnAdultsPerRoom() {
			return dDnAdultsPerRoom;
		}

		public WebElement getdDnChildrenPerRoom() {
			return dDnChildrenPerRoom;
		}

		public WebElement getBtnSubmit() {
			return btnSubmit;
		}

		public WebElement getSuccessMsg1() {
			return successMsg1;
		}

		public WebElement getErrorMsg2() {
			return errorMsg2;
		}

		public WebElement getErrorMsg3() {
			return errorMsg3;
		}

		public WebElement getErrorMsg4() {
			return errorMsg4;
		}

		public void searchHotels(String location, String hotels, String roomType, String noOfRooms, String checkInDate,
				String checkOutDate, String adultsPerRoom, String childrenPerRoom) {

			selectOptionByText(getdDnLocation(), location);
			selectOptionByText(getdDnHotels(), hotels);
			selectOptionByText(getdDnRoomType(), roomType);
			selectOptionByText(getdDnNoOfRooms(), noOfRooms);
			clear(getTxtCheckInDate());
			elementSendKeys(getTxtCheckInDate(), checkInDate);
			clear(getTxtCheckOutDate());
			elementSendKeys(getTxtCheckOutDate(), checkOutDate);
			selectOptionByText(getdDnAdultsPerRoom(), adultsPerRoom);
			selectOptionByText(getdDnChildrenPerRoom(), childrenPerRoom);
			elementClick(getBtnSubmit());

		}

		public void searchHotels(String location, String noOfRooms, String checkInDate, String checkOutDate,
				String adultsPerRoom) {

			selectOptionByText(getdDnLocation(), location);
			selectOptionByText(getdDnNoOfRooms(), noOfRooms);
			clear(getTxtCheckInDate());
			elementSendKeys(getTxtCheckInDate(), checkInDate);
			clear(getTxtCheckOutDate());
			elementSendKeys(getTxtCheckOutDate(), checkOutDate);
			selectOptionByText(getdDnAdultsPerRoom(), adultsPerRoom);
			elementClick(getBtnSubmit());

		}

		public void searchHotels() {
			elementClick(getBtnSubmit());
		}


	

}
