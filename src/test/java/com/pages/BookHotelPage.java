

	package com.pages;

	import java.util.List;
	import java.util.Map;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.base.BaseClass;

	import io.cucumber.datatable.DataTable;

	public class BookHotelPage extends BaseClass {
		
		public BookHotelPage() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//input[@id='first_name']")
		private WebElement txtFirstName;

		@FindBy(xpath = "//input[@id='last_name']")
		private WebElement txtLastName;

		@FindBy(xpath = "//textarea[@id='address']")
		private WebElement txtBillingAddress;

		@FindBy(xpath = "//input[@id='cc_num']")
		private WebElement txtCreditCardNo;

		@FindBy(xpath = "//select[@id='cc_type']")
		private WebElement dDnCreditCardType;

		@FindBy(xpath = "//select[@id='cc_exp_month']")
		private WebElement dDnExpiryDateMonth;

		@FindBy(xpath = "//select[@id='cc_exp_year']")
		private WebElement dDnExpiryDateYear;

		@FindBy(xpath = "//input[@id='cc_cvv']")
		private WebElement txtCvvNumber;

		@FindBy(xpath = "//input[@id='book_now']")
		private WebElement btnBookNow;

		@FindBy(xpath = "(//tr/td[@class='login_title'])[2]")
		private WebElement successMsg3;

		@FindBy(xpath = "//label[@id='first_name_span']")
		private WebElement errorMsg6;

		@FindBy(xpath = "//label[@id='last_name_span']")
		private WebElement errorMsg7;

		@FindBy(xpath = "//label[@id='address_span']")
		private WebElement errorMsg8;

		@FindBy(xpath = "//label[@id='cc_num_span']")
		private WebElement errorMsg9;

		@FindBy(xpath = "//label[@id='cc_type_span']")
		private WebElement errorMsg10;

		@FindBy(xpath = "//label[@id='cc_expiry_span']")
		private WebElement errorMsg11;

		@FindBy(xpath = "//label[@id='cc_cvv_span']")
		private WebElement errorMsg12;

		public WebElement getTxtFirstName() {
			return txtFirstName;
		}

		public WebElement getTxtLastName() {
			return txtLastName;
		}

		public WebElement getTxtBillingAddress() {
			return txtBillingAddress;
		}

		public WebElement getTxtCreditCardNo() {
			return txtCreditCardNo;
		}

		public WebElement getdDnCreditCardType() {
			return dDnCreditCardType;
		}

		public WebElement getdDnExpiryDateMonth() {
			return dDnExpiryDateMonth;
		}

		public WebElement getdDnExpiryDateYear() {
			return dDnExpiryDateYear;
		}

		public WebElement getTxtCvvNumber() {
			return txtCvvNumber;
		}

		public WebElement getBtnBookNow() {
			return btnBookNow;
		}

		public WebElement getSuccessMsg3() {
			return successMsg3;
		}

		public WebElement getErrorMsg6() {
			return errorMsg6;
		}

		public WebElement getErrorMsg7() {
			return errorMsg7;
		}

		public WebElement getErrorMsg8() {
			return errorMsg8;
		}

		public WebElement getErrorMsg9() {
			return errorMsg9;
		}

		public WebElement getErrorMsg10() {
			return errorMsg10;
		}

		public WebElement getErrorMsg11() {
			return errorMsg11;
		}

		public WebElement getErrorMsg12() {
			return errorMsg12;
		}

		public void bookHotel(String firstName, String lastName, String billingAddress, DataTable dataTable) {

			elementSendKeys(getTxtFirstName(), firstName);
			elementSendKeys(getTxtLastName(), lastName);
			elementSendKeys(getTxtBillingAddress(), billingAddress);

			List<Map<String, String>> m = dataTable.asMaps();
			Map<String, String> map = m.get(1);
			String ccardNo = map.get("ccardNo");
			String ccardType = map.get("ccardType");
			String expMonth = map.get("expMonth");
			String expYear = map.get("expYear");
			String cvvNo = map.get("cvvNo");

			elementSendKeys(getTxtCreditCardNo(), ccardNo);
			selectOptionByText(getdDnCreditCardType(), ccardType);
			selectOptionByText(getdDnExpiryDateMonth(), expMonth);
			selectOptionByText(getdDnExpiryDateYear(), expYear);
			elementSendKeys(getTxtCvvNumber(), cvvNo);
			elementClick(getBtnBookNow());

		}

		public void bookHotel() {
			elementClick(getBtnBookNow());
		}

	

}
