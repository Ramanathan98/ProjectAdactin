

	package com.pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.base.BaseClass;

	public class SelectHotelPage extends BaseClass {
		
		public SelectHotelPage() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//input[@type='radio']")
		private WebElement rDbSelect;

		@FindBy(xpath = "//input[@id='continue']")
		private WebElement rDbContinue;
		
		@FindBy(xpath = "//label[@id='radiobutton_span']")
		private WebElement errorMsg5;

		@FindBy(xpath = "//tr/td[@class='login_title']")
		private WebElement successMsg2;

		public WebElement getrDbSelect() {
			return rDbSelect;
		}

		public WebElement getrDbContinue() {
			return rDbContinue;
		}
		
		public WebElement getErrorMsg5() {
			return errorMsg5;
		}

		public WebElement getSuccessMsg2() {
			return successMsg2;
		}
		
		public void selectHotel() {
			elementClick(getrDbSelect());
			elementClick(getrDbContinue());
		}
		
		public void clickContinue() {
			elementClick(getrDbContinue());
		}


	

}
