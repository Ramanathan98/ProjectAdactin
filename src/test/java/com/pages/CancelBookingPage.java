
	package com.pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CancelBookingPage extends BookingConfirmPage {
		
		public CancelBookingPage() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(id = "order_id_text")
		private WebElement txtSearchOrderId;

		@FindBy(id = "search_hotel_id")
		private WebElement btnGo;

		@FindBy(xpath = "(//input[@type='button'])[1]")
		private WebElement btnCancel;

		@FindBy(xpath = "//td/label[@id='search_result_error']")
		private WebElement successMsg5;

		public WebElement getTxtSearchOrderId() {
			return txtSearchOrderId;
		}

		public WebElement getBtnGo() {
			return btnGo;
		}

		public WebElement getBtnCancel() {
			return btnCancel;
		}

		public WebElement getsuccessMsg5() {
			return successMsg5;
		}

		public void cancelCurrentOrderId() {
			elementSendKeys(getTxtSearchOrderId(), getOrderId());
			elementClick(getBtnGo());
			elementClick(getBtnCancel());
			clickOkAlert();
		}

		public void cancelExistingOrderId(String exOrderId) {

			elementClick(getClkBookedItinerary());
			elementSendKeys(getTxtSearchOrderId(), exOrderId);
			elementClick(getBtnGo());
			elementClick(getBtnCancel());
			clickOkAlert();

		}


	
}
