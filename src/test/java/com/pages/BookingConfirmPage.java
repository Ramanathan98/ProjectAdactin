
	package com.pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.base.BaseClass;

	public class BookingConfirmPage extends BaseClass {
		
		public BookingConfirmPage() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//input[@id='order_no']")
		private WebElement txtOrderNo;

		@FindBy(xpath = "//a[text()='Booked Itinerary']")
		private WebElement clkBookedItinerary;

		@FindBy(xpath = "//tr/td[@class='login_title']")
		private WebElement successMsg4;

		public WebElement getTxtOrderNo() {
			return txtOrderNo;
		}

		public WebElement getClkBookedItinerary() {
			return clkBookedItinerary;
		}

		public WebElement getSuccessMsg4() {
			return successMsg4;
		}

		public String getOrderId() {
			String orderId = elementGetAttributeValue(getTxtOrderNo());
			elementClick(getClkBookedItinerary());
			return orderId;
		}

	

}
