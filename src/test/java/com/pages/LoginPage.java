
	package com.pages;

	import java.awt.AWTException;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.base.BaseClass;

	public class LoginPage extends BaseClass {
		
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(id = "username")
		private WebElement txtUsername;

		@FindBy(id = "password")
		private WebElement txtPassword;

		@FindBy(id = "login")
		private WebElement btnLogin;

		@FindBy(xpath = "//div/b")
		private WebElement errorMsg1;

		public WebElement getTxtUsername() {
			return txtUsername;
		}

		public WebElement getTxtPassword() {
			return txtPassword;
		}

		public WebElement getBtnLogin() {
			return btnLogin;
		}

		public WebElement getErrorMsg1() {
			return errorMsg1;
		}

		public void login(String username, String password) {
			elementSendKeys(getTxtUsername(), username);
			elementSendKeys(getTxtPassword(), password);
			elementClick(getBtnLogin());
		}

		public void loginWithEnterKey(String username, String password) throws AWTException {
			elementSendKeys(getTxtUsername(), username);
			elementSendKeys(getTxtPassword(), password);
			enter();
		}


	

}
